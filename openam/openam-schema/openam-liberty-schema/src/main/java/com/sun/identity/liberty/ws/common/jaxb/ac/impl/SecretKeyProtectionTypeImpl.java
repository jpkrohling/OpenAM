//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v1.0.6-b27-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.06.11 at 10:33:54 AM PDT 
//


package com.sun.identity.liberty.ws.common.jaxb.ac.impl;

public class SecretKeyProtectionTypeImpl implements com.sun.identity.liberty.ws.common.jaxb.ac.SecretKeyProtectionType, com.sun.xml.bind.JAXBObject, com.sun.identity.federation.jaxb.entityconfig.impl.runtime.UnmarshallableObject, com.sun.identity.federation.jaxb.entityconfig.impl.runtime.XMLSerializable, com.sun.identity.federation.jaxb.entityconfig.impl.runtime.ValidatableObject
{

    protected com.sun.xml.bind.util.ListImpl _Extension;
    protected com.sun.identity.liberty.ws.common.jaxb.ac.KeyStorageType _KeyStorage;
    protected com.sun.identity.liberty.ws.common.jaxb.ac.KeyActivationType _KeyActivation;
    public final static java.lang.Class version = (com.sun.identity.liberty.ws.common.jaxb.ac.impl.JAXBVersion.class);
    private static com.sun.msv.grammar.Grammar schemaFragment;

    private final static java.lang.Class PRIMARY_INTERFACE_CLASS() {
        return (com.sun.identity.liberty.ws.common.jaxb.ac.SecretKeyProtectionType.class);
    }

    protected com.sun.xml.bind.util.ListImpl _getExtension() {
        if (_Extension == null) {
            _Extension = new com.sun.xml.bind.util.ListImpl(new java.util.ArrayList());
        }
        return _Extension;
    }

    public java.util.List getExtension() {
        return _getExtension();
    }

    public com.sun.identity.liberty.ws.common.jaxb.ac.KeyStorageType getKeyStorage() {
        return _KeyStorage;
    }

    public void setKeyStorage(com.sun.identity.liberty.ws.common.jaxb.ac.KeyStorageType value) {
        _KeyStorage = value;
    }

    public com.sun.identity.liberty.ws.common.jaxb.ac.KeyActivationType getKeyActivation() {
        return _KeyActivation;
    }

    public void setKeyActivation(com.sun.identity.liberty.ws.common.jaxb.ac.KeyActivationType value) {
        _KeyActivation = value;
    }

    public com.sun.identity.federation.jaxb.entityconfig.impl.runtime.UnmarshallingEventHandler createUnmarshaller(com.sun.identity.federation.jaxb.entityconfig.impl.runtime.UnmarshallingContext context) {
        return new com.sun.identity.liberty.ws.common.jaxb.ac.impl.SecretKeyProtectionTypeImpl.Unmarshaller(context);
    }

    public void serializeBody(com.sun.identity.federation.jaxb.entityconfig.impl.runtime.XMLSerializer context)
        throws org.xml.sax.SAXException
    {
        int idx1 = 0;
        final int len1 = ((_Extension == null)? 0 :_Extension.size());
        if (_KeyActivation!= null) {
            if (_KeyActivation instanceof javax.xml.bind.Element) {
                context.childAsBody(((com.sun.xml.bind.JAXBObject) _KeyActivation), "KeyActivation");
            } else {
                context.startElement("urn:liberty:ac:2003-08", "KeyActivation");
                context.childAsURIs(((com.sun.xml.bind.JAXBObject) _KeyActivation), "KeyActivation");
                context.endNamespaceDecls();
                context.childAsAttributes(((com.sun.xml.bind.JAXBObject) _KeyActivation), "KeyActivation");
                context.endAttributes();
                context.childAsBody(((com.sun.xml.bind.JAXBObject) _KeyActivation), "KeyActivation");
                context.endElement();
            }
        }
        if (_KeyStorage!= null) {
            if (_KeyStorage instanceof javax.xml.bind.Element) {
                context.childAsBody(((com.sun.xml.bind.JAXBObject) _KeyStorage), "KeyStorage");
            } else {
                context.startElement("urn:liberty:ac:2003-08", "KeyStorage");
                context.childAsURIs(((com.sun.xml.bind.JAXBObject) _KeyStorage), "KeyStorage");
                context.endNamespaceDecls();
                context.childAsAttributes(((com.sun.xml.bind.JAXBObject) _KeyStorage), "KeyStorage");
                context.endAttributes();
                context.childAsBody(((com.sun.xml.bind.JAXBObject) _KeyStorage), "KeyStorage");
                context.endElement();
            }
        }
        while (idx1 != len1) {
            if (_Extension.get(idx1) instanceof javax.xml.bind.Element) {
                context.childAsBody(((com.sun.xml.bind.JAXBObject) _Extension.get(idx1 ++)), "Extension");
            } else {
                context.startElement("urn:liberty:ac:2003-08", "Extension");
                int idx_4 = idx1;
                context.childAsURIs(((com.sun.xml.bind.JAXBObject) _Extension.get(idx_4 ++)), "Extension");
                context.endNamespaceDecls();
                int idx_5 = idx1;
                context.childAsAttributes(((com.sun.xml.bind.JAXBObject) _Extension.get(idx_5 ++)), "Extension");
                context.endAttributes();
                context.childAsBody(((com.sun.xml.bind.JAXBObject) _Extension.get(idx1 ++)), "Extension");
                context.endElement();
            }
        }
    }

