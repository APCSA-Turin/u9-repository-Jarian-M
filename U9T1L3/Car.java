package U9T1L3;

public class Car extends Vehicle {
    private boolean electric;
    private boolean discountApplied;
    
    public Car(String licensePlate, double tollFee, int passengers, boolean electric) {
      super(licensePlate, tollFee, passengers);
      this.electric = electric;
      discountApplied = false;   // default value
    }
  
    public boolean isElectric() {
      return electric;
    }
  
    public boolean isDiscountApplied() {
      return discountApplied;
    }

    public void printCar() {
        String print = "License Plate: " + getLicensePlate() + "\n";
        print += "Toll Fee: " + getTollFee() + "\n";
        print += "Number of Passengers: " + getPassengers() + "\n";
        print += "Electric: " + isElectric() + "\n";
        print += "Discount Applied: " + isDiscountApplied();
        System.out.println(print);
    }

    public boolean dropOffPassengers(int numOut) {
        if(numOut < getPassengers()) {
            setPassengers(getPassengers() - numOut);
            return true;
        } else {
            return false;
        }

    }

    public void applyDiscount() {
        if(!discountApplied) {
            if(isElectric()) {
                setTollFee(getTollFee() / 2);
                discountApplied = true;
            }
        }
    }
  }