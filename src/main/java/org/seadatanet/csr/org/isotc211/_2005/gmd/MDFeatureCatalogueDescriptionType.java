//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0-SNAPSHOT 
//         See <a href="https://jaxb.java.net/">https://jaxb.java.net/</a> 
//         Any modifications to this file will be lost upon recompilation of the source schema. 
//         Generated on: 2017.09.29 at 03:54:02 PM CEST 
//


package org.seadatanet.csr.org.isotc211._2005.gmd;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.seadatanet.csr.org.isotc211._2005.gco.BooleanPropertyType;
import org.seadatanet.csr.org.isotc211._2005.gco.CharacterStringPropertyType;
import org.seadatanet.csr.org.isotc211._2005.gco.GenericNamePropertyType;


/**
 * Information identifing the feature catalogue
 * 
 * <p>Java class for MD_FeatureCatalogueDescription_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected         content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MD_FeatureCatalogueDescription_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.isotc211.org/2005/gmd}AbstractMD_ContentInformation_Type"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="complianceCode" type="{http://www.isotc211.org/2005/gco}Boolean_PropertyType" minOccurs="0"/&gt;
 *         &lt;element name="language" type="{http://www.isotc211.org/2005/gco}CharacterString_PropertyType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="includedWithDataset" type="{http://www.isotc211.org/2005/gco}Boolean_PropertyType"/&gt;
 *         &lt;element name="featureTypes" type="{http://www.isotc211.org/2005/gco}GenericName_PropertyType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="featureCatalogueCitation" type="{http://www.isotc211.org/2005/gmd}CI_Citation_PropertyType" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MD_FeatureCatalogueDescription_Type", propOrder = {
    "complianceCode",
    "language",
    "includedWithDataset",
    "featureTypes",
    "featureCatalogueCitation"
})
public class MDFeatureCatalogueDescriptionType
    extends AbstractMDContentInformationType
    implements Serializable
{

    protected BooleanPropertyType complianceCode;
    protected List<CharacterStringPropertyType> language;
    @XmlElement(required = true)
    protected BooleanPropertyType includedWithDataset;
    protected List<GenericNamePropertyType> featureTypes;
    @XmlElement(required = true)
    protected List<CICitationPropertyType> featureCatalogueCitation;

    /**
     * Gets the value of the complianceCode property.
     * 
     * @return
     *     possible object is
     *     {@link BooleanPropertyType }
     *     
     */
    public BooleanPropertyType getComplianceCode() {
        return complianceCode;
    }

    /**
     * Sets the value of the complianceCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link BooleanPropertyType }
     *     
     */
    public void setComplianceCode(BooleanPropertyType value) {
        this.complianceCode = value;
    }

    public boolean isSetComplianceCode() {
        return (this.complianceCode!= null);
    }

    /**
     * Gets the value of the language property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the language property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLanguage().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CharacterStringPropertyType }
     * 
     * 
     */
    public List<CharacterStringPropertyType> getLanguage() {
        if (language == null) {
            language = new ArrayList<CharacterStringPropertyType>();
        }
        return this.language;
    }

    public boolean isSetLanguage() {
        return ((this.language!= null)&&(!this.language.isEmpty()));
    }

    public void unsetLanguage() {
        this.language = null;
    }

    /**
     * Gets the value of the includedWithDataset property.
     * 
     * @return
     *     possible object is
     *     {@link BooleanPropertyType }
     *     
     */
    public BooleanPropertyType getIncludedWithDataset() {
        return includedWithDataset;
    }

    /**
     * Sets the value of the includedWithDataset property.
     * 
     * @param value
     *     allowed object is
     *     {@link BooleanPropertyType }
     *     
     */
    public void setIncludedWithDataset(BooleanPropertyType value) {
        this.includedWithDataset = value;
    }

    public boolean isSetIncludedWithDataset() {
        return (this.includedWithDataset!= null);
    }

    /**
     * Gets the value of the featureTypes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the featureTypes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFeatureTypes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GenericNamePropertyType }
     * 
     * 
     */
    public List<GenericNamePropertyType> getFeatureTypes() {
        if (featureTypes == null) {
            featureTypes = new ArrayList<GenericNamePropertyType>();
        }
        return this.featureTypes;
    }

    public boolean isSetFeatureTypes() {
        return ((this.featureTypes!= null)&&(!this.featureTypes.isEmpty()));
    }

    public void unsetFeatureTypes() {
        this.featureTypes = null;
    }

    /**
     * Gets the value of the featureCatalogueCitation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the featureCatalogueCitation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFeatureCatalogueCitation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CICitationPropertyType }
     * 
     * 
     */
    public List<CICitationPropertyType> getFeatureCatalogueCitation() {
        if (featureCatalogueCitation == null) {
            featureCatalogueCitation = new ArrayList<CICitationPropertyType>();
        }
        return this.featureCatalogueCitation;
    }

    public boolean isSetFeatureCatalogueCitation() {
        return ((this.featureCatalogueCitation!= null)&&(!this.featureCatalogueCitation.isEmpty()));
    }

    public void unsetFeatureCatalogueCitation() {
        this.featureCatalogueCitation = null;
    }

}
