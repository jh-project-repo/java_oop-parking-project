package car;

import vehicle.Vehicle;

public class Car implements Vehicle {

    private int carNumber;
    private int carType;
    private int entranceTime;
    private int exitTime;

    public int getCarNumber() {
        return carNumber;
    }

    public void setCarNumber(int carNumber) {
        this.carNumber = carNumber;
    }

    public int getCarType() {
        return carType;
    }

    public void setCarType(int carType) {
        this.carType = carType;
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

    // Implement interface
    public int getPrice(int hour, int minute) {
        int price = 2000;   // 최초 30분 요금
        int allMinutes = (hour * 60) + minute - 30; // 최초 30분 제외한 총 시간(분)

        if (isPositiveNumber(allMinutes)) {
            price += (allMinutes / 10 + 1) * 1000;
        }

        return price;
    }

    public int getPrice(CarType carType, int hour, int minute) {
        int price = 0;
        switch (carType) {
            case GENERALCAR:
                System.out.println("일반 승용차");
                break;
            case ELECTRICCAR:
                System.out.println("전기차");
                break;
        }
        return 0;
    }

    private boolean isPositiveNumber(int minutes) {
        return minutes > 0;
    }
}
