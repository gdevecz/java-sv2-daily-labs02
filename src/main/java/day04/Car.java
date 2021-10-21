package day04;

public class Car {
    private int liter;
    private int distanceInKm;

    public void setLiter(int liter) {
        this.liter = liter;
    }

    public void setDistanceInKm(int distanceInKm) {
        this.distanceInKm = distanceInKm;
    }

    public double averageLiterPerHundredKm(){
        return ((double) liter / distanceInKm) * 100.0;
    }
}
