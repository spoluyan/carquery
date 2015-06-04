package pw.spn.carquery.model;

public enum TransmissionType {
    AUTOMATED_MANUAL("Automated Manual"), AUTOMATIC("Automatic"), DIRECT_DRIVE("Direct Drive"), MANUAL("Manual"), NOT_AVAILABLE(
            "Not Available");

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
        return NOT_AVAILABLE;
    }
}
