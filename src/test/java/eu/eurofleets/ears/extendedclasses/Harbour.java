/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eu.eurofleets.ears.extendedclasses;

import be.naturalsciences.bmdc.cruise.model.ICountry;
import be.naturalsciences.bmdc.cruise.model.ILinkedDataTerm;
import be.naturalsciences.bmdc.cruise.model.IHarbour;

/**
 *
 * @author thomas
 */
public class Harbour implements IHarbour {

    private ILinkedDataTerm harbourTerm;
    private ICountry country;

    public Harbour(ILinkedDataTerm harbourTerm, ICountry country) {
        this.harbourTerm = harbourTerm;
        this.country = country;
    }

    @Override
    public ILinkedDataTerm getTerm() {
        return this.harbourTerm;
    }

    @Override
    public void setTerm(ILinkedDataTerm harbour) {
        harbourTerm = harbour;
    }

    @Override
    public ICountry _getCountry() {
        return country;
    }

    @Override
    public void _setCountry(ICountry country) {
        this.country = country;
    }

}
