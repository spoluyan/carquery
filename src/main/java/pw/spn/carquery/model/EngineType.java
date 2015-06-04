package pw.spn.carquery.model;

public enum EngineType {
    // TODO add more
    UNKNOWN("Unknown"), V("V"), IN_LINE("in-line");

    private String value;

    EngineType(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public static EngineType fromValue(String value) {
        for (EngineType type : values()) {
            if (type.value.equalsIgnoreCase(value)) {
                return type;
            }
        }
        return UNKNOWN;
    }
}
