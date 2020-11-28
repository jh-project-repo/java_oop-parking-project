package view;

import util.Validations;

import java.util.Scanner;

public class InputView {
    private final static Scanner SCANNER = new Scanner(System.in);

    public static int inputMenu() {
        OutputView.initView(); // 얘는 이쪽에 있는게 좋을까.. main 함수에 바로 넣는게 좋을까..?
        int menu = SCANNER.nextInt();
        SCANNER.nextLine(); // 개행처리를 위해 사용
        Validations.validInputMenu(menu);
        return menu;
    }

    public static String inputCarAndCapacity() {
        String carAndCapacity = SCANNER.nextLine();
        Validations.validInputCarAndCapacity(carAndCapacity);
        return carAndCapacity;
    }

    public static String vehicleType(final String carAndCapacity) {
        String[] vehicle = carAndCapacity.split(" ");
        return vehicle[0];
    }

    public static int vehicleCapacity(final String carAndCapacity) {
        String[] vehicle = carAndCapacity.split(" ");
        int capacity = Integer.parseInt(vehicle[1]);
        Validations.validInputCapacity(capacity);
        return capacity;
    }

    /**
     * 차량 번호를 4자리 입력할 때 까지 무한반복을 통해 입력 -> 유효성 검사를 하는데...
     * 괜찮은건가...?
     * @return
     */
    public static int inputVehicleNumber() {
        while (true) {
            OutputView.printVehicleNumber();
            int vehicleNumber = Integer.parseInt(SCANNER.nextLine());
            if (!Validations.validInputVehicleNumber(vehicleNumber)) {
                OutputView.printNotValidVehicleNumber();
                continue;
            }
            return vehicleNumber;
        }
    }

    // 입차시간, 출차시간 유효성 검사에 로직이 중복인데... 어떻께 빼낼 수 있을까..?
    public static String inputEntranceTime() {
        while (true) {
            OutputView.printEntranceTime();
            String date = SCANNER.nextLine();
            if (!Validations.vaildInputEntranceTime(date, "yyyyMMddHHmm")) {
                OutputView.printNotValidEntranceTime();
                continue;
            }
            return date;
        }
    }

    public static int inputExitCarNumber() {
        OutputView.printExitVehicleNumber();
        return Integer.parseInt(SCANNER.nextLine());
    }

    public static String inputExitTime() {
        while (true) {
            OutputView.printExitTime();
            String date = SCANNER.nextLine();
            if (!Validations.vaildInputEntranceTime(date, "yyyyMMddHHmm")) {
                OutputView.printNotValidEntranceTime();
                continue;
            }
            return date;
        }
    }

}

