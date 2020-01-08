/*
 * To change this license header, choose ILicense Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package be.naturalsciences.bmdc.cruise.model;

/**
 *
 * @author thomas
 */
public interface ILicense {

    ILinkedDataTerm getLicenseTerm();

    void setLicenseTerm(ILinkedDataTerm license);
}
