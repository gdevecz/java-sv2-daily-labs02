package day04;

public class CarMain {

    public static void main(String[] args) {
        Car car = new Car();
        car.setAmountOfFuel(40);
        car.setKm(635);

        System.out.println(car.calculateConpsumption());

        GasStation gasStation = new GasStation(505.4);
        System.out.println(gasStation.tankCar(car, 40) + " Ft");

        System.out.println(car.calculateConpsumption());
    }
}
