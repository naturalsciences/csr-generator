//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0-SNAPSHOT 
//         See <a href="https://jaxb.java.net/">https://jaxb.java.net/</a> 
//         Any modifications to this file will be lost upon recompilation of the source schema. 
//         Generated on: 2017.09.29 at 03:54:02 PM CEST 
//


package org.seadatanet.csr.org.isotc211._2005.gmi;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.seadatanet.csr.org.isotc211._2005.gco.AbstractObjectType;
import org.seadatanet.csr.org.isotc211._2005.gco.CharacterStringPropertyType;
import org.seadatanet.csr.org.isotc211._2005.gmd.CICitationPropertyType;
import org.seadatanet.csr.org.isotc211._2005.gmd.MDIdentifierPropertyType;
import org.seadatanet.csr.org.seadatanet.SDNDataCategoryCodePropertyType;


/**
 * Description: Designations for the measuring instruments - FGDC: Platform_and_Instrument_Identification - shortName: PltfrmInstId
 * 
 * <p>Java class for MI_Instrument_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected         content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MI_Instrument_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.isotc211.org/2005/gco}AbstractObject_Type"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="citation" type="{http://www.isotc211.org/2005/gmd}CI_Citation_PropertyType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="identifier" type="{http://www.isotc211.org/2005/gmd}MD_Identifier_PropertyType"/&gt;
 *         &lt;element name="type" type="{http://www.isotc211.org/2005/gco}CharacterString_PropertyType"/&gt;
 *         &lt;element name="description" type="{http://www.isotc211.org/2005/gco}CharacterString_PropertyType" minOccurs="0"/&gt;
 *         &lt;element name="mountedOn" type="{http://www.isotc211.org/2005/gmi}MI_Platform_PropertyType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MI_Instrument_Type", propOrder = {
    "citation",
    "identifier",
    "type",
    "description",
    "mountedOn"
})
public class MIInstrumentType
    extends AbstractObjectType
    implements Serializable
{

    protected List<CICitationPropertyType> citation;
    @XmlElement(required = true)
    protected MDIdentifierPropertyType identifier;
    @XmlElement(required = true)
    protected SDNDataCategoryCodePropertyType type;
    protected CharacterStringPropertyType description;
    protected MIPlatformPropertyType mountedOn;

    /**
     * Gets the value of the citation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the citation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCitation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CICitationPropertyType }
     * 
     * 
     */
    public List<CICitationPropertyType> getCitation() {
        if (citation == null) {
            citation = new ArrayList<CICitationPropertyType>();
        }
        return this.citation;
    }

    public boolean isSetCitation() {
        return ((this.citation!= null)&&(!this.citation.isEmpty()));
    }

    public void unsetCitation() {
        this.citation = null;
    }

    /**
     * Gets the value of the identifier property.
     * 
     * @return
     *     possible object is
     *     {@link MDIdentifierPropertyType }
     *     
     */
    public MDIdentifierPropertyType getIdentifier() {
        return identifier;
    }

    /**
     * Sets the value of the identifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link MDIdentifierPropertyType }
     *     
     */
    public void setIdentifier(MDIdentifierPropertyType value) {
        this.identifier = value;
    }

    public boolean isSetIdentifier() {
        return (this.identifier!= null);
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public SDNDataCategoryCodePropertyType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public void setType(SDNDataCategoryCodePropertyType value) {
        this.type = value;
    }

    public boolean isSetType() {
        return (this.type!= null);
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public CharacterStringPropertyType getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public void setDescription(CharacterStringPropertyType value) {
        this.description = value;
    }

    public boolean isSetDescription() {
        return (this.description!= null);
    }

    /**
     * Gets the value of the mountedOn property.
     * 
     * @return
     *     possible object is
     *     {@link MIPlatformPropertyType }
     *     
     */
    public MIPlatformPropertyType getMountedOn() {
        return mountedOn;
    }

    /**
     * Sets the value of the mountedOn property.
     * 
     * @param value
     *     allowed object is
     *     {@link MIPlatformPropertyType }
     *     
     */
    public void setMountedOn(MIPlatformPropertyType value) {
        this.mountedOn = value;
    }

    public boolean isSetMountedOn() {
        return (this.mountedOn!= null);
    }

}
