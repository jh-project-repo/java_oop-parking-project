import bus.Bus;
import car.Car;
import parking.Parking;
import truck.Truck;
import util.DateUtils;
import vehicle.Vehicles;
import view.InputView;
import view.OutputView;

public class Main {
    private static final int PARKING_COUNT = 10;

    public static void main(String[] args) {
        Parking parking = new Parking(PARKING_COUNT);
        int allIncome = 0;
        int parkingCount = 0;

        while (true) {
            OutputView.print();
            OutputView.printParkingCountStatus(parkingCount, parking.getVehicleCount());
            OutputView.print();
            int menu = InputView.inputMenu();

            if (menu == 1) { // 입차
                if (parking.isFullParking(parkingCount)) {
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
                    Vehicles car = Car.getCar(vehicleCapacity, vehicleNumber, entranceTime);
                    parking.add(car);
                } else if ("t".equals(carType)) {
                    Vehicles truck = Truck.getTurck(vehicleCapacity, vehicleNumber, entranceTime);
                    parking.add(truck);
                } else if ("b".equals(carType)) {
                    Vehicles bus = Bus.getBus(vehicleCapacity, vehicleNumber, entranceTime);
                    parking.add(bus);
                }
                parkingCount ++;

            } else if (menu == 2) { // 출차
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

            } else if (menu == 3) { // 주차 차량 보기
                if (parking.isEmpty()) {
                    OutputView.printEmptyParking();
                    continue;
                }
                OutputView.printParkingList(parking.getVehicles());

            } else if (menu == 4) {
                OutputView.printAllIncome(allIncome);
            } else if (menu == 5) {
                break;
            }
        }
    }
}
