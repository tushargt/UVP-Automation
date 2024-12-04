package enums;

public enum EngineCapacity {
    LESS_THAN_SIXTY_ONE_CC("Less than 61 cc"),
    GREATER_THAN_SIXTY_CC_LESS_THAN_ONE_TWENTY_SIX_CC("Greater than 60cc but less than 126cc"),
    GREATER_THAN_ONE_TWENTY_FIVE_CC_LESS_THAN_FIVE_HUNDRED_ONE_CC("Greater than 125cc but less than 501cc"),
    GREATER_THAN_FIVE_HUNDRED_CC("Greater than 500cc");

    private String value;

    EngineCapacity(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
