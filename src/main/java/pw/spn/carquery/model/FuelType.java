package pw.spn.carquery.model;

public enum FuelType {
    // TODO add more
    UNKNOWN("Unknown"), GASOLINE("Gasoline"), DIESEL("Diesel");

    private String value;

    FuelType(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public static FuelType fromValue(String value) {
        for (FuelType type : values()) {
            if (type.value.equalsIgnoreCase(value)) {
                return type;
            }
        }
        return UNKNOWN;
    }
}
