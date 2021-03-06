//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0-SNAPSHOT 
//         See <a href="https://jaxb.java.net/">https://jaxb.java.net/</a> 
//         Any modifications to this file will be lost upon recompilation of the source schema. 
//         Generated on: 2017.09.29 at 03:54:02 PM CEST 
//


package org.seadatanet.csr.org.isotc211._2005.gmi;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import org.seadatanet.csr.org.isotc211._2005.gco.DistancePropertyType;


/**
 * Description: Distance between adjacent pixels - shortName: nomRes
 * 
 * <p>Java class for LE_NominalResolution_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected         content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LE_NominalResolution_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="scanningResolution" type="{http://www.isotc211.org/2005/gco}Distance_PropertyType"/&gt;
 *         &lt;element name="groundResolution" type="{http://www.isotc211.org/2005/gco}Distance_PropertyType"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LE_NominalResolution_Type", propOrder = {
    "scanningResolution",
    "groundResolution"
})
public class LENominalResolutionType
    implements Serializable
{

    protected DistancePropertyType scanningResolution;
    protected DistancePropertyType groundResolution;

    /**
     * Gets the value of the scanningResolution property.
     * 
     * @return
     *     possible object is
     *     {@link DistancePropertyType }
     *     
     */
    public DistancePropertyType getScanningResolution() {
        return scanningResolution;
    }

    /**
     * Sets the value of the scanningResolution property.
     * 
     * @param value
     *     allowed object is
     *     {@link DistancePropertyType }
     *     
     */
    public void setScanningResolution(DistancePropertyType value) {
        this.scanningResolution = value;
    }

    public boolean isSetScanningResolution() {
        return (this.scanningResolution!= null);
    }

    /**
     * Gets the value of the groundResolution property.
     * 
     * @return
     *     possible object is
     *     {@link DistancePropertyType }
     *     
     */
    public DistancePropertyType getGroundResolution() {
        return groundResolution;
    }

    /**
     * Sets the value of the groundResolution property.
     * 
     * @param value
     *     allowed object is
     *     {@link DistancePropertyType }
     *     
     */
    public void setGroundResolution(DistancePropertyType value) {
        this.groundResolution = value;
    }

    public boolean isSetGroundResolution() {
        return (this.groundResolution!= null);
    }

}
