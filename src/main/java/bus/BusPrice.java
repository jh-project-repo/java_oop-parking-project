package bus;

/**
 * 이 클래스도 마찬가지로 분리한게 필요한지 ... 의문 --> TruckPrice 클래스 주석 참고
 */
public class BusPrice {

    public static int getPrice(BusType busType, final int hour, final int minute) {
        int defaultPrice = busType.getDefaultPrice();
        int halfHourlyPrice = busType.getHalfHourlyPrice();
        return getPrice(hour, minute, defaultPrice, halfHourlyPrice);
    }

    private static int getPrice(final int hour, final int minute, final int defaultPrice, final int halfHourlyPrice) {
        int price = defaultPrice;   // 최초 1시간 요금
        int allMinutes = (hour * 60) + minute - 60;

        if (isPositiveNumber(allMinutes)) {
            price += ((allMinutes - 1) / 30 + 1) * halfHourlyPrice;
        }
        return price;
    }

    private static boolean isPositiveNumber(final int minutes) {
        return minutes > 0;
    }
}
