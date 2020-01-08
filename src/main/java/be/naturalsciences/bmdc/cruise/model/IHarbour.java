/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package be.naturalsciences.bmdc.cruise.model;

/**
 * An interface that contains the core EARS elements for a Harbour, enriched with entities and fields needed for the CSR.  
 * @author thomas
 */
public interface IHarbour {
    
    ILinkedDataTerm getHarbourTerm();

    void setHarbourTerm(ILinkedDataTerm harbourTerm);
    
    ICountry _getCountry();
    
    void _setCountry(ICountry country);

}