/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package be.naturalsciences.bmdc.cruise.csr.model;

import java.util.Date;
import java.util.Objects;

/**
 *
 * @author thomas
 */
public class Thesaurus {

    String thesaurusTitle;
    String thesaurusUrl;
    String thesaurusAltTitle;
    Date thesaurusDate;
    String thesaurusVersion;
    String publicationOrRevision;
    public static final Thesaurus NO_THESAURUS = new Thesaurus(Thesaurus.NOTHING, null, null, null, null, null);
    public static final String NOTHING = "NO_THESAURUS";

    public static String PUBLICATION = "publication";
    public static String REVISION = "revision";

    /* public Thesaurus(IKeyword keyword) {
        this(keyword.getThesaurusTitle() == null ? NOTHING : keyword.getThesaurusTitle(), null, keyword.getThesaurusUrl(), keyword.getThesaurusPublicationDate(), keyword.getThesaurusVersion());
    }*/
    public Thesaurus(String thesaurusTitle, String thesaurusAltTitle, String thesaurusUrl, Date thesaurusDate, String thesaurusVersion, String publicationOrRevision) {
        if (thesaurusTitle == null) {
            throw new IllegalArgumentException("The thesaurus must have a title.");
        }
        this.thesaurusTitle = thesaurusTitle;
        this.thesaurusAltTitle = thesaurusAltTitle;
        this.thesaurusDate = thesaurusDate;
        this.thesaurusVersion = thesaurusVersion;
        this.thesaurusUrl = thesaurusUrl;
        this.publicationOrRevision = publicationOrRevision;
    }

    public String getThesaurusTitle() {
        return thesaurusTitle;
    }

    public String getThesaurusUrl() {
        return thesaurusUrl;
    }

    public String getThesaurusAltTitle() {
        return thesaurusAltTitle;
    }

    public Date getThesaurusDate() {
        return thesaurusDate;
    }

    public String getThesaurusVersion() {
        return thesaurusVersion;
    }

    public String getPublicationOrRevision() {
        return publicationOrRevision;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 23 * hash + Objects.hashCode(this.thesaurusUrl);
        hash = 23 * hash + Objects.hashCode(this.thesaurusTitle);
        hash = 23 * hash + Objects.hashCode(this.thesaurusDate);
        hash = 23 * hash + Objects.hashCode(this.thesaurusVersion);
        return hash;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        } else if (other instanceof Thesaurus) {
            Thesaurus otherThesaurus = (Thesaurus) other;
            Date localThesaurusPublicationDate = this.thesaurusDate == null ? new Date() : this.thesaurusDate;
            String localThesaurusVersion = this.thesaurusVersion == null ? "" : this.thesaurusVersion;

            Date otherThesaurusPublicationDate = otherThesaurus.thesaurusDate == null ? new Date() : otherThesaurus.thesaurusDate;
            String otherThesaurusVersion = otherThesaurus.thesaurusVersion == null ? "" : otherThesaurus.thesaurusVersion;

            return otherThesaurus.thesaurusTitle.equals(this.thesaurusTitle) && localThesaurusPublicationDate.equals(otherThesaurusPublicationDate) && localThesaurusVersion.equals(otherThesaurusVersion);
        }
        return false;
    }
}
