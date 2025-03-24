package U9T5_WarmUp;

import java.util.ArrayList;

public class Vet {
    private String vetName;
    private ArrayList<Animal> clients;

    public Vet(String name) {
        vetName = name;
        clients = new ArrayList<Animal>();
    }

    public boolean addClient(Animal add) {
        if(!clients.contains(add)) {
            System.out.println("Welcome to " + vetName + "'s office, " + add.getName());
            clients.add(add);
            return true;
        } else {
            System.out.println(add.getName() + " is already a client of " + vetName);
            return false;
        }
    }

    public void printClientList() {
        for(Animal animal : clients) {
            System.out.println(animal.getName() + ": " + animal.getClass());
        }
    }
}
