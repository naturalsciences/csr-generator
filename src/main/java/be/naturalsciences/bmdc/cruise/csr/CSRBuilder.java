/*
 * To change this license header, choose ILicense Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package be.naturalsciences.bmdc.cruise.csr;

import be.naturalsciences.bmdc.cruise.model.ILicense;
import be.naturalsciences.bmdc.cruise.model.ICruise;
import be.naturalsciences.bmdc.cruise.model.ILinkedDataTerm;
import be.naturalsciences.bmdc.cruise.model.IOrganisation;
import be.naturalsciences.bmdc.cruise.model.IPerson;
import be.naturalsciences.bmdc.cruise.model.IProgram;
import static be.naturalsciences.bmdc.metadata.iso.ISO19115DatasetBuilder.GEMET_INSPIRE_THEMES_PUBLICATION_DATE;
import static be.naturalsciences.bmdc.metadata.iso.ISO19115DatasetBuilder.GEMET_INSPIRE_THEMES_THESAURUS_URL;
import be.naturalsciences.bmdc.metadata.model.IKeyword;
import be.naturalsciences.bmdc.metadata.model.Thesaurus;
import java.lang.reflect.Field;
import java.text.SimpleDateFormat;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collection;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.annotation.XmlElement;
import org.seadatanet.csr.org.isotc211._2005.gco.CharacterStringPropertyType;
import org.seadatanet.csr.org.isotc211._2005.gco.CodeListValueType;
import org.seadatanet.csr.org.isotc211._2005.gco.DatePropertyType;
import org.seadatanet.csr.org.isotc211._2005.gmd.CIAddressPropertyType;
import org.seadatanet.csr.org.isotc211._2005.gmd.CIAddressType;
import org.seadatanet.csr.org.isotc211._2005.gmd.CICitationPropertyType;
import org.seadatanet.csr.org.isotc211._2005.gmd.CICitationType;
import org.seadatanet.csr.org.isotc211._2005.gmd.CIContactPropertyType;
import org.seadatanet.csr.org.isotc211._2005.gmd.CIContactType;
import org.seadatanet.csr.org.isotc211._2005.gmd.CIDatePropertyType;
import org.seadatanet.csr.org.isotc211._2005.gmd.CIDateType;
import org.seadatanet.csr.org.isotc211._2005.gmd.CIDateTypeCodePropertyType;
import org.seadatanet.csr.org.isotc211._2005.gmd.CIOnlineResourcePropertyType;
import org.seadatanet.csr.org.isotc211._2005.gmd.CIOnlineResourceType;
import org.seadatanet.csr.org.isotc211._2005.gmd.CIResponsiblePartyPropertyType;
import org.seadatanet.csr.org.isotc211._2005.gmd.CIResponsiblePartyType;
import org.seadatanet.csr.org.isotc211._2005.gmd.CIRoleCodePropertyType;
import org.seadatanet.csr.org.isotc211._2005.gmd.CITelephonePropertyType;
import org.seadatanet.csr.org.isotc211._2005.gmd.CITelephoneType;
import org.seadatanet.csr.org.isotc211._2005.gmd.LanguageCodePropertyType;
import org.seadatanet.csr.org.isotc211._2005.gmd.MDCharacterSetCodePropertyType;
import org.seadatanet.csr.org.isotc211._2005.gmd.MDConstraintsPropertyType;
import org.seadatanet.csr.org.isotc211._2005.gmd.MDConstraintsType;
import org.seadatanet.csr.org.isotc211._2005.gmd.MDIdentificationPropertyType;
import org.seadatanet.csr.org.isotc211._2005.gmd.MDIdentifierPropertyType;
import org.seadatanet.csr.org.isotc211._2005.gmd.MDIdentifierType;
import org.seadatanet.csr.org.isotc211._2005.gmd.MDKeywordTypeCodePropertyType;
import org.seadatanet.csr.org.isotc211._2005.gmd.MDKeywordsPropertyType;
import org.seadatanet.csr.org.isotc211._2005.gmd.MDKeywordsType;
import org.seadatanet.csr.org.isotc211._2005.gmd.MDLegalConstraintsPropertyType;
import org.seadatanet.csr.org.isotc211._2005.gmd.MDLegalConstraintsType;
import org.seadatanet.csr.org.isotc211._2005.gmd.MDMetadataExtensionInformationPropertyType;
import org.seadatanet.csr.org.isotc211._2005.gmd.MDMetadataType;
import org.seadatanet.csr.org.isotc211._2005.gmd.MDRestrictionCodePropertyType;
import org.seadatanet.csr.org.isotc211._2005.gmd.MDScopeCodePropertyType;
import org.seadatanet.csr.org.isotc211._2005.gmd.MDTopicCategoryCodePropertyType;
import org.seadatanet.csr.org.isotc211._2005.gmd.MDTopicCategoryCodeType;
import org.seadatanet.csr.org.isotc211._2005.gmd.URLPropertyType;
import org.seadatanet.csr.org.isotc211._2005.gmi.MIMetadataType;
import org.seadatanet.csr.org.isotc211._2005.gmx.AnchorType;
import org.seadatanet.csr.org.isotc211._2005.gmx.ObjectFactory;
import org.seadatanet.csr.org.seadatanet.MDKeywordsPropertyTypeSDN;
import org.seadatanet.csr.org.seadatanet.MDKeywordsTypeSDN;
import org.seadatanet.csr.org.seadatanet.SDNCountryCodePropertyType;
import org.seadatanet.csr.org.seadatanet.SDNDataIdentificationType;
import org.seadatanet.csr.org.seadatanet.SDNDeviceCategoryCodePropertyType;
import org.seadatanet.csr.org.seadatanet.SDNEDMERPCodePropertyType;
import org.seadatanet.csr.org.seadatanet.SDNEDMOCodePropertyType;
import org.seadatanet.csr.org.seadatanet.SDNHierarchyLevelNameCodePropertyType;
import org.seadatanet.csr.org.seadatanet.SDNKeyword;
import org.seadatanet.csr.org.seadatanet.SDNParameterDiscoveryCodePropertyType;
import org.seadatanet.csr.org.seadatanet.SDNPlatformCategoryCodePropertyType;
import org.seadatanet.csr.org.seadatanet.SDNPlatformCodePropertyType;
import org.seadatanet.csr.org.seadatanet.SDNPortCodePropertyType;
import org.seadatanet.csr.org.seadatanet.SDNWaterBodyCodePropertyType;

/**
 *
 * @author thomas
 */
