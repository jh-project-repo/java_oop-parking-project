package bus;

/**
 * 이 클래스도 마찬가지로 분리한게 필요한지 ... 의문 --> TruckPrice 클래스 주석 참고
 */
public class BusPrice {

    public static int getPrice(BusType busType, final int hour, final int minute) {
        int defaultPrice = busType.getDefaultPrice();
        int halfHourlyPrice = busType.getHalfHourlyPrice();
        System.out.println("defaultPrice: " + defaultPrice);
        System.out.println("halfHourlyPrice: " + halfHourlyPrice);
        return getPrice(hour, minute, defaultPrice, halfHourlyPrice);

        // 딱히 switch로 안나누고 바로 getPrice 함수 호출해도 될듯..? 왜냐면 인자로 BusType를 받으니까?
//        switch (busType) {
//            case LARGE_BUS:
//                price = getPrice(hour, minute, defaultPrice, halfHourlyPrice);
//                break;
//            case MEDIUM_BUS:
//                price = getPrice(hour, minute, defaultPrice, halfHourlyPrice);
//                break;
//            case MINI_BUS:
//                price = getPrice(hour, minute, defaultPrice, halfHourlyPrice);
//                break;
//            default:
//                throw new IllegalStateException(busType + "에 해당하는 버스 종류가 없습니다.");
//        }

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
