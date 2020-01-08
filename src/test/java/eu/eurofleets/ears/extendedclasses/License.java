/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eu.eurofleets.ears.extendedclasses;

import be.naturalsciences.bmdc.cruise.model.ILicense;
import be.naturalsciences.bmdc.cruise.model.ILinkedDataTerm;

/**
 *
 * @author thomas
 */
public class License implements ILicense {

    private ILinkedDataTerm licenseTerm;

    @Override
    public ILinkedDataTerm getLicenseTerm() {
        return licenseTerm;
    }

    @Override
    public void setLicenseTerm(ILinkedDataTerm licenseTerm) {
        this.licenseTerm = licenseTerm;
    }

    public License(ILinkedDataTerm licenseTerm) {
        this.licenseTerm = licenseTerm;
    }

}
