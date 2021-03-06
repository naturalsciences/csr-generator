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
import javax.xml.bind.annotation.XmlType;
import org.seadatanet.csr.org.isotc211._2005.gmd.LIProcessStepType;


/**
 * Description: Information about an event or transformation in the life of the dataset including details of the algorithm and software used for processing - FGDC:  - shortName: DetailProcStep
 * 
 * <p>Java class for LE_ProcessStep_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected         content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LE_ProcessStep_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.isotc211.org/2005/gmd}LI_ProcessStep_Type"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="output" type="{http://www.isotc211.org/2005/gmi}LE_Source_PropertyType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="report" type="{http://www.isotc211.org/2005/gmi}LE_ProcessStepReport_PropertyType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="processingInformation" type="{http://www.isotc211.org/2005/gmi}LE_Processing_PropertyType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LE_ProcessStep_Type", propOrder = {
    "output",
    "report",
    "processingInformation"
})
public class LEProcessStepType
    extends LIProcessStepType
    implements Serializable
{

    protected List<LESourcePropertyType> output;
    protected List<LEProcessStepReportPropertyType> report;
    protected LEProcessingPropertyType processingInformation;

    /**
     * Gets the value of the output property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the output property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOutput().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LESourcePropertyType }
     * 
     * 
     */
    public List<LESourcePropertyType> getOutput() {
        if (output == null) {
            output = new ArrayList<LESourcePropertyType>();
        }
        return this.output;
    }

    public boolean isSetOutput() {
        return ((this.output!= null)&&(!this.output.isEmpty()));
    }

    public void unsetOutput() {
        this.output = null;
    }

    /**
     * Gets the value of the report property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the report property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReport().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LEProcessStepReportPropertyType }
     * 
     * 
     */
    public List<LEProcessStepReportPropertyType> getReport() {
        if (report == null) {
            report = new ArrayList<LEProcessStepReportPropertyType>();
        }
        return this.report;
    }

    public boolean isSetReport() {
        return ((this.report!= null)&&(!this.report.isEmpty()));
    }

    public void unsetReport() {
        this.report = null;
    }

    /**
     * Gets the value of the processingInformation property.
     * 
     * @return
     *     possible object is
     *     {@link LEProcessingPropertyType }
     *     
     */
    public LEProcessingPropertyType getProcessingInformation() {
        return processingInformation;
    }

    /**
     * Sets the value of the processingInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link LEProcessingPropertyType }
     *     
     */
    public void setProcessingInformation(LEProcessingPropertyType value) {
        this.processingInformation = value;
    }

    public boolean isSetProcessingInformation() {
        return (this.processingInformation!= null);
    }

}
