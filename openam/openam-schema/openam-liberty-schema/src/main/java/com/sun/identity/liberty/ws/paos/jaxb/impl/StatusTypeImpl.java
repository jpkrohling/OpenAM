//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v1.0.6-b27-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.06.11 at 10:33:54 AM PDT 
//


package com.sun.identity.liberty.ws.paos.jaxb.impl;

public class StatusTypeImpl implements com.sun.identity.liberty.ws.paos.jaxb.StatusType, com.sun.xml.bind.JAXBObject, com.sun.identity.federation.jaxb.entityconfig.impl.runtime.UnmarshallableObject, com.sun.identity.federation.jaxb.entityconfig.impl.runtime.XMLSerializable, com.sun.identity.federation.jaxb.entityconfig.impl.runtime.ValidatableObject
{

    protected com.sun.identity.liberty.ws.paos.jaxb.StatusType _Status;
    protected java.lang.String _Ref;
    protected java.lang.String _Comment;
    protected javax.xml.namespace.QName _Code;
    public final static java.lang.Class version = (com.sun.identity.liberty.ws.paos.jaxb.impl.JAXBVersion.class);
    private static com.sun.msv.grammar.Grammar schemaFragment;

    private final static java.lang.Class PRIMARY_INTERFACE_CLASS() {
        return (com.sun.identity.liberty.ws.paos.jaxb.StatusType.class);
    }

    public com.sun.identity.liberty.ws.paos.jaxb.StatusType getStatus() {
        return _Status;
    }

    public void setStatus(com.sun.identity.liberty.ws.paos.jaxb.StatusType value) {
        _Status = value;
    }

    public java.lang.String getRef() {
        return _Ref;
    }

    public void setRef(java.lang.String value) {
        _Ref = value;
    }

    public java.lang.String getComment() {
        return _Comment;
    }

    public void setComment(java.lang.String value) {
        _Comment = value;
    }

    public javax.xml.namespace.QName getCode() {
        return _Code;
    }

    public void setCode(javax.xml.namespace.QName value) {
        _Code = value;
    }

    public com.sun.identity.federation.jaxb.entityconfig.impl.runtime.UnmarshallingEventHandler createUnmarshaller(com.sun.identity.federation.jaxb.entityconfig.impl.runtime.UnmarshallingContext context) {
        return new com.sun.identity.liberty.ws.paos.jaxb.impl.StatusTypeImpl.Unmarshaller(context);
    }

    public void serializeBody(com.sun.identity.federation.jaxb.entityconfig.impl.runtime.XMLSerializer context)
        throws org.xml.sax.SAXException
    {
        if (_Status!= null) {
            if (_Status instanceof javax.xml.bind.Element) {
                context.childAsBody(((com.sun.xml.bind.JAXBObject) _Status), "Status");
            } else {
                context.startElement("urn:liberty:paos:2003-08", "Status");
                context.childAsURIs(((com.sun.xml.bind.JAXBObject) _Status), "Status");
                context.endNamespaceDecls();
                context.childAsAttributes(((com.sun.xml.bind.JAXBObject) _Status), "Status");
                context.endAttributes();
                context.childAsBody(((com.sun.xml.bind.JAXBObject) _Status), "Status");
                context.endElement();
            }
        }
    }

    public void serializeAttributes(com.sun.identity.federation.jaxb.entityconfig.impl.runtime.XMLSerializer context)
        throws org.xml.sax.SAXException
    {
        context.startAttribute("", "code");
        try {
            context.text(javax.xml.bind.DatatypeConverter.printQName(((javax.xml.namespace.QName) _Code), context.getNamespaceContext()), "Code");
        } catch (java.lang.Exception e) {
            com.sun.identity.federation.jaxb.entityconfig.impl.runtime.Util.handlePrintConversionException(this, e, context);
        }
        context.endAttribute();
        if (_Comment!= null) {
            context.startAttribute("", "comment");
            try {
                context.text(((java.lang.String) _Comment), "Comment");
            } catch (java.lang.Exception e) {
                com.sun.identity.federation.jaxb.entityconfig.impl.runtime.Util.handlePrintConversionException(this, e, context);
            }
            context.endAttribute();
        }
        if (_Ref!= null) {
            context.startAttribute("", "ref");
            try {
                context.text(((java.lang.String) _Ref), "Ref");
            } catch (java.lang.Exception e) {
                com.sun.identity.federation.jaxb.entityconfig.impl.runtime.Util.handlePrintConversionException(this, e, context);
            }
            context.endAttribute();
        }
        if (_Status!= null) {
            if (_Status instanceof javax.xml.bind.Element) {
                context.childAsAttributes(((com.sun.xml.bind.JAXBObject) _Status), "Status");
            }
        }
    }

