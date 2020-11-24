package car;

public class ElectricCar extends Car {

    private int battery;

    public int getBattery() {
        return battery;
    }

    public void setBattery(int battery) {
        this.battery = battery;
    }

    public ElectricCar() {
    }

    public ElectricCar(int carNumber, String entranceTime, int battery) {
        super(CarType.ELECTRIC_CAR, carNumber, entranceTime);
        this.battery = battery;
    }

    public int getChargePrice() {
        return 0;
    }
}
