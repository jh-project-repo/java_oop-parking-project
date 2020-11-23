package truck;

public class LargeTruck extends Truck {

    @Override
    public int getPrice(final int hour, final int minute) {
        int price = 0;
        price += hour * 4000;

        if (isPositiveNumber(minute)) {
            price += 4000;
        }

        return price;
    }

    private static boolean isPositiveNumber(final int minutes) {
        return minutes > 0;
    }
}
