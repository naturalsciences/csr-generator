//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0-SNAPSHOT 
//         See <a href="https://jaxb.java.net/">https://jaxb.java.net/</a> 
//         Any modifications to this file will be lost upon recompilation of the source schema. 
//         Generated on: 2017.09.29 at 03:54:02 PM CEST 
//


package org.seadatanet.csr.org.seadatanet;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import org.seadatanet.csr.org.isotc211._2005.gmd.CICitationType;
import org.seadatanet.csr.org.isotc211._2005.gmd.CIOnlineResourcePropertyType;


/**
 * Standardized resource reference
 * 
 * <p>Java class for SDN_Citation_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected         content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SDN_Citation_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.isotc211.org/2005/gmd}CI_Citation_Type"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="onlineReference" type="{http://www.isotc211.org/2005/gmd}CI_OnlineResource_PropertyType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute ref="{http://www.isotc211.org/2005/gco}isoType use="required" fixed="CI_Citation_Type""/&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SDN_Citation_Type", propOrder = {
    "onlineReference"
})
public class SDNCitationType
    extends CICitationType
    implements Serializable
{

    protected CIOnlineResourcePropertyType onlineReference;
    /**
     * 
     * 
     */
    @XmlAttribute(name = "isoType", namespace = "http://www.isotc211.org/2005/gco", required = true)
    public final static String ISO_TYPE = "CI_Citation_Type";

    /**
     * Gets the value of the onlineReference property.
     * 
     * @return
     *     possible object is
     *     {@link CIOnlineResourcePropertyType }
     *     
     */
    public CIOnlineResourcePropertyType getOnlineReference() {
        return onlineReference;
    }

    /**
     * Sets the value of the onlineReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link CIOnlineResourcePropertyType }
     *     
     */
    public void setOnlineReference(CIOnlineResourcePropertyType value) {
        this.onlineReference = value;
    }

    public boolean isSetOnlineReference() {
        return (this.onlineReference!= null);
    }

}