package pw.spn.carquery.model;

public enum TransmissionType {
    // TODO add more
    UNKNOWN("Unknown"), MANUAL("Manual");

    private String value;

    TransmissionType(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public static TransmissionType fromValue(String value) {
        for (TransmissionType type : values()) {
            if (type.value.equalsIgnoreCase(value)) {
                return type;
            }
        }
        return UNKNOWN;
    }
}
