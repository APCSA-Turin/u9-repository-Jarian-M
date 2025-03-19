package U9T1L3;

public class Taxi extends Car{
    private double fareCollected;

    public Taxi(String licensePlate, double tollFee, int passengers, boolean electric, double fareCollected) {
        super(licensePlate, tollFee, passengers, electric);
        this.fareCollected = fareCollected;
    }

    public double getFareCollected() {
        return fareCollected;
    }

    public void printTaxi() {
        String print = "License Plate: " + getLicensePlate() + "\n";
        print += "Toll Fee: " + getTollFee() + "\n";
        print += "Number of Passengers: " + getPassengers() + "\n";
        print += "Electric: " + isElectric() + "\n";
        print += "Discount Applied: " + isDiscountApplied() + "\n";
        print += "Total Fare Collected: " + fareCollected;
        System.out.println(print);
    }

    public void pickupRiders(int numRiders, double farePerRider) {
        setPassengers(getPassengers() + numRiders);
        fareCollected += numRiders * farePerRider;
        if(!isDiscountApplied() && getPassengers() >= 4) {
            setTollFee(getTollFee() / 2);
            setDiscountApplied(true);
        }
    }
}
