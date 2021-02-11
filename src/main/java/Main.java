import bus.Bus;
import car.Car;
import parking.Parking;
import truck.Truck;
import util.DateUtils;
import util.Menu;
import vehicle.Vehicles;
import view.InputView;
import view.OutputView;

public class Main {

    public static void main(String[] args) {
        Parking parking = new Parking();

        int allIncome = 0;
        int parkingCount = 0;

        while (true) {
            OutputView.print();
            OutputView.printParkingCountStatus(parkingCount);
            OutputView.print();
            int menu = InputView.inputMenu();

            if (menu == Menu.INPUT_CAR) { // 입차
                if (parking.isFull()) {
                    OutputView.printFullParking(parkingCount);
                    continue;
                }

                OutputView.printCarAndCapacity();
                String carAndCapacity = InputView.inputCarAndCapacity();
                String carType = InputView.vehicleType(carAndCapacity);
                int vehicleCapacity = InputView.vehicleCapacity(carAndCapacity);
                int vehicleNumber = InputView.inputVehicleNumber();
                String entranceTime = InputView.inputEntranceTime();

                if ("c".equals(carType)) {
                    Vehicles car = Car.of(vehicleCapacity, vehicleNumber, entranceTime);
                    parking.add(car);
                } else if ("t".equals(carType)) {
                    Vehicles truck = Truck.of(vehicleCapacity, vehicleNumber, entranceTime);
                    parking.add(truck);
                } else if ("b".equals(carType)) {
                    Vehicles bus = Bus.of(vehicleCapacity, vehicleNumber, entranceTime);
                    parking.add(bus);
                }
                parkingCount ++;

            } else if (menu == Menu.EXIT_CAR) { // 출차
                if (parking.isEmpty()) {
                    OutputView.printEmptyParking();
                    continue;
                }

                int vehicleNumber = InputView.inputExitCarNumber();

                if (!parking.contains(vehicleNumber)) {
                    OutputView.printHasNotVehicle(vehicleNumber);
                    continue;
                }
                String exitTime = InputView.inputExitTime();

                Vehicles vehicles = parking.get(vehicleNumber);
                int hour = DateUtils.getDiffHours(vehicles.getEntranceTime(), exitTime);
                int minute = DateUtils.getDiffMinutes(vehicles.getEntranceTime(), exitTime);
                OutputView.printParkingTime(hour, minute);

                int parkingRate = vehicles.getPrice(hour, minute);
                OutputView.printParkingRate(parkingRate);
                allIncome += parkingRate;
                parkingCount --;

                if (parking.remove(vehicleNumber)) {
                    OutputView.printExitVehicle(vehicleNumber);
                }

            } else if (menu == Menu.PRINT_PARKING_CAR) {
                if (parking.isEmpty()) {
                    OutputView.printEmptyParking();
                    continue;
                }
                OutputView.printParkingList(parking.getVehicles());

            } else if (menu == Menu.PRINT_ALL_INCOME) {
                OutputView.printAllIncome(allIncome);

            } else if (menu == Menu.EXIT) {
                break;
            }
        }
    }
}
