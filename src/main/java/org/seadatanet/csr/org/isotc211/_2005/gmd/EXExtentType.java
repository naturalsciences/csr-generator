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
import javax.xml.bind.annotation.XmlType;
import org.seadatanet.csr.org.isotc211._2005.gco.AbstractObjectType;
import org.seadatanet.csr.org.isotc211._2005.gco.CharacterStringPropertyType;


/**
 * Information about spatial, vertical, and temporal extent
 * 
 * <p>Java class for EX_Extent_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected         content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EX_Extent_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.isotc211.org/2005/gco}AbstractObject_Type"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="description" type="{http://www.isotc211.org/2005/gco}CharacterString_PropertyType" minOccurs="0"/&gt;
 *         &lt;element name="geographicElement" type="{http://www.isotc211.org/2005/gmd}EX_GeographicExtent_PropertyType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="temporalElement" type="{http://www.isotc211.org/2005/gmd}EX_TemporalExtent_PropertyType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="verticalElement" type="{http://www.isotc211.org/2005/gmd}EX_VerticalExtent_PropertyType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EX_Extent_Type", propOrder = {
    "description",
    "geographicElement",
    "temporalElement",
    "verticalElement"
})
public class EXExtentType
    extends AbstractObjectType
    implements Serializable
{

    protected CharacterStringPropertyType description;
    protected List<EXGeographicExtentPropertyType> geographicElement;
    protected List<EXTemporalExtentPropertyType> temporalElement;
    protected List<EXVerticalExtentPropertyType> verticalElement;

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
     * Gets the value of the geographicElement property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the geographicElement property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGeographicElement().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EXGeographicExtentPropertyType }
     * 
     * 
     */
    public List<EXGeographicExtentPropertyType> getGeographicElement() {
        if (geographicElement == null) {
            geographicElement = new ArrayList<EXGeographicExtentPropertyType>();
        }
        return this.geographicElement;
    }

    public boolean isSetGeographicElement() {
        return ((this.geographicElement!= null)&&(!this.geographicElement.isEmpty()));
    }

    public void unsetGeographicElement() {
        this.geographicElement = null;
    }

    /**
     * Gets the value of the temporalElement property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the temporalElement property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTemporalElement().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EXTemporalExtentPropertyType }
     * 
     * 
     */
    public List<EXTemporalExtentPropertyType> getTemporalElement() {
        if (temporalElement == null) {
            temporalElement = new ArrayList<EXTemporalExtentPropertyType>();
        }
        return this.temporalElement;
    }

    public boolean isSetTemporalElement() {
        return ((this.temporalElement!= null)&&(!this.temporalElement.isEmpty()));
    }

    public void unsetTemporalElement() {
        this.temporalElement = null;
    }

    /**
     * Gets the value of the verticalElement property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the verticalElement property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVerticalElement().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EXVerticalExtentPropertyType }
     * 
     * 
     */
    public List<EXVerticalExtentPropertyType> getVerticalElement() {
        if (verticalElement == null) {
            verticalElement = new ArrayList<EXVerticalExtentPropertyType>();
        }
        return this.verticalElement;
    }

    public boolean isSetVerticalElement() {
        return ((this.verticalElement!= null)&&(!this.verticalElement.isEmpty()));
    }

    public void unsetVerticalElement() {
        this.verticalElement = null;
    }

}
