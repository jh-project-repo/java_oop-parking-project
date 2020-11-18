import view.InputView;
import view.OutputView;

public class Main {
    public static void main(String[] args) {
        while (true) {
            int menu = InputView.inputMenu();
            if (menu == 1) {

                OutputView.printCarAndCapacity();

            } else if (menu == 2) {

            } else if (menu == 3) {

            } else if (menu == 4) {

            } else if (menu == 5) {
                break;
            }
        }
    }
}
