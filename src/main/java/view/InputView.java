package view;

import java.util.Scanner;

public class InputView {
    private final static Scanner SCANNER = new Scanner(System.in);

    public static int inputMenu() {
        OutputView.initView(); // 얘는 이쪽에 있는게 좋을까.. main 함수에 바로 넣는게 좋을까..?
        int menu = SCANNER.nextInt();
        validMenuInput(menu);
        return menu;
    }

    // return이 boolean형인 함수 ? void형인 예외처리 ? 어떤게 더 좋을까...?, 네이밍은 적정한가..?
    private static void validMenuInput(int input) {
        if (input > 5 || input < 1) {
            throw new IllegalArgumentException("메뉴 번호의 범위가 잘못 되었습니다.");
        }
    }

    public static String inputCarAndCapacity() {
        return SCANNER.nextLine();
    }

    public static String vehicleType() {
        String[] vehicle = inputCarAndCapacity().split(" ");
        return vehicle[0];
    }

    public static int vehicleSize() {
        String[] vehicle = inputCarAndCapacity().split(" ");
        return Integer.parseInt(vehicle[1]);
    }

    public static int inputCarNumber() {
        OutputView.printCarNumber();
        return SCANNER.nextInt();
    }

    public static int inputEntranceTime() {
        OutputView.printEntranceTime();
        return SCANNER.nextInt();
    }


}

