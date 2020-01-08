//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0-SNAPSHOT 
//         See <a href="https://jaxb.java.net/">https://jaxb.java.net/</a> 
//         Any modifications to this file will be lost upon recompilation of the source schema. 
//         Generated on: 2017.09.29 at 03:54:02 PM CEST 
//
package org.seadatanet.csr.org.seadatanet;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import org.seadatanet.csr.org.isotc211._2005.gmd.MDDataIdentificationType;

/**
 * Standardized resource reference
 *
 * <p>
 * Java class for SDN_DataIdentification_Type complex type.
 *
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 *
 * <pre>
 * &lt;complexType name="SDN_DataIdentification_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.isotc211.org/2005/gmd}MD_DataIdentification_Type"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="additionalDocumentation" type="{http://www.seadatanet.org}SDN_Citation_PropertyType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute ref="{http://www.isotc211.org/2005/gco}isoType use="required" fixed="MD_DataIdentification_Type""/&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SDN_DataIdentification_Type", propOrder = {
    "descriptiveKeywordsSDN",
    "rest"
})
public class SDNDataIdentificationType
        extends MDDataIdentificationType
        implements Serializable {

    @XmlElementRef(name = "additionalDocumentation", namespace = "http://www.seadatanet.org", type = JAXBElement.class, required = false)
    protected List<JAXBElement<SDNCitationPropertyType>> rest;
    /**
     *
     *
     */
    @XmlAttribute(name = "isoType", namespace = "http://www.isotc211.org/2005/gco", required = true)
    public final static String ISO_TYPE = "MD_DataIdentification_Type";

    @XmlElement(name = "descriptiveKeywords", namespace = "http://www.isotc211.org/2005/gmd", required = true)
    protected List<MDKeywordsPropertyTypeSDN> descriptiveKeywordsSDN;

    /**
     * Gets the rest of the content model.
     *
     * <p>
     * You are getting this "catch-all" property because of the following
     * reason: The field name "AdditionalDocumentation" is used by two different
     * parts of a schema. See: line 44 of
     * file:/home/thomas/Documents/varia-standards/csr/csr-3.0.0-offline-version.xsd
     * line 86 of
     * file:/home/thomas/Documents/varia-standards/csr/iso19139/gmd/identification.xsd
     * <p>
     * To get rid of this property, apply a property customization to one of
     * both of the following declarations to change their names: Gets the value
     * of the rest property.
     *
     * <p>
     * This accessor method returns a reference to the live list, not a
     * snapshot. Therefore any modification you make to the returned list will
     * be present inside the JAXB object. This is why there is not a
     * <CODE>set</CODE> method for the rest property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRest().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link SDNCitationPropertyType }{@code >}
     *
     *
     */
    public List<JAXBElement<SDNCitationPropertyType>> getRest() {
        if (rest == null) {
            rest = new ArrayList<JAXBElement<SDNCitationPropertyType>>();
        }
        return this.rest;
    }
    
    
    public List<MDKeywordsPropertyTypeSDN> getDescriptiveKeywordsSDN() {
        if (descriptiveKeywordsSDN == null) {
            descriptiveKeywordsSDN = new ArrayList<MDKeywordsPropertyTypeSDN>();
        }
        return this.descriptiveKeywordsSDN;
    }

    public boolean isSetDescriptiveKeywordsSDN() {
        return ((this.descriptiveKeywordsSDN != null) && (!this.descriptiveKeywordsSDN.isEmpty()));
    }

    public void unsetDescriptiveKeywordsSDN() {
        this.descriptiveKeywordsSDN = null;
    }

}