    public void serializeAttributes(com.sun.identity.federation.jaxb.entityconfig.impl.runtime.XMLSerializer context)
        throws org.xml.sax.SAXException
    {
        int idx1 = 0;
        final int len1 = ((_Extension == null)? 0 :_Extension.size());
        if (_KeyActivation!= null) {
            if (_KeyActivation instanceof javax.xml.bind.Element) {
                context.childAsAttributes(((com.sun.xml.bind.JAXBObject) _KeyActivation), "KeyActivation");
            }
        }
        if (_KeyStorage!= null) {
            if (_KeyStorage instanceof javax.xml.bind.Element) {
                context.childAsAttributes(((com.sun.xml.bind.JAXBObject) _KeyStorage), "KeyStorage");
            }
        }
        while (idx1 != len1) {
            if (_Extension.get(idx1) instanceof javax.xml.bind.Element) {
                context.childAsAttributes(((com.sun.xml.bind.JAXBObject) _Extension.get(idx1 ++)), "Extension");
            } else {
                idx1 += 1;
            }
        }
    }

    public void serializeURIs(com.sun.identity.federation.jaxb.entityconfig.impl.runtime.XMLSerializer context)
        throws org.xml.sax.SAXException
    {
        int idx1 = 0;
        final int len1 = ((_Extension == null)? 0 :_Extension.size());
        if (_KeyActivation!= null) {
            if (_KeyActivation instanceof javax.xml.bind.Element) {
                context.childAsURIs(((com.sun.xml.bind.JAXBObject) _KeyActivation), "KeyActivation");
            }
        }
        if (_KeyStorage!= null) {
            if (_KeyStorage instanceof javax.xml.bind.Element) {
                context.childAsURIs(((com.sun.xml.bind.JAXBObject) _KeyStorage), "KeyStorage");
            }
        }
        while (idx1 != len1) {
            if (_Extension.get(idx1) instanceof javax.xml.bind.Element) {
                context.childAsURIs(((com.sun.xml.bind.JAXBObject) _Extension.get(idx1 ++)), "Extension");
            } else {
                idx1 += 1;
            }
        }
    }

    public java.lang.Class getPrimaryInterface() {
        return (com.sun.identity.liberty.ws.common.jaxb.ac.SecretKeyProtectionType.class);
    }

