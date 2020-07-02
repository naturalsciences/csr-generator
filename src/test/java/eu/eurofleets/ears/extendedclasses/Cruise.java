package eu.eurofleets.ears.extendedclasses;

import be.naturalsciences.bmdc.cruise.model.ICruise;
import be.naturalsciences.bmdc.cruise.model.IEvent;
import be.naturalsciences.bmdc.cruise.model.IHarbour;
import be.naturalsciences.bmdc.cruise.model.ILinkedDataTerm;
import be.naturalsciences.bmdc.cruise.model.IOrganisation;
import be.naturalsciences.bmdc.cruise.model.IPerson;
import be.naturalsciences.bmdc.cruise.model.IPlatform;
import be.naturalsciences.bmdc.cruise.model.IProgram;
import be.naturalsciences.bmdc.cruise.model.IProject;
import be.naturalsciences.bmdc.cruise.model.ISeaArea;
import be.naturalsciences.bmdc.cruise.model.ITool;
import java.time.OffsetDateTime;
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
public class Cruise implements ICruise {

    private String identifier; //the identifier used by the operator for the cruise.
    private int id; //the database PK
    private OffsetDateTime startDate;
    private OffsetDateTime endDate;
    private IOrganisation collateCentre; //the data centre that will do the data management and dissemination, an identifier in an external vocabulary, e.g. EDMO
    private IHarbour departureHarbour; //an identifier in an external vocabulary, e.g. C38 (can be urn or url)
    private IHarbour arrivalHarbour; //an identifier in an external vocabulary, e.g. C38 (can be urn or url)
    private Collection<? extends IPerson> chiefScientists;
    private Collection<? extends ISeaArea> seaAreas;
    private Collection<? extends IProgram> programs;
    private IPlatform platform;
    private String objectives;
    private boolean isCancelled; //additional field so that cancelled cruises don't need to be deleted from the database. They just don't show up in EARS.
    private Collection<? extends ILinkedDataTerm> P02;
    private String name;
    private Collection<? extends IEvent> events;

    @Override
    public String getIdentifier() {
        return identifier;
    }

    @Override
    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public void setId(int id) {
        this.id = id;
    }

    @Override
    public OffsetDateTime getStartDate() {
        return startDate;
    }

    @Override
    public void setStartDate(OffsetDateTime startDate) {
        this.startDate = startDate;
    }

    @Override
    public OffsetDateTime getEndDate() {
        return endDate;
    }

    @Override
    public void setEndDate(OffsetDateTime endDate) {
        this.endDate = endDate;
    }

    @Override
    public IOrganisation getCollateCentre() {
        return collateCentre;
    }

    @Override
    public void setCollateCentre(IOrganisation collateCentre) {
        this.collateCentre = collateCentre;
    }

    @Override
    public IHarbour getDepartureHarbour() {
        return departureHarbour;
    }

    @Override
    public void setDepartureHarbour(IHarbour departureHarbour) {
        this.departureHarbour = departureHarbour;
    }

    @Override
    public IHarbour getArrivalHarbour() {
        return arrivalHarbour;
    }

    @Override
    public void setArrivalHarbour(IHarbour arrivalHarbour) {
        this.arrivalHarbour = arrivalHarbour;
    }

    @Override
    public Collection<? extends IPerson> getChiefScientists() {
        return chiefScientists;
    }

    @Override
    public void setChiefScientists(Collection<? extends IPerson> chiefScientists) {
        this.chiefScientists = chiefScientists;
    }

    @Override
    public Collection<? extends ISeaArea> getSeaAreas() {
        return seaAreas;
    }

    @Override
    public void setSeaAreas(Collection<? extends ISeaArea> seaAreas) {
        this.seaAreas = seaAreas;
    }

    @Override
    public Collection<? extends IProgram> getPrograms() {
        return programs;
    }

    @Override
    public void setPrograms(Collection<? extends IProgram> programs) {
        this.programs = programs;
    }

    @Override
    public IPlatform getPlatform() {
        return platform;
    }

    @Override
    public void setPlatform(IPlatform platform) {
        this.platform = platform;
        platform.addCruise(this);
    }

    @Override
    public String getObjectives() {
        return objectives;
    }

    @Override
    public void setObjectives(String objectives) {
        this.objectives = objectives;
    }

    @Override
    public boolean getIsCancelled() {
        return isCancelled;
    }

    @Override
    public void setIsCancelled(boolean isCancelled) {
        this.isCancelled = isCancelled;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public Collection<? extends ILinkedDataTerm> getP02() {
        return P02;
    }

    @Override
    public void setP02(Collection<? extends ILinkedDataTerm> P02) {
        this.P02 = P02;
    }

    @Override
    public Collection<? extends IEvent> getEvents() {
        return events;
    }

    @Override
    public void setEvents(Collection<? extends IEvent> events) {
        this.events = events;
    }

    @Override
    public Collection<ILinkedDataTerm> getProjectTerms() {
        Collection<ILinkedDataTerm> r = new ArrayList<>();
        if (programs != null) {
            for (IProgram p : programs) {
                if (p.getProjects() != null) {
                    for (IProject pr : p.getProjects()) {
                        r.add(pr.getTerm());
                    }
                }
            }
        }
        return r;
    }

    @Override
    public Collection<ILinkedDataTerm> getSeaAreaTerms() {
        Collection<ILinkedDataTerm> r = new ArrayList<>();
        if (seaAreas != null) {
            for (ISeaArea a : seaAreas) {
                if (a.getTerm() != null) {
                    r.add(a.getTerm());
                }
            }
        }
        return r;
    }

    @Override
    public Set<ILinkedDataTerm> getInstrumentTypes() {
        Set<ILinkedDataTerm> toolCategories = new HashSet();
        if (events != null) {
            for (IEvent event : events) {
                toolCategories.add(event.getToolCategory());
            }
        }
        return toolCategories;
    }

    @Override
    public Set<? extends ITool> getInstruments() {
        Set<ITool> tools = new HashSet();
        if (events != null) {
            for (IEvent event : events) {
                tools.add(event.getTool());
            }
        }
        return tools;
    }

}
