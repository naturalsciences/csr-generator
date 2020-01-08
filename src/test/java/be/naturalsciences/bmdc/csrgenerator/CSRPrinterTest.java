/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package be.naturalsciences.bmdc.csrgenerator;

import be.naturalsciences.bmdc.cruise.csr.CSRPrinter;
import be.naturalsciences.bmdc.cruise.csr.CSRBuilder;
import eu.eurofleets.ears.extendedclasses.Country;
import eu.eurofleets.ears.extendedclasses.Harbour;
import eu.eurofleets.ears.extendedclasses.Cruise;
import eu.eurofleets.ears.extendedclasses.License;
import eu.eurofleets.ears.extendedclasses.LinkedDataTerm;
import eu.eurofleets.ears.extendedclasses.Organisation;
import eu.eurofleets.ears.extendedclasses.Person;
import eu.eurofleets.ears.extendedclasses.Platform;
import eu.eurofleets.ears.extendedclasses.Program;
import eu.eurofleets.ears.extendedclasses.Project;
import eu.eurofleets.ears.extendedclasses.SeaArea;
import java.io.File;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.util.Arrays;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Ignore;

/**
 *
 * @author thomas
 */
public class CSRPrinterTest {

    public CSRPrinterTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    public Cruise generateANiceTestCruise() {
        Cruise c = new Cruise();
        Country belgium = new Country(new LinkedDataTerm("C32:BE", "Belgium"));
        Harbour h = new Harbour(new LinkedDataTerm("SDN:C38::BSH4510", "Zeebrugge"), belgium);

        c.setArrivalHarbour(h);
        c.setDepartureHarbour(h);
        c.setIdentifier("BE11/2007_18");
        c.setName("BE11/2007_18");
        c.setStartDate(OffsetDateTime.of(2017, 11, 8, 0, 0, 0, 0, ZoneOffset.UTC));
        c.setEndDate(OffsetDateTime.of(2017, 11, 15, 0, 0, 0, 0, ZoneOffset.UTC));
        c.setObjectives("The objectives of the cruise are to validate the modeling efforts of the last 2 years using the COHERENS model. Rubber ducks will be released.");

        List<SeaArea> seaAreas = Arrays.asList(new SeaArea[]{new SeaArea(new LinkedDataTerm("SDN:C19::1_2", "North Sea"))});

        List<Cruise> cruises = Arrays.asList(new Cruise[]{c});
        c.setSeaAreas(seaAreas);

        LinkedDataTerm odnaturet = new LinkedDataTerm("SDN:EDMO::3330", "Royal Belgian Institute of Natural Sciences, Operational Directorate Natural Environment");
        Organisation odnature = new Organisation(odnaturet, "02/555.555", "02/555.556", "info@odnature.be", "http://odnature.naturalsciences.be", "Vautierstraat 1", "Brussel", "1000", belgium);

        LinkedDataTerm sumot = new LinkedDataTerm("SDN:EDMO::3330", "Royal Belgian Institute of Natural Sciences, Operational Directorate Natural Environment, SUMO");
        Organisation sumo = new Organisation(sumot, "02/555.551", "02/555.552", "info@sumo.be", "http://odnature.naturalsciences.be", "Vautierstraat 1", "Brussel", "1000", belgium);

        List<Person> chiefScientists = Arrays.asList(new Person[]{new Person("Michael", "Fettweis", sumo, null, null, null)});
        c.setChiefScientists(chiefScientists);
        Platform p = new Platform(new LinkedDataTerm("SDN:C17::11BE", "Belgica"), new LinkedDataTerm("SDN:L06::31", "research vessel"), odnature);
        c.setPlatform(p);
        LinkedDataTerm bmdct = new LinkedDataTerm("SDN:EDMO::1778", "Belgian Marine Data Centre");
        Organisation bmdc = new Organisation(bmdct, "02/555666", "02/555662", "info@bmdc.be", "www.bmdc.be", "Vautierstraat 1", "Brussel", "1000", belgium);
        c.setCollateCentre(bmdc);

        Project prj = new Project(new LinkedDataTerm("SDN:EDMERP::11436", "An ecosystem approach in sustainable fisheries management through local ecological knowledge {acronym=&quot;LECOFISH&quot; organisation=&quot;Ghent University, Maritime Institute / Dpt. International Public Law&quot; country=&quot;Belgium&quot;}"));
        List<Project> projects = Arrays.asList(new Project[]{prj});
        Program pr = new Program("MOMO", cruises, chiefScientists, "The MOMO programme is active since 2012 and investigates...", projects);
        List<Program> programmes = Arrays.asList(new Program[]{pr});
        c.setPrograms(programmes);
        return c;
    }

