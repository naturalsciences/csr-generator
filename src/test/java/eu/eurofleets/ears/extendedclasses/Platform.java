package eu.eurofleets.ears.extendedclasses;

import be.naturalsciences.bmdc.cruise.model.ILinkedDataTerm;
import be.naturalsciences.bmdc.cruise.model.IOrganisation;
import be.naturalsciences.bmdc.cruise.model.IPlatform;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author thomas
 */
public class Platform implements IPlatform {

    private ILinkedDataTerm platformTerm;  //an identifier in an external vocabulary, e.g. C17 (can be urn or url)
    private ILinkedDataTerm platformClass; //an identifier in an external vocabulary, e.g. L06 (can be urn or url)
    private IOrganisation vesselOperator;

    public Platform(ILinkedDataTerm platformTerm, ILinkedDataTerm platformClass, IOrganisation vesselOperator) {
        this.platformTerm = platformTerm;
        this.platformClass = platformClass;
        this.vesselOperator = vesselOperator;
    }

    @Override
    public ILinkedDataTerm getPlatformTerm() {
        return platformTerm;
    }

    @Override
    public void setPlatformTerm(ILinkedDataTerm platformTerm) {
        this.platformTerm = platformTerm;
    }

    @Override
    public ILinkedDataTerm getPlatformClass() {
        return platformClass;
    }

    @Override
    public void setPlatformClass(ILinkedDataTerm platformClass) {
        this.platformClass = platformClass;
    }

    @Override
    public IOrganisation getVesselOperator() {
        return vesselOperator;
    }

    @Override
    public void setVesselOperator(IOrganisation organisation) {
        this.vesselOperator = vesselOperator;
    }

}