public class CSRBuilder {

    public enum Role {
        DISTRIBUTOR, RESOURCEPROVIDER, COAUTHOR, EDITOR, CONTRIBUTOR, OWNER, USER, STAKEHOLDER, RIGHTS_HOLDER, FUNDER, PUBLISHER, AUTHOR, POINT_OF_CONTACT, PRINCIPAL_INVESTIGATOR, MEDIATOR, PROCESSOR, ORIGINATOR, CUSTODIAN, COLLABORATOR, SPONSOR
    }

    public static org.seadatanet.csr.org.isotc211._2005.gmd.ObjectFactory gmd = new org.seadatanet.csr.org.isotc211._2005.gmd.ObjectFactory();
    public static org.seadatanet.csr.org.isotc211._2005.gmi.ObjectFactory gmi = new org.seadatanet.csr.org.isotc211._2005.gmi.ObjectFactory();
    public static org.seadatanet.csr.net.opengis.gml.ObjectFactory gml = new org.seadatanet.csr.net.opengis.gml.ObjectFactory();
    public static org.seadatanet.csr.org.isotc211._2005.gco.ObjectFactory gco = new org.seadatanet.csr.org.isotc211._2005.gco.ObjectFactory();
    public static org.seadatanet.csr.org.seadatanet.ObjectFactory sdn = new org.seadatanet.csr.org.seadatanet.ObjectFactory();
    public static org.seadatanet.csr.org.isotc211._2005.gmx.ObjectFactory gmx = new org.seadatanet.csr.org.isotc211._2005.gmx.ObjectFactory();

    public static String GMX_CODELISTS = "http://vocab.nerc.ac.uk/isoCodelists/sdnCodelists/gmxCodeLists.xml";
    public static String CDI_CSR_CODELISTS = "http://vocab.nerc.ac.uk/isoCodelists/sdnCodelists/cdicsrCodeList.xml";
    public static String EDMO_EDMERP_CODELISTS = "http://seadatanet.maris2.nl/isocodelists/sdncodelists/edmo-edmerp-Codelists.xml";

    public static CodeListRealm REALM_ISO = new CodeListRealm("ISOTC211/19115", GMX_CODELISTS);
    public static CodeListRealm REALM_SDN_EDMO_EDMERP = new CodeListRealm("SeaDataNet", EDMO_EDMERP_CODELISTS);
    public static CodeListRealm REALM_SDN_ISO = new CodeListRealm("SeaDataNet", GMX_CODELISTS);
    public static CodeListRealm REALM_SDN_CDI_CSR = new CodeListRealm("SeaDataNet", CDI_CSR_CODELISTS);

    public static Map<String, Class> KEYWORD_TYPES = new HashMap();

    public static String PUBLICATION = "publication";
    public static String REVISION = "revision";

    public static Map<String, String> CODE_SPACES_URLS = new HashMap<>();
    public static Map<Role, CIRoleCodePropertyType> ROLES = new HashMap<>();
    public static MDKeywordsPropertyType OCEANOGRAPHIC_GEOGRAPHIC_FEATURES;

    public static Thesaurus THESAURUS_GEMET = new Thesaurus("GEMET - INSPIRE themes, version 1.0", null, GEMET_INSPIRE_THEMES_THESAURUS_URL, GEMET_INSPIRE_THEMES_PUBLICATION_DATE, null, PUBLICATION);
    public static Thesaurus THESAURUS_C38 = new Thesaurus("SeaDataNet Ports Gazetteer", "C38", "", new GregorianCalendar(2017, Calendar.DECEMBER, 5).getTime(), "61", REVISION);
    public static Thesaurus THESAURUS_C17 = new Thesaurus("ICES Platform Codes", "C17", "", new GregorianCalendar(2018, Calendar.JUNE, 9).getTime(), "748", REVISION);
    public static Thesaurus THESAURUS_L06 = new Thesaurus("SeaVoX Platform Categories", "L06", "", new GregorianCalendar(2018, Calendar.MARCH, 14).getTime(), "14", REVISION);
    public static Thesaurus THESAURUS_EDMERP = new Thesaurus("European Directory of Marine Environmental Research Projects", "EDMERP", "", new GregorianCalendar(2013, Calendar.APRIL, 16).getTime(), null, REVISION);
    public static Thesaurus THESAURUS_C19 = new Thesaurus("SeaVoX salt and fresh water body gazetteer", "C19", "", new GregorianCalendar(2018, Calendar.FEBRUARY, 21).getTime(), "17", REVISION);
    public static Thesaurus THESAURUS_P02 = new Thesaurus("SeaDataNet Parameter Discovery Vocabulary", "P02", "", new GregorianCalendar(2018, Calendar.APRIL, 5).getTime(), "108", REVISION);
    public static Thesaurus THESAURUS_L05 = new Thesaurus("SeaDataNet device categories", "L05", "", new GregorianCalendar(2018, Calendar.APRIL, 7).getTime(), "64", REVISION);

