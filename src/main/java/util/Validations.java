package util;

public class Validations {

    /**
     * return이 boolean형인 함수 ? void형인 함수 ? 어떤게 더 좋을까...?, 네이밍은 적정한가..?
     * 메뉴 유효성 검사
     * @param input - 메뉴 번호
     */
    public static void validInputMenu(final int input) {
        if (input > 5 || input < 1) {
            throw new IllegalArgumentException("메뉴 번호의 범위가 잘못 되었습니다.");
        }
    }

    /**
     * 예외 처리는 프로그램 종료 처리하는게 좋은지... 아니면 다시 입력받도록 하는게 좋은지...
     * 차량 종류 및 용량 입력 유효성 검사(공백을 기준으로 입력)
     * @param carAndCapacity - 차량 종류 + 용량 입력
     */
    public static void validInputCarAndCapacity(final String carAndCapacity) {
        if (carAndCapacity.split(" ").length != 2) {
            throw new IllegalStateException("차랑 종류 및 용량 입력이 잘못 되었습니다.");
        }
    }

    /**
     * 차량 용량 OR 승객 수 유효성 검사
     * @param capacity - 용량 OR 승객 수
     */
    public static void validInputCapacity(final int capacity) {
        if (capacity < 0) {
            throw new IllegalStateException("차랑 용량 및 승객수 입력이 잘못 되었습니다.");
        }
    }

    /**
     * 차량번호 유효성 검사(4자리 ... 문자열로 파싱 후 비교)
     * @param vehicleNumber - 차량 번호
     * @return
     */
    public static boolean validInputVehicleNumber(final int vehicleNumber) {
        return String.valueOf(vehicleNumber).length() == 4;
    }

}
