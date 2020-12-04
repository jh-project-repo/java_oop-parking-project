package vehicle;

public abstract class Vehicles {

    protected int vehicleNumber;

    protected String entranceTime;

    // 처음 설계할때부터 주차요금을 구할 때, 시간 + 분 이 아닌 총 분으로 메서드를 만들면...
    // 매개변수도 1개로 감소되고 더 좋을듯...?
    public abstract int getPrice(int hour, int minute);

    public abstract int getVehicleNumber();

    public abstract void setVehicleNumber(int vehicleNumber);

    public abstract String getEntranceTime();

    public abstract void setEntranceTime(String entranceTime);

    public abstract String toString();

}
