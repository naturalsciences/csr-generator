/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package be.naturalsciences.bmdc.cruise.model;

import java.time.OffsetDateTime;
import java.util.Collection;

/**
 * An interface that contains the core EARS elements for an , enriched with entities and fields needed for the CSR.  
 * @author thomas
 */
public interface IEvent {
    
    IProgram getProgram();

    ILinkedDataTerm getAction();

    IPerson getActor();

    String getEventDefinitionId();

    int getId();

    String getIdentifier();

    ILinkedDataTerm getProcess();

    Collection<? extends IProperty> getProperties();

    ILinkedDataTerm getSubject();

    OffsetDateTime getTimeStamp();

    ITool getTool();

    ILinkedDataTerm getToolCategory();
    
    void setProgram(IProgram program);

    void setAction(ILinkedDataTerm action);

    void setActor(IPerson actor);

    void setEventDefinitionId(String eventDefinitionId);

    void setId(int id);

    void setIdentifier(String identifier);

    void setProcess(ILinkedDataTerm process);

    void setProperties(Collection<? extends IProperty> properties);

    void setSubject(ILinkedDataTerm subject);

    void setTimeStamp(OffsetDateTime timeStamp);

    void setTool(ITool tool);

    void setToolCategory(ILinkedDataTerm toolCategory);
    
}
