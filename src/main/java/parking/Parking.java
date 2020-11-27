package parking;

import vehicle.Vehicles;

import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("JavaDoc")
public class Parking {

    private int vehicleCount;
    private List<Vehicles> vehicles;

    public int getVehicleCount() {
        return vehicleCount;
    }

    public void setVehicleCount(int vehicleCount) {
        this.vehicleCount = vehicleCount;
    }

    public List<Vehicles> getVehicles() {
        return vehicles;
    }

    public Parking() {
    }

    public Parking(int vehicleCount) {
        this.vehicleCount = vehicleCount;
        vehicles = new ArrayList<>(vehicleCount);
    }


    /**
     * Returns true if this list contains no elements
     * @return
     */
    public boolean isEmpty() {
        return vehicles.size() == 0;
    }


    /**
     * Returns true if this list contains the specified element
     * @param vehicleNumber : 차량 번호
     * @return
     */
    public boolean contains(final int vehicleNumber) {
        for (Vehicles v : vehicles) {
            if (v.getVehicleNumber() == vehicleNumber) {
                return true;
            }
        }
        return false;
    }


    /**
     * Appends the specified element to the end of this list
     * @param vehicle : 차량
     */
    public void add(final Vehicles vehicle) {
        vehicles.add(vehicle);
    }


    /**
     * Returns the element at the specified position in this list
     * @param vehicleNumber : 차량 번호
     * @return
     */
    public Vehicles get(final int vehicleNumber) {
        return vehicles.get(indexOf(vehicleNumber));
    }

    /**
     * Returns the index of the first occurrence of the specified element
     * in this list, or -1 if this list does not contain the element.
     * @param vehicleNumber : 차량 번호
     * @return
     */
    public int indexOf(final int vehicleNumber) {
        int index = -1;

        for (int i = 0; i < vehicles.size(); i++) {
            if (vehicles.get(i).getVehicleNumber() == vehicleNumber) {
                return i;
            }
        }
        return index;
    }


    /**
     * Return true, Removes the first occurrence of the specified element from this list,
     * if it is present. If this list does not contain the element, Returns false;
     * @param vehicleNumber : 차량 번호
     */
    public boolean remove(final int vehicleNumber) {
        if (contains(vehicleNumber)) {
            vehicles.remove(indexOf(vehicleNumber));
            return true;
        }
        return false;
    }

    /**
     * 주차장의 차량 공간과 입차한 차량 공간이 같을경우 true
     * @param parkingCount - 입차한 차량 대수
     * @return
     */
    public boolean isFullParking(final int parkingCount) {
        return vehicleCount == parkingCount;
    }

}
