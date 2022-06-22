package eu.eurofleets.ears.extendedclasses;

import be.naturalsciences.bmdc.cruise.model.IEvent;
import be.naturalsciences.bmdc.cruise.model.ILinkedDataTerm;
import be.naturalsciences.bmdc.cruise.model.IProperty;
import be.naturalsciences.bmdc.cruise.model.ITool;
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
public class Tool implements ITool {
   
    private ILinkedDataTerm thisTool;
    private ILinkedDataTerm parentTool;
    private Collection<? extends IEvent> events;

    public Tool(ILinkedDataTerm thisTool, ILinkedDataTerm parentTool) {
        this.thisTool = thisTool;
        this.parentTool = parentTool;
    }

    @Override
    public ILinkedDataTerm getTerm() {
        return thisTool;
    }

    @Override
    public void setTerm(ILinkedDataTerm thisTool) {
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

    @Override
    public String getSerialNumber() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ILinkedDataTerm getToolCategory() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Collection<? extends IProperty> getCharacteristics() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Collection<? extends IProperty> getCapabilities() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Collection<? extends ILinkedDataTerm> getMeasuredParameters() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setSerialNumber(String serialNumber) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setToolCategory(ILinkedDataTerm toolCategory) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setCharacteristics(Collection<? extends IProperty> characteristics) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setCapabilities(Collection<? extends IProperty> capabilities) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setMeasuredParameters(Collection<? extends ILinkedDataTerm> measuredParameters) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
