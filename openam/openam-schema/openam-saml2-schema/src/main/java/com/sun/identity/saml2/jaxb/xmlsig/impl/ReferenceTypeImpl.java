//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v1.0.6-b27-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.06.11 at 10:34:07 AM PDT 
//


package com.sun.identity.saml2.jaxb.xmlsig.impl;

public class ReferenceTypeImpl implements com.sun.identity.saml2.jaxb.xmlsig.ReferenceType, com.sun.xml.bind.JAXBObject, com.sun.identity.saml2.jaxb.assertion.impl.runtime.UnmarshallableObject, com.sun.identity.saml2.jaxb.assertion.impl.runtime.XMLSerializable, com.sun.xml.bind.marshaller.IdentifiableObject, com.sun.identity.saml2.jaxb.assertion.impl.runtime.ValidatableObject
{

    protected com.sun.identity.saml2.jaxb.xmlsig.TransformsType _Transforms;
    protected byte[] _DigestValue;
    protected com.sun.identity.saml2.jaxb.xmlsig.DigestMethodType _DigestMethod;
    protected java.lang.String _Type;
    protected java.lang.String _Id;
    protected java.lang.String _URI;
    public final static java.lang.Class version = (com.sun.identity.saml2.jaxb.xmlsig.impl.JAXBVersion.class);
    private static com.sun.msv.grammar.Grammar schemaFragment;

    private final static java.lang.Class PRIMARY_INTERFACE_CLASS() {
        return (com.sun.identity.saml2.jaxb.xmlsig.ReferenceType.class);
    }

    public com.sun.identity.saml2.jaxb.xmlsig.TransformsType getTransforms() {
        return _Transforms;
    }

    public void setTransforms(com.sun.identity.saml2.jaxb.xmlsig.TransformsType value) {
        _Transforms = value;
    }

    public byte[] getDigestValue() {
        return _DigestValue;
    }

    public void setDigestValue(byte[] value) {
        _DigestValue = value;
    }

    public com.sun.identity.saml2.jaxb.xmlsig.DigestMethodType getDigestMethod() {
        return _DigestMethod;
    }

    public void setDigestMethod(com.sun.identity.saml2.jaxb.xmlsig.DigestMethodType value) {
        _DigestMethod = value;
    }

    public java.lang.String getType() {
        return _Type;
    }

    public void setType(java.lang.String value) {
        _Type = value;
    }

    public java.lang.String getId() {
        return _Id;
    }

    public void setId(java.lang.String value) {
        _Id = value;
    }

    public java.lang.String getURI() {
        return _URI;
    }

    public void setURI(java.lang.String value) {
        _URI = value;
    }

    public com.sun.identity.saml2.jaxb.assertion.impl.runtime.UnmarshallingEventHandler createUnmarshaller(com.sun.identity.saml2.jaxb.assertion.impl.runtime.UnmarshallingContext context) {
        return new com.sun.identity.saml2.jaxb.xmlsig.impl.ReferenceTypeImpl.Unmarshaller(context);
    }

    public void serializeBody(com.sun.identity.saml2.jaxb.assertion.impl.runtime.XMLSerializer context)
        throws org.xml.sax.SAXException
    {
        if (_Transforms!= null) {
            if (_Transforms instanceof javax.xml.bind.Element) {
                context.childAsBody(((com.sun.xml.bind.JAXBObject) _Transforms), "Transforms");
            } else {
                context.startElement("http://www.w3.org/2000/09/xmldsig#", "Transforms");
                context.childAsURIs(((com.sun.xml.bind.JAXBObject) _Transforms), "Transforms");
                context.endNamespaceDecls();
                context.childAsAttributes(((com.sun.xml.bind.JAXBObject) _Transforms), "Transforms");
                context.endAttributes();
                context.childAsBody(((com.sun.xml.bind.JAXBObject) _Transforms), "Transforms");
                context.endElement();
            }
        }
        if (_DigestMethod instanceof javax.xml.bind.Element) {
            context.childAsBody(((com.sun.xml.bind.JAXBObject) _DigestMethod), "DigestMethod");
        } else {
            context.startElement("http://www.w3.org/2000/09/xmldsig#", "DigestMethod");
            context.childAsURIs(((com.sun.xml.bind.JAXBObject) _DigestMethod), "DigestMethod");
            context.endNamespaceDecls();
            context.childAsAttributes(((com.sun.xml.bind.JAXBObject) _DigestMethod), "DigestMethod");
            context.endAttributes();
            context.childAsBody(((com.sun.xml.bind.JAXBObject) _DigestMethod), "DigestMethod");
            context.endElement();
        }
        context.startElement("http://www.w3.org/2000/09/xmldsig#", "DigestValue");
        context.endNamespaceDecls();
        context.endAttributes();
        try {
            context.text(com.sun.msv.datatype.xsd.Base64BinaryType.save(((byte[]) _DigestValue)), "DigestValue");
        } catch (java.lang.Exception e) {
            com.sun.identity.saml2.jaxb.assertion.impl.runtime.Util.handlePrintConversionException(this, e, context);
        }
        context.endElement();
    }

