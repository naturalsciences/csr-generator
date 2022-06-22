/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package be.naturalsciences.bmdc.cruise.csr;

import java.util.List;

/**
 *
 * @author thomas
 */
public class IllegalCSRArgumentException extends IllegalArgumentException {

    private List<String> invalidArguments;

    public List<String> getInvalidArguments() {
        return invalidArguments;
    }

    public void setInvalidArguments(List<String> invalidArguments) {
        this.invalidArguments = invalidArguments;
    }

    public IllegalCSRArgumentException(List<String> invalidArguments) {
        super(String.join("|", invalidArguments));
        this.invalidArguments = invalidArguments;
    }
}
