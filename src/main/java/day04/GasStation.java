package day04;

public class GasStation {

    private double price;

    public GasStation(double price) {
        this.price = price;
    }

    public double tankCar(Car car, int liter){
        car.setAmountOfFuel(liter);
//      A megtehető távolság beállítása
        car.setKm(liter * car.calculateConpsumption());
        return liter * price;
    }
}