    public void serializeURIs(com.sun.identity.federation.jaxb.entityconfig.impl.runtime.XMLSerializer context)
        throws org.xml.sax.SAXException
    {
        try {
            context.getNamespaceContext().declareNamespace(((javax.xml.namespace.QName) _Code).getNamespaceURI(), ((javax.xml.namespace.QName) _Code).getPrefix(), false);
        } catch (java.lang.Exception e) {
            com.sun.identity.federation.jaxb.entityconfig.impl.runtime.Util.handlePrintConversionException(this, e, context);
        }
        if (_Status!= null) {
            if (_Status instanceof javax.xml.bind.Element) {
                context.childAsURIs(((com.sun.xml.bind.JAXBObject) _Status), "Status");
            }
        }
    }

    public java.lang.Class getPrimaryInterface() {
        return (com.sun.identity.liberty.ws.paos.jaxb.StatusType.class);
    }

    public com.sun.msv.verifier.DocumentDeclaration createRawValidator() {
        if (schemaFragment == null) {
            schemaFragment = com.sun.xml.bind.validator.SchemaDeserializer.deserialize((
 "\u00ac\u00ed\u0000\u0005sr\u0000\u001fcom.sun.msv.grammar.SequenceExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\u001dcom.su"
+"n.msv.grammar.BinaryExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\u0004exp1t\u0000 Lcom/sun/msv/gra"
+"mmar/Expression;L\u0000\u0004exp2q\u0000~\u0000\u0002xr\u0000\u001ecom.sun.msv.grammar.Expressi"
+"on\u00f8\u0018\u0082\u00e8N5~O\u0002\u0000\u0002L\u0000\u0013epsilonReducibilityt\u0000\u0013Ljava/lang/Boolean;L\u0000\u000b"
+"expandedExpq\u0000~\u0000\u0002xpppsq\u0000~\u0000\u0000ppsq\u0000~\u0000\u0000ppsr\u0000\u001dcom.sun.msv.grammar."
+"ChoiceExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0001ppsq\u0000~\u0000\bsr\u0000\u0011java.lang.Boolean\u00cd r\u0080\u00d5"
+"\u009c\u00fa\u00ee\u0002\u0000\u0001Z\u0000\u0005valuexp\u0000psr\u0000\'com.sun.msv.grammar.trex.ElementPatter"
+"n\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000\tnameClasst\u0000\u001fLcom/sun/msv/grammar/NameClass;xr"
+"\u0000\u001ecom.sun.msv.grammar.ElementExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002Z\u0000\u001aignoreUndeclar"
+"edAttributesL\u0000\fcontentModelq\u0000~\u0000\u0002xq\u0000~\u0000\u0003q\u0000~\u0000\fp\u0000sq\u0000~\u0000\bppsr\u0000 com"
+".sun.msv.grammar.OneOrMoreExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\u001ccom.sun.msv.gram"
+"mar.UnaryExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000\u0003expq\u0000~\u0000\u0002xq\u0000~\u0000\u0003q\u0000~\u0000\fpsr\u0000 com.sun.ms"
+"v.grammar.AttributeExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\u0003expq\u0000~\u0000\u0002L\u0000\tnameClassq\u0000~\u0000"
+"\u000exq\u0000~\u0000\u0003q\u0000~\u0000\fpsr\u00002com.sun.msv.grammar.Expression$AnyStringExp"
+"ression\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0003sq\u0000~\u0000\u000b\u0001q\u0000~\u0000\u0018sr\u0000 com.sun.msv.grammar."
+"AnyNameClass\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\u001dcom.sun.msv.grammar.NameClass\u0000\u0000\u0000\u0000"
+"\u0000\u0000\u0000\u0001\u0002\u0000\u0000xpsr\u00000com.sun.msv.grammar.Expression$EpsilonExpressio"
+"n\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0003q\u0000~\u0000\u0019q\u0000~\u0000\u001esr\u0000#com.sun.msv.grammar.SimpleNa"
+"meClass\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\tlocalNamet\u0000\u0012Ljava/lang/String;L\u0000\fnamesp"
+"aceURIq\u0000~\u0000 xq\u0000~\u0000\u001bt\u00003com.sun.identity.liberty.ws.paos.jaxb.St"
+"atusElementt\u0000+http://java.sun.com/jaxb/xjc/dummy-elementssq\u0000"
+"~\u0000\rq\u0000~\u0000\fp\u0000sq\u0000~\u0000\u0000ppsq\u0000~\u0000\rpp\u0000sq\u0000~\u0000\bppsq\u0000~\u0000\u0012q\u0000~\u0000\fpsq\u0000~\u0000\u0015q\u0000~\u0000\fpq"
+"\u0000~\u0000\u0018q\u0000~\u0000\u001cq\u0000~\u0000\u001esq\u0000~\u0000\u001ft\u00000com.sun.identity.liberty.ws.paos.jaxb"
+".StatusTypeq\u0000~\u0000#sq\u0000~\u0000\bppsq\u0000~\u0000\u0015q\u0000~\u0000\fpsr\u0000\u001bcom.sun.msv.grammar."
+"DataExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0003L\u0000\u0002dtt\u0000\u001fLorg/relaxng/datatype/Datatype;L\u0000\u0006"
+"exceptq\u0000~\u0000\u0002L\u0000\u0004namet\u0000\u001dLcom/sun/msv/util/StringPair;xq\u0000~\u0000\u0003q\u0000~\u0000"
+"\fpsr\u0000\"com.sun.msv.datatype.xsd.QnameType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000*com.s"
+"un.msv.datatype.xsd.BuiltinAtomicType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000%com.sun."
+"msv.datatype.xsd.ConcreteType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\'com.sun.msv.data"
+"type.xsd.XSDatatypeImpl\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0003L\u0000\fnamespaceUriq\u0000~\u0000 L\u0000\btyp"
+"eNameq\u0000~\u0000 L\u0000\nwhiteSpacet\u0000.Lcom/sun/msv/datatype/xsd/WhiteSpa"
+"ceProcessor;xpt\u0000 http://www.w3.org/2001/XMLSchemat\u0000\u0005QNamesr\u0000"
+"5com.sun.msv.datatype.xsd.WhiteSpaceProcessor$Collapse\u0000\u0000\u0000\u0000\u0000\u0000"
+"\u0000\u0001\u0002\u0000\u0000xr\u0000,com.sun.msv.datatype.xsd.WhiteSpaceProcessor\u0000\u0000\u0000\u0000\u0000\u0000\u0000"
+"\u0001\u0002\u0000\u0000xpsr\u00000com.sun.msv.grammar.Expression$NullSetExpression\u0000\u0000"
+"\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0003q\u0000~\u0000\fpsr\u0000\u001bcom.sun.msv.util.StringPair\u00d0t\u001ejB\u008f\u008d\u00a0"
+"\u0002\u0000\u0002L\u0000\tlocalNameq\u0000~\u0000 L\u0000\fnamespaceURIq\u0000~\u0000 xpq\u0000~\u00009q\u0000~\u00008sq\u0000~\u0000\u001ft\u0000"
+"\u0004typet\u0000)http://www.w3.org/2001/XMLSchema-instanceq\u0000~\u0000\u001esq\u0000~\u0000\u001f"
+"t\u0000\u0006Statust\u0000\u0018urn:liberty:paos:2003-08q\u0000~\u0000\u001esq\u0000~\u0000\u0015ppq\u0000~\u00001sq\u0000~\u0000\u001f"
+"t\u0000\u0004codet\u0000\u0000sq\u0000~\u0000\bppsq\u0000~\u0000\u0015q\u0000~\u0000\fpsq\u0000~\u0000.q\u0000~\u0000\fpsr\u0000#com.sun.msv.da"
+"tatype.xsd.StringType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001Z\u0000\risAlwaysValidxq\u0000~\u00003q\u0000~\u00008t"
+"\u0000\u0006stringsr\u00005com.sun.msv.datatype.xsd.WhiteSpaceProcessor$Pre"
+"serve\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000;\u0001q\u0000~\u0000>sq\u0000~\u0000?q\u0000~\u0000Pq\u0000~\u00008sq\u0000~\u0000\u001ft\u0000\u0007comment"
+"q\u0000~\u0000Jq\u0000~\u0000\u001esq\u0000~\u0000\bppsq\u0000~\u0000\u0015q\u0000~\u0000\fpsq\u0000~\u0000.ppsr\u0000#com.sun.msv.dataty"
+"pe.xsd.NcnameType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\"com.sun.msv.datatype.xsd.Tok"
+"enType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000Nq\u0000~\u00008t\u0000\u0006NCNameq\u0000~\u0000<\u0000q\u0000~\u0000>sq\u0000~\u0000?q\u0000~\u0000\\q"
+"\u0000~\u00008sq\u0000~\u0000\u001ft\u0000\u0003refq\u0000~\u0000Jq\u0000~\u0000\u001esr\u0000\"com.sun.msv.grammar.Expression"
+"Pool\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000\bexpTablet\u0000/Lcom/sun/msv/grammar/Expression"
+"Pool$ClosedHash;xpsr\u0000-com.sun.msv.grammar.ExpressionPool$Clo"
+"sedHash\u00d7j\u00d0N\u00ef\u00e8\u00ed\u001c\u0003\u0000\u0003I\u0000\u0005countB\u0000\rstreamVersionL\u0000\u0006parentt\u0000$Lcom/s"
+"un/msv/grammar/ExpressionPool;xp\u0000\u0000\u0000\r\u0001pq\u0000~\u0000\u0014q\u0000~\u0000(q\u0000~\u0000Kq\u0000~\u0000\u0011q\u0000"
+"~\u0000\'q\u0000~\u0000%q\u0000~\u0000\u0007q\u0000~\u0000\u0005q\u0000~\u0000\u0006q\u0000~\u0000\tq\u0000~\u0000Vq\u0000~\u0000,q\u0000~\u0000\nx"));
        }
        return new com.sun.msv.verifier.regexp.REDocumentDeclaration(schemaFragment);
    }

