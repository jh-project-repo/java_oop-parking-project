package bus;

public enum BusType {

    LARGE_BUS(5000, 3000),
    MEDIUM_BUS(3000, 2000),
    MINI_BUS(2000, 1000);

    private final int defaultPrice;
    private final int halfHourlyPrice;

    private BusType(int defaultPrice, int halfHourlyPrice) {
        this.defaultPrice = defaultPrice;
        this.halfHourlyPrice = halfHourlyPrice;
    }

    public int getDefaultPrice() {
        return defaultPrice;
    }

    public int getHalfHourlyPrice() {
        return halfHourlyPrice;
    }

}
