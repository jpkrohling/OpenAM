/**
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS HEADER.
 *
 * Copyright (c) 2011 ForgeRock AS. All Rights Reserved
 *
 * The contents of this file are subject to the terms
 * of the Common Development and Distribution License
 * (the License). You may not use this file except in
 * compliance with the License.
 *
 * You can obtain a copy of the License at
 * http://forgerock.org/license/CDDLv1.0.html
 * See the License for the specific language governing
 * permission and limitations under the License.
 *
 * When distributing Covered Code, include this CDDL
 * Header Notice in each file and include the License file
 * at http://forgerock.org/license/CDDLv1.0.html
 * If applicable, add the following below the CDDL Header,
 * with the fields enclosed by brackets [] replaced by
 * your own identifying information:
 * "Portions Copyrighted [year] [name of copyright owner]"
 *
 */

package org.forgerock.openam.amsessionstore.db.opendj;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.logging.Level;
import org.forgerock.openam.amsessionstore.common.AMRecord;
import org.forgerock.openam.amsessionstore.common.Constants;
import org.forgerock.openam.amsessionstore.common.Log;
import org.forgerock.openam.amsessionstore.common.SystemProperties;
import org.forgerock.openam.amsessionstore.db.DBStatistics;
import org.forgerock.openam.amsessionstore.db.NotFoundException;
import org.forgerock.openam.amsessionstore.db.PersistentStore;
import org.forgerock.openam.amsessionstore.db.StoreException;
import org.opends.server.core.AddOperation;
import org.opends.server.core.DeleteOperation;
import org.opends.server.core.ModifyOperation;
import org.opends.server.protocols.internal.InternalClientConnection;
import org.opends.server.protocols.internal.InternalSearchOperation;
import org.opends.server.protocols.ldap.LDAPModification;
import org.opends.server.types.Attribute;
import org.opends.server.types.DereferencePolicy;
import org.opends.server.types.DirectoryException;
import org.opends.server.types.ModificationType;
import org.opends.server.types.RawAttribute;
import org.opends.server.types.RawModification;
import org.opends.server.types.ResultCode;
import org.opends.server.types.SearchResultEntry;
import org.opends.server.types.SearchScope;

/**
 *
 * @author steve
 */
public class OpenDJPersistentStore implements PersistentStore, Runnable {
    private boolean shutdown = false;
    private Thread storeThread;
    private int sleepInterval = 60 * 1000;
    private final static String ID = "OpenDJPersistentStore"; 
    private static InternalClientConnection icConn;
    
    private final static String PKEY_FILTER_PRE = "(pKey=";
    private final static String PKEY_FILTER_POST = ")";
    private final static String SKEY_FILTER_PRE = "(sKey=";
    private final static String SKEY_FILTER_POST = ")";
    private final static String EXPDATE_FILTER_PRE = "(expirationDate<=";
    private final static String EXPDATE_FILTER_POST = ")";
    private static LinkedHashSet<String> returnAttrs;
    
    static {
        initialize();
    }
    
    private static void initialize() {
        returnAttrs = new LinkedHashSet<String>();
        returnAttrs.add("dn");
        returnAttrs.add(AMRecordDataEntry.PRI_KEY);
        returnAttrs.add(AMRecordDataEntry.SEC_KEY);
        returnAttrs.add(AMRecordDataEntry.AUX_DATA);
        returnAttrs.add(AMRecordDataEntry.DATA);
        returnAttrs.add(AMRecordDataEntry.EXP_DATE);
        returnAttrs.add(AMRecordDataEntry.EXTRA_BYTE_ATTR);
        returnAttrs.add(AMRecordDataEntry.EXTRA_STRING_ATTR);
        returnAttrs.add(AMRecordDataEntry.OPERATION);
        returnAttrs.add(AMRecordDataEntry.SERVICE);
        returnAttrs.add(AMRecordDataEntry.STATE);
    }
    
    @SuppressWarnings("CallToThreadStartDuringObjectConstruction")
    public OpenDJPersistentStore() 
    throws StoreException {
        Runtime.getRuntime().addShutdownHook(new Thread() {
            @Override
            public void run() {
                internalShutdown();
            }
        });
        
        storeThread = new Thread(this);        
        storeThread.setName(ID);
        storeThread.start();
        initializeOpenDJ();
        
        // Syncup embedded opends replication with current 
        // server instances.
        if (syncServerInfoWithReplication() == false) {
            Log.logger.log(Level.FINE, "embedded replication sync failed.");
        }
        
        icConn = InternalClientConnection.getRootConnection();
        Log.logger.log(Level.FINE, "OpenDJPersistentStore created successfully.");
    }
    