    public class Unmarshaller
        extends com.sun.identity.federation.jaxb.entityconfig.impl.runtime.AbstractUnmarshallingEventHandlerImpl
    {


        public Unmarshaller(com.sun.identity.federation.jaxb.entityconfig.impl.runtime.UnmarshallingContext context) {
            super(context, "-------------");
        }

        protected Unmarshaller(com.sun.identity.federation.jaxb.entityconfig.impl.runtime.UnmarshallingContext context, int startState) {
            this(context);
            state = startState;
        }

        public java.lang.Object owner() {
            return com.sun.identity.liberty.ws.paos.jaxb.impl.StatusTypeImpl.this;
        }

        public void enterElement(java.lang.String ___uri, java.lang.String ___local, java.lang.String ___qname, org.xml.sax.Attributes __atts)
            throws org.xml.sax.SAXException
        {
            int attIdx;
            outer:
            while (true) {
                switch (state) {
                    case  12 :
                        revertToParentFromEnterElement(___uri, ___local, ___qname, __atts);
                        return ;
                    case  9 :
                        if (("Status" == ___local)&&("urn:liberty:paos:2003-08" == ___uri)) {
                            _Status = ((com.sun.identity.liberty.ws.paos.jaxb.impl.StatusElementImpl) spawnChildFromEnterElement((com.sun.identity.liberty.ws.paos.jaxb.impl.StatusElementImpl.class), 12, ___uri, ___local, ___qname, __atts));
                            return ;
                        }
                        if (("Status" == ___local)&&("urn:liberty:paos:2003-08" == ___uri)) {
                            context.pushAttributes(__atts, false);
                            state = 10;
                            return ;
                        }
                        state = 12;
                        continue outer;
                    case  10 :
                        attIdx = context.getAttribute("", "code");
                        if (attIdx >= 0) {
                            context.consumeAttribute(attIdx);
                            context.getCurrentHandler().enterElement(___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        break;
                    case  0 :
                        attIdx = context.getAttribute("", "code");
                        if (attIdx >= 0) {
                            final java.lang.String v = context.eatAttribute(attIdx);
                            state = 3;
                            eatText1(v);
                            continue outer;
                        }
                        break;
                    case  3 :
                        attIdx = context.getAttribute("", "comment");
                        if (attIdx >= 0) {
                            final java.lang.String v = context.eatAttribute(attIdx);
                            state = 6;
                            eatText2(v);
                            continue outer;
                        }
                        state = 6;
                        continue outer;
                    case  6 :
                        attIdx = context.getAttribute("", "ref");
                        if (attIdx >= 0) {
                            final java.lang.String v = context.eatAttribute(attIdx);
                            state = 9;
                            eatText3(v);
                            continue outer;
                        }
                        state = 9;
                        continue outer;
                }
                super.enterElement(___uri, ___local, ___qname, __atts);
                break;
            }
        }

        private void eatText1(final java.lang.String value)
            throws org.xml.sax.SAXException
        {
            try {
                _Code = javax.xml.bind.DatatypeConverter.parseQName(com.sun.xml.bind.WhiteSpaceProcessor.collapse(com.sun.xml.bind.WhiteSpaceProcessor.collapse(value)), context);
            } catch (java.lang.Exception e) {
                handleParseConversionException(e);
            }
        }

        private void eatText2(final java.lang.String value)
            throws org.xml.sax.SAXException
        {
            try {
                _Comment = value;
            } catch (java.lang.Exception e) {
                handleParseConversionException(e);
            }
        }

        private void eatText3(final java.lang.String value)
            throws org.xml.sax.SAXException
        {
            try {
                _Ref = com.sun.xml.bind.WhiteSpaceProcessor.collapse(value);
            } catch (java.lang.Exception e) {
                handleParseConversionException(e);
            }
        }

        public void leaveElement(java.lang.String ___uri, java.lang.String ___local, java.lang.String ___qname)
            throws org.xml.sax.SAXException
        {
            int attIdx;
            outer:
            while (true) {
                switch (state) {
                    case  12 :
                        revertToParentFromLeaveElement(___uri, ___local, ___qname);
                        return ;
                    case  9 :
                        state = 12;
                        continue outer;
                    case  10 :
                        attIdx = context.getAttribute("", "code");
                        if (attIdx >= 0) {
                            context.consumeAttribute(attIdx);
                            context.getCurrentHandler().leaveElement(___uri, ___local, ___qname);
                            return ;
                        }
                        break;
                    case  0 :
                        attIdx = context.getAttribute("", "code");
                        if (attIdx >= 0) {
                            final java.lang.String v = context.eatAttribute(attIdx);
                            state = 3;
                            eatText1(v);
                            continue outer;
                        }
                        break;
                    case  3 :
                        attIdx = context.getAttribute("", "comment");
                        if (attIdx >= 0) {
                            final java.lang.String v = context.eatAttribute(attIdx);
                            state = 6;
                            eatText2(v);
                            continue outer;
                        }
                        state = 6;
                        continue outer;
                    case  6 :
                        attIdx = context.getAttribute("", "ref");
                        if (attIdx >= 0) {
                            final java.lang.String v = context.eatAttribute(attIdx);
                            state = 9;
                            eatText3(v);
                            continue outer;
                        }
                        state = 9;
                        continue outer;
                    case  11 :
                        if (("Status" == ___local)&&("urn:liberty:paos:2003-08" == ___uri)) {
                            context.popAttributes();
                            state = 12;
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
                    case  12 :
                        revertToParentFromEnterAttribute(___uri, ___local, ___qname);
                        return ;
                    case  9 :
                        state = 12;
                        continue outer;
                    case  10 :
                        if (("code" == ___local)&&("" == ___uri)) {
                            _Status = ((com.sun.identity.liberty.ws.paos.jaxb.impl.StatusTypeImpl) spawnChildFromEnterAttribute((com.sun.identity.liberty.ws.paos.jaxb.impl.StatusTypeImpl.class), 11, ___uri, ___local, ___qname));
                            return ;
                        }
                        break;
                    case  0 :
                        if (("code" == ___local)&&("" == ___uri)) {
                            state = 1;
                            return ;
                        }
                        break;
                    case  3 :
                        if (("comment" == ___local)&&("" == ___uri)) {
                            state = 4;
                            return ;
                        }
                        state = 6;
                        continue outer;
                    case  6 :
                        if (("ref" == ___local)&&("" == ___uri)) {
                            state = 7;
                            return ;
                        }
                        state = 9;
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
                    case  2 :
                        if (("code" == ___local)&&("" == ___uri)) {
                            state = 3;
                            return ;
                        }
                        break;
                    case  12 :
                        revertToParentFromLeaveAttribute(___uri, ___local, ___qname);
                        return ;
                    case  9 :
                        state = 12;
                        continue outer;
                    case  10 :
                        attIdx = context.getAttribute("", "code");
                        if (attIdx >= 0) {
                            context.consumeAttribute(attIdx);
                            context.getCurrentHandler().leaveAttribute(___uri, ___local, ___qname);
                            return ;
                        }
                        break;
                    case  5 :
                        if (("comment" == ___local)&&("" == ___uri)) {
                            state = 6;
                            return ;
                        }
                        break;
                    case  0 :
                        attIdx = context.getAttribute("", "code");
                        if (attIdx >= 0) {
                            final java.lang.String v = context.eatAttribute(attIdx);
                            state = 3;
                            eatText1(v);
                            continue outer;
                        }
                        break;
                    case  8 :
                        if (("ref" == ___local)&&("" == ___uri)) {
                            state = 9;
                            return ;
                        }
                        break;
                    case  3 :
                        attIdx = context.getAttribute("", "comment");
                        if (attIdx >= 0) {
                            final java.lang.String v = context.eatAttribute(attIdx);
                            state = 6;
                            eatText2(v);
                            continue outer;
                        }
                        state = 6;
                        continue outer;
                    case  6 :
                        attIdx = context.getAttribute("", "ref");
                        if (attIdx >= 0) {
                            final java.lang.String v = context.eatAttribute(attIdx);
                            state = 9;
                            eatText3(v);
                            continue outer;
                        }
                        state = 9;
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
                        case  12 :
                            revertToParentFromText(value);
                            return ;
                        case  9 :
                            state = 12;
                            continue outer;
                        case  10 :
                            attIdx = context.getAttribute("", "code");
                            if (attIdx >= 0) {
                                context.consumeAttribute(attIdx);
                                context.getCurrentHandler().text(value);
                                return ;
                            }
                            break;
                        case  4 :
                            state = 5;
                            eatText2(value);
                            return ;
                        case  0 :
                            attIdx = context.getAttribute("", "code");
                            if (attIdx >= 0) {
                                final java.lang.String v = context.eatAttribute(attIdx);
                                state = 3;
                                eatText1(v);
                                continue outer;
                            }
                            break;
                        case  3 :
                            attIdx = context.getAttribute("", "comment");
                            if (attIdx >= 0) {
                                final java.lang.String v = context.eatAttribute(attIdx);
                                state = 6;
                                eatText2(v);
                                continue outer;
                            }
                            state = 6;
                            continue outer;
                        case  7 :
                            state = 8;
                            eatText3(value);
                            return ;
                        case  6 :
                            attIdx = context.getAttribute("", "ref");
                            if (attIdx >= 0) {
                                final java.lang.String v = context.eatAttribute(attIdx);
                                state = 9;
                                eatText3(v);
                                continue outer;
                            }
                            state = 9;
                            continue outer;
                        case  1 :
                            state = 2;
                            eatText1(value);
                            return ;
                    }
                } catch (java.lang.RuntimeException e) {
                    handleUnexpectedTextException(value, e);
                }
                break;
            }
        }

    }

}
