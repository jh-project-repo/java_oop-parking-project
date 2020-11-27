package truck;

/**
 * 기존에 트럭 종류별로 대형(Large) , 중형(Medium) , 소형(Mini)로 나뉘었는데,
 * 이렇게 나뉘게 되면 각 종류별로 주차 요금을 구하는 메서드 - getPrice() 를 중복으로 작성을 해야함...
 * getPrice() 메서드에서 다른 부분은 모두 동일하고, 시간당 요금만 종류별로 다르기 때문에 아래와 같이
 * TruckPrice 클래스를 만들어 중복을 제거했는데... 객체를 대형-중형-소형 으로 나누어서 추후 변동사항, 요구사항
 * 등의 확장성을 고려해 나누는게 맞는지... 중복을 제거하고 아래처럼 구현하는게 맞는지...... ??
 */
public class TruckPrice {

    public static int getPrice(TruckType truckType, final int hour, final int minute) {
        int hourlyPrice = truckType.getHourlyPrice();
        return getPrice(hour, minute, hourlyPrice);
    }

    private static int getPrice(final int hour, final int minute, final int hourlyPrice) {
        int price = 0;
        price += hour * hourlyPrice;

        if (isPositiveNumber(minute)) {
            price += hourlyPrice;
        }
        return price;
    }

    private static boolean isPositiveNumber(final int minutes) {
        return minutes > 0;
    }

}
