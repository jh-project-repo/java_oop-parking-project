package truck;

public enum TruckType {

    LARGE_TRUCK(4000, "대형트럭"),
    MEDIUM_TRUCK(3000, "중형트럭"),
    MINI_TRUCK(2000, "소형트럭");

    private final int hourlyPrice;
    private final String truck;

    TruckType(int price, String truck) {
        this.hourlyPrice = price;
        this.truck = truck;
    }

    public int getHourlyPrice() {
        return hourlyPrice;
    }

    public String getTruck() {
        return truck;
    }

}
