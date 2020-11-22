package parking;

import vehicle.Vehicle;

import java.util.List;

public class Parking {

    private int vehicleCount;
    private List<Vehicle> vehicles;


    public int getVehicleCount() {
        return vehicleCount;
    }

    public void setVehicleCount(int vehicleCount) {
        this.vehicleCount = vehicleCount;
    }

    public List<Vehicle> getVehicles() {
        return vehicles;
    }

    public void setVehicles(List<Vehicle> vehicles) {
        this.vehicles = vehicles;
    }

    public Parking() {
    }

    public Parking(int vehicleCount) {
        this.vehicleCount = vehicleCount;
    }

}
