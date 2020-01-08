/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eu.eurofleets.ears.extendedclasses;

import be.naturalsciences.bmdc.cruise.model.ICountry;
import be.naturalsciences.bmdc.cruise.model.ILinkedDataTerm;

/**
 *
 * @author thomas
 */
public class Country implements ICountry {

    private ILinkedDataTerm countryTerm;

    @Override
    public ILinkedDataTerm getCountryTerm() {
        return countryTerm;
    }

    @Override
    public void setCountryTerm(ILinkedDataTerm country) {
        this.countryTerm = country;
    }

    public Country(ILinkedDataTerm countryTerm) {
        this.countryTerm = countryTerm;
    }
    
    

}
