//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0-SNAPSHOT 
//         See <a href="https://jaxb.java.net/">https://jaxb.java.net/</a> 
//         Any modifications to this file will be lost upon recompilation of the source schema. 
//         Generated on: 2017.09.29 at 03:54:02 PM CEST 
//


package org.seadatanet.csr.net.opengis.gml;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlList;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ParameterValueType complex type.
 * 
 * <p>The following schema fragment specifies the expected         content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ParameterValueType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.opengis.net/gml}AbstractGeneralParameterValueType"&gt;
 *       &lt;sequence&gt;
 *         &lt;choice&gt;
 *           &lt;element ref="{http://www.opengis.net/gml}value"/&gt;
 *           &lt;element ref="{http://www.opengis.net/gml}dmsAngleValue"/&gt;
 *           &lt;element ref="{http://www.opengis.net/gml}stringValue"/&gt;
 *           &lt;element ref="{http://www.opengis.net/gml}integerValue"/&gt;
 *           &lt;element ref="{http://www.opengis.net/gml}booleanValue"/&gt;
 *           &lt;element ref="{http://www.opengis.net/gml}valueList"/&gt;
 *           &lt;element ref="{http://www.opengis.net/gml}integerValueList"/&gt;
 *           &lt;element ref="{http://www.opengis.net/gml}valueFile"/&gt;
 *         &lt;/choice&gt;
 *         &lt;element ref="{http://www.opengis.net/gml}operationParameter"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ParameterValueType", propOrder = {
    "value",
    "dmsAngleValue",
    "stringValue",
    "integerValue",
    "booleanValue",
    "valueList",
    "integerValueList",
    "valueFile",
    "operationParameter"
})
public class ParameterValueType
    extends AbstractGeneralParameterValueType
    implements Serializable
{

    protected MeasureType value;
    protected DMSAngleType dmsAngleValue;
    protected String stringValue;
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger integerValue;
    protected java.lang.Boolean booleanValue;
    protected MeasureListType valueList;
    @XmlList
    protected List<BigInteger> integerValueList;
    @XmlSchemaType(name = "anyURI")
    protected String valueFile;
    @XmlElementRef(name = "operationParameter", namespace = "http://www.opengis.net/gml", type = NetOpengisGmlOperationParameterPropertyType.class)
    protected JAXBElement<OperationParameterPropertyType> operationParameter;

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link MeasureType }
     *     
     */
    public MeasureType getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasureType }
     *     
     */
    public void setValue(MeasureType value) {
        this.value = value;
    }

    public boolean isSetValue() {
        return (this.value!= null);
    }

    /**
     * Gets the value of the dmsAngleValue property.
     * 
     * @return
     *     possible object is
     *     {@link DMSAngleType }
     *     
     */
    public DMSAngleType getDmsAngleValue() {
        return dmsAngleValue;
    }

    /**
     * Sets the value of the dmsAngleValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link DMSAngleType }
     *     
     */
    public void setDmsAngleValue(DMSAngleType value) {
        this.dmsAngleValue = value;
    }

    public boolean isSetDmsAngleValue() {
        return (this.dmsAngleValue!= null);
    }

    /**
     * Gets the value of the stringValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStringValue() {
        return stringValue;
    }

    /**
     * Sets the value of the stringValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStringValue(String value) {
        this.stringValue = value;
    }

    public boolean isSetStringValue() {
        return (this.stringValue!= null);
    }

    /**
     * Gets the value of the integerValue property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getIntegerValue() {
        return integerValue;
    }

    /**
     * Sets the value of the integerValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setIntegerValue(BigInteger value) {
        this.integerValue = value;
    }

    public boolean isSetIntegerValue() {
        return (this.integerValue!= null);
    }

    /**
     * Gets the value of the booleanValue property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.Boolean }
     *     
     */
    public java.lang.Boolean isBooleanValue() {
        return booleanValue;
    }

    /**
     * Sets the value of the booleanValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.Boolean }
     *     
     */
    public void setBooleanValue(java.lang.Boolean value) {
        this.booleanValue = value;
    }

    public boolean isSetBooleanValue() {
        return (this.booleanValue!= null);
    }

    /**
     * Gets the value of the valueList property.
     * 
     * @return
     *     possible object is
     *     {@link MeasureListType }
     *     
     */
    public MeasureListType getValueList() {
        return valueList;
    }

    /**
     * Sets the value of the valueList property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasureListType }
     *     
     */
    public void setValueList(MeasureListType value) {
        this.valueList = value;
    }

    public boolean isSetValueList() {
        return (this.valueList!= null);
    }

    /**
     * Gets the value of the integerValueList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the integerValueList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIntegerValueList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BigInteger }
     * 
     * 
     */
    public List<BigInteger> getIntegerValueList() {
        if (integerValueList == null) {
            integerValueList = new ArrayList<BigInteger>();
        }
        return this.integerValueList;
    }

    public boolean isSetIntegerValueList() {
        return ((this.integerValueList!= null)&&(!this.integerValueList.isEmpty()));
    }

    public void unsetIntegerValueList() {
        this.integerValueList = null;
    }

    /**
     * Gets the value of the valueFile property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValueFile() {
        return valueFile;
    }

    /**
     * Sets the value of the valueFile property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValueFile(String value) {
        this.valueFile = value;
    }

    public boolean isSetValueFile() {
        return (this.valueFile!= null);
    }

    /**
     * Gets the value of the operationParameter property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link OperationParameterPropertyType }{@code >}
     *     {@link NetOpengisGmlOperationParameterPropertyType }
     *     
     */
    public JAXBElement<OperationParameterPropertyType> getOperationParameter() {
        return operationParameter;
    }

    /**
     * Sets the value of the operationParameter property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link OperationParameterPropertyType }{@code >}
     *     {@link NetOpengisGmlOperationParameterPropertyType }
     *     
     */
    public void setOperationParameter(JAXBElement<OperationParameterPropertyType> value) {
        this.operationParameter = value;
    }

    public boolean isSetOperationParameter() {
        return (this.operationParameter!= null);
    }

}