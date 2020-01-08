package eu.eurofleets.ears.extendedclasses;

import be.naturalsciences.bmdc.cruise.model.ILinkedDataTerm;
import be.naturalsciences.bmdc.cruise.model.ITool;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author thomas
 */
public class Tool implements ITool {
    private ILinkedDataTerm thisTool;
    private ILinkedDataTerm parentTool;

    @Override
    public ILinkedDataTerm getThisTool() {
        return thisTool;
    }

    @Override
    public void setThisTool(ILinkedDataTerm thisTool) {
        this.thisTool = thisTool;
    }

    @Override
    public ILinkedDataTerm getParentTool() {
        return parentTool;
    }

    @Override
    public void setParentTool(ILinkedDataTerm parentTool) {
        this.parentTool = parentTool;
    }
    
    
}
