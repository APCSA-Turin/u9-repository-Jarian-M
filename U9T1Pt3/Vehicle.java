package U9T1Pt3;

public class Vehicle {
    private String licensePlate;
    private double tollFee;
    private int passengers;
    
    public Vehicle(String licensePlate, double tollFee, int passengers) {
      this.licensePlate = licensePlate;
      this.tollFee = tollFee;
      this.passengers = passengers;
    }
  
    public String getLicensePlate() {
      return licensePlate;
    }
  
    public double getTollFee() {
      return tollFee;
    }
  
    public int getPassengers() {
      return passengers;
    }

    public void setPassengers(int newPass) {
        passengers = newPass;
    }

    public void setTollFee(double newFee) {
        tollFee = newFee;
    }
  
    public double calculateTollPrice() {
      return tollFee * passengers;
    }

    public void printInfo() {
        System.out.println("License Plate: " + licensePlate);
        System.out.println("Toll Fee: " + tollFee);
        System.out.println("Number of Passengers: " + passengers);
    }

    public void gPS() {
        System.out.println("GPS is On and Active!");
        System.out.println("Starting route to your destination! In 1 mile...");
    }
  }