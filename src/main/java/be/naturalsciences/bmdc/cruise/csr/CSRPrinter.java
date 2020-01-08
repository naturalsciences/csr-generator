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
        return writer.toString();
    }

    public void print() throws JAXBException {
        marshaller.marshal(builder.getMetadata(), System.out);
    }

}
