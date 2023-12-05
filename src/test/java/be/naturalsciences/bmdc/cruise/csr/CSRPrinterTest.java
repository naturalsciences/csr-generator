/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package be.naturalsciences.bmdc.cruise.csr;

import be.naturalsciences.bmdc.cruise.comparator.CoordinateComparator;
import be.naturalsciences.bmdc.cruise.model.ICoordinate;
import be.naturalsciences.bmdc.cruise.model.IEvent;
import be.naturalsciences.bmdc.cruise.model.ITool;
import eu.eurofleets.ears.extendedclasses.Coordinate;
import eu.eurofleets.ears.extendedclasses.Country;
import eu.eurofleets.ears.extendedclasses.Cruise;
import eu.eurofleets.ears.extendedclasses.Deployment;
import eu.eurofleets.ears.extendedclasses.Event;
import eu.eurofleets.ears.extendedclasses.Harbour;
import eu.eurofleets.ears.extendedclasses.License;
import eu.eurofleets.ears.extendedclasses.LinkedDataTerm;
import eu.eurofleets.ears.extendedclasses.Organisation;
import eu.eurofleets.ears.extendedclasses.Person;
import eu.eurofleets.ears.extendedclasses.Platform;
import eu.eurofleets.ears.extendedclasses.Program;
import eu.eurofleets.ears.extendedclasses.Project;
import eu.eurofleets.ears.extendedclasses.Property;
import eu.eurofleets.ears.extendedclasses.SeaArea;
import eu.eurofleets.ears.extendedclasses.Tool;
import java.io.File;
import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

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

    public static Event getTestDeployment(String date, ITool tool) {
        Person joan = new Person("Joan", "Backers", null, null, null, "joan.backers@naturalsciences.be");
        Deployment event = new Deployment();
        event.setIdentifier(null); //this is a purely new event.
        Country belgium = new Country(
                new LinkedDataTerm("http://vocab.nerc.ac.uk/collection/C32/current/BE", "Belgium", "C32:BE"));
        LinkedDataTerm odnaturet = new LinkedDataTerm("https://edmo.seadatanet.org/report/3330",
                "Royal Belgian Institute of Natural Sciences, Operational Directorate Natural Environment",
                "SDN:EDMO::3330");
        Organisation odnature = new Organisation(odnaturet, "02/555.555", "02/555.556", "info@odnature.be",
                "http://odnature.naturalsciences.be", "Vautierstraat 1", "Brussel", "1000", belgium);

        Platform p = new Platform(
                new LinkedDataTerm("http://vocab.nerc.ac.uk/collection/C17/current/11BE", "Belgica", "SDN:C17::11BE"),
                new LinkedDataTerm("http://vocab.nerc.ac.uk/collection/L06/current/31", "research vessel",
                        "SDN:L06::31"),
                odnature);
        event.setPlatform(p);
        event.setEventDefinitionId("e3c8df0d-02e9-446d-a59b-224a14b89f9a");
        event.setTimeStamp(OffsetDateTime.parse(date));
        event.setToolCategory(
                new LinkedDataTerm("http://vocab.nerc.ac.uk/collection/L05/current/50/", "sediment grabs", null));
        event.setTool(tool);
        event.setProcess(new LinkedDataTerm("http://ontologies.ef-ears.eu/ears2/1#pro_22", "Deployment", null));
        event.setAction(new LinkedDataTerm("http://ontologies.ef-ears.eu/ears2/1#act_2", "End", null));
        event.setSubject(new LinkedDataTerm("http://vocab.nerc.ac.uk/collection/C77/current/G71/",
                "In-situ seafloor measurement/sampling", null));
        event.setActor(joan);
        //    event.setPlatform(new Platform("SDN:C17::11BE"));
        List<Property> properties = new ArrayList<>();
        properties.add(new Property(new LinkedDataTerm("http://ontologies.orr.org/fish_count", "fish_count", null),
                "89", null));
        properties.add(new Property(new LinkedDataTerm("http://ontologies.ef-ears.eu/ears2/1#pry_21", "depth_m", null),
                "3", "m"));
        properties.add(new Property(new LinkedDataTerm("http://ontologies.ef-ears.eu/ears2/1#pry_4", "label", null),
                "W04", null));
        properties.add(new Property(new LinkedDataTerm("http://ontologies.ef-ears.eu/ears2/1#pry_16", "sampleId", null),
                "20190506_12", null));
        event.setProperties(properties);
        return event;
    }

    public static Cruise generateANiceTestCruise() {
        Cruise c = new Cruise();
        c.setFinalReportUrl("https://csr.seadatanet.org/html/20193166/20193166_report.pdf");
        Country belgium = new Country(
                new LinkedDataTerm("http://vocab.nerc.ac.uk/collection/C32/current/BE", "Belgium", "C32:BE"));
        Harbour h = new Harbour(new LinkedDataTerm("http://vocab.nerc.ac.uk/collection/C38/current/BSH4510",
                "Zeebrugge", "SDN:C38::BSH4510"), belgium);
        List<Coordinate> coords = new ArrayList<>();
        Coordinate c1 = new Coordinate(2.5, 51.0);
        Coordinate c2 = new Coordinate(2.6, 51.1);
        Coordinate c3 = new Coordinate(2.6, 51.1);
        Coordinate c4 = new Coordinate(2.7, 51.2);
        Coordinate c5 = new Coordinate(2.7, 51.1);
        coords.add(c1);
        coords.add(c2);
        coords.add(c3);
        coords.add(c4);
        coords.add(c5);
        Collection<IEvent> events = new ArrayList<>();

        events.add(getTestDeployment("2019-04-25T11:08:00Z", new Tool(
                new LinkedDataTerm("http://vocab.nerc.ac.uk/collection/L22/current/TOOL0653/", "Van Veen grab", null),
                null))); //same day
        events.add(getTestDeployment("2019-04-25T12:08:00Z", new Tool(
                new LinkedDataTerm("http://vocab.nerc.ac.uk/collection/L22/current/TOOL0653/", "Van Veen grab", null),
                null)));
        events.add(getTestDeployment("2019-04-25T13:08:00Z", new Tool(
                new LinkedDataTerm("http://vocab.nerc.ac.uk/collection/L22/current/TOOL0653/", "Van Veen grab", null),
                null)));
        events.add(getTestDeployment("2019-04-25T14:08:00Z", new Tool(
                new LinkedDataTerm("http://vocab.nerc.ac.uk/collection/L22/current/TOOL0653/", "Van Veen grab", null),
                null)));
        //same tool, other day
        events.add(getTestDeployment("2019-04-26T16:25:00Z", new Tool(
                new LinkedDataTerm("http://vocab.nerc.ac.uk/collection/L22/current/TOOL0653/", "Van Veen grab", null),
                null))); //other day
        events.add(getTestDeployment("2019-04-26T17:25:00Z", new Tool(
                new LinkedDataTerm("http://vocab.nerc.ac.uk/collection/L22/current/TOOL0653/", "Van Veen grab", null),
                null)));
        //other tool, other day
        events.add(getTestDeployment("2019-05-01T16:25:00Z", new Tool(
                new LinkedDataTerm("http://vocab.nerc.ac.uk/collection/L22/current/TOOL0658/", "Supergrabber", null),
                null))); //other day
        events.add(getTestDeployment("2019-05-01T17:25:00Z", new Tool(
                new LinkedDataTerm("http://vocab.nerc.ac.uk/collection/L22/current/TOOL0658/", "Supergrabber", null),
                null)));
        events.add(getTestDeployment("2019-05-01T16:25:00Z", new Tool(
                new LinkedDataTerm("http://vocab.nerc.ac.uk/collection/L22/current/TOOL0658/", "Supergrabber", null),
                null))); //other day

        c.setEvents(events);
        if (coords.size() > 0) {
            c.setTrack(coords);
            ICoordinate max = Collections.max(c.getTrack(), new CoordinateComparator());
            ICoordinate min = Collections.min(c.getTrack(), new CoordinateComparator());

            c.setSouthBoundLatitude(min.getY());
            c.setNorthBoundLatitude(max.getY());
            c.setWestBoundLongitude(min.getX());
            c.setEastBoundLongitude(max.getX());
        }
        c.setTrackGmlUrl(
                "https://ears.bmdc.be/geoserver/ows?version=2.0.0&SERVICE=WFS&REQUEST=getfeature&typename=odas:odas_ship_track&SRSNAME=EPSG:4326&viewparams=campaign:2017/37a&outputformat=json");
        c.setArrivalHarbour(h);
        c.setDepartureHarbour(h);
        c.setIdentifier("BE11/2007_18");
        c.setName("BE11/2007_18");
        ZoneId systemDefault = ZoneId.systemDefault();
        OffsetDateTime start = OffsetDateTime.of(2017, 11, 8, 7, 0, 0, 0, ZoneOffset.UTC);
        OffsetDateTime end = OffsetDateTime.of(2017, 11, 15, 18, 0, 0, 0, ZoneOffset.UTC);
        ZoneOffset offset = systemDefault.getRules().getOffset(start.toInstant());
        start = start.withOffsetSameLocal(offset);
        end = end.withOffsetSameLocal(offset);
        c.setStartDate(start);
        c.setEndDate(end);
        // c.setObjectives("The objectives of the cruise are to validate the modeling efforts of the last 2 years using the COHERENS model. Rubber ducks will be released.");

        List<SeaArea> seaAreas = Arrays.asList(
                new SeaArea[] { new SeaArea(new LinkedDataTerm("http://vocab.nerc.ac.uk/collection/C19/current/1_2",
                        "North Sea", "SDN:C19::1_2")) });

        List<Cruise> cruises = Arrays.asList(new Cruise[] { c });
        c.setSeaAreas(seaAreas);

        LinkedDataTerm odnaturet = new LinkedDataTerm("https://edmo.seadatanet.org/report/3330",
                "Royal Belgian Institute of Natural Sciences, Operational Directorate Natural Environment",
                "SDN:EDMO::3330");
        Organisation odnature = new Organisation(odnaturet, "02/555.555", "02/555.556", "info@odnature.be",
                "http://odnature.naturalsciences.be", "Vautierstraat 1", "Brussel", "1000", belgium);

        LinkedDataTerm sumot = new LinkedDataTerm("https://edmo.seadatanet.org/report/3330",
                "Royal Belgian Institute of Natural Sciences, Operational Directorate Natural Environment, SUMO",
                "SDN:EDMO::3330");
        Organisation sumo = new Organisation(sumot, "02/555.551", "02/555.552", "info@sumo.be",
                "http://odnature.naturalsciences.be", "Vautierstraat 1", "Brussel", "1000", belgium);

        List<Person> chiefScientists = Arrays
                .asList(new Person[] { new Person("Michael", "Fettweis", sumo, null, null, null) });
        c.setChiefScientists(chiefScientists);
        Platform p = new Platform(
                new LinkedDataTerm("http://vocab.nerc.ac.uk/collection/C17/current/11BE", "Belgica", "SDN:C17::11BE"),
                new LinkedDataTerm("http://vocab.nerc.ac.uk/collection/L06/current/31", "research vessel",
                        "SDN:L06::31"),
                odnature);
        c.setPlatform(p);
        LinkedDataTerm bmdct = new LinkedDataTerm("https://edmo.seadatanet.org/report/1778",
                "Belgian Marine Data Centre", "SDN:EDMO::1778");
        Organisation bmdc = new Organisation(bmdct, "02/555666", "02/555662", "info@bmdc.be", "www.bmdc.be",
                "Vautierstraat 1", "Brussel", "1000", belgium);
        c.setCollateCentre(bmdc);

        Project prj = new Project(new LinkedDataTerm("https://edmerp.seadatanet.org/report/11436",
                "An ecosystem approach in sustainable fisheries management through local ecological knowledge {acronym=&quot;LECOFISH&quot; organisation=&quot;Ghent University, Maritime Institute / Dpt. International Public Law&quot; country=&quot;Belgium&quot;}",
                "SDN:EDMERP::11436"));
        List<Project> projects = Arrays.asList(new Project[] { prj });
        Program pr = new Program("MOMO", cruises, chiefScientists,
                "The MOMO programme is active since 2012 and investigates...", projects);
        List<Program> programmes = Arrays.asList(new Program[] { pr });
        c.setPrograms(programmes);

        for (IEvent event : c.getEvents()) {
            event.setProgram(pr); //MOMO
        }
        return c;
    }

    @Test
    public void testGetResult2() throws Exception {
        Cruise cruise = generateANiceTestCruise();
        cruise.setObjectives(null);
        License l = new License(new LinkedDataTerm("http://www.seadatanet.org/urnurl/SDN:L08::LS", "SeaDataNet licence",
                "SDN:L08::LS"));
        CSRPrinter instance = new CSRPrinter(new CSRBuilder(cruise, l, false));

        String result = instance.getResult();
        System.out.println(result);
        testResult(result);
    }

    private void testResult(String result) {
        assertTrue(result.contains(
                "<gmd:LanguageCode codeList=\"http://vocab.nerc.ac.uk/isoCodelists/sdnCodelists/gmxCodeLists.xml#LanguageCode\" codeListValue=\"eng\" codeSpace=\"SeaDataNet\">English</gmd:LanguageCode>"));
        assertTrue(result.contains(
                "<gmd:MD_CharacterSetCode codeList=\"http://vocab.nerc.ac.uk/isoCodelists/sdnCodelists/gmxCodeLists.xml#MD_CharacterSetCode\" codeListValue=\"utf8\" codeSpace=\"ISOTC211/19115\">utf8</gmd:MD_CharacterSetCode>"));
        assertFalse(result.contains("sdn:descriptiveKeywords"));
        assertFalse(result.contains("sdn:thesaurusName"));
        assertTrue(result.contains(
                "<sdn:additionalDocumentation xlink:href=\"https://csr.seadatanet.org/html/20193166/20193166_report.pdf\"/>"));
        //assertTrue(result.contains("xlink:type=\"simple\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\""));
        assertTrue(result.contains(
                "<sdn:SDN_PlatformCode codeList=\"http://vocab.nerc.ac.uk/isoCodelists/sdnCodelists/cdicsrCodeList.xml#SDN_PlatformCode\" codeListValue=\"11BE\" codeSpace=\"SeaDataNet\">Belgica</sdn:SDN_PlatformCode>"));
        assertTrue(result.contains(
                "<sdn:SDN_CountryCode codeList=\"http://vocab.nerc.ac.uk/isoCodelists/sdnCodelists/cdicsrCodeList.xml#SDN_CountryCode\" codeListValue=\"Belgium\" codeSpace=\"SeaDataNet\">BE</sdn:SDN_CountryCode>"));
        assertTrue(result.contains(
                "<sdn:SDN_EDMOCode codeList=\"https://edmo.seadatanet.org/isocodelists/edmo-edmerp-codelists.xml#SDN_EDMOCode\" codeListValue=\"1778\" codeSpace=\"SeaDataNet\">Belgian Marine Data Centre</sdn:SDN_EDMOCode>"));
        assertTrue(result.contains(
                "<gmd:MD_KeywordTypeCode codeList=\"http://vocab.nerc.ac.uk/isoCodelists/sdnCodelists/gmxCodeLists.xml#MD_KeywordTypeCode\" codeListValue=\"departure_place\" codeSpace=\"SeaDataNet\">departure_place</gmd:MD_KeywordTypeCode>"));
        assertTrue(result.contains("<gco:CharacterString>Oceanographic geographical features</gco:CharacterString>"));
        assertTrue(result.contains(
                "MD_KeywordTypeCode codeList=\"http://vocab.nerc.ac.uk/isoCodelists/sdnCodelists/gmxCodeLists.xml#MD_KeywordTypeCode\" codeListValue=\"theme\" codeSpace=\"SeaDataNet\""));
        assertTrue(result.contains("departure_place"));
        assertTrue(result.contains("arrival_place"));
        assertTrue(result.contains("departure_country"));
        assertTrue(result.contains("arrival_country"));
        assertTrue(result.contains("<gco:Decimal>2.5</gco:Decimal>"));
        assertTrue(result.contains("<gco:Decimal>51.2</gco:Decimal>"));

        //TODO: READD. assertTrue(result.contains("<sdn:SDN_EDMERPCode codeList=\"http://seadatanet.maris2.nl/isocodelists/sdncodelists/edmo-edmerp-Codelists.xml#SDN_EDMERPCode\" codeListValue=\"11436\" codeSpace=\"SeaDataNet\">An ecosystem approach in sustainable fisheries management through local ecological knowledge {acronym=&amp;quot;LECOFISH&amp;quot; organisation=&amp;quot;Ghent University, Maritime Institute / Dpt. International Public Law&amp;quot; country=&amp;quot;Belgium&amp;quot;}</sdn:SDN_EDMERPCode>"));

        assertTrue(result.contains("<gco:CharacterString>Not applicable</gco:CharacterString>"));

        assertTrue(result.contains("<gmd:MD_TopicCategoryCode>oceans</gmd:MD_TopicCategoryCode>"));

        assertTrue(result.contains("<gml:beginPosition>2017-11-08T07:00:00+01:00</gml:beginPosition>")); //start date in the temporalextent
        assertTrue(result.contains("<gco:DateTime>2017-11-08T07:00:00.000+01:00</gco:DateTime>")); //start date in the significantEvents list
        //TODO: READD. assertTrue(result.contains("sdn:SDN_Objective gco:isoType=\"MI_Objective_Type\" id=")); //objective

        //TODO: READD. assertTrue(result.contains("<sdn:quantity>2</sdn:quantity>"));
        //TODO: READD. assertTrue(result.contains("<sdn:quantity>4</sdn:quantity>"));
        //TODO: READD. assertTrue(result.contains("<sdn:quantity>3</sdn:quantity>"));
        //TODO: READD. assertTrue(result.contains("<gco:CharacterString>urn:SDN:CSR:LOCAL:BE11_2007_18.objective.G71</gco:CharacterString>"));
        //TODO: READD. assertTrue(result.contains("<sdn:SDN_DataCategoryCode codeList=\"http://vocab.nerc.ac.uk/isoCodelists/sdnCodelists/cdicsrCodeList.xml#SDN_DataCategoryCode\" codeListValue=\"G71\" codeSpace=\"SeaDataNet\">In-situ seafloor measurement/sampling</sdn:SDN_DataCategoryCode>"));
        assertFalse(result.contains("<gmd:geographicElement xsi:nil=\"true\"/>"));
        assertTrue(result.contains("COMMISSION REGULATION (EU) No 1089/2010"));
    }
}