    public void serializeAttributes(com.sun.identity.saml2.jaxb.assertion.impl.runtime.XMLSerializer context)
        throws org.xml.sax.SAXException
    {
        if (_Id!= null) {
            context.startAttribute("", "Id");
            try {
                context.text(context.onID(this, ((java.lang.String) _Id)), "Id");
            } catch (java.lang.Exception e) {
                com.sun.identity.saml2.jaxb.assertion.impl.runtime.Util.handlePrintConversionException(this, e, context);
            }
            context.endAttribute();
        }
        if (_Type!= null) {
            context.startAttribute("", "Type");
            try {
                context.text(((java.lang.String) _Type), "Type");
            } catch (java.lang.Exception e) {
                com.sun.identity.saml2.jaxb.assertion.impl.runtime.Util.handlePrintConversionException(this, e, context);
            }
            context.endAttribute();
        }
        if (_URI!= null) {
            context.startAttribute("", "URI");
            try {
                context.text(((java.lang.String) _URI), "URI");
            } catch (java.lang.Exception e) {
                com.sun.identity.saml2.jaxb.assertion.impl.runtime.Util.handlePrintConversionException(this, e, context);
            }
            context.endAttribute();
        }
        if (_Transforms!= null) {
            if (_Transforms instanceof javax.xml.bind.Element) {
                context.childAsAttributes(((com.sun.xml.bind.JAXBObject) _Transforms), "Transforms");
            }
        }
        if (_DigestMethod instanceof javax.xml.bind.Element) {
            context.childAsAttributes(((com.sun.xml.bind.JAXBObject) _DigestMethod), "DigestMethod");
        }
    }

    public void serializeURIs(com.sun.identity.saml2.jaxb.assertion.impl.runtime.XMLSerializer context)
        throws org.xml.sax.SAXException
    {
        if (_Transforms!= null) {
            if (_Transforms instanceof javax.xml.bind.Element) {
                context.childAsURIs(((com.sun.xml.bind.JAXBObject) _Transforms), "Transforms");
            }
        }
        if (_DigestMethod instanceof javax.xml.bind.Element) {
            context.childAsURIs(((com.sun.xml.bind.JAXBObject) _DigestMethod), "DigestMethod");
        }
    }

    public java.lang.String ____jaxb____getId() {
        return ((java.lang.String) _Id);
    }

    public java.lang.Class getPrimaryInterface() {
        return (com.sun.identity.saml2.jaxb.xmlsig.ReferenceType.class);
    }

