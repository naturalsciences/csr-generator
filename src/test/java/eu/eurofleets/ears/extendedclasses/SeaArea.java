package eu.eurofleets.ears.extendedclasses;

import be.naturalsciences.bmdc.cruise.model.ILinkedDataTerm;
import be.naturalsciences.bmdc.cruise.model.ISeaArea;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author thomas
 */
public class SeaArea implements ISeaArea {

    private ILinkedDataTerm seaAreaTerm;

    public SeaArea(ILinkedDataTerm seaAreaTerm) {
        this.seaAreaTerm = seaAreaTerm;
    }

    @Override
    public ILinkedDataTerm getTerm() {
        return this.seaAreaTerm;
    }

    @Override
    public void setTerm(ILinkedDataTerm seaAreaTerm) {
        this.seaAreaTerm = seaAreaTerm;
    }

}
