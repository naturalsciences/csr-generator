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
import org.seadatanet.csr.org.isotc211._2005.gco.CharacterStringPropertyType;
import org.seadatanet.csr.org.isotc211._2005.gco.IntegerPropertyType;
import org.seadatanet.csr.org.isotc211._2005.gmd.MDReferenceSystemPropertyType;


/**
 * <p>Java class for MI_GCPCollection_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected         content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MI_GCPCollection_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.isotc211.org/2005/gmi}AbstractMI_GeolocationInformation_Type"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="collectionIdentification" type="{http://www.isotc211.org/2005/gco}Integer_PropertyType"/&gt;
 *         &lt;element name="collectionName" type="{http://www.isotc211.org/2005/gco}CharacterString_PropertyType"/&gt;
 *         &lt;element name="coordinateReferenceSystem" type="{http://www.isotc211.org/2005/gmd}MD_ReferenceSystem_PropertyType"/&gt;
 *         &lt;element name="gcp" type="{http://www.isotc211.org/2005/gmi}MI_GCP_PropertyType" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MI_GCPCollection_Type", propOrder = {
    "collectionIdentification",
    "collectionName",
    "coordinateReferenceSystem",
    "gcp"
})
public class MIGCPCollectionType
    extends AbstractMIGeolocationInformationType
    implements Serializable
{

    @XmlElement(required = true)
    protected IntegerPropertyType collectionIdentification;
    @XmlElement(required = true)
    protected CharacterStringPropertyType collectionName;
    @XmlElement(required = true)
    protected MDReferenceSystemPropertyType coordinateReferenceSystem;
    @XmlElement(required = true)
    protected List<MIGCPPropertyType> gcp;

    /**
     * Gets the value of the collectionIdentification property.
     * 
     * @return
     *     possible object is
     *     {@link IntegerPropertyType }
     *     
     */
    public IntegerPropertyType getCollectionIdentification() {
        return collectionIdentification;
    }

    /**
     * Sets the value of the collectionIdentification property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntegerPropertyType }
     *     
     */
    public void setCollectionIdentification(IntegerPropertyType value) {
        this.collectionIdentification = value;
    }

    public boolean isSetCollectionIdentification() {
        return (this.collectionIdentification!= null);
    }

    /**
     * Gets the value of the collectionName property.
     * 
     * @return
     *     possible object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public CharacterStringPropertyType getCollectionName() {
        return collectionName;
    }

    /**
     * Sets the value of the collectionName property.
     * 
     * @param value
     *     allowed object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public void setCollectionName(CharacterStringPropertyType value) {
        this.collectionName = value;
    }

    public boolean isSetCollectionName() {
        return (this.collectionName!= null);
    }

    /**
     * Gets the value of the coordinateReferenceSystem property.
     * 
     * @return
     *     possible object is
     *     {@link MDReferenceSystemPropertyType }
     *     
     */
    public MDReferenceSystemPropertyType getCoordinateReferenceSystem() {
        return coordinateReferenceSystem;
    }

    /**
     * Sets the value of the coordinateReferenceSystem property.
     * 
     * @param value
     *     allowed object is
     *     {@link MDReferenceSystemPropertyType }
     *     
     */
    public void setCoordinateReferenceSystem(MDReferenceSystemPropertyType value) {
        this.coordinateReferenceSystem = value;
    }

    public boolean isSetCoordinateReferenceSystem() {
        return (this.coordinateReferenceSystem!= null);
    }

    /**
     * Gets the value of the gcp property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the gcp property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGcp().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MIGCPPropertyType }
     * 
     * 
     */
    public List<MIGCPPropertyType> getGcp() {
        if (gcp == null) {
            gcp = new ArrayList<MIGCPPropertyType>();
        }
        return this.gcp;
    }

    public boolean isSetGcp() {
        return ((this.gcp!= null)&&(!this.gcp.isEmpty()));
    }

    public void unsetGcp() {
        this.gcp = null;
    }

}
