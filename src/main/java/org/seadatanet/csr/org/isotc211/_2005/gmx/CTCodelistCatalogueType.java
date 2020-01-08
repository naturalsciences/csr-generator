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


/**
 * <p>Java class for CT_CodelistCatalogue_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected         content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CT_CodelistCatalogue_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.isotc211.org/2005/gmx}AbstractCT_Catalogue_Type"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="codelistItem" type="{http://www.isotc211.org/2005/gmx}CT_Codelist_PropertyType" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CT_CodelistCatalogue_Type", propOrder = {
    "codelistItem"
})
public class CTCodelistCatalogueType
    extends AbstractCTCatalogueType
    implements Serializable
{

    @XmlElement(required = true)
    protected List<CTCodelistPropertyType> codelistItem;

    /**
     * Gets the value of the codelistItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the codelistItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCodelistItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CTCodelistPropertyType }
     * 
     * 
     */
    public List<CTCodelistPropertyType> getCodelistItem() {
        if (codelistItem == null) {
            codelistItem = new ArrayList<CTCodelistPropertyType>();
        }
        return this.codelistItem;
    }

    public boolean isSetCodelistItem() {
        return ((this.codelistItem!= null)&&(!this.codelistItem.isEmpty()));
    }

    public void unsetCodelistItem() {
        this.codelistItem = null;
    }

}
