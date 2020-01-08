//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0-SNAPSHOT 
//         See <a href="https://jaxb.java.net/">https://jaxb.java.net/</a> 
//         Any modifications to this file will be lost upon recompilation of the source schema. 
//         Generated on: 2017.09.29 at 03:54:02 PM CEST 
//


package org.seadatanet.csr.org.isotc211._2005.gmx;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.seadatanet.csr.net.opengis.gml.PrimeMeridianType;


/**
 * <p>Java class for ML_PrimeMeridian_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected         content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ML_PrimeMeridian_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.opengis.net/gml}PrimeMeridianType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="alternativeExpression" type="{http://www.isotc211.org/2005/gmx}PrimeMeridianAlt_PropertyType" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ML_PrimeMeridian_Type", propOrder = {
    "alternativeExpression"
})
public class MLPrimeMeridianType
    extends PrimeMeridianType
    implements Serializable
{

    @XmlElement(required = true)
    protected List<PrimeMeridianAltPropertyType> alternativeExpression;

    /**
     * Gets the value of the alternativeExpression property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the alternativeExpression property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAlternativeExpression().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PrimeMeridianAltPropertyType }
     * 
     * 
     */
    public List<PrimeMeridianAltPropertyType> getAlternativeExpression() {
        if (alternativeExpression == null) {
            alternativeExpression = new ArrayList<PrimeMeridianAltPropertyType>();
        }
        return this.alternativeExpression;
    }

    public boolean isSetAlternativeExpression() {
        return ((this.alternativeExpression!= null)&&(!this.alternativeExpression.isEmpty()));
    }

    public void unsetAlternativeExpression() {
        this.alternativeExpression = null;
    }

}
