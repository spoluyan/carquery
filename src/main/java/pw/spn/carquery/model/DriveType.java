package pw.spn.carquery.model;

public enum DriveType {
    FOUR_WD("4WD"), ALL_WHEEL_DRIVE("All Wheel Drive"), AWD("AWD"), FOUR_WHEEL_DRIVE("Four Wheel Drive"), FRONT("Front"), FRONT_WHEEL_DRIVE(
            "Front Wheel Driv"), NOT_AVAILABLE("Not Available"), REAR("Rear"), REAR_WHEEL_DRIVE("Rear Wheel Drive");

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
        return NOT_AVAILABLE;
    }
}