    private boolean syncServerInfoWithReplication() {
        try {
            if (!replicationEnabled()) {
                return false;
            }
            
            // Get list of amsessiondb servers
            Set<AMSessionDBOpenDJServer> serverSet = EmbeddedOpenDJ.getServers();
            if (serverSet == null) { 
                return true;
            }

            String openDJAdminPort = SystemProperties.get(Constants.OPENDJ_ADMIN_PORT);
            String openDJPasswd = SystemProperties.get(Constants.OPENDJ_DS_MGR_PASSWD);

            Set<String> currServerSet = new HashSet<String>();
            Set<String> currServerDSSet = new HashSet<String>();
            Set<String> currServerDSAdminPortsSet = new HashSet<String>();

            for (AMSessionDBOpenDJServer server : serverSet) {
                String hostName = server.getHostName();
                String replPort = server.getReplPort();
                currServerSet.add(hostName + ":" + replPort);

                currServerDSAdminPortsSet.add(hostName + ":" + server.getAdminPort());
            }
 
            boolean stats = EmbeddedOpenDJ.syncReplicatedServers(
                  currServerSet, openDJAdminPort, openDJPasswd);
            boolean statd = EmbeddedOpenDJ.syncReplicatedDomains(
                  currServerSet, openDJAdminPort, openDJPasswd);
            boolean statl = EmbeddedOpenDJ.syncReplicatedServerList(
                  currServerDSAdminPortsSet, openDJPasswd, openDJPasswd);
            return stats || statd || statl;
        } catch (Exception ex) {
            Log.logger.log(Level.SEVERE, "Could not sync servers with embedded replication:", ex);
            return false;
        }
    }
    
    private boolean replicationEnabled() {
        boolean multipleServers = false;
        
        try {
            multipleServers = EmbeddedOpenDJ.getServers().size() > 1;
        } catch (StoreException se) {
            Log.logger.log(Level.SEVERE, "Unable to determine server count", se);
        }
        
        return multipleServers;
    }
    
    private void initializeOpenDJ() 
    throws StoreException {
        try {
            EmbeddedOpenDJ.startServer(OpenDJConfig.getOdjRoot());
        } catch (Exception ex) {
            Log.logger.log(Level.SEVERE, "Unable to start embedded OpenDJ server.", ex);
            throw new StoreException("Unable to start embedded OpenDJ server.", ex);
        }
    }
    
    @SuppressWarnings("SleepWhileInLoop")
    @Override
    public void run() {
        while (!shutdown) {
            try {
                Thread.sleep(sleepInterval);
                long curTime = System.currentTimeMillis() / 1000;
                deleteExpired(curTime);
            } catch (InterruptedException ie) {
                Log.logger.log(Level.WARNING, "Thread interupted", ie);
            } catch (StoreException se) {
                Log.logger.log(Level.WARNING, "Store Exception", se);
            }   
        }
    }
    
    @Override
    public void write(AMRecord record) 
    throws StoreException {
        boolean found = false;
        StringBuilder baseDN = new StringBuilder();
        baseDN.append(Constants.AMRECORD_NAMING_ATTR).append(Constants.EQUALS);
        baseDN.append(record.getPrimaryKey()).append(Constants.COMMA);
        baseDN.append(Constants.BASE_DN).append(Constants.COMMA).append(OpenDJConfig.getSessionDBSuffix());
        
        try {
            InternalSearchOperation iso = icConn.processSearch(baseDN.toString(),
                SearchScope.SINGLE_LEVEL, DereferencePolicy.NEVER_DEREF_ALIASES,
                0, 0, false, Constants.FAMRECORD_FILTER , returnAttrs);
            ResultCode resultCode = iso.getResultCode();

            if (resultCode == ResultCode.SUCCESS) {
                Object[] params = { baseDN };
                Log.logger.log(Level.FINE,"Entry present: {0}", params);
                found = true;
            } else if (resultCode == ResultCode.NO_SUCH_OBJECT) {
                Object[] params = { baseDN };
                Log.logger.log(Level.FINE,"Entry not present: {0}", params);
            } else {
                Object[] params = { baseDN, resultCode };
                Log.logger.log(Level.WARNING, "Error in accessing entry DN: {0}, error code = {1}", params);
                throw new StoreException("Unable to access entry DN" + baseDN);
            }
        } catch (DirectoryException dex) {
            Log.logger.log(Level.WARNING, "Error in accessing entry DN: " + baseDN, dex);
            throw new StoreException("Unable to read record from store", dex);
        }
        
        if (found) {
            update(record);
        } else {
            store(record);
        }
    }
   
