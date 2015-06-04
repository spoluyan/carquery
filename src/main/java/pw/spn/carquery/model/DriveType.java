package pw.spn.carquery.model;

public enum DriveType {
    // TODO add more
    UNKNOWN("Unknown"), FRONT("Front"), REAR("Rear"), AWD("AWD"), FOUR_WD("4WD");

    private String value;

    DriveType(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public static DriveType fromValue(String value) {
        for (DriveType type : values()) {
            if (type.value.equalsIgnoreCase(value)) {
                return type;
            }
        }
        return UNKNOWN;
    }
}
