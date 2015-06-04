package pw.spn.carquery.model;

import java.io.Serializable;

public class Model implements Serializable {
    private static final long serialVersionUID = -4916596833057880241L;

    private String name;
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
}