    /**
     * Test of createFile method, of class CSRPrinter.
     */
    @Test
    @Ignore
    public void testCreateFile() throws Exception {
        System.out.println("createFile");
        File file = null;
        boolean overwrite = false;
        CSRPrinter instance = null;
        instance.createFile(file, overwrite);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getResult method, of class CSRPrinter.
     */
    @Test
    public void testGetResult() throws Exception {
        System.out.println("getResult");
        Cruise cruise = generateANiceTestCruise();
        License l = new License(new LinkedDataTerm("http://www.seadatanet.org/urnurl/SDN:L08::LS", "SeaDataNet licence"));
        CSRPrinter instance = new CSRPrinter(new CSRBuilder(cruise, l));

        String result = instance.getResult();
        System.out.println(result);

        assertTrue(result.contains("<gmd:LanguageCode codeList=\"http://vocab.nerc.ac.uk/isoCodelists/sdnCodelists/gmxCodeLists.xml#LanguageCode\" codeListValue=\"eng\" codeSpace=\"SeaDataNet\">English</gmd:LanguageCode>"));
        assertTrue(result.contains("<gmd:MD_CharacterSetCode codeList=\"http://vocab.nerc.ac.uk/isoCodelists/sdnCodelists/gmxCodeLists.xml#MD_CharacterSetCode\" codeListValue=\"utf8\" codeSpace=\"ISOTC211/19115\">utf8</gmd:MD_CharacterSetCode>"));
        assertFalse(result.contains("sdn:descriptiveKeywords"));
        assertFalse(result.contains("sdn:thesaurusName"));

        assertTrue(result.contains("<sdn:SDN_PlatformCode codeList=\"http://vocab.nerc.ac.uk/isoCodelists/sdnCodelists/cdicsrCodeList.xml#SDN_PlatformCode\" codeListValue=\"11BE\" codeSpace=\"SeaDataNet\">Belgica</sdn:SDN_PlatformCode>"));
        assertTrue(result.contains("<sdn:SDN_CountryCode codeList=\"http://vocab.nerc.ac.uk/isoCodelists/sdnCodelists/cdicsrCodeList.xml#SDN_CountryCode\" codeListValue=\"Belgium\" codeSpace=\"SeaDataNet\">BE</sdn:SDN_CountryCode>"));
        assertTrue(result.contains("<sdn:SDN_EDMOCode codeList=\"http://seadatanet.maris2.nl/isocodelists/sdncodelists/edmo-edmerp-Codelists.xml#SDN_EDMOCode\" codeListValue=\"1778\" codeSpace=\"SeaDataNet\">Belgian Marine Data Centre</sdn:SDN_EDMOCode>"));
        assertTrue(result.contains("<gmd:MD_KeywordTypeCode codeList=\"http://vocab.nerc.ac.uk/isoCodelists/sdnCodelists/gmxCodeLists.xml#MD_KeywordTypeCode\" codeListValue=\"departure_place\" codeSpace=\"SeaDataNet\">departure_place</gmd:MD_KeywordTypeCode>"));
        assertTrue(result.contains("<gco:CharacterString>Oceanographic geographical features</gco:CharacterString>"));
        assertTrue(result.contains("MD_KeywordTypeCode codeList=\"http://vocab.nerc.ac.uk/isoCodelists/sdnCodelists/gmxCodeLists.xml#MD_KeywordTypeCode\" codeListValue=\"theme\" codeSpace=\"SeaDataNet\""));
        assertTrue(result.contains("departure_place"));
        assertTrue(result.contains("arrival_place"));
        assertTrue(result.contains("departure_country"));
        assertTrue(result.contains("arrival_country"));

        assertTrue(result.contains("<sdn:SDN_EDMERPCode codeList=\"http://seadatanet.maris2.nl/isocodelists/sdncodelists/edmo-edmerp-Codelists.xml#SDN_EDMERPCode\" codeListValue=\"11436\" codeSpace=\"SeaDataNet\">An ecosystem approach in sustainable fisheries management through local ecological knowledge {acronym=&amp;quot;LECOFISH&amp;quot; organisation=&amp;quot;Ghent University, Maritime Institute / Dpt. International Public Law&amp;quot; country=&amp;quot;Belgium&amp;quot;}</sdn:SDN_EDMERPCode>"));

        assertTrue(result.contains("<gco:CharacterString>Not applicable</gco:CharacterString>"));

        assertTrue(result.contains("<gmd:MD_TopicCategoryCode>oceans</gmd:MD_TopicCategoryCode>"));
    }

}
