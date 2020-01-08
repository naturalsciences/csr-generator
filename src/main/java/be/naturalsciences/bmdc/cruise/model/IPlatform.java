/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package be.naturalsciences.bmdc.cruise.model;

/**
 * An interface that contains the core EARS elements for a Platform, enriched
 * with entities and fields needed for the CSR.
 *
 * @author thomas
 */
public interface IPlatform {

    ILinkedDataTerm getPlatformTerm();

    ILinkedDataTerm getPlatformClass();

    void setPlatformTerm(ILinkedDataTerm platformTerm);

    void setPlatformClass(ILinkedDataTerm platformClass);

    IOrganisation getVesselOperator();
    
    void setVesselOperator(IOrganisation organisation);

}
