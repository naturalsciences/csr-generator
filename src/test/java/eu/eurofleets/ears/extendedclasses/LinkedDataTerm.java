package eu.eurofleets.ears.extendedclasses;

import be.naturalsciences.bmdc.cruise.model.ILinkedDataTerm;
import java.util.regex.Pattern;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author thomas
 */
public class LinkedDataTerm implements ILinkedDataTerm {

    private String identifier;  //an identifier in an external vocabulary, i.e. the EARS ontology or the BODC Tool list L22 (can only be url)
    private String name;

    @Override
    public String getIdentifier() {
        return identifier;
    }

    @Override
    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    public LinkedDataTerm(String identifier, String name) {
        this.identifier = identifier;
        this.name = name;
    }

    public final static Pattern URN_PATTERN = Pattern.compile(
            "^[a-z0-9][a-z0-9-]{0,31}:([a-z0-9()+,\\-.:=@;$_!*']|%[0-9a-f]{2})+$",
            Pattern.CASE_INSENSITIVE);

    public final static Pattern URL_PATTERN = Pattern.compile(
            "(https?:\\/\\/(?:www\\.|(?!www))[a-zA-Z0-9][a-zA-Z0-9-]+[a-zA-Z0-9]\\.[^\\s]{2,}|www\\.[a-zA-Z0-9][a-zA-Z0-9-]+[a-zA-Z0-9]\\.[^\\s]{2,}|https?:\\/\\/(?:www\\.|(?!www))[a-zA-Z0-9]+\\.[^\\s]{2,}|www\\.[a-zA-Z0-9]+\\.[^\\s]{2,})",
            Pattern.CASE_INSENSITIVE);

    @Override
    public String getInnerMostIdentifier() {
        if (URN_PATTERN.matcher(identifier).matches()) {
            String[] split = identifier.split(":");
            return split[split.length - 1];
        } else if (URL_PATTERN.matcher(identifier).matches()) {
            String[] split = identifier.split("/");
            return split[split.length - 1];
        } else {
            return identifier;
        }
    }
}
