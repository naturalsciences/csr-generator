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
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
 import org.seadatanet.csr.org.isotc211._2005.gmx.MLAffineCSType;
 import org.seadatanet.csr.org.isotc211._2005.gmx.MLCartesianCSType;
 import org.seadatanet.csr.org.isotc211._2005.gmx.MLCylindricalCSType;
 import org.seadatanet.csr.org.isotc211._2005.gmx.MLEllipsoidalCSType;
 import org.seadatanet.csr.org.isotc211._2005.gmx.MLLinearCSType;
 import org.seadatanet.csr.org.isotc211._2005.gmx.MLPolarCSType;
 import org.seadatanet.csr.org.isotc211._2005.gmx.MLSphericalCSType;
 import org.seadatanet.csr.org.isotc211._2005.gmx.MLTimeCSType;
 import org.seadatanet.csr.org.isotc211._2005.gmx.MLUserDefinedCSType;
 import org.seadatanet.csr.org.isotc211._2005.gmx.MLVerticalCSType;


/**
 * gml:CoordinateSystemPropertyType is a property type for association roles to a coordinate system, either referencing or containing the definition of that coordinate system.
 * 
 * <p>Java class for CoordinateSystemPropertyType complex type.
 * 
 * <p>The following schema fragment specifies the expected         content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CoordinateSystemPropertyType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence minOccurs="0"&gt;
 *         &lt;element ref="{http://www.opengis.net/gml}AbstractCoordinateSystem"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attGroup ref="{http://www.opengis.net/gml}AssociationAttributeGroup"/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CoordinateSystemPropertyType", propOrder = {
    "abstractCoordinateSystem"
})
public class CoordinateSystemPropertyType
    implements Serializable
{

    @XmlElementRef(name = "AbstractCoordinateSystem", namespace = "http://www.opengis.net/gml", type = JAXBElement.class, required = false)
    protected JAXBElement<? extends AbstractCoordinateSystemType> abstractCoordinateSystem;
    @XmlAttribute(name = "nilReason")
    protected List<String> nilReason;
    @XmlAttribute(name = "remoteSchema", namespace = "http://www.opengis.net/gml")
    @XmlSchemaType(name = "anyURI")
    protected String remoteSchema;
    /**
     * 
     * 
     */
    @XmlAttribute(name = "type", namespace = "http://www.w3.org/1999/xlink")
    public final static String TYPE = "simple";
    @XmlAttribute(name = "href", namespace = "http://www.w3.org/1999/xlink")
    @XmlSchemaType(name = "anyURI")
    protected String href;
    @XmlAttribute(name = "role", namespace = "http://www.w3.org/1999/xlink")
    @XmlSchemaType(name = "anyURI")
    protected String role;
    @XmlAttribute(name = "arcrole", namespace = "http://www.w3.org/1999/xlink")
    @XmlSchemaType(name = "anyURI")
    protected String arcrole;
    @XmlAttribute(name = "title", namespace = "http://www.w3.org/1999/xlink")
    protected String title;
    @XmlAttribute(name = "show", namespace = "http://www.w3.org/1999/xlink")
    protected String show;
    @XmlAttribute(name = "actuate", namespace = "http://www.w3.org/1999/xlink")
    protected String actuate;

    /**
     * Gets the value of the abstractCoordinateSystem property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MLTimeCSType }{@code >}
     *     {@link NetOpengisGmlTimeCSType }
     *     {@link JAXBElement }{@code <}{@link MLEllipsoidalCSType }{@code >}
     *     {@link NetOpengisGmlEllipsoidalCSType }
     *     {@link JAXBElement }{@code <}{@link MLUserDefinedCSType }{@code >}
     *     {@link JAXBElement }{@code <}{@link UserDefinedCSType }{@code >}
     *     {@link JAXBElement }{@code <}{@link MLVerticalCSType }{@code >}
     *     {@link NetOpengisGmlVerticalCSType }
     *     {@link JAXBElement }{@code <}{@link MLLinearCSType }{@code >}
     *     {@link JAXBElement }{@code <}{@link LinearCSType }{@code >}
     *     {@link JAXBElement }{@code <}{@link MLSphericalCSType }{@code >}
     *     {@link NetOpengisGmlSphericalCSType }
     *     {@link JAXBElement }{@code <}{@link ObliqueCartesianCSType }{@code >}
     *     {@link JAXBElement }{@code <}{@link MLCartesianCSType }{@code >}
     *     {@link NetOpengisGmlCartesianCSType }
     *     {@link JAXBElement }{@code <}{@link MLAffineCSType }{@code >}
     *     {@link NetOpengisGmlAffineCSType }
     *     {@link JAXBElement }{@code <}{@link TemporalCSType }{@code >}
     *     {@link JAXBElement }{@code <}{@link MLPolarCSType }{@code >}
     *     {@link JAXBElement }{@code <}{@link PolarCSType }{@code >}
     *     {@link JAXBElement }{@code <}{@link MLCylindricalCSType }{@code >}
     *     {@link JAXBElement }{@code <}{@link CylindricalCSType }{@code >}
     *     {@link JAXBElement }{@code <}{@link AbstractCoordinateSystemType }{@code >}
     *     
     */
    public JAXBElement<? extends AbstractCoordinateSystemType> getAbstractCoordinateSystem() {
        return abstractCoordinateSystem;
    }

    /**
     * Sets the value of the abstractCoordinateSystem property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MLTimeCSType }{@code >}
     *     {@link NetOpengisGmlTimeCSType }
     *     {@link JAXBElement }{@code <}{@link MLEllipsoidalCSType }{@code >}
     *     {@link NetOpengisGmlEllipsoidalCSType }
     *     {@link JAXBElement }{@code <}{@link MLUserDefinedCSType }{@code >}
     *     {@link JAXBElement }{@code <}{@link UserDefinedCSType }{@code >}
     *     {@link JAXBElement }{@code <}{@link MLVerticalCSType }{@code >}
     *     {@link NetOpengisGmlVerticalCSType }
     *     {@link JAXBElement }{@code <}{@link MLLinearCSType }{@code >}
     *     {@link JAXBElement }{@code <}{@link LinearCSType }{@code >}
     *     {@link JAXBElement }{@code <}{@link MLSphericalCSType }{@code >}
     *     {@link NetOpengisGmlSphericalCSType }
     *     {@link JAXBElement }{@code <}{@link ObliqueCartesianCSType }{@code >}
     *     {@link JAXBElement }{@code <}{@link MLCartesianCSType }{@code >}
     *     {@link NetOpengisGmlCartesianCSType }
     *     {@link JAXBElement }{@code <}{@link MLAffineCSType }{@code >}
     *     {@link NetOpengisGmlAffineCSType }
     *     {@link JAXBElement }{@code <}{@link TemporalCSType }{@code >}
     *     {@link JAXBElement }{@code <}{@link MLPolarCSType }{@code >}
     *     {@link JAXBElement }{@code <}{@link PolarCSType }{@code >}
     *     {@link JAXBElement }{@code <}{@link MLCylindricalCSType }{@code >}
     *     {@link JAXBElement }{@code <}{@link CylindricalCSType }{@code >}
     *     {@link JAXBElement }{@code <}{@link AbstractCoordinateSystemType }{@code >}
     *     
     */
    public void setAbstractCoordinateSystem(JAXBElement<? extends AbstractCoordinateSystemType> value) {
        this.abstractCoordinateSystem = value;
    }

    public boolean isSetAbstractCoordinateSystem() {
        return (this.abstractCoordinateSystem!= null);
    }

    /**
     * Gets the value of the nilReason property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the nilReason property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNilReason().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getNilReason() {
        if (nilReason == null) {
            nilReason = new ArrayList<String>();
        }
        return this.nilReason;
    }

    public boolean isSetNilReason() {
        return ((this.nilReason!= null)&&(!this.nilReason.isEmpty()));
    }

    public void unsetNilReason() {
        this.nilReason = null;
    }

    /**
     * Gets the value of the remoteSchema property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRemoteSchema() {
        return remoteSchema;
    }

    /**
     * Sets the value of the remoteSchema property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRemoteSchema(String value) {
        this.remoteSchema = value;
    }

    public boolean isSetRemoteSchema() {
        return (this.remoteSchema!= null);
    }

    /**
     * Gets the value of the href property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHref() {
        return href;
    }

    /**
     * Sets the value of the href property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHref(String value) {
        this.href = value;
    }

    public boolean isSetHref() {
        return (this.href!= null);
    }

    /**
     * Gets the value of the role property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRole() {
        return role;
    }

    /**
     * Sets the value of the role property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRole(String value) {
        this.role = value;
    }

    public boolean isSetRole() {
        return (this.role!= null);
    }

    /**
     * Gets the value of the arcrole property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArcrole() {
        return arcrole;
    }

    /**
     * Sets the value of the arcrole property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArcrole(String value) {
        this.arcrole = value;
    }

    public boolean isSetArcrole() {
        return (this.arcrole!= null);
    }

    /**
     * Gets the value of the title property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets the value of the title property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitle(String value) {
        this.title = value;
    }

    public boolean isSetTitle() {
        return (this.title!= null);
    }

    /**
     * Gets the value of the show property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShow() {
        return show;
    }

    /**
     * Sets the value of the show property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShow(String value) {
        this.show = value;
    }

    public boolean isSetShow() {
        return (this.show!= null);
    }

    /**
     * Gets the value of the actuate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActuate() {
        return actuate;
    }

    /**
     * Sets the value of the actuate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActuate(String value) {
        this.actuate = value;
    }

    public boolean isSetActuate() {
        return (this.actuate!= null);
    }

}
