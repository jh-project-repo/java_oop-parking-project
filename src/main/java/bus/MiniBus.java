package bus;

public class MiniBus extends Bus {

    public int getPrice(int hour, int minute) {
        int price = 2000; // 최초 1시간 요금
        int allMinutes = (hour * 60) + minute - 60; // 최초 1시간 제외한 총 시간(분)

        if (isPositiveNumber(allMinutes)) {
            price += ((allMinutes - 1) / 30 + 1) * 1000;
        }

        return price;
    }

    private static boolean isPositiveNumber(int minutes) {
        return minutes > 0;
    }

}
