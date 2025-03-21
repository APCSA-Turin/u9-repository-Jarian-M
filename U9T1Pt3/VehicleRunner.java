package U9T1Pt3;

public class VehicleRunner {
    public static void main(String[] args) {
      Vehicle myVehicle = new Vehicle("BB8123", 7.0, 3);
      myVehicle.printInfo();
      myVehicle.gPS();
      System.out.println();
      Car myCar = new Car("MK4567", 6.75, 4, true);
      myCar.printInfo();
      myCar.gPS();
      System.out.println();
      Truck myTruck = new Truck("TB12MX", 15.50, 2, 4, true);
      myTruck.printInfo();
      myTruck.gPS();
      System.out.println();
      Taxi myTaxi = new Taxi("TX1412", 13.75, 4, true, 2.0);
      myTaxi.printInfo();
      myTaxi.gPS();
    }
}