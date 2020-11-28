package car;

import util.DateUtils;
import vehicle.Vehicles;

public class Car extends Vehicles {

    private CarType carType;
    private int vehicleCapacity;

    public CarType getCarType() {
        return carType;
    }

    public int getVehicleCapacity() {
        return vehicleCapacity;
    }

    public void setVehicleCapacity(int vehicleCapacity) {
        this.vehicleCapacity = vehicleCapacity;
    }

    public void setCarType(CarType carType) {
        this.carType = carType;
    }

    @Override
    public int getVehicleNumber() {
        return vehicleNumber;
    }

    @Override
    public void setVehicleNumber(int vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }

    public String getEntranceTime() {
        return entranceTime;
    }

    public void setEntranceTime(String entranceTime) {
        this.entranceTime = entranceTime;
    }

    public Car() {
    }

    public Car(CarType carType, int vehicleNumber, String entranceTime) {
        this.carType = carType;
        this.vehicleNumber = vehicleNumber;
        this.entranceTime = entranceTime;
    }
//
//    public Car(CarType carType, int vehicleCapacity, int vehicleNumber, int entranceTime) {
//        this.carType = getCarType(vehicleCapacity);
//        this.vehicleCapacity = vehicleCapacity;
//        this.vehicleNumber = vehicleNumber;
//        this.entranceTime = entranceTime;
//    }
//
//    private CarType getCarType(int vehicleCapacity) {
//        if (isPositiveCapacity(vehicleCapacity)) {
//            return CarType.ELECTRIC_CAR;
//        }
//        return CarType.GENERAL_CAR;
//    }

    public static Car getCar(final int carCapacity, final int vehicleNumber, final String entranceTime) {
        if (isPositiveCapacity(carCapacity)) {
            return new ElectricCar(vehicleNumber, entranceTime, carCapacity);
        }
        return new GeneralCar(vehicleNumber, entranceTime);
    }

    private static boolean isPositiveCapacity(final int carCapacity) {
        return carCapacity > 0;
    }


    @Override
    public int getPrice(final int hour, final int minute) {
        return getPrice(carType, hour, minute);
    }

    public int getPrice(CarType carType, final int hour, final int minute) {
        int price = defaultCarPrice(hour, minute);
        switch (carType) {
            case GENERAL_CAR:
                System.out.println("일반 승용차");
                break;
            case ELECTRIC_CAR:
                System.out.println("전기 승용차");
                ElectricCar electricCar = new ElectricCar();
                price += electricCar.getChargePrice();
                break;
        }
        return price;
    }

    private boolean isPositiveNumber(final int minutes) {
        return minutes > 0;
    }

    private int defaultCarPrice(final int hour, final int minute) {
        int price = 2000;   // 최초 30분 요금
        int allMinutes = (hour * 60) + minute - 30; // 최초 30분 제외한 총 시간(분)

        // 1분 ~ 10분의 경우 추가요금이 붙기에 -1을 통해 0분~9분으로 만들어서 계산함.
        if (isPositiveNumber(allMinutes)) {
            price += ((allMinutes - 1) / 10 + 1) * 1000;
        }
        return price;
    }

    @Override
    public String toString() {
        return "승용차 " + vehicleNumber + " " + DateUtils.getDateFormat(entranceTime);
    }
}
