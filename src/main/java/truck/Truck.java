package truck;

import util.DateUtils;
import vehicle.Vehicles;

import static com.google.common.base.Preconditions.checkArgument;
import static com.google.common.base.Preconditions.checkNotNull;

public class Truck extends Vehicles {

    private TruckType truckType;

    @Override
    public int getVehicleNumber() {
        return vehicleNumber;
    }

    @Override
    public String getEntranceTime() {
        return entranceTime;
    }

    private Truck() {
    }

    public Truck(TruckType truckType, int vehicleNumber, String entranceTime) {
        checkNotNull(truckType, "busType must not null");
        checkArgument(vehicleNumber >= 0, "vehicleNumber must be greater than zero");
        checkArgument(
                entranceTime.length() == 12,
                "entraceTime length must be 12 - yyyyMMddHHmm"
        );

        this.truckType = truckType;
        this.vehicleNumber = vehicleNumber;
        this.entranceTime = entranceTime;
    }

    public static Truck of(final int vehicleCapacity, final int vehicleNumber, final String entranceTime) {
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
