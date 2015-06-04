package pw.spn.carquery.model;

public enum BodyType {
    // TODO add more
    UNKNOWN("Unknown"), COUPE("Coupe"), SEDAN("Sedan"), SUV("SUV"), PICKUP("Pickup"), CROSSOVER("Crossover"), MINIVAN(
            "Minivan"), ROADSTER("Roadster");

    private String value;

    BodyType(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public static BodyType fromValue(String value) {
        for (BodyType type : values()) {
            if (type.value.equalsIgnoreCase(value)) {
                return type;
            }
        }
        return UNKNOWN;
    }
}
