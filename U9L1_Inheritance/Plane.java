public class Plane extends Vehicle{
    private String type;

    public Plane(String name, int wheels, String type) {
        super(name, wheels);
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void isCruising() {
        System.out.println("We Have Reached Cruising Altitudes!");
    }
}
