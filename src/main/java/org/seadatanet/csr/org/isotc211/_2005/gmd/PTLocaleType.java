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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.seadatanet.csr.org.isotc211._2005.gco.AbstractObjectType;


/**
 * <p>Java class for PT_Locale_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected         content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PT_Locale_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.isotc211.org/2005/gco}AbstractObject_Type"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="languageCode" type="{http://www.isotc211.org/2005/gmd}LanguageCode_PropertyType"/&gt;
 *         &lt;element name="country" type="{http://www.isotc211.org/2005/gmd}Country_PropertyType" minOccurs="0"/&gt;
 *         &lt;element name="characterEncoding" type="{http://www.isotc211.org/2005/gmd}MD_CharacterSetCode_PropertyType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PT_Locale_Type", propOrder = {
    "languageCode",
    "country",
    "characterEncoding"
})
public class PTLocaleType
    extends AbstractObjectType
    implements Serializable
{

    @XmlElement(required = true)
    protected LanguageCodePropertyType languageCode;
    protected CountryPropertyType country;
    @XmlElement(required = true)
    protected MDCharacterSetCodePropertyType characterEncoding;

    /**
     * Gets the value of the languageCode property.
     * 
     * @return
     *     possible object is
     *     {@link LanguageCodePropertyType }
     *     
     */
    public LanguageCodePropertyType getLanguageCode() {
        return languageCode;
    }

    /**
     * Sets the value of the languageCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link LanguageCodePropertyType }
     *     
     */
    public void setLanguageCode(LanguageCodePropertyType value) {
        this.languageCode = value;
    }

    public boolean isSetLanguageCode() {
        return (this.languageCode!= null);
    }

    /**
     * Gets the value of the country property.
     * 
     * @return
     *     possible object is
     *     {@link CountryPropertyType }
     *     
     */
    public CountryPropertyType getCountry() {
        return country;
    }

    /**
     * Sets the value of the country property.
     * 
     * @param value
     *     allowed object is
     *     {@link CountryPropertyType }
     *     
     */
    public void setCountry(CountryPropertyType value) {
        this.country = value;
    }

    public boolean isSetCountry() {
        return (this.country!= null);
    }

    /**
     * Gets the value of the characterEncoding property.
     * 
     * @return
     *     possible object is
     *     {@link MDCharacterSetCodePropertyType }
     *     
     */
    public MDCharacterSetCodePropertyType getCharacterEncoding() {
        return characterEncoding;
    }

    /**
     * Sets the value of the characterEncoding property.
     * 
     * @param value
     *     allowed object is
     *     {@link MDCharacterSetCodePropertyType }
     *     
     */
    public void setCharacterEncoding(MDCharacterSetCodePropertyType value) {
        this.characterEncoding = value;
    }

    public boolean isSetCharacterEncoding() {
        return (this.characterEncoding!= null);
    }

}
