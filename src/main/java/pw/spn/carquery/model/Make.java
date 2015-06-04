package pw.spn.carquery.model;

import java.io.Serializable;

public class Make implements Serializable {
    private static final long serialVersionUID = 5375759502094975958L;

    private String id;
    private String displayName;
    private String country;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
