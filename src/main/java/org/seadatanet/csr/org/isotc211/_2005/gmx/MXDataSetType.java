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
import org.seadatanet.csr.org.isotc211._2005.gmd.DSDataSetType;


/**
 * <p>Java class for MX_DataSet_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected         content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MX_DataSet_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.isotc211.org/2005/gmd}DS_DataSet_Type"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="dataFile" type="{http://www.isotc211.org/2005/gmx}MX_DataFile_PropertyType" maxOccurs="unbounded"/&gt;
 *         &lt;element name="datasetCatalogue" type="{http://www.isotc211.org/2005/gmx}CT_Catalogue_PropertyType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="supportFile" type="{http://www.isotc211.org/2005/gmx}MX_SupportFile_PropertyType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MX_DataSet_Type", propOrder = {
    "dataFile",
    "datasetCatalogue",
    "supportFile"
})
public class MXDataSetType
    extends DSDataSetType
    implements Serializable
{

    @XmlElement(required = true)
    protected List<MXDataFilePropertyType> dataFile;
    protected List<CTCataloguePropertyType> datasetCatalogue;
    protected List<MXSupportFilePropertyType> supportFile;

    /**
     * Gets the value of the dataFile property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dataFile property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDataFile().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MXDataFilePropertyType }
     * 
     * 
     */
    public List<MXDataFilePropertyType> getDataFile() {
        if (dataFile == null) {
            dataFile = new ArrayList<MXDataFilePropertyType>();
        }
        return this.dataFile;
    }

    public boolean isSetDataFile() {
        return ((this.dataFile!= null)&&(!this.dataFile.isEmpty()));
    }

    public void unsetDataFile() {
        this.dataFile = null;
    }

    /**
     * Gets the value of the datasetCatalogue property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the datasetCatalogue property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDatasetCatalogue().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CTCataloguePropertyType }
     * 
     * 
     */
    public List<CTCataloguePropertyType> getDatasetCatalogue() {
        if (datasetCatalogue == null) {
            datasetCatalogue = new ArrayList<CTCataloguePropertyType>();
        }
        return this.datasetCatalogue;
    }

    public boolean isSetDatasetCatalogue() {
        return ((this.datasetCatalogue!= null)&&(!this.datasetCatalogue.isEmpty()));
    }

    public void unsetDatasetCatalogue() {
        this.datasetCatalogue = null;
    }

    /**
     * Gets the value of the supportFile property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the supportFile property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSupportFile().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MXSupportFilePropertyType }
     * 
     * 
     */
    public List<MXSupportFilePropertyType> getSupportFile() {
        if (supportFile == null) {
            supportFile = new ArrayList<MXSupportFilePropertyType>();
        }
        return this.supportFile;
    }

    public boolean isSetSupportFile() {
        return ((this.supportFile!= null)&&(!this.supportFile.isEmpty()));
    }

    public void unsetSupportFile() {
        this.supportFile = null;
    }

}