    public com.sun.msv.verifier.DocumentDeclaration createRawValidator() {
        if (schemaFragment == null) {
            schemaFragment = com.sun.xml.bind.validator.SchemaDeserializer.deserialize((
 "\u00ac\u00ed\u0000\u0005sr\u0000\u001fcom.sun.msv.grammar.SequenceExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\u001dcom.su"
+"n.msv.grammar.BinaryExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\u0004exp1t\u0000 Lcom/sun/msv/gra"
+"mmar/Expression;L\u0000\u0004exp2q\u0000~\u0000\u0002xr\u0000\u001ecom.sun.msv.grammar.Expressi"
+"on\u00f8\u0018\u0082\u00e8N5~O\u0002\u0000\u0002L\u0000\u0013epsilonReducibilityt\u0000\u0013Ljava/lang/Boolean;L\u0000\u000b"
+"expandedExpq\u0000~\u0000\u0002xpppsq\u0000~\u0000\u0000ppsr\u0000\u001dcom.sun.msv.grammar.ChoiceEx"
+"p\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0001ppsq\u0000~\u0000\u0007sr\u0000\u0011java.lang.Boolean\u00cd r\u0080\u00d5\u009c\u00fa\u00ee\u0002\u0000\u0001Z\u0000"
+"\u0005valuexp\u0000psr\u0000\'com.sun.msv.grammar.trex.ElementPattern\u0000\u0000\u0000\u0000\u0000\u0000\u0000"
+"\u0001\u0002\u0000\u0001L\u0000\tnameClasst\u0000\u001fLcom/sun/msv/grammar/NameClass;xr\u0000\u001ecom.su"
+"n.msv.grammar.ElementExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002Z\u0000\u001aignoreUndeclaredAttrib"
+"utesL\u0000\fcontentModelq\u0000~\u0000\u0002xq\u0000~\u0000\u0003q\u0000~\u0000\u000bp\u0000sq\u0000~\u0000\u0007ppsr\u0000 com.sun.msv"
+".grammar.OneOrMoreExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\u001ccom.sun.msv.grammar.Unar"
+"yExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000\u0003expq\u0000~\u0000\u0002xq\u0000~\u0000\u0003q\u0000~\u0000\u000bpsr\u0000 com.sun.msv.gramma"
+"r.AttributeExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\u0003expq\u0000~\u0000\u0002L\u0000\tnameClassq\u0000~\u0000\rxq\u0000~\u0000\u0003q"
+"\u0000~\u0000\u000bpsr\u00002com.sun.msv.grammar.Expression$AnyStringExpression\u0000"
+"\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0003sq\u0000~\u0000\n\u0001q\u0000~\u0000\u0017sr\u0000 com.sun.msv.grammar.AnyNameC"
+"lass\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\u001dcom.sun.msv.grammar.NameClass\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000x"
+"psr\u00000com.sun.msv.grammar.Expression$EpsilonExpression\u0000\u0000\u0000\u0000\u0000\u0000\u0000"
+"\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0003q\u0000~\u0000\u0018q\u0000~\u0000\u001dsr\u0000#com.sun.msv.grammar.SimpleNameClass\u0000"
+"\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\tlocalNamet\u0000\u0012Ljava/lang/String;L\u0000\fnamespaceURIq\u0000"
+"~\u0000\u001fxq\u0000~\u0000\u001at\u0000?com.sun.identity.liberty.ws.common.jaxb.ac.KeyAc"
+"tivationElementt\u0000+http://java.sun.com/jaxb/xjc/dummy-element"
+"ssq\u0000~\u0000\fq\u0000~\u0000\u000bp\u0000sq\u0000~\u0000\u0000ppsq\u0000~\u0000\fpp\u0000sq\u0000~\u0000\u0007ppsq\u0000~\u0000\u0011q\u0000~\u0000\u000bpsq\u0000~\u0000\u0014q\u0000~"
+"\u0000\u000bpq\u0000~\u0000\u0017q\u0000~\u0000\u001bq\u0000~\u0000\u001dsq\u0000~\u0000\u001et\u0000<com.sun.identity.liberty.ws.commo"
+"n.jaxb.ac.KeyActivationTypeq\u0000~\u0000\"sq\u0000~\u0000\u0007ppsq\u0000~\u0000\u0014q\u0000~\u0000\u000bpsr\u0000\u001bcom."
+"sun.msv.grammar.DataExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0003L\u0000\u0002dtt\u0000\u001fLorg/relaxng/datat"
+"ype/Datatype;L\u0000\u0006exceptq\u0000~\u0000\u0002L\u0000\u0004namet\u0000\u001dLcom/sun/msv/util/Strin"
+"gPair;xq\u0000~\u0000\u0003q\u0000~\u0000\u000bpsr\u0000\"com.sun.msv.datatype.xsd.QnameType\u0000\u0000\u0000\u0000"
+"\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000*com.sun.msv.datatype.xsd.BuiltinAtomicType\u0000\u0000\u0000\u0000\u0000\u0000\u0000"
+"\u0001\u0002\u0000\u0000xr\u0000%com.sun.msv.datatype.xsd.ConcreteType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\'"
+"com.sun.msv.datatype.xsd.XSDatatypeImpl\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0003L\u0000\fnamespa"
+"ceUriq\u0000~\u0000\u001fL\u0000\btypeNameq\u0000~\u0000\u001fL\u0000\nwhiteSpacet\u0000.Lcom/sun/msv/datat"
+"ype/xsd/WhiteSpaceProcessor;xpt\u0000 http://www.w3.org/2001/XMLS"
+"chemat\u0000\u0005QNamesr\u00005com.sun.msv.datatype.xsd.WhiteSpaceProcesso"
+"r$Collapse\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000,com.sun.msv.datatype.xsd.WhiteSpace"
+"Processor\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xpsr\u00000com.sun.msv.grammar.Expression$Nul"
+"lSetExpression\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0003q\u0000~\u0000\u000bpsr\u0000\u001bcom.sun.msv.util.St"
+"ringPair\u00d0t\u001ejB\u008f\u008d\u00a0\u0002\u0000\u0002L\u0000\tlocalNameq\u0000~\u0000\u001fL\u0000\fnamespaceURIq\u0000~\u0000\u001fxpq\u0000"
+"~\u00008q\u0000~\u00007sq\u0000~\u0000\u001et\u0000\u0004typet\u0000)http://www.w3.org/2001/XMLSchema-ins"
+"tanceq\u0000~\u0000\u001dsq\u0000~\u0000\u001et\u0000\rKeyActivationt\u0000\u0016urn:liberty:ac:2003-08q\u0000~"
+"\u0000\u001dsq\u0000~\u0000\u0007ppsq\u0000~\u0000\u0007q\u0000~\u0000\u000bpsq\u0000~\u0000\fq\u0000~\u0000\u000bp\u0000sq\u0000~\u0000\u0007ppsq\u0000~\u0000\u0011q\u0000~\u0000\u000bpsq\u0000~\u0000"
+"\u0014q\u0000~\u0000\u000bpq\u0000~\u0000\u0017q\u0000~\u0000\u001bq\u0000~\u0000\u001dsq\u0000~\u0000\u001et\u0000<com.sun.identity.liberty.ws.c"
+"ommon.jaxb.ac.KeyStorageElementq\u0000~\u0000\"sq\u0000~\u0000\fq\u0000~\u0000\u000bp\u0000sq\u0000~\u0000\u0000ppsq\u0000"
+"~\u0000\fpp\u0000sq\u0000~\u0000\u0007ppsq\u0000~\u0000\u0011q\u0000~\u0000\u000bpsq\u0000~\u0000\u0014q\u0000~\u0000\u000bpq\u0000~\u0000\u0017q\u0000~\u0000\u001bq\u0000~\u0000\u001dsq\u0000~\u0000\u001et"
+"\u00009com.sun.identity.liberty.ws.common.jaxb.ac.KeyStorageTypeq"
+"\u0000~\u0000\"sq\u0000~\u0000\u0007ppsq\u0000~\u0000\u0014q\u0000~\u0000\u000bpq\u0000~\u00000q\u0000~\u0000@q\u0000~\u0000\u001dsq\u0000~\u0000\u001et\u0000\nKeyStorageq\u0000"
+"~\u0000Eq\u0000~\u0000\u001dsq\u0000~\u0000\u0011ppsq\u0000~\u0000\u0007ppsq\u0000~\u0000\fpp\u0000sq\u0000~\u0000\u0007ppsq\u0000~\u0000\u0011q\u0000~\u0000\u000bpsq\u0000~\u0000\u0014q"
+"\u0000~\u0000\u000bpq\u0000~\u0000\u0017q\u0000~\u0000\u001bq\u0000~\u0000\u001dsq\u0000~\u0000\u001et\u0000;com.sun.identity.liberty.ws.com"
+"mon.jaxb.ac.ExtensionElementq\u0000~\u0000\"sq\u0000~\u0000\fpp\u0000sq\u0000~\u0000\u0000ppsq\u0000~\u0000\fpp\u0000s"
+"q\u0000~\u0000\u0007ppsq\u0000~\u0000\u0011q\u0000~\u0000\u000bpsq\u0000~\u0000\u0014q\u0000~\u0000\u000bpq\u0000~\u0000\u0017q\u0000~\u0000\u001bq\u0000~\u0000\u001dsq\u0000~\u0000\u001et\u00008com.s"
+"un.identity.liberty.ws.common.jaxb.ac.ExtensionTypeq\u0000~\u0000\"sq\u0000~"
+"\u0000\u0007ppsq\u0000~\u0000\u0014q\u0000~\u0000\u000bpq\u0000~\u00000q\u0000~\u0000@q\u0000~\u0000\u001dsq\u0000~\u0000\u001et\u0000\tExtensionq\u0000~\u0000Esr\u0000\"co"
+"m.sun.msv.grammar.ExpressionPool\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000\bexpTablet\u0000/Lco"
+"m/sun/msv/grammar/ExpressionPool$ClosedHash;xpsr\u0000-com.sun.ms"
+"v.grammar.ExpressionPool$ClosedHash\u00d7j\u00d0N\u00ef\u00e8\u00ed\u001c\u0003\u0000\u0003I\u0000\u0005countB\u0000\rstr"
+"eamVersionL\u0000\u0006parentt\u0000$Lcom/sun/msv/grammar/ExpressionPool;xp"
+"\u0000\u0000\u0000\u001a\u0001pq\u0000~\u0000Gq\u0000~\u0000[q\u0000~\u0000Zq\u0000~\u0000\u0013q\u0000~\u0000\'q\u0000~\u0000Jq\u0000~\u0000Rq\u0000~\u0000^q\u0000~\u0000fq\u0000~\u0000\u0006q\u0000~\u0000"
+"\u0010q\u0000~\u0000&q\u0000~\u0000Iq\u0000~\u0000Qq\u0000~\u0000]q\u0000~\u0000eq\u0000~\u0000$q\u0000~\u0000Oq\u0000~\u0000cq\u0000~\u0000\u0005q\u0000~\u0000\bq\u0000~\u0000Fq\u0000~\u0000"
+"+q\u0000~\u0000Vq\u0000~\u0000jq\u0000~\u0000\tx"));
        }
        return new com.sun.msv.verifier.regexp.REDocumentDeclaration(schemaFragment);
    }

