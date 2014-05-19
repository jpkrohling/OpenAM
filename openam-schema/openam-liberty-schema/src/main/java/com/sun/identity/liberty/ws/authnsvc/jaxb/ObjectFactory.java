//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v1.0.6-b27-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.06.11 at 10:33:54 AM PDT 
//


package com.sun.identity.liberty.ws.authnsvc.jaxb;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.sun.identity.liberty.ws.authnsvc.jaxb package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
public class ObjectFactory
    extends com.sun.identity.federation.jaxb.entityconfig.impl.runtime.DefaultJAXBContextImpl
{

    private static java.util.HashMap defaultImplementations = new java.util.HashMap(23, 0.75F);
    private static java.util.HashMap rootTagMap = new java.util.HashMap();
    public final static com.sun.identity.federation.jaxb.entityconfig.impl.runtime.GrammarInfo grammarInfo = new com.sun.identity.federation.jaxb.entityconfig.impl.runtime.GrammarInfoImpl(rootTagMap, defaultImplementations, (com.sun.identity.liberty.ws.authnsvc.jaxb.ObjectFactory.class));
    public final static java.lang.Class version = (com.sun.identity.liberty.ws.authnsvc.jaxb.impl.JAXBVersion.class);

    static {
        defaultImplementations.put((com.sun.identity.liberty.ws.authnsvc.jaxb.SASLResponseType.CredentialsType.class), "com.sun.identity.liberty.ws.authnsvc.jaxb.impl.SASLResponseTypeImpl$CredentialsTypeImpl");
        defaultImplementations.put((com.sun.identity.liberty.ws.authnsvc.jaxb.PasswordTransformsType.TransformType.class), "com.sun.identity.liberty.ws.authnsvc.jaxb.impl.PasswordTransformsTypeImpl$TransformTypeImpl");
        defaultImplementations.put((com.sun.identity.liberty.ws.authnsvc.jaxb.PasswordTransformsType.class), "com.sun.identity.liberty.ws.authnsvc.jaxb.impl.PasswordTransformsTypeImpl");
        defaultImplementations.put((com.sun.identity.liberty.ws.authnsvc.jaxb.SASLResponseElement.class), "com.sun.identity.liberty.ws.authnsvc.jaxb.impl.SASLResponseElementImpl");
        defaultImplementations.put((com.sun.identity.liberty.ws.authnsvc.jaxb.StatusType.class), "com.sun.identity.liberty.ws.authnsvc.jaxb.impl.StatusTypeImpl");
        defaultImplementations.put((com.sun.identity.liberty.ws.authnsvc.jaxb.SASLRequestType.class), "com.sun.identity.liberty.ws.authnsvc.jaxb.impl.SASLRequestTypeImpl");
        defaultImplementations.put((com.sun.identity.liberty.ws.authnsvc.jaxb.EmptyType.class), "com.sun.identity.liberty.ws.authnsvc.jaxb.impl.EmptyTypeImpl");
        defaultImplementations.put((com.sun.identity.liberty.ws.authnsvc.jaxb.ExtensionType.class), "com.sun.identity.liberty.ws.authnsvc.jaxb.impl.ExtensionTypeImpl");
        defaultImplementations.put((com.sun.identity.liberty.ws.authnsvc.jaxb.StatusElement.class), "com.sun.identity.liberty.ws.authnsvc.jaxb.impl.StatusElementImpl");
        defaultImplementations.put((com.sun.identity.liberty.ws.authnsvc.jaxb.SASLResponseType.DataType.class), "com.sun.identity.liberty.ws.authnsvc.jaxb.impl.SASLResponseTypeImpl$DataTypeImpl");
        defaultImplementations.put((com.sun.identity.liberty.ws.authnsvc.jaxb.ExtensionElement.class), "com.sun.identity.liberty.ws.authnsvc.jaxb.impl.ExtensionElementImpl");
        defaultImplementations.put((com.sun.identity.liberty.ws.authnsvc.jaxb.SASLRequestType.DataType.class), "com.sun.identity.liberty.ws.authnsvc.jaxb.impl.SASLRequestTypeImpl$DataTypeImpl");
        defaultImplementations.put((com.sun.identity.liberty.ws.authnsvc.jaxb.PasswordTransformsType.TransformType.ParameterType.class), "com.sun.identity.liberty.ws.authnsvc.jaxb.impl.PasswordTransformsTypeImpl$TransformTypeImpl$ParameterTypeImpl");
        defaultImplementations.put((com.sun.identity.liberty.ws.authnsvc.jaxb.SASLResponseType.class), "com.sun.identity.liberty.ws.authnsvc.jaxb.impl.SASLResponseTypeImpl");
        defaultImplementations.put((com.sun.identity.liberty.ws.authnsvc.jaxb.SASLRequestElement.class), "com.sun.identity.liberty.ws.authnsvc.jaxb.impl.SASLRequestElementImpl");
        defaultImplementations.put((com.sun.identity.liberty.ws.authnsvc.jaxb.PasswordTransformsElement.class), "com.sun.identity.liberty.ws.authnsvc.jaxb.impl.PasswordTransformsElementImpl");
        rootTagMap.put(new javax.xml.namespace.QName("urn:liberty:sa:2004-04", "SASLResponse"), (com.sun.identity.liberty.ws.authnsvc.jaxb.SASLResponseElement.class));
        rootTagMap.put(new javax.xml.namespace.QName("urn:liberty:sa:2004-04", "SASLRequest"), (com.sun.identity.liberty.ws.authnsvc.jaxb.SASLRequestElement.class));
        rootTagMap.put(new javax.xml.namespace.QName("urn:liberty:sa:2004-04", "PasswordTransforms"), (com.sun.identity.liberty.ws.authnsvc.jaxb.PasswordTransformsElement.class));
        rootTagMap.put(new javax.xml.namespace.QName("urn:liberty:sa:2004-04", "Extension"), (com.sun.identity.liberty.ws.authnsvc.jaxb.ExtensionElement.class));
        rootTagMap.put(new javax.xml.namespace.QName("urn:liberty:sa:2004-04", "Status"), (com.sun.identity.liberty.ws.authnsvc.jaxb.StatusElement.class));
    }

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.sun.identity.liberty.ws.authnsvc.jaxb
     * 
     */
    public ObjectFactory() {
        super(grammarInfo);
    }

    /**
     * Create an instance of the specified Java content interface.
     * 
     * @param javaContentInterface
     *     the Class object of the javacontent interface to instantiate
     * @return
     *     a new instance
     * @throws JAXBException
     *     if an error occurs
     */
    public java.lang.Object newInstance(java.lang.Class javaContentInterface)
        throws javax.xml.bind.JAXBException
    {
        return super.newInstance(javaContentInterface);
    }

    /**
     * Get the specified property. This method can only be
     * used to get provider specific properties.
     * Attempting to get an undefined property will result
     * in a PropertyException being thrown.
     * 
     * @param name
     *     the name of the property to retrieve
     * @return
     *     the value of the requested property
     * @throws PropertyException
     *     when there is an error retrieving the given property or value
     */
    public java.lang.Object getProperty(java.lang.String name)
        throws javax.xml.bind.PropertyException
    {
        return super.getProperty(name);
    }

    /**
     * Set the specified property. This method can only be
     * used to set provider specific properties.
     * Attempting to set an undefined property will result
     * in a PropertyException being thrown.
     * 
     * @param name
     *     the name of the property to retrieve
     * @param value
     *     the value of the property to be set
     * @throws PropertyException
     *     when there is an error processing the given property or value
     */
    public void setProperty(java.lang.String name, java.lang.Object value)
        throws javax.xml.bind.PropertyException
    {
        super.setProperty(name, value);
    }

    /**
     * Create an instance of SASLResponseTypeCredentialsType
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public com.sun.identity.liberty.ws.authnsvc.jaxb.SASLResponseType.CredentialsType createSASLResponseTypeCredentialsType()
        throws javax.xml.bind.JAXBException
    {
        return new com.sun.identity.liberty.ws.authnsvc.jaxb.impl.SASLResponseTypeImpl.CredentialsTypeImpl();
    }

    /**
     * Create an instance of PasswordTransformsTypeTransformType
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public com.sun.identity.liberty.ws.authnsvc.jaxb.PasswordTransformsType.TransformType createPasswordTransformsTypeTransformType()
        throws javax.xml.bind.JAXBException
    {
        return new com.sun.identity.liberty.ws.authnsvc.jaxb.impl.PasswordTransformsTypeImpl.TransformTypeImpl();
    }

    /**
     * Create an instance of PasswordTransformsType
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public com.sun.identity.liberty.ws.authnsvc.jaxb.PasswordTransformsType createPasswordTransformsType()
        throws javax.xml.bind.JAXBException
    {
        return new com.sun.identity.liberty.ws.authnsvc.jaxb.impl.PasswordTransformsTypeImpl();
    }

    /**
     * Create an instance of SASLResponseElement
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public com.sun.identity.liberty.ws.authnsvc.jaxb.SASLResponseElement createSASLResponseElement()
        throws javax.xml.bind.JAXBException
    {
        return new com.sun.identity.liberty.ws.authnsvc.jaxb.impl.SASLResponseElementImpl();
    }

    /**
     * Create an instance of StatusType
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public com.sun.identity.liberty.ws.authnsvc.jaxb.StatusType createStatusType()
        throws javax.xml.bind.JAXBException
    {
        return new com.sun.identity.liberty.ws.authnsvc.jaxb.impl.StatusTypeImpl();
    }

    /**
     * Create an instance of SASLRequestType
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public com.sun.identity.liberty.ws.authnsvc.jaxb.SASLRequestType createSASLRequestType()
        throws javax.xml.bind.JAXBException
    {
        return new com.sun.identity.liberty.ws.authnsvc.jaxb.impl.SASLRequestTypeImpl();
    }

    /**
     * Create an instance of EmptyType
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public com.sun.identity.liberty.ws.authnsvc.jaxb.EmptyType createEmptyType()
        throws javax.xml.bind.JAXBException
    {
        return new com.sun.identity.liberty.ws.authnsvc.jaxb.impl.EmptyTypeImpl();
    }

    /**
     * Create an instance of ExtensionType
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public com.sun.identity.liberty.ws.authnsvc.jaxb.ExtensionType createExtensionType()
        throws javax.xml.bind.JAXBException
    {
        return new com.sun.identity.liberty.ws.authnsvc.jaxb.impl.ExtensionTypeImpl();
    }

    /**
     * Create an instance of StatusElement
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public com.sun.identity.liberty.ws.authnsvc.jaxb.StatusElement createStatusElement()
        throws javax.xml.bind.JAXBException
    {
        return new com.sun.identity.liberty.ws.authnsvc.jaxb.impl.StatusElementImpl();
    }

    /**
     * Create an instance of SASLResponseTypeDataType
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public com.sun.identity.liberty.ws.authnsvc.jaxb.SASLResponseType.DataType createSASLResponseTypeDataType()
        throws javax.xml.bind.JAXBException
    {
        return new com.sun.identity.liberty.ws.authnsvc.jaxb.impl.SASLResponseTypeImpl.DataTypeImpl();
    }

    /**
     * Create an instance of ExtensionElement
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public com.sun.identity.liberty.ws.authnsvc.jaxb.ExtensionElement createExtensionElement()
        throws javax.xml.bind.JAXBException
    {
        return new com.sun.identity.liberty.ws.authnsvc.jaxb.impl.ExtensionElementImpl();
    }

    /**
     * Create an instance of SASLRequestTypeDataType
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public com.sun.identity.liberty.ws.authnsvc.jaxb.SASLRequestType.DataType createSASLRequestTypeDataType()
        throws javax.xml.bind.JAXBException
    {
        return new com.sun.identity.liberty.ws.authnsvc.jaxb.impl.SASLRequestTypeImpl.DataTypeImpl();
    }

    /**
     * Create an instance of PasswordTransformsTypeTransformTypeParameterType
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public com.sun.identity.liberty.ws.authnsvc.jaxb.PasswordTransformsType.TransformType.ParameterType createPasswordTransformsTypeTransformTypeParameterType()
        throws javax.xml.bind.JAXBException
    {
        return new com.sun.identity.liberty.ws.authnsvc.jaxb.impl.PasswordTransformsTypeImpl.TransformTypeImpl.ParameterTypeImpl();
    }

    /**
     * Create an instance of SASLResponseType
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public com.sun.identity.liberty.ws.authnsvc.jaxb.SASLResponseType createSASLResponseType()
        throws javax.xml.bind.JAXBException
    {
        return new com.sun.identity.liberty.ws.authnsvc.jaxb.impl.SASLResponseTypeImpl();
    }

    /**
     * Create an instance of SASLRequestElement
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public com.sun.identity.liberty.ws.authnsvc.jaxb.SASLRequestElement createSASLRequestElement()
        throws javax.xml.bind.JAXBException
    {
        return new com.sun.identity.liberty.ws.authnsvc.jaxb.impl.SASLRequestElementImpl();
    }

    /**
     * Create an instance of PasswordTransformsElement
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public com.sun.identity.liberty.ws.authnsvc.jaxb.PasswordTransformsElement createPasswordTransformsElement()
        throws javax.xml.bind.JAXBException
    {
        return new com.sun.identity.liberty.ws.authnsvc.jaxb.impl.PasswordTransformsElementImpl();
    }

}
