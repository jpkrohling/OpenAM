//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v1.0.6-b27-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.06.11 at 10:33:54 AM PDT 
//


package com.sun.identity.liberty.ws.common.jaxb.ac.impl;

public class ActivationLimitTypeImpl implements com.sun.identity.liberty.ws.common.jaxb.ac.ActivationLimitType, com.sun.xml.bind.JAXBObject, com.sun.identity.federation.jaxb.entityconfig.impl.runtime.UnmarshallableObject, com.sun.identity.federation.jaxb.entityconfig.impl.runtime.XMLSerializable, com.sun.identity.federation.jaxb.entityconfig.impl.runtime.ValidatableObject
{

    protected com.sun.identity.liberty.ws.common.jaxb.ac.ActivationLimitSessionType _ActivationLimitSession;
    protected com.sun.identity.liberty.ws.common.jaxb.ac.ActivationLimitDurationType _ActivationLimitDuration;
    protected com.sun.identity.liberty.ws.common.jaxb.ac.ActivationLimitUsagesType _ActivationLimitUsages;
    public final static java.lang.Class version = (com.sun.identity.liberty.ws.common.jaxb.ac.impl.JAXBVersion.class);
    private static com.sun.msv.grammar.Grammar schemaFragment;

    private final static java.lang.Class PRIMARY_INTERFACE_CLASS() {
        return (com.sun.identity.liberty.ws.common.jaxb.ac.ActivationLimitType.class);
    }

    public com.sun.identity.liberty.ws.common.jaxb.ac.ActivationLimitSessionType getActivationLimitSession() {
        return _ActivationLimitSession;
    }

    public void setActivationLimitSession(com.sun.identity.liberty.ws.common.jaxb.ac.ActivationLimitSessionType value) {
        _ActivationLimitSession = value;
    }

    public com.sun.identity.liberty.ws.common.jaxb.ac.ActivationLimitDurationType getActivationLimitDuration() {
        return _ActivationLimitDuration;
    }

    public void setActivationLimitDuration(com.sun.identity.liberty.ws.common.jaxb.ac.ActivationLimitDurationType value) {
        _ActivationLimitDuration = value;
    }

    public com.sun.identity.liberty.ws.common.jaxb.ac.ActivationLimitUsagesType getActivationLimitUsages() {
        return _ActivationLimitUsages;
    }

    public void setActivationLimitUsages(com.sun.identity.liberty.ws.common.jaxb.ac.ActivationLimitUsagesType value) {
        _ActivationLimitUsages = value;
    }

    public com.sun.identity.federation.jaxb.entityconfig.impl.runtime.UnmarshallingEventHandler createUnmarshaller(com.sun.identity.federation.jaxb.entityconfig.impl.runtime.UnmarshallingContext context) {
        return new com.sun.identity.liberty.ws.common.jaxb.ac.impl.ActivationLimitTypeImpl.Unmarshaller(context);
    }

