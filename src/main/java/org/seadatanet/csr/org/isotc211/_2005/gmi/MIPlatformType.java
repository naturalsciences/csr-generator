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
import org.seadatanet.csr.org.isotc211._2005.gmd.CIResponsiblePartyPropertyType;
import org.seadatanet.csr.org.isotc211._2005.gmd.MDIdentifierPropertyType;


/**
 * Description: Designations for the platform used to acquire the dataset - shortName: PltfrmId
 * 
 * <p>Java class for MI_Platform_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected         content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MI_Platform_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.isotc211.org/2005/gco}AbstractObject_Type"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="citation" type="{http://www.isotc211.org/2005/gmd}CI_Citation_PropertyType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="identifier" type="{http://www.isotc211.org/2005/gmd}MD_Identifier_PropertyType"/&gt;
 *         &lt;element name="description" type="{http://www.isotc211.org/2005/gco}CharacterString_PropertyType"/&gt;
 *         &lt;element name="sponsor" type="{http://www.isotc211.org/2005/gmd}CI_ResponsibleParty_PropertyType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="instrument" type="{http://www.isotc211.org/2005/gmi}MI_Instrument_PropertyType" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MI_Platform_Type", propOrder = {
    "citation",
    "identifier",
    "description",
    "sponsor",
    "instrument"
})
public class MIPlatformType
    extends AbstractObjectType
    implements Serializable
{

    protected List<CICitationPropertyType> citation;
    @XmlElement(required = true)
    protected MDIdentifierPropertyType identifier;
    @XmlElement(required = true)
    protected CharacterStringPropertyType description;
    protected List<CIResponsiblePartyPropertyType> sponsor;
    @XmlElement(required = true)
    protected List<MIInstrumentPropertyType> instrument;

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
     * Gets the value of the sponsor property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sponsor property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSponsor().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CIResponsiblePartyPropertyType }
     * 
     * 
     */
    public List<CIResponsiblePartyPropertyType> getSponsor() {
        if (sponsor == null) {
            sponsor = new ArrayList<CIResponsiblePartyPropertyType>();
        }
        return this.sponsor;
    }

    public boolean isSetSponsor() {
        return ((this.sponsor!= null)&&(!this.sponsor.isEmpty()));
    }

    public void unsetSponsor() {
        this.sponsor = null;
    }

    /**
     * Gets the value of the instrument property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the instrument property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInstrument().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MIInstrumentPropertyType }
     * 
     * 
     */
    public List<MIInstrumentPropertyType> getInstrument() {
        if (instrument == null) {
            instrument = new ArrayList<MIInstrumentPropertyType>();
        }
        return this.instrument;
    }

    public boolean isSetInstrument() {
        return ((this.instrument!= null)&&(!this.instrument.isEmpty()));
    }

    public void unsetInstrument() {
        this.instrument = null;
    }

}