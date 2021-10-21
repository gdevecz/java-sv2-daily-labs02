package day04;

public class CarMain {

    public static void main(String[] args) {
        Car car = new Car();
        car.setLiter(5);
        car.setDistanceInKm(15);

        System.out.println(car.averageLiterPerHundredKm());

        GasStation gasStation = new GasStation(505.4);
        System.out.println(gasStation.refueling(car, 40) + " Ft");

        System.out.println(car.averageLiterPerHundredKm());
    }
}
