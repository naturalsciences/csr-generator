//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0-SNAPSHOT 
//         See <a href="https://jaxb.java.net/">https://jaxb.java.net/</a> 
//         Any modifications to this file will be lost upon recompilation of the source schema. 
//         Generated on: 2017.09.29 at 03:54:02 PM CEST 
//


package org.seadatanet.csr.org.isotc211._2005.gmd;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import org.seadatanet.csr.org.isotc211._2005.gco.AbstractObjectType;


/**
 * <p>Java class for MD_ReferenceSystem_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected         content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MD_ReferenceSystem_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.isotc211.org/2005/gco}AbstractObject_Type"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="referenceSystemIdentifier" type="{http://www.isotc211.org/2005/gmd}RS_Identifier_PropertyType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MD_ReferenceSystem_Type", propOrder = {
    "referenceSystemIdentifier"
})
public class MDReferenceSystemType
    extends AbstractObjectType
    implements Serializable
{

    protected RSIdentifierPropertyType referenceSystemIdentifier;

    /**
     * Gets the value of the referenceSystemIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link RSIdentifierPropertyType }
     *     
     */
    public RSIdentifierPropertyType getReferenceSystemIdentifier() {
        return referenceSystemIdentifier;
    }

    /**
     * Sets the value of the referenceSystemIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link RSIdentifierPropertyType }
     *     
     */
    public void setReferenceSystemIdentifier(RSIdentifierPropertyType value) {
        this.referenceSystemIdentifier = value;
    }

    public boolean isSetReferenceSystemIdentifier() {
        return (this.referenceSystemIdentifier!= null);
    }

}