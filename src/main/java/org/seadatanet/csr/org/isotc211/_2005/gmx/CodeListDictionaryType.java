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
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import org.seadatanet.csr.net.opengis.gml.DictionaryType;


/**
 * Constraints: - 1) metadataProperty.card = 0 - 2) dictionaryEntry.card = 0
 * 
 * <p>Java class for CodeListDictionary_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected         content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CodeListDictionary_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.opengis.net/gml}DictionaryType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="codeEntry" type="{http://www.isotc211.org/2005/gmx}CodeDefinition_PropertyType" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CodeListDictionary_Type", propOrder = {
    "codeEntry"
})
@XmlSeeAlso({
    MLCodeListDictionaryType.class
})
public class CodeListDictionaryType
    extends DictionaryType
    implements Serializable
{

    @XmlElement(required = true)
    protected List<CodeDefinitionPropertyType> codeEntry;

    /**
     * Gets the value of the codeEntry property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the codeEntry property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCodeEntry().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CodeDefinitionPropertyType }
     * 
     * 
     */
    public List<CodeDefinitionPropertyType> getCodeEntry() {
        if (codeEntry == null) {
            codeEntry = new ArrayList<CodeDefinitionPropertyType>();
        }
        return this.codeEntry;
    }

    public boolean isSetCodeEntry() {
        return ((this.codeEntry!= null)&&(!this.codeEntry.isEmpty()));
    }

    public void unsetCodeEntry() {
        this.codeEntry = null;
    }

}