/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package be.naturalsciences.bmdc.cruise.model;

/**
 * An interface that contains the core EARS elements for an Organisation,
 * enriched with entities and fields needed for the CSR.
 *
 * @author thomas
 */
public interface IOrganisation {

    ILinkedDataTerm getOrganisationTerm();

    void setOrganisationTerm(ILinkedDataTerm organisation);

    ICountry _getCountry();

    void _setCountry(ICountry country);

    String _getDeliveryPoint();

    void _setDeliveryPoint(String deliveryPoint);

    String _getCity();

    void _setCity(String city);

    String _getPostalcode();

    void _setPostalcode(String postalcode);

    String _getWebsite();

    void _setWebsite(String website);

    String _getPhoneNumber();

    void _setPhoneNumber(String phoneNumber);

    String _getFaxNumber();

    void _setFaxNumber(String faxNumber);

    String _getEmailAddress();

    void _setEmailAddress(String emailAddresss);
}
