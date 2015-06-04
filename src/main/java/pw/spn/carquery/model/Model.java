package pw.spn.carquery.model;

import java.io.Serializable;

import org.codehaus.jackson.annotate.JsonProperty;

public class Model implements Serializable {
    private static final long serialVersionUID = -4916596833057880241L;

    @JsonProperty("model_name")
    private String name;

    @JsonProperty("model_make_id")
    private String makeID;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMakeID() {
        return makeID;
    }

    public void setMakeID(String makeID) {
        this.makeID = makeID;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((makeID == null) ? 0 : makeID.hashCode());
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Model other = (Model) obj;
        if (makeID == null) {
            if (other.makeID != null)
                return false;
        } else if (!makeID.equals(other.makeID))
            return false;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        return true;
    }
}