    public void serializeBody(com.sun.identity.federation.jaxb.entityconfig.impl.runtime.XMLSerializer context)
        throws org.xml.sax.SAXException
    {
        if (((_ActivationLimitSession == null)&&(_ActivationLimitDuration!= null))&&(_ActivationLimitUsages == null)) {
            if (_ActivationLimitDuration instanceof javax.xml.bind.Element) {
                context.childAsBody(((com.sun.xml.bind.JAXBObject) _ActivationLimitDuration), "ActivationLimitDuration");
            } else {
                context.startElement("urn:liberty:ac:2003-08", "ActivationLimitDuration");
                context.childAsURIs(((com.sun.xml.bind.JAXBObject) _ActivationLimitDuration), "ActivationLimitDuration");
                context.endNamespaceDecls();
                context.childAsAttributes(((com.sun.xml.bind.JAXBObject) _ActivationLimitDuration), "ActivationLimitDuration");
                context.endAttributes();
                context.childAsBody(((com.sun.xml.bind.JAXBObject) _ActivationLimitDuration), "ActivationLimitDuration");
                context.endElement();
            }
        } else {
            if (((_ActivationLimitSession == null)&&(_ActivationLimitDuration == null))&&(_ActivationLimitUsages!= null)) {
                if (_ActivationLimitUsages instanceof javax.xml.bind.Element) {
                    context.childAsBody(((com.sun.xml.bind.JAXBObject) _ActivationLimitUsages), "ActivationLimitUsages");
                } else {
                    context.startElement("urn:liberty:ac:2003-08", "ActivationLimitUsages");
                    context.childAsURIs(((com.sun.xml.bind.JAXBObject) _ActivationLimitUsages), "ActivationLimitUsages");
                    context.endNamespaceDecls();
                    context.childAsAttributes(((com.sun.xml.bind.JAXBObject) _ActivationLimitUsages), "ActivationLimitUsages");
                    context.endAttributes();
                    context.childAsBody(((com.sun.xml.bind.JAXBObject) _ActivationLimitUsages), "ActivationLimitUsages");
                    context.endElement();
                }
            } else {
                if (((_ActivationLimitSession!= null)&&(_ActivationLimitDuration == null))&&(_ActivationLimitUsages == null)) {
                    if (_ActivationLimitSession instanceof javax.xml.bind.Element) {
                        context.childAsBody(((com.sun.xml.bind.JAXBObject) _ActivationLimitSession), "ActivationLimitSession");
                    } else {
                        context.startElement("urn:liberty:ac:2003-08", "ActivationLimitSession");
                        context.childAsURIs(((com.sun.xml.bind.JAXBObject) _ActivationLimitSession), "ActivationLimitSession");
                        context.endNamespaceDecls();
                        context.childAsAttributes(((com.sun.xml.bind.JAXBObject) _ActivationLimitSession), "ActivationLimitSession");
                        context.endAttributes();
                        context.childAsBody(((com.sun.xml.bind.JAXBObject) _ActivationLimitSession), "ActivationLimitSession");
                        context.endElement();
                    }
                }
            }
        }
    }

    public void serializeAttributes(com.sun.identity.federation.jaxb.entityconfig.impl.runtime.XMLSerializer context)
        throws org.xml.sax.SAXException
    {
        if (((_ActivationLimitSession == null)&&(_ActivationLimitDuration!= null))&&(_ActivationLimitUsages == null)) {
            if (_ActivationLimitDuration instanceof javax.xml.bind.Element) {
                context.childAsAttributes(((com.sun.xml.bind.JAXBObject) _ActivationLimitDuration), "ActivationLimitDuration");
            }
        } else {
            if (((_ActivationLimitSession == null)&&(_ActivationLimitDuration == null))&&(_ActivationLimitUsages!= null)) {
                if (_ActivationLimitUsages instanceof javax.xml.bind.Element) {
                    context.childAsAttributes(((com.sun.xml.bind.JAXBObject) _ActivationLimitUsages), "ActivationLimitUsages");
                }
            } else {
                if (((_ActivationLimitSession!= null)&&(_ActivationLimitDuration == null))&&(_ActivationLimitUsages == null)) {
                    if (_ActivationLimitSession instanceof javax.xml.bind.Element) {
                        context.childAsAttributes(((com.sun.xml.bind.JAXBObject) _ActivationLimitSession), "ActivationLimitSession");
                    }
                }
            }
        }
    }

    public void serializeURIs(com.sun.identity.federation.jaxb.entityconfig.impl.runtime.XMLSerializer context)
        throws org.xml.sax.SAXException
    {
        if (((_ActivationLimitSession == null)&&(_ActivationLimitDuration!= null))&&(_ActivationLimitUsages == null)) {
            if (_ActivationLimitDuration instanceof javax.xml.bind.Element) {
                context.childAsURIs(((com.sun.xml.bind.JAXBObject) _ActivationLimitDuration), "ActivationLimitDuration");
            }
        } else {
            if (((_ActivationLimitSession == null)&&(_ActivationLimitDuration == null))&&(_ActivationLimitUsages!= null)) {
                if (_ActivationLimitUsages instanceof javax.xml.bind.Element) {
                    context.childAsURIs(((com.sun.xml.bind.JAXBObject) _ActivationLimitUsages), "ActivationLimitUsages");
                }
            } else {
                if (((_ActivationLimitSession!= null)&&(_ActivationLimitDuration == null))&&(_ActivationLimitUsages == null)) {
                    if (_ActivationLimitSession instanceof javax.xml.bind.Element) {
                        context.childAsURIs(((com.sun.xml.bind.JAXBObject) _ActivationLimitSession), "ActivationLimitSession");
                    }
                }
            }
        }
    }

