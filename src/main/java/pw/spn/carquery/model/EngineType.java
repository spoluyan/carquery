package pw.spn.carquery.model;

public enum EngineType {
    BOXER("boxer"), DUAL_DISK_ROTARY("dual-disc rotary"), ELECTRIC("electric"), FLAT("Flat"), IN_LINE("in-line"), INLINE(
            "Inline"), NOT_AVAILABLE("Not Available"), SINGLE("single"), V("V"), W("W");

    private String value;

    EngineType(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public static EngineType fromValue(String value) {
        for (EngineType type : values()) {
            if (type.value.equalsIgnoreCase(value)) {
                return type;
            }
        }
        return NOT_AVAILABLE;
    }
}
