package bus;

import util.DateUtils;
import vehicle.Vehicles;

public class Bus extends Vehicles {

    private BusType busType;

    @Override
    public int getVehicleNumber() {
        return vehicleNumber;
    }

    @Override
    public void setVehicleNumber(int vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }

    @Override
    public String getEntranceTime() {
        return entranceTime;
    }

    @Override
    public void setEntranceTime(String entranceTime) {
        this.entranceTime = entranceTime;
    }

    private Bus() {}

    public Bus(BusType busType, int vehicleNumber, String entranceTime) {
        this.busType = busType;
        this.vehicleNumber = vehicleNumber;
        this.entranceTime = entranceTime;
    }

    public static Bus getBus(final int vehicleCapacity, final int vehicleNumber, final String entranceTime) {
        return new Bus(getBusType(vehicleCapacity), vehicleNumber, entranceTime);
    }

    private static BusType getBusType(final int vehicleCapacity) {
        if (vehicleCapacity >= 40) {
            return BusType.LARGE_BUS;
        } else if (vehicleCapacity >= 20) {
            return BusType.MEDIUM_BUS;
        }
        return BusType.MINI_BUS;
    }

    @Override
    public int getPrice(final int hour, final int minute) {
        return BusPrice.getPrice(busType, hour, minute);
    }

    @Override
    public String toString() {
        return "버스 " + vehicleNumber + " " + DateUtils.getDateFormat(entranceTime);
    }
}
