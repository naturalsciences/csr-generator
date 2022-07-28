/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package be.naturalsciences.bmdc.cruise.csr;

import be.naturalsciences.bmdc.cruise.model.IEvent;
import be.naturalsciences.bmdc.cruise.model.ILinkedDataTerm;
import be.naturalsciences.bmdc.cruise.model.IPerson;
import be.naturalsciences.bmdc.cruise.model.ITool;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 *
 * @author thomas
 */
public class CSRObjective {

    //note that they do not contain Actions. Deployment/start and deployment/end will count double...
    public static CSRObjective deployments = new CSRObjective("Deployment", "http://ontologies.ef-ears.eu/ears2/1#pro_22", null, null, null, null, "number of deployments", "CSRU025", null, new ArrayList<>());
    public static CSRObjective observations = new CSRObjective("Observation", "http://ontologies.ef-ears.eu/ears2/1#pro_8", null, null, null, null, "number of observations", "CSRU011", null, new ArrayList<>());
    public static CSRObjective profiles = new CSRObjective("Profile", "http://ontologies.ef-ears.eu/ears2/1#pro_13", null, null, null, null, "number of profiles", "CSRU007", null, new ArrayList<>());
    public static CSRObjective recoveries = new CSRObjective("Recovery", "http://ontologies.ef-ears.eu/ears2/1#pro_23", null, null, null, null, "number of recoveries", "CSRU026", null, new ArrayList<>());
    public static CSRObjective samplings = new CSRObjective("Sampling", "http://ontologies.ef-ears.eu/ears2/1#pro_1", null, null, null, null, "number of samples", "CSRU006", null, new ArrayList<>());
    public static CSRObjective cores = new CSRObjective("Sampling", "http://ontologies.ef-ears.eu/ears2/1#pro_1", "unconsolidated sediment corers", "http://vocab.nerc.ac.uk/collection/L05/current/51/", null, null, "number of cores", "CSRU008", null, new ArrayList<>());

    public static CSRObjective tracks = new CSRObjective("Track", "http://ontologies.ef-ears.eu/ears2/1#pro_11", null, null, null, null, "number of track lines", "CSRU022", null, new ArrayList<>());
    public static CSRObjective tows = new CSRObjective("Tow", "http://ontologies.ef-ears.eu/ears2/1#pro_10", null, null, null, null, "number of hauls", "CSRU005", null, new ArrayList<>());

    public static CSRObjective stations = new CSRObjective("Operation", "http://ontologies.ef-ears.eu/ears2/1#pro_28", null, null, null, null, "number of stations", "CSRU001", null, new ArrayList<>()); //this is a generalised quantity when all others fail

    public static Set<CSRObjective> OBJECTIVES = new HashSet<>();

    static {
        OBJECTIVES.add(deployments);
        OBJECTIVES.add(observations);
        OBJECTIVES.add(profiles);
        OBJECTIVES.add(recoveries);
        OBJECTIVES.add(samplings);
        OBJECTIVES.add(cores);
        OBJECTIVES.add(tracks);
        OBJECTIVES.add(tows);
        OBJECTIVES.add(stations);
    }
    private final String processName;
    private final String processIdentifier;
    private final String toolCategoryName;
    private final String toolCategoryIdentifier;
    private final String L18Name; //L18 group
    private final String L18Identifier;
    private ITool tool;
    private IPerson pi;
    private List<IEvent> events;
    private boolean excludeToolCategory; //whether 
    private ILinkedDataTerm purpose; //C77 purpose

    public void addEvent(IEvent event) {
        this.events.add(event);
    }

    public CSRObjective(CSRObjective other) {
        this.processName = other.processName;
        this.processIdentifier = other.processIdentifier;
        this.toolCategoryName = other.toolCategoryName;
        this.toolCategoryIdentifier = other.toolCategoryIdentifier;
        this.purpose = other.purpose;
        this.L18Name = other.L18Name;
        this.L18Identifier = other.L18Identifier;
        this.tool = other.tool;
        this.events = new ArrayList<>();
        this.events.addAll(other.events);
        this.pi = other.pi;
    }

    public CSRObjective(String processName, String processIdentifier, String toolCategoryName, String toolCategoryIdentifier, String purposeName, String purposeIdentifier, String L18Name, String L18Identifier, ITool tool, List<IEvent> events) {
        this.processName = processName;
        this.processIdentifier = processIdentifier;
        this.toolCategoryName = toolCategoryName;
        this.toolCategoryIdentifier = toolCategoryIdentifier;
        this.purpose = purpose;
        this.tool = tool;
        this.events = events;
        this.L18Name = L18Name;
        this.L18Identifier = L18Identifier;
    }

    public String getProcessName() {
        return processName;
    }

    public String getProcessIdentifier() {
        return processIdentifier;
    }

    public ITool getTool() {
        return tool;
    }

    public void setTool(ITool tool) {
        this.tool = tool;
    }

    public List<IEvent> getEvents() {
        return events;
    }

    public void setEvents(List<IEvent> events) {
        this.events = events;
    }

    public String getL18Name() {
        return L18Name;
    }

    public String getL18Identifier() {
        return L18Identifier;
    }

    public String getToolCategoryName() {
        return toolCategoryName;
    }

    public String getToolCategoryIdentifier() {
        return toolCategoryIdentifier;
    }

    public ILinkedDataTerm getPurpose() {
        return purpose;
    }

    public void setPurpose(ILinkedDataTerm purpose) {
        this.purpose = purpose;
    }

    public IPerson getPi() {
        return pi;
    }

    public void setPi(IPerson pi) {
        this.pi = pi;
    }

}
