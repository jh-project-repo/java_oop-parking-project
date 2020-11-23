package truck;

public enum TruckType {

    LARGE_TRUCK(4000),
    MEDIUM_TRUCK(3000),
    MINI_TRUCK(2000);

    private final int hourlyPrice;

    private TruckType(int price) {
        this.hourlyPrice = price;
    }

    public int getHourlyPrice() {
        return hourlyPrice;
    }

}
