package bus;

import util.DateUtils;
import vehicle.Vehicles;

import static com.google.common.base.Preconditions.checkArgument;
import static com.google.common.base.Preconditions.checkNotNull;

public class Bus extends Vehicles {

    private BusType busType;

    @Override
    public int getVehicleNumber() {
        return vehicleNumber;
    }

    @Override
    public String getEntranceTime() {
        return entranceTime;
    }

    private Bus() {}

    public Bus(BusType busType, int vehicleNumber, String entranceTime) {
        checkNotNull(busType, "busType must not null");
        checkArgument(vehicleNumber >= 0, "vehicleNumber must be greater than zero");
        checkArgument(
                entranceTime.length() == 12,
                "entraceTime length must be 12 - yyyyMMddHHmm"
                );

        this.busType = busType;
        this.vehicleNumber = vehicleNumber;
        this.entranceTime = entranceTime;
    }

    public static Bus of(final int vehicleCapacity, final int vehicleNumber, final String entranceTime) {
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
