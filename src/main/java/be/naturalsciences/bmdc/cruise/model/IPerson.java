/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package be.naturalsciences.bmdc.cruise.model;

/**
 * An interface that contains the core EARS elements for a Person, enriched with
 * entities and fields needed for the CSR.
 *
 * @author thomas
 */
public interface IPerson {

    String getFirstName();

    String getLastName();

    IOrganisation getOrganisation();

    void setFirstName(String firstName);

    void setLastName(String lastName);

    void setOrganisation(IOrganisation organisation);

    String _getPhoneNumber();

    void _setPhoneNumber(String phoneNumber);

    String _getFaxNumber();

    void setFaxNumber(String faxNumber);

    String _getEmailAddress();

    void _setEmailAddress(String email);

    int hashCode();

    boolean equals(Object obj);

}
