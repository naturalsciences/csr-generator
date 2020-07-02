package eu.eurofleets.ears.extendedclasses;

import be.naturalsciences.bmdc.cruise.model.ILinkedDataTerm;
import be.naturalsciences.bmdc.cruise.model.IProperty;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author thomas
 */
public class Property implements IProperty {

     private ILinkedDataTerm key;
    private String value;
    private String uom;

    @Override
    public ILinkedDataTerm getKey() {
        return key;
    }

    @Override
    public void setKey(ILinkedDataTerm key) {
        this.key = key;
    }

    @Override
    public String getValue() {
        return value;
    }

    @Override
    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String getUom() {
        return uom;
    }

    @Override
    public final void setUom(String uom) {
        if ("".equals(uom)) {
            uom = null;
        }
        this.uom = uom;
    }

    public Property(ILinkedDataTerm key, String value, String uom) {
        this.key = key;
        this.value = value;
        setUom(uom);
    }

}
