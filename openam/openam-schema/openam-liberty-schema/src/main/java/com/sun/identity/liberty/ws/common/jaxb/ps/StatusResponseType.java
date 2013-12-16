//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v1.0.6-b27-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.06.11 at 10:33:54 AM PDT 
//


package com.sun.identity.liberty.ws.common.jaxb.ps;


/**
 * Java content class for StatusResponseType complex type.
 * <p>The following schema fragment specifies the expected content contained within this java content object. (defined at file:/Users/allan/A-SVN/trunk/opensso/products/federation/library/xsd/liberty/lib-arch-protocols-schema.xsd line 277)
 * <p>
 * <pre>
 * &lt;complexType name="StatusResponseType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:oasis:names:tc:SAML:1.0:protocol}ResponseAbstractType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:liberty:iff:2003-08}Extension" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{urn:liberty:iff:2003-08}ProviderID"/>
 *         &lt;element ref="{urn:oasis:names:tc:SAML:1.0:protocol}Status"/>
 *         &lt;element ref="{urn:liberty:iff:2003-08}RelayState" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 */
public interface StatusResponseType
    extends com.sun.identity.liberty.ws.common.jaxb.protocol.ResponseAbstractType
{


    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link com.sun.identity.liberty.ws.common.jaxb.protocol.StatusElement}
     *     {@link com.sun.identity.liberty.ws.common.jaxb.protocol.StatusType}
     */
    com.sun.identity.liberty.ws.common.jaxb.protocol.StatusType getStatus();

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link com.sun.identity.liberty.ws.common.jaxb.protocol.StatusElement}
     *     {@link com.sun.identity.liberty.ws.common.jaxb.protocol.StatusType}
     */
    void setStatus(com.sun.identity.liberty.ws.common.jaxb.protocol.StatusType value);

    /**
     * Gets the value of the Extension property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the Extension property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExtension().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link com.sun.identity.liberty.ws.common.jaxb.ps.ExtensionElement}
     * {@link com.sun.identity.liberty.ws.common.jaxb.ps.ExtensionType}
     * 
     */
    java.util.List getExtension();

    /**
     * Gets the value of the providerID property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String}
     */
    java.lang.String getProviderID();

    /**
     * Sets the value of the providerID property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String}
     */
    void setProviderID(java.lang.String value);

    /**
     * Gets the value of the relayState property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String}
     */
    java.lang.String getRelayState();

    /**
     * Sets the value of the relayState property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String}
     */
    void setRelayState(java.lang.String value);

}
