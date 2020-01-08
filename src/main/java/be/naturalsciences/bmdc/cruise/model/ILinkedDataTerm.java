/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package be.naturalsciences.bmdc.cruise.model;

/**
 * An interface that contains the core EARS elements for a Term that exists in a linked data context, enriched with entities and fields needed for the CSR.  
 * @author thomas
 */
public interface ILinkedDataTerm {

    /***
     * Return the  identifier for the term. This must be an url.
     * @return 
     */
    String getIdentifier();

    String getName();

    /***
     * Set the identifier for the term. This must be an url.
     * @return 
     */
    void setIdentifier(String identifier);

    void setName(String name);
    
    String getInnerMostIdentifier();    
}