    public void store(AMRecord record) 
    throws StoreException {
        AMRecordDataEntry entry = new AMRecordDataEntry(record);
        List<RawAttribute> attrList = entry.getAttrList();
        StringBuilder dn = new StringBuilder();
        dn.append(AMRecordDataEntry.PRI_KEY).append(Constants.EQUALS).append(record.getPrimaryKey());
        dn.append(Constants.COMMA).append(Constants.BASE_DN);
        dn.append(Constants.COMMA).append(OpenDJConfig.getSessionDBSuffix());
        attrList.addAll(AMRecordDataEntry.getObjectClasses());
        AddOperation ao = icConn.processAdd(dn.toString(), attrList);
        ResultCode resultCode = ao.getResultCode();
        
        if (resultCode == ResultCode.SUCCESS) {
            Object[] params = { dn };
            Log.logger.log(Level.FINE, "Successfully created entry: {0}", params);
        } else if (resultCode == ResultCode.ENTRY_ALREADY_EXISTS) {
            Object[] params = { dn };
            Log.logger.log(Level.WARNING, " unable to create: Entry " +
                        "Already Exists Error for DN {0}", params);
        } else {
            Object[] params = { dn, resultCode };
            Log.logger.log(Level.WARNING, "Error creating entry: {0}, error code = {1}", params);
            throw new StoreException("Unable to create entry: " + dn);
        }
    }
    
    protected void update(AMRecord record)
    throws StoreException {
        List<RawModification> modList = createModificationList(record);
        StringBuilder dn = new StringBuilder();
        dn.append(AMRecordDataEntry.PRI_KEY).append(Constants.EQUALS).append(record.getPrimaryKey());
        dn.append(Constants.COMMA).append(Constants.BASE_DN);
        dn.append(Constants.COMMA).append(OpenDJConfig.getSessionDBSuffix());
        
        ModifyOperation mo = icConn.processModify(dn.toString(), modList);
        ResultCode resultCode = mo.getResultCode();
        
        if (resultCode == ResultCode.SUCCESS) {
            Log.logger.log(Level.FINE, "Successfully modified entry: {0}" + dn);
        } else {
            Object[] params = { dn, resultCode };
            Log.logger.log(Level.WARNING, "Error modifying entry {0}, error code = {1}", params);
            throw new StoreException("Unable to modify entry: " + dn);
        }
    }
    
    private List<RawModification> createModificationList(AMRecord record)
    throws StoreException {
        List<RawModification> mods = new ArrayList<RawModification>();
        AMRecordDataEntry entry = new AMRecordDataEntry(record);
        List<RawAttribute> attrList = entry.getAttrList();
        
        for (RawAttribute attr : attrList) {
            RawModification mod = new LDAPModification(ModificationType.REPLACE, attr);
            mods.add(mod);
        }
                
        return mods;
    }
    
    @Override
    public AMRecord read(String id) 
    throws NotFoundException, StoreException { 
        StringBuilder baseDN = new StringBuilder();
        
        try {
            StringBuilder filter = new StringBuilder();
            filter.append(PKEY_FILTER_PRE).append(id).append(PKEY_FILTER_POST);
            baseDN.append(Constants.BASE_DN).append(Constants.COMMA).append(OpenDJConfig.getSessionDBSuffix());
            InternalSearchOperation iso = icConn.processSearch(baseDN.toString(),
                SearchScope.SINGLE_LEVEL, DereferencePolicy.NEVER_DEREF_ALIASES,
                0, 0, false, filter.toString() , returnAttrs);
            ResultCode resultCode = iso.getResultCode();

            if (resultCode == ResultCode.SUCCESS) {
                LinkedList searchResult = iso.getSearchEntries();
                
                if (!searchResult.isEmpty()) {
                    SearchResultEntry entry =
                        (SearchResultEntry) searchResult.get(0);
                    List<Attribute> attributes = entry.getAttributes();

                    Map<String, Set<String>> results = 
                            EmbeddedSearchResultIterator.convertLDAPAttributeSetToMap(attributes);
                    AMRecordDataEntry dataEntry = new AMRecordDataEntry("pkey=" + id + "," + baseDN, results);
                    return dataEntry.getAMRecord();
                } else {
                    return null;
                }
            } else if (resultCode == ResultCode.NO_SUCH_OBJECT) {
                Object[] params = { baseDN };
                Log.logger.log(Level.FINE,"Entry not present: {0}", params);
                
                return null;
            } else {
                Object[] params = { baseDN, resultCode };
                Log.logger.log(Level.WARNING, "Error in accessing entry DN: {0}, error code = {1}", params);
                throw new StoreException("Unable to access entry DN" + baseDN);
            }
        } catch (DirectoryException dex) {
            Log.logger.log(Level.WARNING, "Error in accessing entry DN: " + baseDN, dex);
            throw new StoreException("Unable to read record from store", dex);
        }
    }
    