    public com.sun.msv.verifier.DocumentDeclaration createRawValidator() {
        if (schemaFragment == null) {
            schemaFragment = com.sun.xml.bind.validator.SchemaDeserializer.deserialize((
 "\u00ac\u00ed\u0000\u0005sr\u0000\u001fcom.sun.msv.grammar.SequenceExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\u001dcom.su"
+"n.msv.grammar.BinaryExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\u0004exp1t\u0000 Lcom/sun/msv/gra"
+"mmar/Expression;L\u0000\u0004exp2q\u0000~\u0000\u0002xr\u0000\u001ecom.sun.msv.grammar.Expressi"
+"on\u00f8\u0018\u0082\u00e8N5~O\u0002\u0000\u0002L\u0000\u0013epsilonReducibilityt\u0000\u0013Ljava/lang/Boolean;L\u0000\u000b"
+"expandedExpq\u0000~\u0000\u0002xpppsq\u0000~\u0000\u0000ppsq\u0000~\u0000\u0000ppsq\u0000~\u0000\u0000ppsq\u0000~\u0000\u0000ppsr\u0000\u001dcom."
+"sun.msv.grammar.ChoiceExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0001ppsq\u0000~\u0000\nsr\u0000\u0011java.l"
+"ang.Boolean\u00cd r\u0080\u00d5\u009c\u00fa\u00ee\u0002\u0000\u0001Z\u0000\u0005valuexp\u0000psr\u0000\'com.sun.msv.grammar.tr"
+"ex.ElementPattern\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000\tnameClasst\u0000\u001fLcom/sun/msv/gram"
+"mar/NameClass;xr\u0000\u001ecom.sun.msv.grammar.ElementExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002Z"
+"\u0000\u001aignoreUndeclaredAttributesL\u0000\fcontentModelq\u0000~\u0000\u0002xq\u0000~\u0000\u0003q\u0000~\u0000\u000ep"
+"\u0000sq\u0000~\u0000\nppsr\u0000 com.sun.msv.grammar.OneOrMoreExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\u001c"
+"com.sun.msv.grammar.UnaryExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000\u0003expq\u0000~\u0000\u0002xq\u0000~\u0000\u0003q\u0000~\u0000"
+"\u000epsr\u0000 com.sun.msv.grammar.AttributeExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\u0003expq\u0000~\u0000\u0002"
+"L\u0000\tnameClassq\u0000~\u0000\u0010xq\u0000~\u0000\u0003q\u0000~\u0000\u000epsr\u00002com.sun.msv.grammar.Express"
+"ion$AnyStringExpression\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0003sq\u0000~\u0000\r\u0001q\u0000~\u0000\u001asr\u0000 com."
+"sun.msv.grammar.AnyNameClass\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\u001dcom.sun.msv.gramm"
+"ar.NameClass\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xpsr\u00000com.sun.msv.grammar.Expression$"
+"EpsilonExpression\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0003q\u0000~\u0000\u001bq\u0000~\u0000 sr\u0000#com.sun.msv."
+"grammar.SimpleNameClass\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\tlocalNamet\u0000\u0012Ljava/lang/"
+"String;L\u0000\fnamespaceURIq\u0000~\u0000\"xq\u0000~\u0000\u001dt\u00004com.sun.identity.saml2.j"
+"axb.xmlsig.TransformsElementt\u0000+http://java.sun.com/jaxb/xjc/"
+"dummy-elementssq\u0000~\u0000\u000fq\u0000~\u0000\u000ep\u0000sq\u0000~\u0000\u0000ppsq\u0000~\u0000\u000fpp\u0000sq\u0000~\u0000\nppsq\u0000~\u0000\u0014q\u0000"
+"~\u0000\u000epsq\u0000~\u0000\u0017q\u0000~\u0000\u000epq\u0000~\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000 sq\u0000~\u0000!t\u00001com.sun.identity.sam"
+"l2.jaxb.xmlsig.TransformsTypeq\u0000~\u0000%sq\u0000~\u0000\nppsq\u0000~\u0000\u0017q\u0000~\u0000\u000epsr\u0000\u001bco"
+"m.sun.msv.grammar.DataExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0003L\u0000\u0002dtt\u0000\u001fLorg/relaxng/dat"
+"atype/Datatype;L\u0000\u0006exceptq\u0000~\u0000\u0002L\u0000\u0004namet\u0000\u001dLcom/sun/msv/util/Str"
+"ingPair;xq\u0000~\u0000\u0003ppsr\u0000\"com.sun.msv.datatype.xsd.QnameType\u0000\u0000\u0000\u0000\u0000\u0000"
+"\u0000\u0001\u0002\u0000\u0000xr\u0000*com.sun.msv.datatype.xsd.BuiltinAtomicType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002"
+"\u0000\u0000xr\u0000%com.sun.msv.datatype.xsd.ConcreteType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\'co"
+"m.sun.msv.datatype.xsd.XSDatatypeImpl\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0003L\u0000\fnamespace"
+"Uriq\u0000~\u0000\"L\u0000\btypeNameq\u0000~\u0000\"L\u0000\nwhiteSpacet\u0000.Lcom/sun/msv/datatyp"
+"e/xsd/WhiteSpaceProcessor;xpt\u0000 http://www.w3.org/2001/XMLSch"
+"emat\u0000\u0005QNamesr\u00005com.sun.msv.datatype.xsd.WhiteSpaceProcessor$"
+"Collapse\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000,com.sun.msv.datatype.xsd.WhiteSpacePr"
+"ocessor\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xpsr\u00000com.sun.msv.grammar.Expression$NullS"
+"etExpression\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0003q\u0000~\u0000\u000epsr\u0000\u001bcom.sun.msv.util.Stri"
+"ngPair\u00d0t\u001ejB\u008f\u008d\u00a0\u0002\u0000\u0002L\u0000\tlocalNameq\u0000~\u0000\"L\u0000\fnamespaceURIq\u0000~\u0000\"xpq\u0000~\u0000"
+";q\u0000~\u0000:sq\u0000~\u0000!t\u0000\u0004typet\u0000)http://www.w3.org/2001/XMLSchema-insta"
+"nceq\u0000~\u0000 sq\u0000~\u0000!t\u0000\nTransformst\u0000\"http://www.w3.org/2000/09/xmld"
+"sig#q\u0000~\u0000 sq\u0000~\u0000\nppsq\u0000~\u0000\u000fpp\u0000sq\u0000~\u0000\nppsq\u0000~\u0000\u0014q\u0000~\u0000\u000epsq\u0000~\u0000\u0017q\u0000~\u0000\u000epq\u0000"
+"~\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000 sq\u0000~\u0000!t\u00006com.sun.identity.saml2.jaxb.xmlsig.Dig"
+"estMethodElementq\u0000~\u0000%sq\u0000~\u0000\u000fpp\u0000sq\u0000~\u0000\u0000ppsq\u0000~\u0000\u000fpp\u0000sq\u0000~\u0000\nppsq\u0000~\u0000"
+"\u0014q\u0000~\u0000\u000epsq\u0000~\u0000\u0017q\u0000~\u0000\u000epq\u0000~\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000 sq\u0000~\u0000!t\u00003com.sun.identity."
+"saml2.jaxb.xmlsig.DigestMethodTypeq\u0000~\u0000%sq\u0000~\u0000\nppsq\u0000~\u0000\u0017q\u0000~\u0000\u000epq"
+"\u0000~\u00003q\u0000~\u0000Cq\u0000~\u0000 sq\u0000~\u0000!t\u0000\fDigestMethodq\u0000~\u0000Hsq\u0000~\u0000\u000fpp\u0000sq\u0000~\u0000\u0000ppsq\u0000"
+"~\u00000ppsr\u0000\'com.sun.msv.datatype.xsd.FinalComponent\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001I"
+"\u0000\nfinalValuexr\u0000\u001ecom.sun.msv.datatype.xsd.Proxy\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000\b"
+"baseTypet\u0000)Lcom/sun/msv/datatype/xsd/XSDatatypeImpl;xq\u0000~\u00007q\u0000"
+"~\u0000Ht\u0000\u000fDigestValueTypeq\u0000~\u0000>sr\u0000)com.sun.msv.datatype.xsd.Base6"
+"4BinaryType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\'com.sun.msv.datatype.xsd.BinaryBas"
+"eType\u00a7\u00ce\u000e\u0097^\u00afW\u0011\u0002\u0000\u0000xq\u0000~\u00005q\u0000~\u0000:t\u0000\fbase64Binaryq\u0000~\u0000>\u0000\u0000\u0000\u0000q\u0000~\u0000@sq\u0000~"
+"\u0000Aq\u0000~\u0000gq\u0000~\u0000Hsq\u0000~\u0000\nppsq\u0000~\u0000\u0017q\u0000~\u0000\u000epq\u0000~\u00003q\u0000~\u0000Cq\u0000~\u0000 sq\u0000~\u0000!t\u0000\u000bDige"
+"stValueq\u0000~\u0000Hsq\u0000~\u0000\nppsq\u0000~\u0000\u0017q\u0000~\u0000\u000epsq\u0000~\u00000ppsr\u0000\u001fcom.sun.msv.data"
+"type.xsd.IDType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000#com.sun.msv.datatype.xsd.Ncnam"
+"eType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\"com.sun.msv.datatype.xsd.TokenType\u0000\u0000\u0000\u0000\u0000\u0000"
+"\u0000\u0001\u0002\u0000\u0000xr\u0000#com.sun.msv.datatype.xsd.StringType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001Z\u0000\ris"
+"AlwaysValidxq\u0000~\u00005q\u0000~\u0000:t\u0000\u0002IDq\u0000~\u0000>\u0000q\u0000~\u0000@sq\u0000~\u0000Aq\u0000~\u0000uq\u0000~\u0000:sq\u0000~\u0000!"
+"t\u0000\u0002Idt\u0000\u0000q\u0000~\u0000 sq\u0000~\u0000\nppsq\u0000~\u0000\u0017q\u0000~\u0000\u000epsq\u0000~\u00000q\u0000~\u0000\u000epsr\u0000#com.sun.msv"
+".datatype.xsd.AnyURIType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u00005q\u0000~\u0000:t\u0000\u0006anyURIq\u0000~\u0000>"
+"q\u0000~\u0000@sq\u0000~\u0000Aq\u0000~\u0000\u007fq\u0000~\u0000:sq\u0000~\u0000!t\u0000\u0004Typeq\u0000~\u0000yq\u0000~\u0000 sq\u0000~\u0000\nppsq\u0000~\u0000\u0017q\u0000"
+"~\u0000\u000epq\u0000~\u0000|sq\u0000~\u0000!t\u0000\u0003URIq\u0000~\u0000yq\u0000~\u0000 sr\u0000\"com.sun.msv.grammar.Expre"
+"ssionPool\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000\bexpTablet\u0000/Lcom/sun/msv/grammar/Expre"
+"ssionPool$ClosedHash;xpsr\u0000-com.sun.msv.grammar.ExpressionPoo"
+"l$ClosedHash\u00d7j\u00d0N\u00ef\u00e8\u00ed\u001c\u0003\u0000\u0003I\u0000\u0005countB\u0000\rstreamVersionL\u0000\u0006parentt\u0000$L"
+"com/sun/msv/grammar/ExpressionPool;xp\u0000\u0000\u0000\u0019\u0001pq\u0000~\u0000\u0013q\u0000~\u0000)q\u0000~\u0000Kq\u0000"
+"~\u0000Sq\u0000~\u0000\'q\u0000~\u0000Qq\u0000~\u0000\u0005q\u0000~\u0000\bq\u0000~\u0000]q\u0000~\u0000\u0083q\u0000~\u0000\u0007q\u0000~\u0000\tq\u0000~\u0000\u0016q\u0000~\u0000*q\u0000~\u0000Lq\u0000"
+"~\u0000Tq\u0000~\u0000zq\u0000~\u0000\u000bq\u0000~\u0000\u0006q\u0000~\u0000.q\u0000~\u0000Xq\u0000~\u0000iq\u0000~\u0000\fq\u0000~\u0000Iq\u0000~\u0000mx"));
        }
        return new com.sun.msv.verifier.regexp.REDocumentDeclaration(schemaFragment);
    }

