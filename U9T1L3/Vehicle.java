package U9T1L3;

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
  }