    public java.lang.Class getPrimaryInterface() {
        return (com.sun.identity.liberty.ws.common.jaxb.ac.ActivationLimitType.class);
    }

    public com.sun.msv.verifier.DocumentDeclaration createRawValidator() {
        if (schemaFragment == null) {
            schemaFragment = com.sun.xml.bind.validator.SchemaDeserializer.deserialize((
 "\u00ac\u00ed\u0000\u0005sr\u0000\u001dcom.sun.msv.grammar.ChoiceExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\u001dcom.sun."
+"msv.grammar.BinaryExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\u0004exp1t\u0000 Lcom/sun/msv/gramm"
+"ar/Expression;L\u0000\u0004exp2q\u0000~\u0000\u0002xr\u0000\u001ecom.sun.msv.grammar.Expression"
+"\u00f8\u0018\u0082\u00e8N5~O\u0002\u0000\u0002L\u0000\u0013epsilonReducibilityt\u0000\u0013Ljava/lang/Boolean;L\u0000\u000bex"
+"pandedExpq\u0000~\u0000\u0002xpppsq\u0000~\u0000\u0000ppsq\u0000~\u0000\u0000ppsq\u0000~\u0000\u0000ppsq\u0000~\u0000\u0000ppsr\u0000\'com.su"
+"n.msv.grammar.trex.ElementPattern\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000\tnameClasst\u0000\u001fL"
+"com/sun/msv/grammar/NameClass;xr\u0000\u001ecom.sun.msv.grammar.Elemen"
+"tExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002Z\u0000\u001aignoreUndeclaredAttributesL\u0000\fcontentModelq"
+"\u0000~\u0000\u0002xq\u0000~\u0000\u0003pp\u0000sq\u0000~\u0000\u0000ppsr\u0000 com.sun.msv.grammar.OneOrMoreExp\u0000\u0000\u0000"
+"\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\u001ccom.sun.msv.grammar.UnaryExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000\u0003expq\u0000~"
+"\u0000\u0002xq\u0000~\u0000\u0003sr\u0000\u0011java.lang.Boolean\u00cd r\u0080\u00d5\u009c\u00fa\u00ee\u0002\u0000\u0001Z\u0000\u0005valuexp\u0000psr\u0000 com."
+"sun.msv.grammar.AttributeExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\u0003expq\u0000~\u0000\u0002L\u0000\tnameCla"
+"ssq\u0000~\u0000\u000bxq\u0000~\u0000\u0003q\u0000~\u0000\u0013psr\u00002com.sun.msv.grammar.Expression$AnyStr"
+"ingExpression\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0003sq\u0000~\u0000\u0012\u0001q\u0000~\u0000\u0017sr\u0000 com.sun.msv.gr"
+"ammar.AnyNameClass\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\u001dcom.sun.msv.grammar.NameCla"
+"ss\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xpsr\u00000com.sun.msv.grammar.Expression$EpsilonExp"
+"ression\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0003q\u0000~\u0000\u0018q\u0000~\u0000\u001dsr\u0000#com.sun.msv.grammar.Si"
+"mpleNameClass\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\tlocalNamet\u0000\u0012Ljava/lang/String;L\u0000\f"
+"namespaceURIq\u0000~\u0000\u001fxq\u0000~\u0000\u001at\u0000Icom.sun.identity.liberty.ws.common"
+".jaxb.ac.ActivationLimitDurationElementt\u0000+http://java.sun.co"
+"m/jaxb/xjc/dummy-elementssq\u0000~\u0000\npp\u0000sr\u0000\u001fcom.sun.msv.grammar.Se"
+"quenceExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0001ppsq\u0000~\u0000\npp\u0000sq\u0000~\u0000\u0000ppsq\u0000~\u0000\u000fq\u0000~\u0000\u0013psq\u0000"
+"~\u0000\u0014q\u0000~\u0000\u0013pq\u0000~\u0000\u0017q\u0000~\u0000\u001bq\u0000~\u0000\u001dsq\u0000~\u0000\u001et\u0000Fcom.sun.identity.liberty.ws"
+".common.jaxb.ac.ActivationLimitDurationTypeq\u0000~\u0000\"sq\u0000~\u0000\u0000ppsq\u0000~"
+"\u0000\u0014q\u0000~\u0000\u0013psr\u0000\u001bcom.sun.msv.grammar.DataExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0003L\u0000\u0002dtt\u0000\u001fLo"
+"rg/relaxng/datatype/Datatype;L\u0000\u0006exceptq\u0000~\u0000\u0002L\u0000\u0004namet\u0000\u001dLcom/su"
+"n/msv/util/StringPair;xq\u0000~\u0000\u0003q\u0000~\u0000\u0013psr\u0000\"com.sun.msv.datatype.x"
+"sd.QnameType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000*com.sun.msv.datatype.xsd.BuiltinA"
+"tomicType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000%com.sun.msv.datatype.xsd.ConcreteTyp"
+"e\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\'com.sun.msv.datatype.xsd.XSDatatypeImpl\u0000\u0000\u0000\u0000\u0000"
+"\u0000\u0000\u0001\u0002\u0000\u0003L\u0000\fnamespaceUriq\u0000~\u0000\u001fL\u0000\btypeNameq\u0000~\u0000\u001fL\u0000\nwhiteSpacet\u0000.Lc"
+"om/sun/msv/datatype/xsd/WhiteSpaceProcessor;xpt\u0000 http://www."
+"w3.org/2001/XMLSchemat\u0000\u0005QNamesr\u00005com.sun.msv.datatype.xsd.Wh"
+"iteSpaceProcessor$Collapse\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000,com.sun.msv.datatyp"
+"e.xsd.WhiteSpaceProcessor\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xpsr\u00000com.sun.msv.gramma"
+"r.Expression$NullSetExpression\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0003q\u0000~\u0000\u0013psr\u0000\u001bcom"
+".sun.msv.util.StringPair\u00d0t\u001ejB\u008f\u008d\u00a0\u0002\u0000\u0002L\u0000\tlocalNameq\u0000~\u0000\u001fL\u0000\fnames"
+"paceURIq\u0000~\u0000\u001fxpq\u0000~\u00009q\u0000~\u00008sq\u0000~\u0000\u001et\u0000\u0004typet\u0000)http://www.w3.org/20"
+"01/XMLSchema-instanceq\u0000~\u0000\u001dsq\u0000~\u0000\u001et\u0000\u0017ActivationLimitDurationt\u0000"
+"\u0016urn:liberty:ac:2003-08sq\u0000~\u0000\npp\u0000sq\u0000~\u0000\u0000ppsq\u0000~\u0000\u000fq\u0000~\u0000\u0013psq\u0000~\u0000\u0014q\u0000"
+"~\u0000\u0013pq\u0000~\u0000\u0017q\u0000~\u0000\u001bq\u0000~\u0000\u001dsq\u0000~\u0000\u001et\u0000Gcom.sun.identity.liberty.ws.comm"
+"on.jaxb.ac.ActivationLimitUsagesElementq\u0000~\u0000\"sq\u0000~\u0000\npp\u0000sq\u0000~\u0000$p"
+"psq\u0000~\u0000\npp\u0000sq\u0000~\u0000\u0000ppsq\u0000~\u0000\u000fq\u0000~\u0000\u0013psq\u0000~\u0000\u0014q\u0000~\u0000\u0013pq\u0000~\u0000\u0017q\u0000~\u0000\u001bq\u0000~\u0000\u001dsq\u0000"
+"~\u0000\u001et\u0000Dcom.sun.identity.liberty.ws.common.jaxb.ac.ActivationL"
+"imitUsagesTypeq\u0000~\u0000\"sq\u0000~\u0000\u0000ppsq\u0000~\u0000\u0014q\u0000~\u0000\u0013pq\u0000~\u00001q\u0000~\u0000Aq\u0000~\u0000\u001dsq\u0000~\u0000\u001e"
+"t\u0000\u0015ActivationLimitUsagesq\u0000~\u0000Fsq\u0000~\u0000\npp\u0000sq\u0000~\u0000\u0000ppsq\u0000~\u0000\u000fq\u0000~\u0000\u0013psq"
+"\u0000~\u0000\u0014q\u0000~\u0000\u0013pq\u0000~\u0000\u0017q\u0000~\u0000\u001bq\u0000~\u0000\u001dsq\u0000~\u0000\u001et\u0000Hcom.sun.identity.liberty.w"
+"s.common.jaxb.ac.ActivationLimitSessionElementq\u0000~\u0000\"sq\u0000~\u0000\npp\u0000"
+"sq\u0000~\u0000$ppsq\u0000~\u0000\npp\u0000sq\u0000~\u0000\u0000ppsq\u0000~\u0000\u000fq\u0000~\u0000\u0013psq\u0000~\u0000\u0014q\u0000~\u0000\u0013pq\u0000~\u0000\u0017q\u0000~\u0000\u001bq"
+"\u0000~\u0000\u001dsq\u0000~\u0000\u001et\u0000Ecom.sun.identity.liberty.ws.common.jaxb.ac.Acti"
+"vationLimitSessionTypeq\u0000~\u0000\"sq\u0000~\u0000\u0000ppsq\u0000~\u0000\u0014q\u0000~\u0000\u0013pq\u0000~\u00001q\u0000~\u0000Aq\u0000~"
+"\u0000\u001dsq\u0000~\u0000\u001et\u0000\u0016ActivationLimitSessionq\u0000~\u0000Fsr\u0000\"com.sun.msv.gramma"
+"r.ExpressionPool\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000\bexpTablet\u0000/Lcom/sun/msv/gramma"
+"r/ExpressionPool$ClosedHash;xpsr\u0000-com.sun.msv.grammar.Expres"
+"sionPool$ClosedHash\u00d7j\u00d0N\u00ef\u00e8\u00ed\u001c\u0003\u0000\u0003I\u0000\u0005countB\u0000\rstreamVersionL\u0000\u0006par"
+"entt\u0000$Lcom/sun/msv/grammar/ExpressionPool;xp\u0000\u0000\u0000\u0017\u0001pq\u0000~\u0000\u0011q\u0000~\u0000("
+"q\u0000~\u0000Iq\u0000~\u0000Qq\u0000~\u0000[q\u0000~\u0000cq\u0000~\u0000\u0005q\u0000~\u0000\u0006q\u0000~\u0000\u000eq\u0000~\u0000\'q\u0000~\u0000Hq\u0000~\u0000Pq\u0000~\u0000Zq\u0000~\u0000b"
+"q\u0000~\u0000%q\u0000~\u0000Nq\u0000~\u0000`q\u0000~\u0000\bq\u0000~\u0000\u0007q\u0000~\u0000,q\u0000~\u0000Uq\u0000~\u0000gq\u0000~\u0000\tx"));
        }
        return new com.sun.msv.verifier.regexp.REDocumentDeclaration(schemaFragment);
    }