    private ICruise cruise;

    private ILicense license;

    public ICruise getCruise() {
        return cruise;
    }

    public ILicense getLicense() {
        return license;
    }

    public CSRBuilder(ICruise cruise, ILicense license) {
        if (cruise.getIdentifier() == null) {
            throw new IllegalArgumentException("Cruise must have an identifier.");
        }
        if (cruise.getName() == null) {
            throw new IllegalArgumentException("Cruise must have a name.");
        }
        if (cruise.getStartDate() == null) {
            throw new IllegalArgumentException("Cruise must have a start date.");
        }
        if (cruise.getEndDate() == null) {
            throw new IllegalArgumentException("Cruise must have an end date.");
        }
        if (cruise.getObjectives() == null) {
            throw new IllegalArgumentException("Cruise must have an objective.");
        }
        if (cruise.getPlatform() == null) {
            throw new IllegalArgumentException("Cruise must have a platform.");
        }
        if (cruise.getPlatform() == null) {
            throw new IllegalArgumentException("Cruise must have a platform.");
        }
        if (cruise.getChiefScientists() == null || cruise.getChiefScientists().isEmpty()) {
            throw new IllegalArgumentException("Cruise must have at least one Chief Scientist.");
        }
        if (cruise.getPlatform().getVesselOperator() == null) {
            throw new IllegalArgumentException("Platform must have a vessel operator.");
        }
        if (cruise.getCollateCentre() == null) {
            throw new IllegalArgumentException("Platform must have a collate centre.");
        }
        if (cruise.getSeaAreas() == null || cruise.getSeaAreas().isEmpty()) {
            throw new IllegalArgumentException("Cruise must have one or more sea areas.");
        }
        //Bounding box is also mandatory
        if (license == null) {
            throw new IllegalArgumentException("Cruise Summary report must receive a list of licenses.");
        }
        this.cruise = cruise;
        this.license = license;
        CIRoleCodePropertyType resourceProvider = new CIRoleCodePropertyType();
        resourceProvider.setCIRoleCode(getCodeListValue(REALM_ISO, "CI_RoleCode", "resourceProvider", "resourceProvider"));

        CIRoleCodePropertyType publisher = new CIRoleCodePropertyType();
        publisher.setCIRoleCode(getCodeListValue(REALM_ISO, "CI_RoleCode", "publisher", "publisher"));

        CIRoleCodePropertyType author = new CIRoleCodePropertyType();
        author.setCIRoleCode(getCodeListValue(REALM_ISO, "CI_RoleCode", "author", "author"));

        CIRoleCodePropertyType custodian = new CIRoleCodePropertyType();
        custodian.setCIRoleCode(getCodeListValue(REALM_ISO, "CI_RoleCode", "custodian", "custodian"));

        CIRoleCodePropertyType owner = new CIRoleCodePropertyType();
        owner.setCIRoleCode(getCodeListValue(REALM_ISO, "CI_RoleCode", "owner", "owner"));

        CIRoleCodePropertyType user = new CIRoleCodePropertyType();
        user.setCIRoleCode(getCodeListValue(REALM_ISO, "CI_RoleCode", "user", "user"));

        CIRoleCodePropertyType distributor = new CIRoleCodePropertyType();
        distributor.setCIRoleCode(getCodeListValue(REALM_ISO, "CI_RoleCode", "distributor", "distributor"));

        CIRoleCodePropertyType originator = new CIRoleCodePropertyType();
        originator.setCIRoleCode(getCodeListValue(REALM_ISO, "CI_RoleCode", "originator", "originator"));

        CIRoleCodePropertyType pointOfContact = new CIRoleCodePropertyType();
        pointOfContact.setCIRoleCode(getCodeListValue(REALM_ISO, "CI_RoleCode", "pointOfContact", "pointOfContact"));

        CIRoleCodePropertyType principalInvestigator = new CIRoleCodePropertyType();
        principalInvestigator.setCIRoleCode(getCodeListValue(REALM_ISO, "CI_RoleCode", "principalInvestigator", "principalInvestigator"));

        CIRoleCodePropertyType processor = new CIRoleCodePropertyType();
        processor.setCIRoleCode(getCodeListValue(REALM_ISO, "CI_RoleCode", "processor", "processor"));

        ROLES.put(Role.RESOURCEPROVIDER, resourceProvider);
        ROLES.put(Role.PUBLISHER, publisher);
        ROLES.put(Role.AUTHOR, author);
        ROLES.put(Role.CUSTODIAN, custodian);
        ROLES.put(Role.OWNER, owner);
        ROLES.put(Role.USER, user);
        ROLES.put(Role.DISTRIBUTOR, distributor);
        ROLES.put(Role.ORIGINATOR, originator);
        ROLES.put(Role.POINT_OF_CONTACT, pointOfContact);
        ROLES.put(Role.PRINCIPAL_INVESTIGATOR, principalInvestigator);
        ROLES.put(Role.PROCESSOR, processor);

        OCEANOGRAPHIC_GEOGRAPHIC_FEATURES = getKeyword(Arrays.asList(new String[]{"Oceanographic geographical features"}), "theme", THESAURUS_GEMET);

        KEYWORD_TYPES.put("departure_place", SDNPortCodePropertyType.class);
        KEYWORD_TYPES.put("arrival_place", SDNPortCodePropertyType.class);
        KEYWORD_TYPES.put("departure_country", SDNCountryCodePropertyType.class);
        KEYWORD_TYPES.put("arrival_country", SDNCountryCodePropertyType.class);
        KEYWORD_TYPES.put("platform", SDNPlatformCodePropertyType.class);
        KEYWORD_TYPES.put("platform_class", SDNPlatformCategoryCodePropertyType.class);
        KEYWORD_TYPES.put("project", SDNEDMERPCodePropertyType.class);
        KEYWORD_TYPES.put("place", SDNWaterBodyCodePropertyType.class);
        KEYWORD_TYPES.put("parameter", SDNParameterDiscoveryCodePropertyType.class);
        KEYWORD_TYPES.put("instrument", SDNDeviceCategoryCodePropertyType.class);
    }

