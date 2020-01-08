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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.seadatanet.csr.org.isotc211._2005.gco.AbstractObjectType;
import org.seadatanet.csr.org.isotc211._2005.gco.DateTimePropertyType;


/**
 * Description: range of date validity - shortName: ReqstDate
 * 
 * <p>Java class for MI_RequestedDate_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected         content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MI_RequestedDate_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.isotc211.org/2005/gco}AbstractObject_Type"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="requestedDateOfCollection" type="{http://www.isotc211.org/2005/gco}DateTime_PropertyType"/&gt;
 *         &lt;element name="latestAcceptableDate" type="{http://www.isotc211.org/2005/gco}DateTime_PropertyType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MI_RequestedDate_Type", propOrder = {
    "requestedDateOfCollection",
    "latestAcceptableDate"
})
public class MIRequestedDateType
    extends AbstractObjectType
    implements Serializable
{

    @XmlElement(required = true)
    protected DateTimePropertyType requestedDateOfCollection;
    @XmlElement(required = true)
    protected DateTimePropertyType latestAcceptableDate;

    /**
     * Gets the value of the requestedDateOfCollection property.
     * 
     * @return
     *     possible object is
     *     {@link DateTimePropertyType }
     *     
     */
    public DateTimePropertyType getRequestedDateOfCollection() {
        return requestedDateOfCollection;
    }

    /**
     * Sets the value of the requestedDateOfCollection property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTimePropertyType }
     *     
     */
    public void setRequestedDateOfCollection(DateTimePropertyType value) {
        this.requestedDateOfCollection = value;
    }

    public boolean isSetRequestedDateOfCollection() {
        return (this.requestedDateOfCollection!= null);
    }

    /**
     * Gets the value of the latestAcceptableDate property.
     * 
     * @return
     *     possible object is
     *     {@link DateTimePropertyType }
     *     
     */
    public DateTimePropertyType getLatestAcceptableDate() {
        return latestAcceptableDate;
    }

    /**
     * Sets the value of the latestAcceptableDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTimePropertyType }
     *     
     */
    public void setLatestAcceptableDate(DateTimePropertyType value) {
        this.latestAcceptableDate = value;
    }

    public boolean isSetLatestAcceptableDate() {
        return (this.latestAcceptableDate!= null);
    }

}
