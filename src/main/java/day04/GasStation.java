package day04;

public class GasStation {

    private double costOfFuel;

    public GasStation(double costOfFuel) {
        this.costOfFuel = costOfFuel;
    }

    public double refueling(Car car, int liter){
        car.setLiter(liter);
        car.setDistanceInKm(liter * car.averageLiterPerHundredKm());
        return liter * costOfFuel;
    }
}
