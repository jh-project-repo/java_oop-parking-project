package view;

/**
 * 각 print별로 다 분리했는데... 이게 좋은 방법인감..?
 */
public class OutputView {

    public static void initView(){
        System.out.println("원하는 기능을 선택하세요!");
        System.out.println("1. 입차");
        System.out.println("2. 출차");
        System.out.println("3. 주차차량 확인");
        System.out.println("4. 총 수입 확인");
        System.out.println("5. 종료");
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

    public static void printParkingTime(final int hour, final int minute) {
        System.out.println("주차시간은 " + hour + "시간 " + minute + "분 입니다.");
    }

    public static void printParkingRate(final int price) {
        System.out.println("주차요금은 + " + price + "원 입니다.");
    }

    public static void printAllPrice(final int price) {
        System.out.println("총 수입은: " + price + "원 입니다.");
    }
}
