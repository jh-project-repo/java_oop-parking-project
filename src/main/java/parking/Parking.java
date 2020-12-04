package parking;

import util.Const;
import vehicle.Vehicles;

import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("JavaDoc")
public class Parking {

    private final List<Vehicles> vehicles;

    public List<Vehicles> getVehicles() {
        return vehicles;
    }

    public Parking() {
        vehicles = new ArrayList<>(Const.PARKING_COUNT);
    }


    /**
     * Returns the number of elements in this list.
     * @return
     */
    public int size() {
        return vehicles.size();
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
     * As-Is) 주차장의 차량 공간과 입차한 차량 공간이 같을경우 true
     * To-Be) 주차장이 자리가 없는지 여부 판단
     *  ==> 코드 리뷰부분, 주차장의 공간이 없는지는 단지 공간이 가득 찼는지만 파악하면 됨.
     *  ==> 딱히 입차한 차량 공간과 판단할 필요가 없음.
     *  ==> 클라이언트 입장에서는 주차장 공간이 있는지 없는지만 필요함.
     * @return
     */
    public boolean isFull() {
        return size() == Const.PARKING_COUNT;  // 코드리뷰 부분
    }

}
