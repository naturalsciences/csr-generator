package eu.eurofleets.ears.extendedclasses;

import be.naturalsciences.bmdc.cruise.model.IEvent;
import be.naturalsciences.bmdc.cruise.model.ILinkedDataTerm;
import be.naturalsciences.bmdc.cruise.model.IPerson;
import be.naturalsciences.bmdc.cruise.model.IPlatform;
import be.naturalsciences.bmdc.cruise.model.IProgram;
import be.naturalsciences.bmdc.cruise.model.IProperty;
import be.naturalsciences.bmdc.cruise.model.ITool;
import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Collection;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author thomas
 */
public abstract class Event implements IEvent {

    private int id; //the database PK
    private String identifier;
    private String eventDefinitionId;
    private OffsetDateTime timeStamp;
    private IPerson actor;
    private ILinkedDataTerm subject;
    private ITool tool;
    private ILinkedDataTerm toolCategory;
    private ILinkedDataTerm process;
    private ILinkedDataTerm action;
    private Collection<? extends IProperty> properties;
    private IProgram program;
    private IPlatform platform;

    @Override
    public String getIdentifier() {
        return identifier;
    }

    @Override
    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    @Override
    public String getEventDefinitionId() {
        return eventDefinitionId;
    }

    @Override
    public void setEventDefinitionId(String eventDefinitionId) {
        this.eventDefinitionId = eventDefinitionId;
    }

    @Override
    public OffsetDateTime getTimeStamp() {
        return timeStamp;
    }

    @Override
    public void setTimeStamp(OffsetDateTime timeStamp) {
        this.timeStamp = timeStamp;
    }

    @Override
    public IPerson getActor() {
        return actor;
    }

    @Override
    public void setActor(IPerson actor) {
        this.actor = actor;
    }

    @Override
    public ILinkedDataTerm getSubject() {
        return subject;
    }

    @Override
    public void setSubject(ILinkedDataTerm subject) {
        this.subject = subject;
    }

    @Override
    public ITool getTool() {
        return tool;
    }

    @Override
    public void setTool(ITool tool) {
        this.tool = tool;
    }

    @Override
    public ILinkedDataTerm getToolCategory() {
        return toolCategory;
    }

    @Override
    public void setToolCategory(ILinkedDataTerm toolCategory) {
        this.toolCategory = toolCategory;
    }

    @Override
    public ILinkedDataTerm getProcess() {
        return process;
    }

    @Override
    public void setProcess(ILinkedDataTerm process) {
        this.process = process;
    }

    @Override
    public ILinkedDataTerm getAction() {
        return action;
    }

    @Override
    public void setAction(ILinkedDataTerm action) {
        this.action = action;
    }

    @Override
    public Collection<? extends IProperty> getProperties() {
        return properties;
    }

    @Override
    public void setProperties(Collection<? extends IProperty> properties) {
        this.properties = properties;
    }

    @Override
    public IProgram getProgram() {
        return program;
    }

    @Override
    public void setProgram(IProgram program) {
        this.program = program;
    }

    @Override
    public IPlatform getPlatform() {
        return this.platform;
    }

    @Override
    public void setPlatform(IPlatform platform) {
        this.platform = platform;
    }

    @Override
    public String getLabel() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setLabel(String label) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getDescription() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setDescription(String description) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getStation() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setStation(String description) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String toString() {
        return tool.getTerm().getName() + " " + process.getName() + " " + action.getName() + " at " + timeStamp.format(DateTimeFormatter.ISO_INSTANT);
    }

}
