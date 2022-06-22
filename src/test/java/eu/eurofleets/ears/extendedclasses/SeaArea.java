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
    private Double eastBoundLongitude;
    private Double westBoundLongitude;
    private Double northBoundLatitude;
    private Double southBoundLatitude;

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

    
    public Double getSouthBoundLatitude() {
        return southBoundLatitude;
    }

    public void setSouthBoundLatitude(Double southBoundLatitude) {
        this.southBoundLatitude = southBoundLatitude;
    }

    public Double getNorthBoundLatitude() {
        return northBoundLatitude;
    }

    public void setNorthBoundLatitude(Double northBoundLatitude) {
        this.northBoundLatitude = northBoundLatitude;
    }

    public Double getWestBoundLongitude() {
        return westBoundLongitude;
    }

    public void setWestBoundLongitude(Double westBoundLongitude) {
        this.westBoundLongitude = westBoundLongitude;
    }

    public Double getEastBoundLongitude() {
        return eastBoundLongitude;
    }

    public void setEastBoundLongitude(Double eastBoundLongitude) {
        this.eastBoundLongitude = eastBoundLongitude;
    }
    
}
