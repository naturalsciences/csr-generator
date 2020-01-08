package eu.eurofleets.ears.extendedclasses;


import be.naturalsciences.bmdc.cruise.model.ICruise;
import be.naturalsciences.bmdc.cruise.model.IPerson;
import be.naturalsciences.bmdc.cruise.model.IProgram;
import be.naturalsciences.bmdc.cruise.model.IProject;
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
public class Program implements IProgram {

    private String identifier;
    private int id;
    private Collection<? extends ICruise> cruises;
    private Collection<? extends IPerson> principalInvestigators;
    private String description;
    private Collection<? extends IProject> projects;

    public Program(String identifier, Collection<? extends ICruise> cruises, Collection<? extends IPerson> principalInvestigators, String description, Collection<? extends IProject> projects) {
        this.identifier = identifier;
        this.cruises = cruises;
        this.principalInvestigators = principalInvestigators;
        this.description = description;
        this.projects = projects;
    }

    
    
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
    public Collection<? extends ICruise> getCruises() {
        return cruises;
    }

    @Override
    public void setCruises(Collection<? extends ICruise> cruises) {
        this.cruises = cruises;
    }

    @Override
    public Collection<? extends IPerson> getPrincipalInvestigators() {
        return principalInvestigators;
    }

    @Override
    public void setPrincipalInvestigators(Collection<? extends IPerson> principalInvestigators) {
        this.principalInvestigators = principalInvestigators;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public Collection<? extends IProject> getProjects() {
        return projects;
    }

    @Override
    public void setProjects(Collection<? extends IProject> projects) {
        this.projects = projects;
    }
}
