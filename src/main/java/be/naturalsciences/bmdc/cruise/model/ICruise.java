/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package be.naturalsciences.bmdc.cruise.model;

import be.naturalsciences.bmdc.cruise.model.IPerson;
import be.naturalsciences.bmdc.cruise.model.IPlatform;
import be.naturalsciences.bmdc.cruise.model.IProgram;
import be.naturalsciences.bmdc.cruise.model.ISeaArea;
import java.time.OffsetDateTime;
import java.util.Collection;

/**
 * An interface that contains the core EARS elements for a SeaArea, enriched
 * with entities and fields needed for the CSR.
 *
 * @author thomas
 */
public interface ICruise {

    IHarbour getArrivalHarbour();

    Collection<? extends IPerson> getChiefScientists();

    IOrganisation getCollateCentre();

    IHarbour getDepartureHarbour();

    OffsetDateTime getEndDate();

    int getId();

    String getIdentifier();

    String getName();

    String getIsCancelled();

    String getObjectives();

    Collection<ILinkedDataTerm> getP02();

    IPlatform getPlatform();

    Collection<? extends IProgram> getPrograms();

    Collection<ILinkedDataTerm> getProjectTerms();

    Collection<ILinkedDataTerm> getSeaAreaTerms();

    Collection<? extends ISeaArea> getSeaAreas();

    OffsetDateTime getStartDate();

    void setArrivalHarbour(IHarbour arrivalHarbour);

    void setChiefScientists(Collection<? extends IPerson> chiefScientists);

    void setCollateCentre(IOrganisation IOrganisation);

    void setDepartureHarbour(IHarbour departureHarbour);

    void setEndDate(OffsetDateTime endDate);

    void setId(int id);

    void setIdentifier(String identifier);

    void setName(String name);

    void setIsCancelled(String isCancelled);

    void setObjectives(String objectives);

    void setP02(Collection<ILinkedDataTerm> P02);

    void setPlatform(IPlatform platform);

    void setPrograms(Collection<? extends IProgram> programs);

    void setSeaAreas(Collection<? extends ISeaArea> seaAreas);

    void setStartDate(OffsetDateTime startDate);

    public Collection<IEvent> getEvents();
    
    public void setEvents(Collection<IEvent> events);
    
    public Collection<ILinkedDataTerm> getInstruments();

}
