package bus;

public enum BusType {

    LARGE_BUS(5000, 3000, "대형버스"),
    MEDIUM_BUS(3000, 2000, "중형버스"),
    MINI_BUS(2000, 1000, "소형버스");

    private final int defaultPrice;
    private final int halfHourlyPrice;
    private final String bus;

    BusType(final int defaultPrice, final int halfHourlyPrice, final String bus) {
        this.defaultPrice = defaultPrice;
        this.halfHourlyPrice = halfHourlyPrice;
        this.bus = bus;
    }

    public int getDefaultPrice() {
        return defaultPrice;
    }

    public int getHalfHourlyPrice() {
        return halfHourlyPrice;
    }

    public String getBus() {
        return bus;
    }

}