    public JAXBElement<String> getJaxbCS(String string) {
        CharacterStringPropertyType cs = new CharacterStringPropertyType();
        JAXBElement<String> jaxbElement = gco.createCharacterString(string);
        return jaxbElement;
    }

    public CharacterStringPropertyType getCS(String string) {
        CharacterStringPropertyType cs = new CharacterStringPropertyType();
        JAXBElement<String> jaxbElement = gco.createCharacterString(string);
        cs.setCharacterString(jaxbElement);
        return cs;
    }

    public List<CharacterStringPropertyType> getCS(Collection<String> strings) {
        List<CharacterStringPropertyType> r = new ArrayList();
        for (String string : strings) {
            CharacterStringPropertyType cs = new CharacterStringPropertyType();
            JAXBElement<String> jaxbElement = gco.createCharacterString(string);
            cs.setCharacterString(jaxbElement);
            r.add(cs);
        }
        return r;
    }

    public CodeListValueType getCodeListValue(String codeSpace, String codeList, String codeListValue, String value) {
        CodeListValueType r = new CodeListValueType();
        r.setCodeSpace(codeSpace);
        r.setCodeList(codeList);
        r.setCodeListValue(codeListValue);

        r.setValue(value);
        return r;
    }

    public CodeListValueType getCodeListValue(CodeListRealm codeListRealm, String codeListHashtag, String codeListValue, String value) {
        String codespaceUrl = codeListRealm.codeList;
        return getCodeListValue(codeListRealm.codeSpace, codespaceUrl + "#" + codeListHashtag, codeListValue, value);
    }

    public CIResponsiblePartyPropertyType getResponsibleParty(IOrganisation organisation, Role roleCode) {
        if (organisation == null) {
            throw new IllegalArgumentException("Organisation must not be null.");
        }
        String phone = organisation._getPhoneNumber();
        String fax = organisation._getFaxNumber();
        String email = organisation._getEmailAddress();

        IPerson person = new IPerson() {
            @Override
            public String getFirstName() {
                return null;
            }

            @Override
            public String getLastName() {
                return null;
            }

            @Override
            public IOrganisation getOrganisation() {
                return organisation;
            }

            @Override
            public void setFirstName(String firstName) {

            }

            @Override
            public void setLastName(String lastName) {

            }

            @Override
            public void setOrganisation(IOrganisation organisation) {

            }

            @Override
            public String _getPhoneNumber() {
                return phone;
            }

            @Override
            public void _setPhoneNumber(String phoneNumber) {

            }

            @Override
            public String _getFaxNumber() {
                return fax;
            }

            @Override
            public void setFaxNumber(String faxNumber) {

            }

            @Override
            public String _getEmailAddress() {
                return email;
            }

            @Override
            public void _setEmailAddress(String email) {

            }
        };
        return getResponsibleParty(person, roleCode);
    }

