package view;

import vehicle.Vehicles;

import java.util.List;

/**
 * 각 print별로 다 분리했는데... 이게 좋은 방법인감..?
 * System.out.println() 출력하는 부분은 무조건 이 클래스로 넣자.
 */
public class OutputView {

    public static void initView(){
        System.out.println();
        System.out.println("원하는 기능을 선택하세요!");
        System.out.println("1. 입차");
        System.out.println("2. 출차");
        System.out.println("3. 주차차량 확인");
        System.out.println("4. 총 수입 확인");
        System.out.println("5. 종료");
    }

    public static void print() {
        System.out.println("============================");
    }
    public static void printCarAndCapacity() {
        System.out.println("차량 종류 및 용량을 입력하세요! 승용차(c), 트럭(t), 버스(b)");
    }

    public static void printCarNumber() {
        System.out.println("차량 번호를 입력하세요! (4자리 숫자)");
    }

    public static void printEntranceTime() {
        System.out.println("입차시간을 입력하세요! (연,월,일,시,분)");
    }

    public static void printExitCarNumber() {
        System.out.println("출차할 차량번호를 입력하세요!");
    }

    public static void printExitTime() {
        System.out.println("출차시간을 입력하세요!");
    }

    public static void printEmptyParking() {
        System.out.println("주차장에 차량이 존재하지 않습니다.");
    }

    public static void printHasNotVehicle(int vehicleNumber) {
        System.out.println(vehicleNumber + " 번호의 차량이 존재하지 않습니다.");
    }

    public static void printParkingTime(final int hour, final int minute) {
        System.out.println("주차시간은 " + hour + "시간 " + minute + "분 입니다.");
    }

    public static void printParkingRate(final int price) {
        System.out.println("주차요금은 + " + price + "원 입니다.");
    }

    public static void printAllIncome(final int price) {
        System.out.println("총 수입은: " + price + "원 입니다.");
    }

    public static void printParkingCountStatus(final int parkingCount, final int vehicleCount) {
        System.out.println("현재 주차장의 잔여 좌석: (" + parkingCount + " / " + vehicleCount + ")");
    }
    public static void printFullParking(final int vehicleCount) {
        System.out.println("현재 주차장에 " + vehicleCount + "대의 차량이 가득 찼습니다.");
    }

    public static void printExitVehicle(final int vehicleNumber) {
        System.out.println(vehicleNumber + "번호의 차량이 출차되었습니다.");
    }

    public static void printParkingList(final List<Vehicles> vehiclesList) {
        for (Vehicles vehicles : vehiclesList) {
            System.out.println(vehicles.toString());
        }
    }
}
