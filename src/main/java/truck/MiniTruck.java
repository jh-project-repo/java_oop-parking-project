package truck;

public class MiniTruck extends Truck {

    @Override
    public int getPrice(final int hour, final int minute) {
        int price = 0;
        price += hour * 2000;

        if (isPositiveNumber(minute)) {
            price += 2000;
        }

        return price;
    }

    private static boolean isPositiveNumber(final int minutes) {
        return minutes > 0;
    }
}
