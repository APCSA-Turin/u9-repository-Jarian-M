package U9T1Pt3;

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

    public void printInfo() {
        super.printInfo();
        System.out.println("Number of Axles: " + getAxles());
        System.out.println("Has Trailer: " + hasTrailer());
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

    @Override
    public double calculateTollPrice() {
        if(hasTrailer()) {
          return getTollFee() * getAxles() * 2;
        } else {
          return getTollFee() * getAxles();
        }
    }
  }