    @Override
    public Set<String> readWithSecKey(String id) 
    throws StoreException, NotFoundException {
        try {
            StringBuilder baseDN = new StringBuilder();
            StringBuilder filter = new StringBuilder();
            filter.append(SKEY_FILTER_PRE).append(id).append(SKEY_FILTER_POST);
            baseDN.append(Constants.BASE_DN).append(Constants.COMMA).append(OpenDJConfig.getSessionDBSuffix());
            InternalSearchOperation iso = icConn.processSearch(baseDN.toString(),
                SearchScope.SINGLE_LEVEL, DereferencePolicy.NEVER_DEREF_ALIASES,
                0, 0, false, filter.toString() , returnAttrs);
            ResultCode resultCode = iso.getResultCode();

            if (resultCode == ResultCode.SUCCESS) {
                LinkedList<SearchResultEntry> searchResult = iso.getSearchEntries();
                
                if (!searchResult.isEmpty()) {
                    Set<String> result = new HashSet<String>();
                    
                    for (SearchResultEntry entry : searchResult) {
                        List<Attribute> attributes = entry.getAttributes();
                        Map<String, Set<String>> results = 
                            EmbeddedSearchResultIterator.convertLDAPAttributeSetToMap(attributes);
                        
                        Set<String> value = results.get(AMRecordDataEntry.DATA);
                        
                        if (value != null && !value.isEmpty()) {
                            for (String v : value) {
                                result.add(v);
                            }
                        }   
                    }
                    
                    return result;
                } else {
                    return null;
                }
            } else if (resultCode == ResultCode.NO_SUCH_OBJECT) {
                Object[] params = { OpenDJConfig.getSessionDBSuffix() };
                Log.logger.log(Level.FINE,"Entry not present: {0}", params);
                
                return null;
            } else {
                Object[] params = { OpenDJConfig.getSessionDBSuffix(), resultCode };
                Log.logger.log(Level.WARNING, "Error in accessing entry DN: {0}, error code = {1}", params);
                throw new StoreException("Unable to access entry DN" + OpenDJConfig.getSessionDBSuffix());
            }
        } catch (DirectoryException dex) {
            Log.logger.log(Level.WARNING, "Error in accessing entry DN: " + OpenDJConfig.getSessionDBSuffix(), dex);
            throw new StoreException("Unable to read record from store", dex);
        }
    }
    
    @Override
    public void delete(String id)
    throws StoreException, NotFoundException {
        StringBuilder dn = new StringBuilder();
        dn.append(AMRecordDataEntry.PRI_KEY).append(Constants.EQUALS).append(id);
        dn.append(Constants.COMMA).append(Constants.BASE_DN);
        dn.append(Constants.COMMA).append(OpenDJConfig.getSessionDBSuffix());
        DeleteOperation dop = icConn.processDelete(dn.toString());
        ResultCode resultCode = dop.getResultCode();
        
        if (resultCode != ResultCode.SUCCESS) {
            Object[] params = { dn };
            Log.logger.log(Level.WARNING, "Unable to delete entry: {0}", params);
        }
    }
    
