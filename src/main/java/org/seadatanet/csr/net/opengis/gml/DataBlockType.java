//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0-SNAPSHOT 
//         See <a href="https://jaxb.java.net/">https://jaxb.java.net/</a> 
//         Any modifications to this file will be lost upon recompilation of the source schema. 
//         Generated on: 2017.09.29 at 03:54:02 PM CEST 
//


package org.seadatanet.csr.net.opengis.gml;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlList;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DataBlockType complex type.
 * 
 * <p>The following schema fragment specifies the expected         content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DataBlockType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.opengis.net/gml}rangeParameters"/&gt;
 *         &lt;choice&gt;
 *           &lt;element ref="{http://www.opengis.net/gml}tupleList"/&gt;
 *           &lt;element ref="{http://www.opengis.net/gml}doubleOrNilReasonTupleList"/&gt;
 *         &lt;/choice&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DataBlockType", propOrder = {
    "rangeParameters",
    "tupleList",
    "doubleOrNilReasonTupleList"
})
public class DataBlockType implements Serializable
{

    @XmlElement(required = true)
    protected RangeParametersType rangeParameters;
    protected CoordinatesType tupleList;
    @XmlList
    protected List<String> doubleOrNilReasonTupleList;

    /**
     * Gets the value of the rangeParameters property.
     * 
     * @return
     *     possible object is
     *     {@link RangeParametersType }
     *     
     */
    public RangeParametersType getRangeParameters() {
        return rangeParameters;
    }

    /**
     * Sets the value of the rangeParameters property.
     * 
     * @param value
     *     allowed object is
     *     {@link RangeParametersType }
     *     
     */
    public void setRangeParameters(RangeParametersType value) {
        this.rangeParameters = value;
    }

    public boolean isSetRangeParameters() {
        return (this.rangeParameters!= null);
    }

    /**
     * Gets the value of the tupleList property.
     * 
     * @return
     *     possible object is
     *     {@link CoordinatesType }
     *     
     */
    public CoordinatesType getTupleList() {
        return tupleList;
    }

    /**
     * Sets the value of the tupleList property.
     * 
     * @param value
     *     allowed object is
     *     {@link CoordinatesType }
     *     
     */
    public void setTupleList(CoordinatesType value) {
        this.tupleList = value;
    }

    public boolean isSetTupleList() {
        return (this.tupleList!= null);
    }

    /**
     * Gets the value of the doubleOrNilReasonTupleList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the doubleOrNilReasonTupleList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDoubleOrNilReasonTupleList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getDoubleOrNilReasonTupleList() {
        if (doubleOrNilReasonTupleList == null) {
            doubleOrNilReasonTupleList = new ArrayList<String>();
        }
        return this.doubleOrNilReasonTupleList;
    }

    public boolean isSetDoubleOrNilReasonTupleList() {
        return ((this.doubleOrNilReasonTupleList!= null)&&(!this.doubleOrNilReasonTupleList.isEmpty()));
    }

    public void unsetDoubleOrNilReasonTupleList() {
        this.doubleOrNilReasonTupleList = null;
    }

}
