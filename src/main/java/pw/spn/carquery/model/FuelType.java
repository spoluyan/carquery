package pw.spn.carquery.model;

public enum FuelType {
    BIOFUEL("Biofuel"), DIESEL("Diesel"), DIESEL_ELECTRIC_HYBRID("Diesel / Electric Hybrid"), ELECTRIC("Electric"), FLEX_FUEL(
            "Flex Fuel"), FLEX_FUEL_PREMIUM_UNLEADED_RECOMMENDED("Flex-Fuel (Premium Unleaded Reco"), FLEX_FUEL_PREMIUM_UNLEADED_E85(
            "Flex-Fuel (Premium Unleaded/E85)"), FLEX_FUEL_UNLEADED_E85("Flex-Fuel (Unleaded/E85)"), FLEXFUEL(
            "FlexFuel"), GASOLINE("Gasoline"), GASOLINE_PREMIUM("Gasoline - Premium"), GASOLINE_ELECTRIC_HYBRID(
            "Gasoline / Electric Hybrid"), LPG("LPG"), NATURAL_GAS("Natural Gas (CNG)"), NOT_AVAILABLE("Not Available"), PREMIUM(
            "Premium"), PREMIUM_UNLEADED_RECOMMENDED("Premium Unleaded (Recommended)"), PREMIUM_UNLEADED_REQUIRED(
            "Premium Unleaded (Required)"), REGULAR_UNLEADED("Regular Unleaded");

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
        return NOT_AVAILABLE;
    }
}
