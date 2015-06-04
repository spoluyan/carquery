package pw.spn.carquery.model;

public enum EnginePosition {
    UNKNOWN("Unknown"), FRONT("Front"), MIDDLE("Middle"), REAR("Rear");

    private String value;

    EnginePosition(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public static EnginePosition fromValue(String value) {
        for (EnginePosition type : values()) {
            if (type.value.equalsIgnoreCase(value)) {
                return type;
            }
        }
        return UNKNOWN;
    }
}
