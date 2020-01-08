/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.seadatanet.csr.org.seadatanet;

import org.seadatanet.csr.org.isotc211._2005.gco.CodeListValueType;

/**
 *
 * @author thomas
 */
public interface SDNKeyword {

    public CodeListValueType get();

    public void set(CodeListValueType value);

    public boolean isSet();
}
