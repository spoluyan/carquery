package pw.spn.carquery.model;

import java.io.Serializable;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;

@JsonIgnoreProperties("make_is_common")
public class Make implements Serializable {
    private static final long serialVersionUID = 5375759502094975958L;

    @JsonProperty("make_id")
    private String id;

    @JsonProperty("make_display")
    private String displayName;

    @JsonProperty("make_country")
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
