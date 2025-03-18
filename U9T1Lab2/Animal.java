public class Animal {
    private String name;
    private int age;
    private boolean vaccinated = false;

    public Animal(String name, int age, boolean vaccinated) {
        this.name = name;
        this.age = age;
        this.vaccinated = vaccinated;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public boolean getVaccinated() {
        return vaccinated;
    }

    public void adopt() {
        System.out.println("Awwwww your too cute! You're coming home with me!");
    }

    public void feed() {
        System.out.println("Time to eat!");
    }
}