package eu.eurofleets.ears.extendedclasses;

import be.naturalsciences.bmdc.cruise.model.ILinkedDataTerm;
import be.naturalsciences.bmdc.cruise.model.IProject;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author thomas
 */
public class Project implements IProject {

    private ILinkedDataTerm projectTerm;

    public Project(ILinkedDataTerm projectTerm) {
        this.projectTerm = projectTerm;
    }

    @Override
    public ILinkedDataTerm getProjectTerm() {
        return projectTerm;
    }

    @Override
    public void setProjectTerm(ILinkedDataTerm projectTerm) {
        this.projectTerm = projectTerm;
    }
}
