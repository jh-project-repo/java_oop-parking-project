package view;

import java.util.Scanner;

public class InputView {
    private final static Scanner SCANNER = new Scanner(System.in);

    public static int inputMenu() {
        OutputView.initView(); // 얘는 이쪽에 있는게 좋을까.. main 함수에 바로 넣는게 좋을까..?
        int menu = SCANNER.nextInt();
        SCANNER.nextLine(); // 개행처리를 위해 사용
        validInputMenu(menu);
        return menu;
    }

    // return이 boolean형인 함수 ? void형인 예외처리 ? 어떤게 더 좋을까...?, 네이밍은 적정한가..?
    private static void validInputMenu(final int input) {
        if (input > 5 || input < 1) {
            throw new IllegalArgumentException("메뉴 번호의 범위가 잘못 되었습니다.");
        }
    }

    public static String inputCarAndCapacity() {
        String carAndCapacity = SCANNER.nextLine();
        validInputCarAndCapacity(carAndCapacity);
        return carAndCapacity;
    }

    // 예외 처리는 프로그램 종료 처리하는게 좋은지... 아니면 다시 입력받도록 하는게 좋은지... 개발자 마음..? 요구사항 마음..?
    private static void validInputCarAndCapacity(final String carAndCapacity) {
        if (carAndCapacity.split(" ").length != 2) {
            throw new IllegalStateException("차랑 종류 및 용량 입력이 잘못 되었습니다.");
        }
    }

    public static String vehicleType(final String carAndCapacity) {
        String[] vehicle = carAndCapacity.split(" ");
        return vehicle[0];
    }

    public static int vehicleCapacity(final String carAndCapacity) {
        String[] vehicle = carAndCapacity.split(" ");
        return Integer.parseInt(vehicle[1]);
    }

    public static int inputCarNumber() {
        OutputView.printCarNumber();
        return Integer.parseInt(SCANNER.nextLine()); // 개행처리를 위해 nextLine() 메서드 사용
    }

    public static String inputEntranceTime() {
        OutputView.printEntranceTime();
        return SCANNER.nextLine();
    }

    public static int inputExitCarNumber() {
        OutputView.printExitCarNumber();
        return Integer.parseInt(SCANNER.nextLine());
    }

    public static String inputExitTime() {
        OutputView.printExitTime();
        return SCANNER.nextLine();
    }

}