    public class Unmarshaller
        extends com.sun.identity.federation.jaxb.entityconfig.impl.runtime.AbstractUnmarshallingEventHandlerImpl
    {


        public Unmarshaller(com.sun.identity.federation.jaxb.entityconfig.impl.runtime.UnmarshallingContext context) {
            super(context, "--------");
        }

        protected Unmarshaller(com.sun.identity.federation.jaxb.entityconfig.impl.runtime.UnmarshallingContext context, int startState) {
            this(context);
            state = startState;
        }

        public java.lang.Object owner() {
            return com.sun.identity.liberty.ws.common.jaxb.ac.impl.ActivationLimitTypeImpl.this;
        }

        public void enterElement(java.lang.String ___uri, java.lang.String ___local, java.lang.String ___qname, org.xml.sax.Attributes __atts)
            throws org.xml.sax.SAXException
        {
            int attIdx;
            outer:
            while (true) {
                switch (state) {
                    case  1 :
                        revertToParentFromEnterElement(___uri, ___local, ___qname, __atts);
                        return ;
                    case  4 :
                        attIdx = context.getAttribute("", "duration");
                        if (attIdx >= 0) {
                            context.consumeAttribute(attIdx);
                            context.getCurrentHandler().enterElement(___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        break;
                    case  0 :
                        if (("ActivationLimitDuration" == ___local)&&("urn:liberty:ac:2003-08" == ___uri)) {
                            _ActivationLimitDuration = ((com.sun.identity.liberty.ws.common.jaxb.ac.impl.ActivationLimitDurationElementImpl) spawnChildFromEnterElement((com.sun.identity.liberty.ws.common.jaxb.ac.impl.ActivationLimitDurationElementImpl.class), 1, ___uri, ___local, ___qname, __atts));
                            return ;
                        }
                        if (("ActivationLimitDuration" == ___local)&&("urn:liberty:ac:2003-08" == ___uri)) {
                            context.pushAttributes(__atts, false);
                            state = 4;
                            return ;
                        }
                        if (("ActivationLimitUsages" == ___local)&&("urn:liberty:ac:2003-08" == ___uri)) {
                            _ActivationLimitUsages = ((com.sun.identity.liberty.ws.common.jaxb.ac.impl.ActivationLimitUsagesElementImpl) spawnChildFromEnterElement((com.sun.identity.liberty.ws.common.jaxb.ac.impl.ActivationLimitUsagesElementImpl.class), 1, ___uri, ___local, ___qname, __atts));
                            return ;
                        }
                        if (("ActivationLimitUsages" == ___local)&&("urn:liberty:ac:2003-08" == ___uri)) {
                            context.pushAttributes(__atts, false);
                            state = 2;
                            return ;
                        }
                        if (("ActivationLimitSession" == ___local)&&("urn:liberty:ac:2003-08" == ___uri)) {
                            _ActivationLimitSession = ((com.sun.identity.liberty.ws.common.jaxb.ac.impl.ActivationLimitSessionElementImpl) spawnChildFromEnterElement((com.sun.identity.liberty.ws.common.jaxb.ac.impl.ActivationLimitSessionElementImpl.class), 1, ___uri, ___local, ___qname, __atts));
                            return ;
                        }
                        if (("ActivationLimitSession" == ___local)&&("urn:liberty:ac:2003-08" == ___uri)) {
                            context.pushAttributes(__atts, false);
                            state = 6;
                            return ;
                        }
                        break;
                    case  6 :
                        _ActivationLimitSession = ((com.sun.identity.liberty.ws.common.jaxb.ac.impl.ActivationLimitSessionTypeImpl) spawnChildFromEnterElement((com.sun.identity.liberty.ws.common.jaxb.ac.impl.ActivationLimitSessionTypeImpl.class), 7, ___uri, ___local, ___qname, __atts));
                        return ;
                    case  2 :
                        attIdx = context.getAttribute("", "number");
                        if (attIdx >= 0) {
                            context.consumeAttribute(attIdx);
                            context.getCurrentHandler().enterElement(___uri, ___local, ___qname, __atts);
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
                    case  1 :
                        revertToParentFromLeaveElement(___uri, ___local, ___qname);
                        return ;
                    case  5 :
                        if (("ActivationLimitDuration" == ___local)&&("urn:liberty:ac:2003-08" == ___uri)) {
                            context.popAttributes();
                            state = 1;
                            return ;
                        }
                        break;
                    case  3 :
                        if (("ActivationLimitUsages" == ___local)&&("urn:liberty:ac:2003-08" == ___uri)) {
                            context.popAttributes();
                            state = 1;
                            return ;
                        }
                        break;
                    case  4 :
                        attIdx = context.getAttribute("", "duration");
                        if (attIdx >= 0) {
                            context.consumeAttribute(attIdx);
                            context.getCurrentHandler().leaveElement(___uri, ___local, ___qname);
                            return ;
                        }
                        break;
                    case  6 :
                        _ActivationLimitSession = ((com.sun.identity.liberty.ws.common.jaxb.ac.impl.ActivationLimitSessionTypeImpl) spawnChildFromLeaveElement((com.sun.identity.liberty.ws.common.jaxb.ac.impl.ActivationLimitSessionTypeImpl.class), 7, ___uri, ___local, ___qname));
                        return ;
                    case  2 :
                        attIdx = context.getAttribute("", "number");
                        if (attIdx >= 0) {
                            context.consumeAttribute(attIdx);
                            context.getCurrentHandler().leaveElement(___uri, ___local, ___qname);
                            return ;
                        }
                        break;
                    case  7 :
                        if (("ActivationLimitSession" == ___local)&&("urn:liberty:ac:2003-08" == ___uri)) {
                            context.popAttributes();
                            state = 1;
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
                    case  1 :
                        revertToParentFromEnterAttribute(___uri, ___local, ___qname);
                        return ;
                    case  4 :
                        if (("duration" == ___local)&&("" == ___uri)) {
                            _ActivationLimitDuration = ((com.sun.identity.liberty.ws.common.jaxb.ac.impl.ActivationLimitDurationTypeImpl) spawnChildFromEnterAttribute((com.sun.identity.liberty.ws.common.jaxb.ac.impl.ActivationLimitDurationTypeImpl.class), 5, ___uri, ___local, ___qname));
                            return ;
                        }
                        break;
                    case  6 :
                        _ActivationLimitSession = ((com.sun.identity.liberty.ws.common.jaxb.ac.impl.ActivationLimitSessionTypeImpl) spawnChildFromEnterAttribute((com.sun.identity.liberty.ws.common.jaxb.ac.impl.ActivationLimitSessionTypeImpl.class), 7, ___uri, ___local, ___qname));
                        return ;
                    case  2 :
                        if (("number" == ___local)&&("" == ___uri)) {
                            _ActivationLimitUsages = ((com.sun.identity.liberty.ws.common.jaxb.ac.impl.ActivationLimitUsagesTypeImpl) spawnChildFromEnterAttribute((com.sun.identity.liberty.ws.common.jaxb.ac.impl.ActivationLimitUsagesTypeImpl.class), 3, ___uri, ___local, ___qname));
                            return ;
                        }
                        break;
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
                    case  1 :
                        revertToParentFromLeaveAttribute(___uri, ___local, ___qname);
                        return ;
                    case  4 :
                        attIdx = context.getAttribute("", "duration");
                        if (attIdx >= 0) {
                            context.consumeAttribute(attIdx);
                            context.getCurrentHandler().leaveAttribute(___uri, ___local, ___qname);
                            return ;
                        }
                        break;
                    case  6 :
                        _ActivationLimitSession = ((com.sun.identity.liberty.ws.common.jaxb.ac.impl.ActivationLimitSessionTypeImpl) spawnChildFromLeaveAttribute((com.sun.identity.liberty.ws.common.jaxb.ac.impl.ActivationLimitSessionTypeImpl.class), 7, ___uri, ___local, ___qname));
                        return ;
                    case  2 :
                        attIdx = context.getAttribute("", "number");
                        if (attIdx >= 0) {
                            context.consumeAttribute(attIdx);
                            context.getCurrentHandler().leaveAttribute(___uri, ___local, ___qname);
                            return ;
                        }
                        break;
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
                        case  1 :
                            revertToParentFromText(value);
                            return ;
                        case  4 :
                            attIdx = context.getAttribute("", "duration");
                            if (attIdx >= 0) {
                                context.consumeAttribute(attIdx);
                                context.getCurrentHandler().text(value);
                                return ;
                            }
                            break;
                        case  6 :
                            _ActivationLimitSession = ((com.sun.identity.liberty.ws.common.jaxb.ac.impl.ActivationLimitSessionTypeImpl) spawnChildFromText((com.sun.identity.liberty.ws.common.jaxb.ac.impl.ActivationLimitSessionTypeImpl.class), 7, value));
                            return ;
                        case  2 :
                            attIdx = context.getAttribute("", "number");
                            if (attIdx >= 0) {
                                context.consumeAttribute(attIdx);
                                context.getCurrentHandler().text(value);
                                return ;
                            }
                            break;
                    }
                } catch (java.lang.RuntimeException e) {
                    handleUnexpectedTextException(value, e);
                }
                break;
            }
        }

    }

}
