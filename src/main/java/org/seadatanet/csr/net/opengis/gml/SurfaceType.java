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


/**
 * <p>Java class for SurfaceType complex type.
 * 
 * <p>The following schema fragment specifies the expected         content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SurfaceType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.opengis.net/gml}AbstractSurfaceType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.opengis.net/gml}patches"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SurfaceType", propOrder = {
    "patches"
})
@XmlSeeAlso({
    PolyhedralSurfaceType.class,
    TriangulatedSurfaceType.class
})
public class SurfaceType
    extends AbstractSurfaceType
    implements Serializable
{

    @XmlElementRef(name = "patches", namespace = "http://www.opengis.net/gml", type = JAXBElement.class)
    protected JAXBElement<? extends SurfacePatchArrayPropertyType> patches;

    /**
     * Gets the value of the patches property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TrianglePatchArrayPropertyType }{@code >}
     *     {@link JAXBElement }{@code <}{@link PolygonPatchArrayPropertyType }{@code >}
     *     {@link JAXBElement }{@code <}{@link SurfacePatchArrayPropertyType }{@code >}
     *     
     */
    public JAXBElement<? extends SurfacePatchArrayPropertyType> getPatches() {
        return patches;
    }

    /**
     * Sets the value of the patches property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TrianglePatchArrayPropertyType }{@code >}
     *     {@link JAXBElement }{@code <}{@link PolygonPatchArrayPropertyType }{@code >}
     *     {@link JAXBElement }{@code <}{@link SurfacePatchArrayPropertyType }{@code >}
     *     
     */
    public void setPatches(JAXBElement<? extends SurfacePatchArrayPropertyType> value) {
        this.patches = value;
    }

    public boolean isSetPatches() {
        return (this.patches!= null);
    }

}
