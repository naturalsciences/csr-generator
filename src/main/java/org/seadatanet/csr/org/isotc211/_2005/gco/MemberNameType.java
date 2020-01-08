//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0-SNAPSHOT 
//         See <a href="https://jaxb.java.net/">https://jaxb.java.net/</a> 
//         Any modifications to this file will be lost upon recompilation of the source schema. 
//         Generated on: 2017.09.29 at 03:54:02 PM CEST 
//
package org.seadatanet.csr.org.isotc211._2005.gco;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * A MemberName is a LocalName that references either an attribute slot in a
 * record or recordType or an attribute, operation, or association role in an
 * object instance or type description in some form of schema. The stored value
 * "aName" is the returned value for the "aName()" operation.
 *
 * <p>
 * Java class for MemberName_Type complex type.
 *
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 *
 * <pre>
 * &lt;complexType name="MemberName_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.isotc211.org/2005/gco}AbstractObject_Type"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="aName" type="{http://www.isotc211.org/2005/gco}CharacterString_PropertyType"/&gt;
 *         &lt;element name="attributeType" type="{http://www.isotc211.org/2005/gco}TypeName_PropertyType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MemberName_Type", propOrder = {
    "aName",
    "attributeType"
})
public class MemberNameType
        extends AbstractObjectType
        implements Serializable {

    @XmlElement(required = true)
    protected CharacterStringPropertyType aName;
    @XmlElement(required = true)
    protected TypeNamePropertyType attributeType;

    /**
     * Gets the value of the aName property.
     *
     * @return possible object is {@link CharacterStringPropertyType }
     *
     */
    public CharacterStringPropertyType getAName() {
        return aName;
    }

    /**
     * Sets the value of the aName property.
     *
     * @param value allowed object is {@link CharacterStringPropertyType }
     *
     */
    public void setAName(CharacterStringPropertyType value) {
        this.aName = value;
    }

    public boolean isSetAName() {
        return (this.aName != null);
    }

    /**
     * Gets the value of the attributeType property.
     *
     * @return possible object is {@link TypeNamePropertyType }
     *
     */
    public TypeNamePropertyType getAttributeType() {
        return attributeType;
    }

    /**
     * Sets the value of the attributeType property.
     *
     * @param value allowed object is {@link TypeNamePropertyType }
     *
     */
    public void setAttributeType(TypeNamePropertyType value) {
        this.attributeType = value;
    }

    public boolean isSetAttributeType() {
        return (this.attributeType != null);
    }

}
