package truck;

import util.DateUtils;
import vehicle.Vehicles;

public class Truck extends Vehicles {

    private TruckType truckType;

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

    public Truck() {
    }

    public Truck(TruckType truckType, int vehicleNumber, String entranceTime) {
        this.truckType = truckType;
        this.vehicleNumber = vehicleNumber;
        this.entranceTime = entranceTime;
    }

    public static Truck getTurck(final int vehicleCapacity, final int vehicleNumber, final String entranceTime) {
        return new Truck(getTruckType(vehicleCapacity), vehicleNumber, entranceTime);
    }

    private static TruckType getTruckType(final int vehicleCapacity) {
        if (vehicleCapacity >= 10) {
            return TruckType.LARGE_TRUCK;
        } else if (vehicleCapacity >= 5) {
            return TruckType.MEDIUM_TRUCK;
        }
        return TruckType.MINI_TRUCK;
    }

    @Override
    public int getPrice(final int hour, final int minute) {
        return TruckPrice.getPrice(truckType, hour, minute);
    }

    @Override
    public String toString() {
        return "트럭 " + vehicleNumber + " " + DateUtils.getDateFormat(entranceTime);
    }
}
