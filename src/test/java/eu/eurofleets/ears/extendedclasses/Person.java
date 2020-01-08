package eu.eurofleets.ears.extendedclasses;

import be.naturalsciences.bmdc.cruise.model.IOrganisation;
import be.naturalsciences.bmdc.cruise.model.IPerson;
import java.util.Objects;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author thomas
 */
public class Person implements IPerson {

    private String firstName;
    private String lastName;
    private IOrganisation organisationIdentifier; //an identifier in an external vocabulary, e.g. EDMO (can be urn or url)

    private String phoneNumber;
    private String faxNumber;
    private String email;

    public Person(String firstName, String lastName, IOrganisation organisationIdentifier, String phoneNumber, String faxNumber, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.organisationIdentifier = organisationIdentifier;
        this.phoneNumber = phoneNumber;
        this.faxNumber = faxNumber;
        this.email = email;
    }

    @Override
    public String getFirstName() {
        return firstName;
    }

    @Override
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Override
    public String getLastName() {
        return lastName;
    }

    @Override
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public IOrganisation getOrganisation() {
        return organisationIdentifier;
    }

    @Override
    public void setOrganisation(IOrganisation organisationIdentifier) {
        this.organisationIdentifier = organisationIdentifier;
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
    public void setFaxNumber(String faxNumber) {
        this.faxNumber = faxNumber;
    }

    @Override
    public String _getEmailAddress() {
        return email;
    }

    @Override
    public void _setEmailAddress(String email) {
        this.email = email;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 67 * hash + Objects.hashCode(this.firstName);
        hash = 67 * hash + Objects.hashCode(this.lastName);
        hash = 67 * hash + Objects.hashCode(this.organisationIdentifier);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Person other = (Person) obj;
        if (!Objects.equals(this.firstName, other.firstName)) {
            return false;
        }
        if (!Objects.equals(this.lastName, other.lastName)) {
            return false;
        }
        if (!Objects.equals(this.organisationIdentifier, other.organisationIdentifier)) {
            return false;
        }
        return true;
    }

}
