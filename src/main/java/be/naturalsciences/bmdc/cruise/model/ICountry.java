/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package be.naturalsciences.bmdc.cruise.model;

/**
 *
 * @author thomas
 */
public interface ICountry {

    ILinkedDataTerm getCountryTerm();

    void setCountryTerm(ILinkedDataTerm country);
}
