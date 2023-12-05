/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package be.naturalsciences.bmdc.cruise.csr;

import eu.eurofleets.ears.extendedclasses.Cruise;
import eu.eurofleets.ears.extendedclasses.License;
import eu.eurofleets.ears.extendedclasses.LinkedDataTerm;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author thomas
 */
public class CSRBuilderTest {

    public CSRBuilderTest() {
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

    private void testIdentifier(String idWithBadChar, String expectedId, Cruise c, License l) throws IllegalCSRArgumentException {
        c.setIdentifier(idWithBadChar);
        CSRBuilder b = new CSRBuilder(c, l, false);
        assertEquals("urn:SDN:CSR:LOCAL:" + expectedId, b.getCSRIdentifier());
    }

    /**
     * Test of getIdentifier method, of class CSRBuilder.
     */
    @Test
    public void testGetIdentifier() throws IllegalCSRArgumentException {
        License l = new License(new LinkedDataTerm("http://www.seadatanet.org/urnurl/SDN:L08::LS", "SeaDataNet licence", "SDN:L08::LS"));
        Cruise c = CSRPrinterTest.generateANiceTestCruise();
        testIdentifier("BE11 2018_01", "BE11_2018_01", c, l);
        testIdentifier("BE11!2018_01", "BE11_2018_01", c, l);
        testIdentifier("BE112018_01", "BE112018_01", c, l);
        testIdentifier("BE11$2018_01", "BE11_2018_01", c, l);
        testIdentifier("BE11/2018_01", "BE11_2018_01", c, l);
        testIdentifier("BE11\\2018_01", "BE11_2018_01", c, l);

        testIdentifier("BE11$2018/01", "BE11_2018_01", c, l);
        // !\"§$%&\\/\\\\()=?]
    }

}
