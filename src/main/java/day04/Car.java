package day04;

public class Car {
    private int liter;
    private double distanceInKm;

    public void setLiter(int liter) {
        this.liter = liter;
    }

    public void setDistanceInKm(double distanceInKm) {
        this.distanceInKm = distanceInKm;
    }

    public double averageLiterPerHundredKm(){
        return ((double) liter / distanceInKm) * 100.0;
    }
}
