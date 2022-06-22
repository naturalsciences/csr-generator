/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package be.naturalsciences.bmdc.cruise.csr;

import java.io.File;
import java.io.StringWriter;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import org.seadatanet.csr.org.isotc211._2005.gmi.MIMetadataType;

/**
 *
 * @author thomas
 */
public class CSRPrinter {

    private CSRBuilder builder;
    private Marshaller marshaller;

    public CSRBuilder getBuilder() {
        return builder;
    }

    public CSRPrinter(CSRBuilder builder) throws JAXBException {
        this.builder = builder;
        JAXBContext jaxbContext = JAXBContext.newInstance(MIMetadataType.class);
        marshaller = jaxbContext.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_SCHEMA_LOCATION, "http://www.seadatanet.org http://schemas.seadatanet.org/Standards-Software/Metadata-formats/SDN2_CSR_ISO19139_3.0.0.xsd");

        process();
    }

    private void process() throws JAXBException {

        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

        //  marshaller.marshal(mdr, System.out);
    }

    public void createFile(File file, boolean overwrite) throws JAXBException {
        marshaller.marshal(builder.getMetadata(), file);
    }

    public String getResult() throws JAXBException {
        StringWriter writer = new StringWriter();
        marshaller.marshal(builder.getMetadata(), writer);
        String result = writer.toString();
        result = result.replace(" xlink:type=\"simple\"", "");
        result = result.replace("gmd:AbstractEX_GeographicExtent xsi:type=\"gmd:EX_BoundingPolygon_Type\"", "gmd:EX_BoundingPolygon");
        result = result.replace("gmd:AbstractEX_GeographicExtent", "gmd:EX_BoundingPolygon");
        result = result.replace("gmd:AbstractDQ_Element xsi:type=\"gmd:DQ_DomainConsistency_Type\"", "gmd:DQ_DomainConsistency");
        result = result.replace("gmd:AbstractDQ_Element", "gmd:DQ_DomainConsistency");

        result = result.replace("gml:AbstractGeometry xsi:type=\"gml:MultiCurveType\"", "gml:MultiCurve");
        result = result.replace("gmi:MI_Objective xsi:type=\"sdn:SDN_Objective_Type\"", "sdn:SDN_Objective");
        result = result.replace("gmi:MI_Objective", "sdn:SDN_Objective");

        result = result.replace("sdn:SDN_ObjectiveTypeCode", "gmi:MI_ObjectiveTypeCode");

        result = result.replace("gml:AbstractGeometry", "gml:MultiCurve");
        result = result.replace("gmd:additionalDocumentation xsi:nil=\"true\"", "sdn:additionalDocumentation xlink:href=\"" + builder.getCruise().getFinalReportUrl() + "\"");
        if (builder.getDefaultMessages() != null && !builder.getDefaultMessages().isEmpty()) {
            StringBuilder sb = new StringBuilder("<!--");
            for (String msg : builder.getDefaultMessages()) {
                sb.append(msg);
            }
            sb.append("-->");
            result = result.replace("<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?>", "<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?>" + sb.toString());
        }
        return result;
    }

    public void print() throws JAXBException {
        marshaller.marshal(builder.getMetadata(), System.out);
    }

}
