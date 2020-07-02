package eu.eurofleets.ears.extendedclasses;

import be.naturalsciences.bmdc.cruise.model.ICruise;
import be.naturalsciences.bmdc.cruise.model.IEvent;
import be.naturalsciences.bmdc.cruise.model.ILinkedDataTerm;
import be.naturalsciences.bmdc.cruise.model.IOrganisation;
import be.naturalsciences.bmdc.cruise.model.IPlatform;
import be.naturalsciences.bmdc.cruise.model.ITool;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

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
    private Collection<Cruise> cruises;

    public Platform(ILinkedDataTerm platformTerm, ILinkedDataTerm platformClass, IOrganisation vesselOperator) {
        this.platformTerm = platformTerm;
        this.platformClass = platformClass;
        this.vesselOperator = vesselOperator;
        this.cruises = new ArrayList<>();
    }

    @Override
    public ILinkedDataTerm getTerm() {
        return platformTerm;
    }

    @Override
    public void setTerm(ILinkedDataTerm platformTerm) {
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

    @Override
    public Set<? extends ITool> getInstruments() {
        Set<ITool> tools = new HashSet();
        if (cruises != null) {
            for (ICruise cruise : cruises) {
                tools.addAll(cruise.getInstruments());
            }
        }
        return tools;
    }

    @Override
    public Collection<Cruise> getCruises() {
        return cruises;
    }

    @Override
    public void addCruise(ICruise cruise) {
        cruises.add((Cruise) cruise);
    }

    @Override
    public Collection<? extends IEvent> getEvents() {
        Set<IEvent> events = new HashSet();
        if (cruises != null) {
            for (ICruise cruise : cruises) {
                events.addAll(cruise.getEvents());
            }
        }
        return events;
    }

}
