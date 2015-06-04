package pw.spn.carquery.model;

public enum EnginePosition {
    FRONT("Front"), MIDDLE("Middle"), NOT_AVAILABLE("Not Available"), REAR("Rear");

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
        return NOT_AVAILABLE;
    }
}
