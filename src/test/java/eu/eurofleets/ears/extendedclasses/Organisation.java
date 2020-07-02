/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eu.eurofleets.ears.extendedclasses;

import be.naturalsciences.bmdc.cruise.model.ICountry;
import be.naturalsciences.bmdc.cruise.model.ILinkedDataTerm;
import be.naturalsciences.bmdc.cruise.model.IOrganisation;

/**
 *
 * @author thomas
 */
public class Organisation implements IOrganisation {

    private ILinkedDataTerm organisationTerm;
    private String phoneNumber;
    private String faxNumber;
    private String emailAddress;
    private String website;
    private String deliveryPoint;
    private String city;
    private String postalCode;
    private ICountry country;

    @Override
    public ILinkedDataTerm getTerm() {
        return organisationTerm;
    }

    @Override
    public void setTerm(ILinkedDataTerm organisationTerm) {
        this.organisationTerm = organisationTerm;
    }

    @Override
    public ICountry _getCountry() {
        return country;
    }

    @Override
    public void _setCountry(ICountry country) {
        this.country = country;
    }

    @Override
    public String _getDeliveryPoint() {
        return deliveryPoint;
    }

    @Override
    public void _setDeliveryPoint(String deliveryPoint) {
        this.deliveryPoint = deliveryPoint;
    }

    @Override
    public String _getCity() {
        return city;
    }

    @Override
    public void _setCity(String city) {
        this.city = city;
    }

    @Override
    public String _getPostalcode() {
        return postalCode;
    }

    @Override
    public void _setPostalcode(String postalCode) {
        this.postalCode = postalCode;
    }

    @Override
    public String _getWebsite() {
        return website;
    }

    @Override
    public void _setWebsite(String website) {
        this.website = website;
    }

    @Override
    public String _getPhoneNumber() {
        return phoneNumber;
    }

    @Override
    public void _setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String _getFaxNumber() {
        return faxNumber;
    }

    @Override
    public void _setFaxNumber(String faxNumber) {
        this.faxNumber = faxNumber;
    }

    @Override
    public String _getEmailAddress() {
        return emailAddress;
    }

    @Override
    public void _setEmailAddress(String emailAddresss) {
        this.emailAddress = emailAddresss;
    }

    public Organisation(ILinkedDataTerm organisationTerm, String phoneNumber, String faxNumber, String emailAddress, String website, String deliveryPoint, String city, String postalCode, ICountry country) {
        this.organisationTerm = organisationTerm;
        this.phoneNumber = phoneNumber;
        this.faxNumber = faxNumber;
        this.emailAddress = emailAddress;
        this.website = website;
        this.deliveryPoint = deliveryPoint;
        this.city = city;
        this.postalCode = postalCode;
        this.country = country;
    }

    
}
