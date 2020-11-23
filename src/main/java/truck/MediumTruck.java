package truck;

public class MediumTruck extends Truck {

    @Override
    public int getPrice(final int hour, final int minute) {
        int price = 0;
        price += hour * 3000;

        if (isPositiveNumber(minute)) {
            price += 3000;
        }

        return price;
    }

    private static boolean isPositiveNumber(final int minutes) {
        return minutes > 0;
    }
}