    @Override
    public void deleteExpired(long expDate)
    throws StoreException {
        try {
            StringBuilder baseDN = new StringBuilder();
            StringBuilder filter = new StringBuilder();
            filter.append(EXPDATE_FILTER_PRE).append(expDate).append(EXPDATE_FILTER_POST);
            baseDN.append(Constants.BASE_DN).append(Constants.COMMA).append(OpenDJConfig.getSessionDBSuffix());
            InternalSearchOperation iso = icConn.processSearch(baseDN.toString(),
                SearchScope.SINGLE_LEVEL, DereferencePolicy.NEVER_DEREF_ALIASES,
                0, 0, false, filter.toString() , returnAttrs);
            ResultCode resultCode = iso.getResultCode();

            if (resultCode == ResultCode.SUCCESS) {
                LinkedList<SearchResultEntry> searchResult = iso.getSearchEntries();
                
                if (!searchResult.isEmpty()) {
                    for (SearchResultEntry entry : searchResult) {
                        List<Attribute> attributes = entry.getAttributes();

                        Map<String, Set<String>> results = 
                            EmbeddedSearchResultIterator.convertLDAPAttributeSetToMap(attributes);
                    
                        Set<String> value = results.get(AMRecordDataEntry.PRI_KEY);
                    
                        if (value != null && !value.isEmpty()) {
                            for (String v : value) {
                                try {
                                    delete(v);
                                } catch (NotFoundException nfe) {
                                    Object[] params = { v };
                                    Log.logger.log(Level.WARNING, "Unable to delete {0} not found", params);
                                }
                            }
                        }
                    }
                }
            } else if (resultCode == ResultCode.NO_SUCH_OBJECT) {
                Object[] params = { OpenDJConfig.getSessionDBSuffix() };
                Log.logger.log(Level.FINE,"Entry not present: {0}", params);
            } else { 
                Object[] params = { OpenDJConfig.getSessionDBSuffix(), resultCode };
                Log.logger.log(Level.WARNING, "Error in accessing entry DN: {0}, error code = {1}" + params);
                throw new StoreException("Unable to access entry DN" + OpenDJConfig.getSessionDBSuffix());
            }
        } catch (DirectoryException dex) {
            Log.logger.log(Level.WARNING, "Error in accessing entry DN: " + OpenDJConfig.getSessionDBSuffix(), dex);
            throw new StoreException("Unable to read record from store", dex);
        }        
    }
    
    @Override
    public Map<String, Long> getRecordCount(String id) 
    throws StoreException {
        try {
            StringBuilder baseDN = new StringBuilder();
            StringBuilder filter = new StringBuilder();
            filter.append(SKEY_FILTER_PRE).append(id).append(SKEY_FILTER_POST);
            baseDN.append(Constants.BASE_DN).append(Constants.COMMA).append(OpenDJConfig.getSessionDBSuffix());
            InternalSearchOperation iso = icConn.processSearch(baseDN.toString(),
                SearchScope.SINGLE_LEVEL, DereferencePolicy.NEVER_DEREF_ALIASES,
                0, 0, false, filter.toString() , returnAttrs);
            ResultCode resultCode = iso.getResultCode();

            if (resultCode == ResultCode.SUCCESS) {
                LinkedList<SearchResultEntry> searchResult = iso.getSearchEntries();
                
                if (!searchResult.isEmpty()) {
                    Map<String, Long> result = new HashMap<String, Long>();
                    
                    for (SearchResultEntry entry : searchResult) {
                        List<Attribute> attributes = entry.getAttributes();
                        Map<String, Set<String>> results = 
                            EmbeddedSearchResultIterator.convertLDAPAttributeSetToMap(attributes);
                        
                        String key = "";
                        Long expDate = new Long(0);
                        
                        Set<String> value = results.get(AMRecordDataEntry.AUX_DATA);
                        
                        if (value != null && !value.isEmpty()) {
                            for (String v : value) {
                                key = v;
                            }
                        } 
                        
                        value = results.get(AMRecordDataEntry.EXP_DATE);
                        
                        if (value != null && !value.isEmpty()) {
                            for (String v : value) {
                                expDate = AMRecordDataEntry.toAMDateFormat(v);
                            }
                        }  
                        
                        result.put(key, expDate);
                    }
                    
                    return result;
                } else {
                    return null;
                }
            } else if (resultCode == ResultCode.NO_SUCH_OBJECT) {
                Object[] params = { OpenDJConfig.getSessionDBSuffix() };
                Log.logger.log(Level.FINE,"Entry not present: {0}", params);
                
                return null;
            } else {
                Object[] params = { OpenDJConfig.getSessionDBSuffix(), resultCode };
                Log.logger.log(Level.WARNING, "Error in accessing entry DN: {0}, error code = {1}" + params);
                throw new StoreException("Unable to access entry DN" + OpenDJConfig.getSessionDBSuffix());
            }
        } catch (DirectoryException dex) {
            Log.logger.log(Level.WARNING, "Error in accessing entry DN: " + OpenDJConfig.getSessionDBSuffix(), dex);
            throw new StoreException("Unable to read record from store", dex);
        }
    }
    
    @Override
    public void shutdown() {
        internalShutdown();
        Log.logger.log(Level.FINE, "shutdown called");
    }
    
    @Override
    public DBStatistics getDBStatistics() {
        return null;
    }
    
    protected void internalShutdown() {
        shutdown = true;    
        Log.logger.log(Level.FINE, "Internal Shutdown called");
        
        try {
            EmbeddedOpenDJ.shutdownServer(); 
        } catch (Exception ex) {
            Log.logger.log(Level.WARNING, "OpenDJ shutdown failure", ex);
        }
    }
}
