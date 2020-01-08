//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0-SNAPSHOT 
//         See <a href="https://jaxb.java.net/">https://jaxb.java.net/</a> 
//         Any modifications to this file will be lost upon recompilation of the source schema. 
//         Generated on: 2017.09.29 at 03:54:02 PM CEST 
//


package org.seadatanet.csr.net.opengis.gml;

import java.io.Serializable;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
 import org.seadatanet.csr.org.isotc211._2005.gmx.MLGeodeticDatumType;


/**
 * <p>Java class for GeodeticDatumType complex type.
 * 
 * <p>The following schema fragment specifies the expected         content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GeodeticDatumType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.opengis.net/gml}AbstractDatumType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.opengis.net/gml}primeMeridian"/&gt;
 *         &lt;element ref="{http://www.opengis.net/gml}ellipsoid"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GeodeticDatumType", propOrder = {
    "primeMeridian",
    "ellipsoid"
})
@XmlSeeAlso({
    MLGeodeticDatumType.class
})
public class GeodeticDatumType
    extends AbstractDatumType
    implements Serializable
{

    @XmlElementRef(name = "primeMeridian", namespace = "http://www.opengis.net/gml", type = NetOpengisGmlPrimeMeridianPropertyType.class)
    protected JAXBElement<PrimeMeridianPropertyType> primeMeridian;
    @XmlElementRef(name = "ellipsoid", namespace = "http://www.opengis.net/gml", type = NetOpengisGmlEllipsoidPropertyType.class)
    protected JAXBElement<EllipsoidPropertyType> ellipsoid;

    /**
     * Gets the value of the primeMeridian property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PrimeMeridianPropertyType }{@code >}
     *     {@link NetOpengisGmlPrimeMeridianPropertyType }
     *     
     */
    public JAXBElement<PrimeMeridianPropertyType> getPrimeMeridian() {
        return primeMeridian;
    }

    /**
     * Sets the value of the primeMeridian property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PrimeMeridianPropertyType }{@code >}
     *     {@link NetOpengisGmlPrimeMeridianPropertyType }
     *     
     */
    public void setPrimeMeridian(JAXBElement<PrimeMeridianPropertyType> value) {
        this.primeMeridian = value;
    }

    public boolean isSetPrimeMeridian() {
        return (this.primeMeridian!= null);
    }

    /**
     * Gets the value of the ellipsoid property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EllipsoidPropertyType }{@code >}
     *     {@link NetOpengisGmlEllipsoidPropertyType }
     *     
     */
    public JAXBElement<EllipsoidPropertyType> getEllipsoid() {
        return ellipsoid;
    }

    /**
     * Sets the value of the ellipsoid property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EllipsoidPropertyType }{@code >}
     *     {@link NetOpengisGmlEllipsoidPropertyType }
     *     
     */
    public void setEllipsoid(JAXBElement<EllipsoidPropertyType> value) {
        this.ellipsoid = value;
    }

    public boolean isSetEllipsoid() {
        return (this.ellipsoid!= null);
    }

}