    public CIResponsiblePartyPropertyType getResponsibleParty(IPerson person, Role roleCode) {

        IOrganisation organisation = person.getOrganisation();
        String firstName = person.getFirstName();
        String lastName = person.getLastName();
        String organisationName = organisation.getOrganisationTerm().getName();
        String organisationIdentifier = organisation.getOrganisationTerm().getInnerMostIdentifier();
        String phoneNumber = person._getPhoneNumber() != null ? person._getPhoneNumber() : organisation._getPhoneNumber();
        String faxNumber = person._getFaxNumber() != null ? person._getFaxNumber() : organisation._getFaxNumber();
        String email = person._getEmailAddress() != null ? person._getEmailAddress() : organisation._getEmailAddress();
        String deliveryPoint = organisation._getDeliveryPoint();
        String city = organisation._getCity();
        String postalCode = organisation._getPostalcode();
        String country = organisation._getCountry().getCountryTerm().getName();
        String sdnCountryCode = organisation._getCountry().getCountryTerm().getInnerMostIdentifier();
        String website = organisation._getWebsite();

        CIRoleCodePropertyType role = null;

        if (roleCode == null) {
            role = ROLES.get(Role.POINT_OF_CONTACT);
        } else {
            role = ROLES.get(roleCode);
        }

        CIResponsiblePartyType party = new CIResponsiblePartyType();
        if (organisationName != null) {
            CodeListValueType edmoCode = getCodeListValue(REALM_SDN_EDMO_EDMERP, "SDN_EDMOCode", organisationIdentifier, organisationName);
            SDNEDMOCodePropertyType sdnEdmoCode = new SDNEDMOCodePropertyType();
            sdnEdmoCode.set(edmoCode);
            party.setOrganisationName(sdnEdmoCode);
        }
        if (firstName != null && lastName != null) {
            party.setIndividualName(getCS(firstName + " " + lastName));
        }
        if (phoneNumber != null || faxNumber != null || deliveryPoint != null || city != null || postalCode != null || sdnCountryCode != null || website != null) {
            CIContactPropertyType contactProp = new CIContactPropertyType();
            CIContactType contact = new CIContactType();
            CITelephonePropertyType phoneProp = new CITelephonePropertyType();

            CITelephoneType phone = new CITelephoneType();
            phone.getVoice().add(getCS(phoneNumber));
            phone.getFacsimile().add(getCS(faxNumber));
            phoneProp.setCITelephone(phone);
            contact.setPhone(phoneProp);
            contactProp.setCIContact(contact);
            CIAddressPropertyType addProp = new CIAddressPropertyType();
            CIAddressType add = new CIAddressType();
            addProp.setCIAddress(add);
            contact.setAddress(addProp);
            if (deliveryPoint != null || city != null || postalCode != null || sdnCountryCode != null) {
                if (deliveryPoint != null) {
                    add.getDeliveryPoint().add(getCS(deliveryPoint));
                }
                if (city != null) {
                    add.setCity(getCS(city));
                }
                if (postalCode != null) {
                    add.setPostalCode(getCS(postalCode));
                }
                if (sdnCountryCode != null) {
                    CodeListValueType countryCode = getCodeListValue(REALM_SDN_CDI_CSR, "SDN_CountryCode", country, sdnCountryCode);
                    SDNCountryCodePropertyType countryCodeSdn = new SDNCountryCodePropertyType();
                    countryCodeSdn.set(countryCode);
                    add.setCountry(countryCodeSdn);
                }
            }
            if (email != null) {
                add.getElectronicMailAddress().add(getCS(email));
            }
            if (website != null) {
                CIOnlineResourcePropertyType onlineResourceProp = new CIOnlineResourcePropertyType();
                CIOnlineResourceType onlineResource = new CIOnlineResourceType();
                URLPropertyType urlProp = new URLPropertyType();
                urlProp.setURL(website);
                onlineResource.setLinkage(urlProp);
                onlineResourceProp.setCIOnlineResource(onlineResource);
                contact.setOnlineResource(onlineResourceProp);
            }
            party.setContactInfo(contactProp);
            party.setRole(role);
        }
        CIResponsiblePartyPropertyType partyType = new CIResponsiblePartyPropertyType();
        partyType.setCIResponsibleParty(party);
        return partyType;
    }

    public MDIdentifierPropertyType getIdentifier(String idString) {
        MDIdentifierPropertyType idProp = new MDIdentifierPropertyType();
        MDIdentifierType id = new MDIdentifierType();
        id.setCode(getCS(idString));
        JAXBElement<MDIdentifierType> mdIdentifier = gmd.createMDIdentifier(id);
        idProp.setMDIdentifier(mdIdentifier);
        return idProp;
    }

    public String getCSRIdentifier() {
        return "urn:SDN:CSR:LOCAL:" + cruise.getIdentifier();
    }

