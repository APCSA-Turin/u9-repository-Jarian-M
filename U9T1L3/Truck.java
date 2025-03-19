package U9T1L3;

public class Truck extends Vehicle {
    private int axles;
    private boolean hasTrailer;
    
    public Truck(String licensePlate, double tollFee, int passengers, int axles, boolean hasTrailer) {
      super(licensePlate, tollFee, passengers);
      this.axles = axles;
      this.hasTrailer = hasTrailer;
    }
  
    public int getAxles() {
      return axles;
    }
  
    public boolean hasTrailer() {
      return hasTrailer;
    }

    public void printTruck() {
        String print = "License Plate: " + getLicensePlate() + "\n";
        print += "Toll Fee: " + getTollFee() + "\n";
        print += "Number of Passengers: " + getPassengers() + "\n";
        print += "Number of Axles: " + getAxles() + "\n";
        print += "Has Trailer: " + hasTrailer();
        System.out.println(print);
    }

    public boolean validateLicensePlate() {
        if(hasTrailer) {
            if(axles > 4 && getLicensePlate().substring(getLicensePlate().length() - 2).equals("MX")) {
                return true;
            } else if(axles <= 4 && getLicensePlate().substring(getLicensePlate().length() - 2).equals("LX")){
                return true;
            } else {
                return false;
            }
        }
        return true;
    }
  }