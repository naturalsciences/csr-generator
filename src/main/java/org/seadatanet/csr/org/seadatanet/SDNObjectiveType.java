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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.seadatanet.csr.org.isotc211._2005.gmi.MIObjectiveType;


/**
 * SDN Objective
 * 
 * <p>Java class for SDN_Objective_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected         content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SDN_Objective_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.isotc211.org/2005/gmi}MI_Objective_Type"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.seadatanet.org}SDN_SamplingActivity" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute ref="{http://www.isotc211.org/2005/gco}isoType use="required" fixed="MI_Objective_Type""/&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SDN_Objective_Type", propOrder = {
    "sdnSamplingActivity"
})
public class SDNObjectiveType
    extends MIObjectiveType
    implements Serializable
{

    @XmlElement(name = "SDN_SamplingActivity")
    protected SDNSamplingActivityType sdnSamplingActivity;
    /**
     * 
     * 
     */
    @XmlAttribute(name = "isoType", namespace = "http://www.isotc211.org/2005/gco", required = true)
    public final static String ISO_TYPE = "MI_Objective_Type";

    /**
     * Gets the value of the sdnSamplingActivity property.
     * 
     * @return
     *     possible object is
     *     {@link SDNSamplingActivityType }
     *     
     */
    public SDNSamplingActivityType getSDNSamplingActivity() {
        return sdnSamplingActivity;
    }

    /**
     * Sets the value of the sdnSamplingActivity property.
     * 
     * @param value
     *     allowed object is
     *     {@link SDNSamplingActivityType }
     *     
     */
    public void setSDNSamplingActivity(SDNSamplingActivityType value) {
        this.sdnSamplingActivity = value;
    }

    public boolean isSetSDNSamplingActivity() {
        return (this.sdnSamplingActivity!= null);
    }

}