    public <S extends SDNKeyword> MDKeywordsPropertyTypeSDN getSDNKeyword(Collection<ILinkedDataTerm> keywords, String type, Thesaurus thesaurus) {
        MDKeywordsPropertyTypeSDN individualKeywordProp = null;
        if (keywords != null && !keywords.isEmpty()) {

            MDKeywordsTypeSDN individualKeyword = new MDKeywordsTypeSDN();
            individualKeyword.setThesaurusName(getThesaurusCitation(thesaurus));
            MDKeywordTypeCodePropertyType keywordTypeProp = new MDKeywordTypeCodePropertyType();
            CodeListValueType keywordType = getCodeListValue(REALM_SDN_ISO, "MD_KeywordTypeCode", type, type);
            keywordTypeProp.setMDKeywordTypeCode(keywordType);
            individualKeyword.setType(keywordTypeProp);

            Class<S> sdnKeywordClass = KEYWORD_TYPES.get(type);
            if (sdnKeywordClass != null) {
                S sdnKeyword = null;
                String codeListHashTag = null;
                try {
                    sdnKeyword = sdnKeywordClass.newInstance();
                    Field field = sdnKeywordClass.getDeclaredField("code");
                    XmlElement x = field.getAnnotation(XmlElement.class);
                    codeListHashTag = x.name();
                } catch (InstantiationException ex) {
                    Logger.getLogger(CSRBuilder.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IllegalAccessException ex) {
                    Logger.getLogger(CSRBuilder.class.getName()).log(Level.SEVERE, null, ex);
                } catch (NoSuchFieldException ex) {
                    Logger.getLogger(CSRBuilder.class.getName()).log(Level.SEVERE, null, ex);
                } catch (SecurityException ex) {
                    Logger.getLogger(CSRBuilder.class.getName()).log(Level.SEVERE, null, ex);
                }
                if (sdnKeyword != null && codeListHashTag != null) {
                    individualKeywordProp = new MDKeywordsPropertyTypeSDN();
                    for (ILinkedDataTerm keyword : keywords) {
                        CodeListRealm realm;
                        if (codeListHashTag.equals("SDN_EDMERPCode")) {
                            realm = REALM_SDN_EDMO_EDMERP;
                        } else {
                            realm = REALM_SDN_CDI_CSR;
                        }
                        sdnKeyword.set(getCodeListValue(realm, codeListHashTag, keyword.getInnerMostIdentifier(), keyword.getName()));
                        individualKeyword.getKeyword().add(sdnKeyword);
                        individualKeywordProp.setMDKeywords(individualKeyword);
                    }
                }
            }
        }
        return individualKeywordProp;
    }

    public MDKeywordsPropertyType getKeyword(Collection<String> keywords, String type, Thesaurus thesaurus) {
        MDKeywordsType individualKeyword = new MDKeywordsType();
        MDKeywordsPropertyType individualKeywordProp = new MDKeywordsPropertyType();
        individualKeyword.getKeyword().addAll(getCS(keywords));

        if (thesaurus != null && !thesaurus.equals(Thesaurus.NO_THESAURUS)) {
            individualKeyword.setThesaurusName(getThesaurusCitation(thesaurus));
        }
        CodeListValueType keywordType = getCodeListValue(REALM_SDN_ISO, "MD_KeywordTypeCode", type, type);
        MDKeywordTypeCodePropertyType keywordTypeProp = new MDKeywordTypeCodePropertyType();
        keywordTypeProp.setMDKeywordTypeCode(keywordType);
        individualKeyword.setType(keywordTypeProp);
        individualKeywordProp.setMDKeywords(individualKeyword);
        return individualKeywordProp;
    }

    public Collection<MDKeywordsPropertyType> getKeywords(Collection<IKeyword> keywords) {
        Collection<MDKeywordsPropertyType> allKeywords = new LinkedHashSet<>();
        if (keywords != null && !keywords.isEmpty()) {
            Map< Thesaurus, List<IKeyword>> intKeywords = new HashMap<>(); //order by thesaurus
            for (IKeyword keyword : keywords) {
                Thesaurus thesaurus = keyword.getThesaurus();
                List<IKeyword> get = intKeywords.get(thesaurus);
                if (get != null) {
                    get.add(keyword);
                    intKeywords.put(thesaurus, get);
                } else {
                    List<IKeyword> subKeywords = new ArrayList<>();
                    subKeywords.add(keyword);
                    intKeywords.put(thesaurus, subKeywords);
                }
            }
            for (Map.Entry<Thesaurus, List<IKeyword>> entry : intKeywords.entrySet()) {
                Thesaurus thesaurus = entry.getKey();
                List<IKeyword> keywordList = entry.getValue();
                for (IKeyword iKeyword : keywordList) {
                    String prefLabel = iKeyword.getPrefLabel();
                    String type = iKeyword.getType();
                    allKeywords.add(getKeyword(Arrays.asList(new String[]{prefLabel}), type, thesaurus));
                }
            }
        }
        return allKeywords;
    }

    public JAXBElement<MIMetadataType> getMetadata() throws JAXBException {
        MDMetadataType csr1 = new MDMetadataType();
        MIMetadataType csr = new MIMetadataType();
        JAXBElement<MIMetadataType> result = gmi.createMIMetadata(csr);
        /*Identifier*/
        csr.setFileIdentifier(getCS(getCSRIdentifier()));
        /*MD Language*/
        LanguageCodePropertyType language = new LanguageCodePropertyType();
        language.setLanguageCode(getCodeListValue(REALM_SDN_ISO, "LanguageCode", "eng", "English"));
        csr.setLanguage(language);
        /*MD Characterset*/
        MDCharacterSetCodePropertyType characterSet = new MDCharacterSetCodePropertyType();
        characterSet.setMDCharacterSetCode(getCodeListValue(REALM_ISO, "MD_CharacterSetCode", "utf8", "utf8"));
        csr.setCharacterSet(characterSet);
        /*Hierarchy Level*/
        MDScopeCodePropertyType scopeCode = new MDScopeCodePropertyType();
        scopeCode.setMDScopeCode(gmd.createMDScopeCode(getCodeListValue(REALM_ISO, "MD_ScopeCode", "series", "series")));
        csr.getHierarchyLevel().add(scopeCode);
        /*Hierarchy Level Name*/
        CodeListValueType hierarchyLevelNameCode = getCodeListValue(REALM_SDN_CDI_CSR, "SDN_HierarchyLevelNameCode", "CSR", "Cruise Summary record");
        SDNHierarchyLevelNameCodePropertyType createSDNHierarchyLevelNameCodePropertyType = new SDNHierarchyLevelNameCodePropertyType();
        createSDNHierarchyLevelNameCodePropertyType.setSDNHierarchyLevelNameCode(hierarchyLevelNameCode);
        csr.getHierarchyLevelName().add(createSDNHierarchyLevelNameCodePropertyType);
        /*Metadata contact*/
        IOrganisation metadataResponsible = cruise.getCollateCentre();
        CIResponsiblePartyPropertyType responsibleParty = getResponsibleParty(metadataResponsible, Role.POINT_OF_CONTACT);
        csr.getContact().add(responsibleParty);

        /*Datestamp*/
        csr.setDateStamp(getSimpleDate(new Date()));
        /*Metadata standard name, version and extension*/
        csr.setMetadataStandardName(getCS("ISO 19115/SeaDataNet profile"));
        csr.setMetadataStandardVersion(getCS("1.0"));
        MDMetadataExtensionInformationPropertyType mdExtProp = new MDMetadataExtensionInformationPropertyType();
        mdExtProp.setHref("http://schemas.seadatanet.org/Standards-Software/Metadata-formats/csrExtensionInformation.xml");
        csr.getMetadataExtensionInfo().add(mdExtProp);

        csr.getIdentificationInfo().add(getIdentificationInfo());
        return result;
    }

    public DatePropertyType getSimpleDate(OffsetDateTime offsetdt) {
        long epochMilli = offsetdt.toInstant().toEpochMilli();
        Date date = new Date(epochMilli);
        return getSimpleDate(date);
    }

    public CIDatePropertyType getDate(Date datetime, String dateTypeString) {
        CIDatePropertyType dateProp = new CIDatePropertyType();
        CIDateType date = new CIDateType();
        date.setDate(getSimpleDate(datetime));
        CIDateTypeCodePropertyType dateType = new CIDateTypeCodePropertyType();
        dateType.setCIDateTypeCode(getCodeListValue(REALM_ISO, "CI_DateTypeCode", dateTypeString, dateTypeString));
        date.setDateType(dateType);
        dateProp.setCIDate(date);
        return dateProp;
    }

    public DatePropertyType getSimpleDate(Date date) {
        DatePropertyType dateProp = new DatePropertyType();
        String dateString = new SimpleDateFormat("yyyy-MM-dd").format(date);
        dateProp.setDate(dateString);
        return dateProp;
    }

    public MDIdentificationPropertyType getIdentificationInfo() {
        MDIdentificationPropertyType id = new MDIdentificationPropertyType();
        SDNDataIdentificationType sdnId = new SDNDataIdentificationType();
        JAXBElement<SDNDataIdentificationType> SDNDataIdentificationJaxb = sdn.createSDNDataIdentification(sdnId);

        id.setAbstractMDIdentification(SDNDataIdentificationJaxb);
        
        sdnId.setCitation(getCruiseCitation(cruise));
        CharacterStringPropertyType cs = getCS(cruise.getObjectives());
        sdnId.setAbstract(cs);
        sdnId.setPurpose(cs);
        sdnId.setId(getCSRIdentifier());

        Collection<? extends IPerson> chiefScientists = cruise.getChiefScientists();

        Set<IPerson> principalInvestigators = new HashSet(); //so that the same person is not evaluated twice
        if (cruise.getPrograms() != null) {
            for (IProgram program : cruise.getPrograms()) {
                principalInvestigators.addAll(program.getPrincipalInvestigators());
            }
        }
        if (chiefScientists != null) {
            principalInvestigators.addAll(chiefScientists);
        }
        for (IPerson principalInvestigator : principalInvestigators) {
            sdnId.getPointOfContact().add(getResponsibleParty(principalInvestigator, Role.POINT_OF_CONTACT));
        }
        /*Dataset Keywords*/
        sdnId.getDescriptiveKeywords().add(OCEANOGRAPHIC_GEOGRAPHIC_FEATURES);

        List<ILinkedDataTerm> departureHarbours = Arrays.asList(new ILinkedDataTerm[]{cruise.getDepartureHarbour().getHarbourTerm()});
        sdnId.getDescriptiveKeywordsSDN().add(getSDNKeyword(departureHarbours, "departure_place", THESAURUS_C38));

        List<ILinkedDataTerm> arrivalHarbours = Arrays.asList(new ILinkedDataTerm[]{cruise.getArrivalHarbour().getHarbourTerm()});
        sdnId.getDescriptiveKeywordsSDN().add(getSDNKeyword(arrivalHarbours, "arrival_place", THESAURUS_C38));

        List<ILinkedDataTerm> departureCountries = Arrays.asList(new ILinkedDataTerm[]{cruise.getDepartureHarbour()._getCountry().getCountryTerm()});
        sdnId.getDescriptiveKeywordsSDN().add(getSDNKeyword(departureCountries, "departure_country", THESAURUS_C38));

        List<ILinkedDataTerm> arrivalCountries = Arrays.asList(new ILinkedDataTerm[]{cruise.getArrivalHarbour()._getCountry().getCountryTerm()});
        sdnId.getDescriptiveKeywordsSDN().add(getSDNKeyword(arrivalCountries, "arrival_country", THESAURUS_C38));

        List<ILinkedDataTerm> platforms = Arrays.asList(new ILinkedDataTerm[]{cruise.getPlatform().getPlatformTerm()});
        sdnId.getDescriptiveKeywordsSDN().add(getSDNKeyword(platforms, "platform", THESAURUS_C17));

        List<ILinkedDataTerm> platformClasses = Arrays.asList(new ILinkedDataTerm[]{cruise.getPlatform().getPlatformClass()});
        sdnId.getDescriptiveKeywordsSDN().add(getSDNKeyword(platformClasses, "platform_class", THESAURUS_L06));

        Collection<ILinkedDataTerm> projects = cruise.getProjectTerms();
        sdnId.getDescriptiveKeywordsSDN().add(getSDNKeyword(projects, "project", THESAURUS_EDMERP));

        Collection<ILinkedDataTerm> seaAreas = cruise.getSeaAreaTerms();
        sdnId.getDescriptiveKeywordsSDN().add(getSDNKeyword(seaAreas, "place", THESAURUS_C19));

        Collection<ILinkedDataTerm> parameters = cruise.getP02();
        sdnId.getDescriptiveKeywordsSDN().add(getSDNKeyword(parameters, "parameter", THESAURUS_P02));

        Collection<ILinkedDataTerm> instruments = cruise.getInstruments();
        sdnId.getDescriptiveKeywordsSDN().add(getSDNKeyword(instruments, "instrument", THESAURUS_L05));

        /*Dataset Constraints*/
        sdnId.getResourceConstraints().add(getUseLimitation("Not applicable"));
        sdnId.getResourceConstraints().add(getAccessConstraint(license.getLicenseTerm().getIdentifier(), license.getLicenseTerm().getName()));

        /*Dataset Language*/
        LanguageCodePropertyType language = new LanguageCodePropertyType();
        language.setLanguageCode(getCodeListValue(REALM_SDN_ISO, "LanguageCode", "eng", "English"));
        sdnId.getLanguage().add(language);

        /*Dataset Characterset*/
        MDCharacterSetCodePropertyType characterSet = new MDCharacterSetCodePropertyType();
        characterSet.setMDCharacterSetCode(getCodeListValue(REALM_ISO, "MD_CharacterSetCode", "utf8", "utf8"));
        sdnId.getCharacterSet().add(characterSet);

        /*Dataset Topic category*/
        MDTopicCategoryCodePropertyType topicProp = new MDTopicCategoryCodePropertyType();
        topicProp.setMDTopicCategoryCode(MDTopicCategoryCodeType.OCEANS);
        sdnId.getTopicCategory().add(topicProp);
        
        return id;
    }

    private MDConstraintsPropertyType getUseLimitation(String freeText) {
        MDConstraintsPropertyType constraintsProp = new MDConstraintsPropertyType();
        MDConstraintsType constraints = new MDConstraintsType();
        constraints.getUseLimitation().add(getCS(freeText));
        constraintsProp.setMDConstraints(gmd.createMDConstraints(constraints));
        return constraintsProp;
    }

    private MDLegalConstraintsPropertyType getAccessConstraint(String url, String text) {
        MDLegalConstraintsPropertyType constraintsProp = new MDLegalConstraintsPropertyType();
        MDLegalConstraintsType constraints = new MDLegalConstraintsType();
        MDRestrictionCodePropertyType restrictionCode = new MDRestrictionCodePropertyType();

        restrictionCode.setMDRestrictionCode(getCodeListValue(REALM_SDN_ISO, "MD_RestrictionCode", "otherRestrictions", "otherRestrictions"));
        constraints.getAccessConstraints().add(restrictionCode);
        constraintsProp.setMDLegalConstraints(constraints);
        AnchorType anchor = new AnchorType();
        anchor.setHref(url);
        anchor.setValue(text);

        JAXBElement<AnchorType> a = gmx.createAnchor(anchor);
        CharacterStringPropertyType c = new CharacterStringPropertyType();
        c.setCharacterString(a);
        constraints.getOtherConstraints().add(c);

        return constraintsProp;
    }

    private CICitationPropertyType getCruiseCitation(ICruise cruise) {
        CICitationPropertyType citationProp = new CICitationPropertyType();
        CICitationType citation = new CICitationType();
        citationProp.setCICitation(citation);
        citation.setTitle(getCS(cruise.getIdentifier()));
        citation.getAlternateTitle().add((getCS(cruise.getName())));
        citation.getIdentifier().add(getIdentifier(getCSRIdentifier()));
        citation.getCitedResponsibleParty().add(getResponsibleParty(cruise.getPlatform().getVesselOperator(), Role.ORIGINATOR));

        citation.getDate().add(getDate(new Date(), REVISION));
        return citationProp;
    }

    private CICitationPropertyType getThesaurusCitation(Thesaurus thesaurus) {
        CICitationPropertyType citationProp = new CICitationPropertyType();
        CICitationType citation = new CICitationType();
        citationProp.setCICitation(citation);
        citation.setTitle(getCS(thesaurus.getThesaurusTitle()));
        String thesaurusCode = thesaurus.getThesaurusAltTitle();
        if (thesaurusCode != null) {
            citation.getAlternateTitle().add(getCS(thesaurusCode));
            citation.getIdentifier().add(getIdentifier("http://www.seadatanet.org/urnurl/SDN:" + thesaurusCode));
        }
        if (thesaurus.getThesaurusVersion() != null) {
            citation.setEdition(getCS(thesaurus.getThesaurusVersion()));
        }
        if (thesaurus.getThesaurusDate() != null) {
            citation.getDate().add(getDate(thesaurus.getThesaurusDate(), thesaurus.getPublicationOrRevision()));
        }
        return citationProp;
    }
}
