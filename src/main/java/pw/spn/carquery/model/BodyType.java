package pw.spn.carquery.model;

public enum BodyType {
    CARGO_VAN("Cargo Vans"), COMPACT_CAR("Compact Cars"), CONVERTIBLE("Convertible"), COUPE("Coupe"), CROSSOVER(
            "Crossover"), HATCHBACK("Hatchback"), LARGE_CAR("Large Cars"), MIDSIZE_CAR("Midsize Cars"), MIDSIZE_STATION_WAGON(
            "Midsize Station Wagons"), MINI_COMPACT_CAR("Mini Compact Cars"), MINIVAN("Minivan"), NOT_AVAILABLE(
            "Not Available"), PANEL_VAN("Panel Van"), PASSENGER_VAN("Passenger Vans"), PICKUP("Pickup"), ROADSTER(
            "Roadster"), SEDAN("Sedan"), SMALL_PICKUP_TRUCK("Small Pickup Trucks"), SMALL_STATION_WAGON(
            "Small Station Wagons"), SPORT_UTILITY_VEHICLE("Sport Utility Vehicles"), STANDARD_PICKUP_TRUCK(
            "Standard Pickup Trucks"), STATION_WAGON("Station Wagon"), SUBCOMPACT_CAR("Subcompact Cars"), SUV("SUV"), TWO_SEATER(
            "Two Seaters"), VAN("Van");

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
        return NOT_AVAILABLE;
    }
}