    public class Unmarshaller
        extends com.sun.identity.federation.jaxb.entityconfig.impl.runtime.AbstractUnmarshallingEventHandlerImpl
    {


        public Unmarshaller(com.sun.identity.federation.jaxb.entityconfig.impl.runtime.UnmarshallingContext context) {
            super(context, "----------");
        }

        protected Unmarshaller(com.sun.identity.federation.jaxb.entityconfig.impl.runtime.UnmarshallingContext context, int startState) {
            this(context);
            state = startState;
        }

        public java.lang.Object owner() {
            return com.sun.identity.liberty.ws.common.jaxb.ac.impl.SecretKeyProtectionTypeImpl.this;
        }

        public void enterElement(java.lang.String ___uri, java.lang.String ___local, java.lang.String ___qname, org.xml.sax.Attributes __atts)
            throws org.xml.sax.SAXException
        {
            int attIdx;
            outer:
            while (true) {
                switch (state) {
                    case  4 :
                        attIdx = context.getAttribute("", "medium");
                        if (attIdx >= 0) {
                            context.consumeAttribute(attIdx);
                            context.getCurrentHandler().enterElement(___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        break;
                    case  7 :
                        if (("Extension" == ___local)&&("urn:liberty:ac:2003-08" == ___uri)) {
                            _getExtension().add(((com.sun.identity.liberty.ws.common.jaxb.ac.impl.ExtensionElementImpl) spawnChildFromEnterElement((com.sun.identity.liberty.ws.common.jaxb.ac.impl.ExtensionElementImpl.class), 7, ___uri, ___local, ___qname, __atts)));
                            return ;
                        }
                        if (("Extension" == ___local)&&("urn:liberty:ac:2003-08" == ___uri)) {
                            context.pushAttributes(__atts, false);
                            state = 8;
                            return ;
                        }
                        revertToParentFromEnterElement(___uri, ___local, ___qname, __atts);
                        return ;
                    case  1 :
                        if (("ActivationPin" == ___local)&&("urn:liberty:ac:2003-08" == ___uri)) {
                            _KeyActivation = ((com.sun.identity.liberty.ws.common.jaxb.ac.impl.KeyActivationTypeImpl) spawnChildFromEnterElement((com.sun.identity.liberty.ws.common.jaxb.ac.impl.KeyActivationTypeImpl.class), 2, ___uri, ___local, ___qname, __atts));
                            return ;
                        }
                        if (("ActivationPin" == ___local)&&("urn:liberty:ac:2003-08" == ___uri)) {
                            _KeyActivation = ((com.sun.identity.liberty.ws.common.jaxb.ac.impl.KeyActivationTypeImpl) spawnChildFromEnterElement((com.sun.identity.liberty.ws.common.jaxb.ac.impl.KeyActivationTypeImpl.class), 2, ___uri, ___local, ___qname, __atts));
                            return ;
                        }
                        if (("Extension" == ___local)&&("urn:liberty:ac:2003-08" == ___uri)) {
                            _KeyActivation = ((com.sun.identity.liberty.ws.common.jaxb.ac.impl.KeyActivationTypeImpl) spawnChildFromEnterElement((com.sun.identity.liberty.ws.common.jaxb.ac.impl.KeyActivationTypeImpl.class), 2, ___uri, ___local, ___qname, __atts));
                            return ;
                        }
                        if (("Extension" == ___local)&&("urn:liberty:ac:2003-08" == ___uri)) {
                            _KeyActivation = ((com.sun.identity.liberty.ws.common.jaxb.ac.impl.KeyActivationTypeImpl) spawnChildFromEnterElement((com.sun.identity.liberty.ws.common.jaxb.ac.impl.KeyActivationTypeImpl.class), 2, ___uri, ___local, ___qname, __atts));
                            return ;
                        }
                        break;
                    case  3 :
                        if (("KeyStorage" == ___local)&&("urn:liberty:ac:2003-08" == ___uri)) {
                            _KeyStorage = ((com.sun.identity.liberty.ws.common.jaxb.ac.impl.KeyStorageElementImpl) spawnChildFromEnterElement((com.sun.identity.liberty.ws.common.jaxb.ac.impl.KeyStorageElementImpl.class), 6, ___uri, ___local, ___qname, __atts));
                            return ;
                        }
                        if (("KeyStorage" == ___local)&&("urn:liberty:ac:2003-08" == ___uri)) {
                            context.pushAttributes(__atts, false);
                            state = 4;
                            return ;
                        }
                        state = 6;
                        continue outer;
                    case  0 :
                        if (("KeyActivation" == ___local)&&("urn:liberty:ac:2003-08" == ___uri)) {
                            _KeyActivation = ((com.sun.identity.liberty.ws.common.jaxb.ac.impl.KeyActivationElementImpl) spawnChildFromEnterElement((com.sun.identity.liberty.ws.common.jaxb.ac.impl.KeyActivationElementImpl.class), 3, ___uri, ___local, ___qname, __atts));
                            return ;
                        }
                        if (("KeyActivation" == ___local)&&("urn:liberty:ac:2003-08" == ___uri)) {
                            context.pushAttributes(__atts, false);
                            state = 1;
                            return ;
                        }
                        state = 3;
                        continue outer;
                    case  8 :
                        if (!(("" == ___uri)||("urn:liberty:ac:2003-08" == ___uri))) {
                            _getExtension().add(((com.sun.identity.liberty.ws.common.jaxb.ac.impl.ExtensionTypeImpl) spawnChildFromEnterElement((com.sun.identity.liberty.ws.common.jaxb.ac.impl.ExtensionTypeImpl.class), 9, ___uri, ___local, ___qname, __atts)));
                            return ;
                        }
                        break;
                    case  6 :
                        if (("Extension" == ___local)&&("urn:liberty:ac:2003-08" == ___uri)) {
                            _getExtension().add(((com.sun.identity.liberty.ws.common.jaxb.ac.impl.ExtensionElementImpl) spawnChildFromEnterElement((com.sun.identity.liberty.ws.common.jaxb.ac.impl.ExtensionElementImpl.class), 7, ___uri, ___local, ___qname, __atts)));
                            return ;
                        }
                        if (("Extension" == ___local)&&("urn:liberty:ac:2003-08" == ___uri)) {
                            context.pushAttributes(__atts, false);
                            state = 8;
                            return ;
                        }
                        break;
                }
                super.enterElement(___uri, ___local, ___qname, __atts);
                break;
            }
        }

        public void leaveElement(java.lang.String ___uri, java.lang.String ___local, java.lang.String ___qname)
            throws org.xml.sax.SAXException
        {
            int attIdx;
            outer:
            while (true) {
                switch (state) {
                    case  4 :
                        attIdx = context.getAttribute("", "medium");
                        if (attIdx >= 0) {
                            context.consumeAttribute(attIdx);
                            context.getCurrentHandler().leaveElement(___uri, ___local, ___qname);
                            return ;
                        }
                        break;
                    case  7 :
                        revertToParentFromLeaveElement(___uri, ___local, ___qname);
                        return ;
                    case  2 :
                        if (("KeyActivation" == ___local)&&("urn:liberty:ac:2003-08" == ___uri)) {
                            context.popAttributes();
                            state = 3;
                            return ;
                        }
                        break;
                    case  3 :
                        state = 6;
                        continue outer;
                    case  0 :
                        state = 3;
                        continue outer;
                    case  9 :
                        if (("Extension" == ___local)&&("urn:liberty:ac:2003-08" == ___uri)) {
                            context.popAttributes();
                            state = 7;
                            return ;
                        }
                        break;
                    case  5 :
                        if (("KeyStorage" == ___local)&&("urn:liberty:ac:2003-08" == ___uri)) {
                            context.popAttributes();
                            state = 6;
                            return ;
                        }
                        break;
                }
                super.leaveElement(___uri, ___local, ___qname);
                break;
            }
        }

        public void enterAttribute(java.lang.String ___uri, java.lang.String ___local, java.lang.String ___qname)
            throws org.xml.sax.SAXException
        {
            int attIdx;
            outer:
            while (true) {
                switch (state) {
                    case  4 :
                        if (("medium" == ___local)&&("" == ___uri)) {
                            _KeyStorage = ((com.sun.identity.liberty.ws.common.jaxb.ac.impl.KeyStorageTypeImpl) spawnChildFromEnterAttribute((com.sun.identity.liberty.ws.common.jaxb.ac.impl.KeyStorageTypeImpl.class), 5, ___uri, ___local, ___qname));
                            return ;
                        }
                        break;
                    case  7 :
                        revertToParentFromEnterAttribute(___uri, ___local, ___qname);
                        return ;
                    case  3 :
                        state = 6;
                        continue outer;
                    case  0 :
                        state = 3;
                        continue outer;
                }
                super.enterAttribute(___uri, ___local, ___qname);
                break;
            }
        }

        public void leaveAttribute(java.lang.String ___uri, java.lang.String ___local, java.lang.String ___qname)
            throws org.xml.sax.SAXException
        {
            int attIdx;
            outer:
            while (true) {
                switch (state) {
                    case  4 :
                        attIdx = context.getAttribute("", "medium");
                        if (attIdx >= 0) {
                            context.consumeAttribute(attIdx);
                            context.getCurrentHandler().leaveAttribute(___uri, ___local, ___qname);
                            return ;
                        }
                        break;
                    case  7 :
                        revertToParentFromLeaveAttribute(___uri, ___local, ___qname);
                        return ;
                    case  3 :
                        state = 6;
                        continue outer;
                    case  0 :
                        state = 3;
                        continue outer;
                }
                super.leaveAttribute(___uri, ___local, ___qname);
                break;
            }
        }

        public void handleText(final java.lang.String value)
            throws org.xml.sax.SAXException
        {
            int attIdx;
            outer:
            while (true) {
                try {
                    switch (state) {
                        case  4 :
                            attIdx = context.getAttribute("", "medium");
                            if (attIdx >= 0) {
                                context.consumeAttribute(attIdx);
                                context.getCurrentHandler().text(value);
                                return ;
                            }
                            break;
                        case  7 :
                            revertToParentFromText(value);
                            return ;
                        case  3 :
                            state = 6;
                            continue outer;
                        case  0 :
                            state = 3;
                            continue outer;
                    }
                } catch (java.lang.RuntimeException e) {
                    handleUnexpectedTextException(value, e);
                }
                break;
            }
        }

    }

}
