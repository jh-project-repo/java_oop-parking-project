package car;

public enum CarType {

    ELECTRIC_CAR("승용차"),
    GENERAL_CAR("전기차");

    private final String car;

    CarType(final String car) {
        this.car = car;
    }

    public String getCar() {
        return car;
    }
}
