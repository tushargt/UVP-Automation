package enums;

public enum VehicleType {
    PASSENGER_VEHICLE("Passenger vehicle"),
    GOODS_CARRYING_VEHICLE("Goods carrying vehicle"),
    PRIME_MOVER("Prime Mover"),
    MOTORCYCLE("Motorcycle"),
    TRAILER_CARAVAN("Trailer/Caravan");

    private String value;

    VehicleType(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
