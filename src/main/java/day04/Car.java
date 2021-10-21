package day04;

public class Car {
    private int amountOfFuel;
    private int km;

    public int getAmountOfFuel() {
        return amountOfFuel;
    }

    public void setAmountOfFuel(int amountOfFuel) {
        this.amountOfFuel = amountOfFuel;
    }

    public double getKm() {
        return km;
    }

    public void setKm(double km) {
        this.km = (int) km;
    }

    public double calculateConpsumption(){
//        return ))double)amountOfFuel*1.0/km) *100);
//        return 100.0 * amountOfFuel /km;
        return ((double) amountOfFuel / km) * 100.0;
    }
}
