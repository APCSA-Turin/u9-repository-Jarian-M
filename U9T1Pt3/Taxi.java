package U9T1Pt3;

public class Taxi extends Car{
    private double fareCollected;

    public Taxi(String licensePlate, double tollFee, int passengers, boolean electric, double fareCollected) {
        super(licensePlate, tollFee, passengers, electric);
        this.fareCollected = fareCollected;
    }

    public double getFareCollected() {
        return fareCollected;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Total Fare Collected: " + fareCollected);
    }

    public void pickupRiders(int numRiders, double farePerRider) {
        setPassengers(getPassengers() + numRiders);
        fareCollected += numRiders * farePerRider;
        if(!isDiscountApplied() && getPassengers() >= 4) {
            setTollFee(getTollFee() / 2);
            setDiscountApplied(true);
        }
    }

    public boolean chargeAndDropOffRiders(double farePerRider) {
        int numRiders = getPassengers() - 1;
        double charged = numRiders * farePerRider;
        fareCollected = charged;
        boolean success = dropOffPassengers(numRiders);

        return success;
    }

    @Override
    public void gPS() {
        System.out.println("Connecting to passenger's destination!");
        super.gPS();
    }
}
