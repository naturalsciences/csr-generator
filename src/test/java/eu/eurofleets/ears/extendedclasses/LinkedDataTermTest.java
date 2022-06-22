package eu.eurofleets.ears.extendedclasses;

import be.naturalsciences.bmdc.cruise.model.ILinkedDataTerm;
import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.assertTrue;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author thomas
 */
public class LinkedDataTermTest {

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

    @Test
    public void testgetUrnFromEARSUrl() {
        String url = "http://ontologies.ef-ears.eu/ears2/1#act_21";
        String urnFromEARSUrl = ILinkedDataTerm.getUrnFromUrl(url);
        assertTrue(urnFromEARSUrl.equals("ears:act::21"));
    }

    @Test
    public void testGetInnerMostIdentifier() throws Exception {
        System.out.println("getInnerMostIdentifier");
        LinkedDataTerm t1 = new LinkedDataTerm("http://vocab.nerc.ac.uk/collection/C17/11BE", "Belgica", "SDN:C17::11BE");
        assertTrue(ILinkedDataTerm.getIdentifierFromNERCorSDNUrlOrUrn(t1.getIdentifier()).equals("11BE"));

        LinkedDataTerm t2 = new LinkedDataTerm("http://vocab.nerc.ac.uk/collection/P01/current/SPWGXX01/", "Specimen weight of biological entity specified elsewhere", "P01/current/SPWGXX01");
        assertTrue(ILinkedDataTerm.getIdentifierFromNERCorSDNUrlOrUrn(t2.getIdentifier()).equals("SPWGXX01"));

        LinkedDataTerm t3 = new LinkedDataTerm("http://vocab.nerc.ac.uk/collection/P01/current/SPWGXX01", "Specimen weight of biological entity specified elsewhere", "P01/current/SPWGXX01");
        assertTrue(ILinkedDataTerm.getIdentifierFromNERCorSDNUrlOrUrn(t3.getIdentifier()).equals("SPWGXX01"));

        LinkedDataTerm t4 = new LinkedDataTerm("https://vocab.nerc.ac.uk/collection/P01/current/SPWGXX01", "Specimen weight of biological entity specified elsewhere", "P01/current/SPWGXX01");
        assertTrue(ILinkedDataTerm.getIdentifierFromNERCorSDNUrlOrUrn(t4.getIdentifier()).equals("SPWGXX01"));

        LinkedDataTerm t5 = new LinkedDataTerm("https://vocab.nerc.ac.uk/collection/P01/current/SPWGXX01", "Specimen weight of biological entity specified elsewhere", "SPWGXX01");
        assertTrue(ILinkedDataTerm.getIdentifierFromNERCorSDNUrlOrUrn(t5.getIdentifier()).equals("SPWGXX01"));

     /*   LinkedDataTerm t6 = new LinkedDataTerm("SPWGDFXX:654", "Hullaballoo","SPWGDFXX:654");
        assertTrue(ILinkedDataTerm.getIdentifierFromNERCorSDNUrlOrUrn(t6.getIdentifier()).equals("SPWGDFXX/654"));

        LinkedDataTerm t7 = new LinkedDataTerm("SPWGDFXX:654", "Hullaballoo","SPWGDFXX:654");
        assertFalse(ILinkedDataTerm.getIdentifierFromNERCorSDNUrlOrUrn(t7.getIdentifier()).equals("SPWGXX01:654"));*/
    }

}
