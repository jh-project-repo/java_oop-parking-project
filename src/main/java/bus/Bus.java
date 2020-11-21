package bus;

import vehicle.Vehicle;

public class Bus implements Vehicle {

    private BusType busType;
    private int busNumber;
    private int entranceTime;
    private int exitTime;

    public BusType getBusType() {
        return busType;
    }

    public void setBusType(BusType busType) {
        this.busType = busType;
    }

    public int getBusNumber() {
        return busNumber;
    }

    public void setBusNumber(int busNumber) {
        this.busNumber = busNumber;
    }

    public int getEntranceTime() {
        return entranceTime;
    }

    public void setEntranceTime(int entranceTime) {
        this.entranceTime = entranceTime;
    }

    public int getExitTime() {
        return exitTime;
    }

    public void setExitTime(int exitTime) {
        this.exitTime = exitTime;
    }

    public Bus() {
    }

    public Bus(BusType busType, int busNumber) {
        this.busType = busType;
        this.busNumber = busNumber;
    }

    public int getPrice(int hour, int minute) {
        return getPrice(busType, hour, minute);
    }

    private int getPrice(BusType busType, int hour, int minute) {
        int price = 0;

        switch (busType) {
            case LARGEBUS:
                Bus largeBus = new LargeBus();
                price = largeBus.getPrice(hour, minute);
                break;
            case MEDIUMBUS:
                Bus mediumBus = new MediumBus();
                price = mediumBus.getPrice(hour, minute);
                break;
            case MINIBUS:
                Bus miniBus = new MiniBus();
                price = miniBus.getPrice(hour, minute);
                break;
        }

        return price;
    }


}