    public class Unmarshaller
        extends com.sun.identity.saml2.jaxb.assertion.impl.runtime.AbstractUnmarshallingEventHandlerImpl
    {


        public Unmarshaller(com.sun.identity.saml2.jaxb.assertion.impl.runtime.UnmarshallingContext context) {
            super(context, "-------------------");
        }

        protected Unmarshaller(com.sun.identity.saml2.jaxb.assertion.impl.runtime.UnmarshallingContext context, int startState) {
            this(context);
            state = startState;
        }

        public java.lang.Object owner() {
            return com.sun.identity.saml2.jaxb.xmlsig.impl.ReferenceTypeImpl.this;
        }

        public void enterElement(java.lang.String ___uri, java.lang.String ___local, java.lang.String ___qname, org.xml.sax.Attributes __atts)
            throws org.xml.sax.SAXException
        {
            int attIdx;
            outer:
            while (true) {
                switch (state) {
                    case  9 :
                        if (("Transforms" == ___local)&&("http://www.w3.org/2000/09/xmldsig#" == ___uri)) {
                            _Transforms = ((com.sun.identity.saml2.jaxb.xmlsig.impl.TransformsElementImpl) spawnChildFromEnterElement((com.sun.identity.saml2.jaxb.xmlsig.impl.TransformsElementImpl.class), 12, ___uri, ___local, ___qname, __atts));
                            return ;
                        }
                        if (("Transforms" == ___local)&&("http://www.w3.org/2000/09/xmldsig#" == ___uri)) {
                            context.pushAttributes(__atts, false);
                            state = 10;
                            return ;
                        }
                        state = 12;
                        continue outer;
                    case  10 :
                        if (("Transform" == ___local)&&("http://www.w3.org/2000/09/xmldsig#" == ___uri)) {
                            _Transforms = ((com.sun.identity.saml2.jaxb.xmlsig.impl.TransformsTypeImpl) spawnChildFromEnterElement((com.sun.identity.saml2.jaxb.xmlsig.impl.TransformsTypeImpl.class), 11, ___uri, ___local, ___qname, __atts));
                            return ;
                        }
                        if (("Transform" == ___local)&&("http://www.w3.org/2000/09/xmldsig#" == ___uri)) {
                            _Transforms = ((com.sun.identity.saml2.jaxb.xmlsig.impl.TransformsTypeImpl) spawnChildFromEnterElement((com.sun.identity.saml2.jaxb.xmlsig.impl.TransformsTypeImpl.class), 11, ___uri, ___local, ___qname, __atts));
                            return ;
                        }
                        break;
                    case  17 :
                        attIdx = context.getAttribute("", "Algorithm");
                        if (attIdx >= 0) {
                            context.consumeAttribute(attIdx);
                            context.getCurrentHandler().enterElement(___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        break;
                    case  16 :
                        revertToParentFromEnterElement(___uri, ___local, ___qname, __atts);
                        return ;
                    case  13 :
                        if (("DigestValue" == ___local)&&("http://www.w3.org/2000/09/xmldsig#" == ___uri)) {
                            context.pushAttributes(__atts, true);
                            state = 14;
                            return ;
                        }
                        break;
                    case  6 :
                        attIdx = context.getAttribute("", "URI");
                        if (attIdx >= 0) {
                            final java.lang.String v = context.eatAttribute(attIdx);
                            state = 9;
                            eatText1(v);
                            continue outer;
                        }
                        state = 9;
                        continue outer;
                    case  3 :
                        attIdx = context.getAttribute("", "Type");
                        if (attIdx >= 0) {
                            final java.lang.String v = context.eatAttribute(attIdx);
                            state = 6;
                            eatText2(v);
                            continue outer;
                        }
                        state = 6;
                        continue outer;
                    case  0 :
                        attIdx = context.getAttribute("", "Id");
                        if (attIdx >= 0) {
                            final java.lang.String v = context.eatAttribute(attIdx);
                            state = 3;
                            eatText3(v);
                            continue outer;
                        }
                        state = 3;
                        continue outer;
                    case  12 :
                        if (("DigestMethod" == ___local)&&("http://www.w3.org/2000/09/xmldsig#" == ___uri)) {
                            _DigestMethod = ((com.sun.identity.saml2.jaxb.xmlsig.impl.DigestMethodElementImpl) spawnChildFromEnterElement((com.sun.identity.saml2.jaxb.xmlsig.impl.DigestMethodElementImpl.class), 13, ___uri, ___local, ___qname, __atts));
                            return ;
                        }
                        if (("DigestMethod" == ___local)&&("http://www.w3.org/2000/09/xmldsig#" == ___uri)) {
                            context.pushAttributes(__atts, true);
                            state = 17;
                            return ;
                        }
                        break;
                }
                super.enterElement(___uri, ___local, ___qname, __atts);
                break;
            }
        }

        private void eatText1(final java.lang.String value)
            throws org.xml.sax.SAXException
        {
            try {
                _URI = com.sun.xml.bind.WhiteSpaceProcessor.collapse(value);
            } catch (java.lang.Exception e) {
                handleParseConversionException(e);
            }
        }

        private void eatText2(final java.lang.String value)
            throws org.xml.sax.SAXException
        {
            try {
                _Type = com.sun.xml.bind.WhiteSpaceProcessor.collapse(value);
            } catch (java.lang.Exception e) {
                handleParseConversionException(e);
            }
        }

        private void eatText3(final java.lang.String value)
            throws org.xml.sax.SAXException
        {
            try {
                _Id = context.addToIdTable(com.sun.xml.bind.WhiteSpaceProcessor.collapse(value));
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
                    case  9 :
                        state = 12;
                        continue outer;
                    case  17 :
                        attIdx = context.getAttribute("", "Algorithm");
                        if (attIdx >= 0) {
                            context.consumeAttribute(attIdx);
                            context.getCurrentHandler().leaveElement(___uri, ___local, ___qname);
                            return ;
                        }
                        break;
                    case  11 :
                        if (("Transforms" == ___local)&&("http://www.w3.org/2000/09/xmldsig#" == ___uri)) {
                            context.popAttributes();
                            state = 12;
                            return ;
                        }
                        break;
                    case  16 :
                        revertToParentFromLeaveElement(___uri, ___local, ___qname);
                        return ;
                    case  15 :
                        if (("DigestValue" == ___local)&&("http://www.w3.org/2000/09/xmldsig#" == ___uri)) {
                            context.popAttributes();
                            state = 16;
                            return ;
                        }
                        break;
                    case  6 :
                        attIdx = context.getAttribute("", "URI");
                        if (attIdx >= 0) {
                            final java.lang.String v = context.eatAttribute(attIdx);
                            state = 9;
                            eatText1(v);
                            continue outer;
                        }
                        state = 9;
                        continue outer;
                    case  3 :
                        attIdx = context.getAttribute("", "Type");
                        if (attIdx >= 0) {
                            final java.lang.String v = context.eatAttribute(attIdx);
                            state = 6;
                            eatText2(v);
                            continue outer;
                        }
                        state = 6;
                        continue outer;
                    case  18 :
                        if (("DigestMethod" == ___local)&&("http://www.w3.org/2000/09/xmldsig#" == ___uri)) {
                            context.popAttributes();
                            state = 13;
                            return ;
                        }
                        break;
                    case  0 :
                        attIdx = context.getAttribute("", "Id");
                        if (attIdx >= 0) {
                            final java.lang.String v = context.eatAttribute(attIdx);
                            state = 3;
                            eatText3(v);
                            continue outer;
                        }
                        state = 3;
                        continue outer;
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
                    case  9 :
                        state = 12;
                        continue outer;
                    case  17 :
                        if (("Algorithm" == ___local)&&("" == ___uri)) {
                            _DigestMethod = ((com.sun.identity.saml2.jaxb.xmlsig.impl.DigestMethodTypeImpl) spawnChildFromEnterAttribute((com.sun.identity.saml2.jaxb.xmlsig.impl.DigestMethodTypeImpl.class), 18, ___uri, ___local, ___qname));
                            return ;
                        }
                        break;
                    case  16 :
                        revertToParentFromEnterAttribute(___uri, ___local, ___qname);
                        return ;
                    case  6 :
                        if (("URI" == ___local)&&("" == ___uri)) {
                            state = 7;
                            return ;
                        }
                        state = 9;
                        continue outer;
                    case  3 :
                        if (("Type" == ___local)&&("" == ___uri)) {
                            state = 4;
                            return ;
                        }
                        state = 6;
                        continue outer;
                    case  0 :
                        if (("Id" == ___local)&&("" == ___uri)) {
                            state = 1;
                            return ;
                        }
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
                    case  9 :
                        state = 12;
                        continue outer;
                    case  17 :
                        attIdx = context.getAttribute("", "Algorithm");
                        if (attIdx >= 0) {
                            context.consumeAttribute(attIdx);
                            context.getCurrentHandler().leaveAttribute(___uri, ___local, ___qname);
                            return ;
                        }
                        break;
                    case  8 :
                        if (("URI" == ___local)&&("" == ___uri)) {
                            state = 9;
                            return ;
                        }
                        break;
                    case  16 :
                        revertToParentFromLeaveAttribute(___uri, ___local, ___qname);
                        return ;
                    case  2 :
                        if (("Id" == ___local)&&("" == ___uri)) {
                            state = 3;
                            return ;
                        }
                        break;
                    case  6 :
                        attIdx = context.getAttribute("", "URI");
                        if (attIdx >= 0) {
                            final java.lang.String v = context.eatAttribute(attIdx);
                            state = 9;
                            eatText1(v);
                            continue outer;
                        }
                        state = 9;
                        continue outer;
                    case  3 :
                        attIdx = context.getAttribute("", "Type");
                        if (attIdx >= 0) {
                            final java.lang.String v = context.eatAttribute(attIdx);
                            state = 6;
                            eatText2(v);
                            continue outer;
                        }
                        state = 6;
                        continue outer;
                    case  0 :
                        attIdx = context.getAttribute("", "Id");
                        if (attIdx >= 0) {
                            final java.lang.String v = context.eatAttribute(attIdx);
                            state = 3;
                            eatText3(v);
                            continue outer;
                        }
                        state = 3;
                        continue outer;
                    case  5 :
                        if (("Type" == ___local)&&("" == ___uri)) {
                            state = 6;
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
                        case  9 :
                            state = 12;
                            continue outer;
                        case  17 :
                            attIdx = context.getAttribute("", "Algorithm");
                            if (attIdx >= 0) {
                                context.consumeAttribute(attIdx);
                                context.getCurrentHandler().text(value);
                                return ;
                            }
                            break;
                        case  16 :
                            revertToParentFromText(value);
                            return ;
                        case  14 :
                            state = 15;
                            eatText4(value);
                            return ;
                        case  4 :
                            state = 5;
                            eatText2(value);
                            return ;
                        case  1 :
                            state = 2;
                            eatText3(value);
                            return ;
                        case  7 :
                            state = 8;
                            eatText1(value);
                            return ;
                        case  6 :
                            attIdx = context.getAttribute("", "URI");
                            if (attIdx >= 0) {
                                final java.lang.String v = context.eatAttribute(attIdx);
                                state = 9;
                                eatText1(v);
                                continue outer;
                            }
                            state = 9;
                            continue outer;
                        case  3 :
                            attIdx = context.getAttribute("", "Type");
                            if (attIdx >= 0) {
                                final java.lang.String v = context.eatAttribute(attIdx);
                                state = 6;
                                eatText2(v);
                                continue outer;
                            }
                            state = 6;
                            continue outer;
                        case  0 :
                            attIdx = context.getAttribute("", "Id");
                            if (attIdx >= 0) {
                                final java.lang.String v = context.eatAttribute(attIdx);
                                state = 3;
                                eatText3(v);
                                continue outer;
                            }
                            state = 3;
                            continue outer;
                    }
                } catch (java.lang.RuntimeException e) {
                    handleUnexpectedTextException(value, e);
                }
                break;
            }
        }

        private void eatText4(final java.lang.String value)
            throws org.xml.sax.SAXException
        {
            try {
                _DigestValue = com.sun.msv.datatype.xsd.Base64BinaryType.load(com.sun.xml.bind.WhiteSpaceProcessor.collapse(value));
            } catch (java.lang.Exception e) {
                handleParseConversionException(e);
            }
        }

    }

}
