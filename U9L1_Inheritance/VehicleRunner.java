public class VehicleRunner {
    public static void main(String[] args) {
        // testing all available methods on a Vehicle object
        Vehicle myVehicle = new Vehicle("Generic Vehicle", 6);
        System.out.println(myVehicle.getName());
        System.out.println(myVehicle.getWheels());
        myVehicle.move(10);
        myVehicle.turn();
        myVehicle.brake();

        // testing all available methods on a Car object
        Car myCar = new Car("Honda Civic", 4, "leather");
        System.out.println(myCar.getName()); // inherited method
        System.out.println(myCar.getWheels()); // inherited method
        System.out.println(myCar.getFabric()); // method ONLY available on Car objects
        myCar.move(30); // inherited method
        myCar.turn(); // inherited method
        myCar.brake(); // inherited method
        myCar.honk(); // method ONLY available on Car objects
        myCar.lockDoors(); // method ONLY available on Car objects

        // ---- WRITE YOUR BICYCLE TEST CODE BELOW ----
        Bicycle myBicycle = new Bicycle("Fast Ting", 2, 2);
        System.out.println(myBicycle.getName());
        System.out.println(myBicycle.getWheels());
        System.out.println(myBicycle.getGearCount());
        myBicycle.move(80);
        myBicycle.turn();
        myBicycle.brake();
        myBicycle.ringBell();

        Plane myPlane = new Plane("Fly Ting", 3, "Drake's Private Jet");
        System.out.println(myPlane.getName());
        System.out.println(myPlane.getWheels());
        System.out.println(myPlane.getType());
        myPlane.move(80);
        myPlane.turn();
        myPlane.brake();
        myPlane.isCruising();
    }
}