/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package be.naturalsciences.bmdc.cruise.model;

import be.naturalsciences.bmdc.cruise.model.ILinkedDataTerm;

/**
 * An interface that contains the core EARS elements for a Tool, enriched with entities and fields needed for the CSR.
 * @author thomas
 */
public interface ITool {

    ILinkedDataTerm getParentTool();

    ILinkedDataTerm getThisTool();

    void setParentTool(ILinkedDataTerm parentTool);

    void setThisTool(ILinkedDataTerm thisTool);
    
}
