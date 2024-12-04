package enums;

public enum CarryingCapacity {
    TWO_TONNES_OR_LESS("2 tonnes or less"),
    MORE_THAN_TWO_TONNES("More than 2 tonnes");

    private String value;

    CarryingCapacity(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
