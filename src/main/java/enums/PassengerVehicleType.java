package enums;

public enum PassengerVehicleType {
    SEDAN("Sedan"),
    STATION_WAGON("Station Wagon"),
    COUPE("Coupe"),
    ROADSTER("Roadster"),
    SELF_PROPELLED_CARAVAN("Self-propelled caravan"),
    BUS_OR_VAN_SEATING_UP_TO_NINE("Bus or van seating up to 9"),
    BUS_OR_VAN_SEATING_TEN_OR_MORE("Bus or van seating 10 or more");

    private String value;

    PassengerVehicleType(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
