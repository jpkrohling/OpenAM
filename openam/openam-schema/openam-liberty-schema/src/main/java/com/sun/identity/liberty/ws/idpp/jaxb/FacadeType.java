//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v1.0.6-b27-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.06.11 at 10:33:54 AM PDT 
//


package com.sun.identity.liberty.ws.idpp.jaxb;


/**
 * Java content class for FacadeType complex type.
 * <p>The following schema fragment specifies the expected content contained within this java content object. (defined at file:/Users/allan/A-SVN/trunk/opensso/products/federation/library/xsd/liberty/lib-id-sis-pp.xsd line 222)
 * <p>
 * <pre>
 * &lt;complexType name="FacadeType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:liberty:id-sis-pp:2003-08}MugShot" minOccurs="0"/>
 *         &lt;element ref="{urn:liberty:id-sis-pp:2003-08}WebSite" minOccurs="0"/>
 *         &lt;element ref="{urn:liberty:id-sis-pp:2003-08}NamePronounced" minOccurs="0"/>
 *         &lt;element ref="{urn:liberty:id-sis-pp:2003-08}GreetSound" minOccurs="0"/>
 *         &lt;element ref="{urn:liberty:id-sis-pp:2003-08}GreetMeSound" minOccurs="0"/>
 *         &lt;element ref="{urn:liberty:id-sis-pp:2003-08}Extension" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{urn:liberty:id-sis-pp:2003-08}commonAttributes"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 */
public interface FacadeType {


    /**
     * Gets the value of the extension property.
     * 
     * @return
     *     possible object is
     *     {@link com.sun.identity.liberty.ws.idpp.jaxb.ExtensionElement}
     *     {@link com.sun.identity.liberty.ws.idpp.jaxb.ExtensionType}
     */
    com.sun.identity.liberty.ws.idpp.jaxb.ExtensionType getExtension();

    /**
     * Sets the value of the extension property.
     * 
     * @param value
     *     allowed object is
     *     {@link com.sun.identity.liberty.ws.idpp.jaxb.ExtensionElement}
     *     {@link com.sun.identity.liberty.ws.idpp.jaxb.ExtensionType}
     */
    void setExtension(com.sun.identity.liberty.ws.idpp.jaxb.ExtensionType value);

    /**
     * Gets the value of the modificationTime property.
     * 
     * @return
     *     possible object is
     *     {@link java.util.Calendar}
     */
    java.util.Calendar getModificationTime();

    /**
     * Sets the value of the modificationTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.util.Calendar}
     */
    void setModificationTime(java.util.Calendar value);

    /**
     * Gets the value of the mugShot property.
     * 
     * @return
     *     possible object is
     *     {@link com.sun.identity.liberty.ws.idpp.jaxb.MugShotElement}
     *     {@link com.sun.identity.liberty.ws.idpp.jaxb.DSTURI}
     */
    com.sun.identity.liberty.ws.idpp.jaxb.DSTURI getMugShot();

    /**
     * Sets the value of the mugShot property.
     * 
     * @param value
     *     allowed object is
     *     {@link com.sun.identity.liberty.ws.idpp.jaxb.MugShotElement}
     *     {@link com.sun.identity.liberty.ws.idpp.jaxb.DSTURI}
     */
    void setMugShot(com.sun.identity.liberty.ws.idpp.jaxb.DSTURI value);

    /**
     * Gets the value of the greetMeSound property.
     * 
     * @return
     *     possible object is
     *     {@link com.sun.identity.liberty.ws.idpp.jaxb.DSTURI}
     *     {@link com.sun.identity.liberty.ws.idpp.jaxb.GreetMeSoundElement}
     */
    com.sun.identity.liberty.ws.idpp.jaxb.DSTURI getGreetMeSound();

    /**
     * Sets the value of the greetMeSound property.
     * 
     * @param value
     *     allowed object is
     *     {@link com.sun.identity.liberty.ws.idpp.jaxb.DSTURI}
     *     {@link com.sun.identity.liberty.ws.idpp.jaxb.GreetMeSoundElement}
     */
    void setGreetMeSound(com.sun.identity.liberty.ws.idpp.jaxb.DSTURI value);

    /**
     * Gets the value of the namePronounced property.
     * 
     * @return
     *     possible object is
     *     {@link com.sun.identity.liberty.ws.idpp.jaxb.NamePronouncedElement}
     *     {@link com.sun.identity.liberty.ws.idpp.jaxb.DSTURI}
     */
    com.sun.identity.liberty.ws.idpp.jaxb.DSTURI getNamePronounced();

    /**
     * Sets the value of the namePronounced property.
     * 
     * @param value
     *     allowed object is
     *     {@link com.sun.identity.liberty.ws.idpp.jaxb.NamePronouncedElement}
     *     {@link com.sun.identity.liberty.ws.idpp.jaxb.DSTURI}
     */
    void setNamePronounced(com.sun.identity.liberty.ws.idpp.jaxb.DSTURI value);

    /**
     * Gets the value of the webSite property.
     * 
     * @return
     *     possible object is
     *     {@link com.sun.identity.liberty.ws.idpp.jaxb.WebSiteElement}
     *     {@link com.sun.identity.liberty.ws.idpp.jaxb.DSTURI}
     */
    com.sun.identity.liberty.ws.idpp.jaxb.DSTURI getWebSite();

    /**
     * Sets the value of the webSite property.
     * 
     * @param value
     *     allowed object is
     *     {@link com.sun.identity.liberty.ws.idpp.jaxb.WebSiteElement}
     *     {@link com.sun.identity.liberty.ws.idpp.jaxb.DSTURI}
     */
    void setWebSite(com.sun.identity.liberty.ws.idpp.jaxb.DSTURI value);

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String}
     */
    java.lang.String getId();

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String}
     */
    void setId(java.lang.String value);

    /**
     * Gets the value of the greetSound property.
     * 
     * @return
     *     possible object is
     *     {@link com.sun.identity.liberty.ws.idpp.jaxb.GreetSoundElement}
     *     {@link com.sun.identity.liberty.ws.idpp.jaxb.DSTURI}
     */
    com.sun.identity.liberty.ws.idpp.jaxb.DSTURI getGreetSound();

    /**
     * Sets the value of the greetSound property.
     * 
     * @param value
     *     allowed object is
     *     {@link com.sun.identity.liberty.ws.idpp.jaxb.GreetSoundElement}
     *     {@link com.sun.identity.liberty.ws.idpp.jaxb.DSTURI}
     */
    void setGreetSound(com.sun.identity.liberty.ws.idpp.jaxb.DSTURI value);

}
