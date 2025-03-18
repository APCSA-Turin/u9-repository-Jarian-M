public class Dog extends Animal{
    private boolean hasBeenWalked;
    private boolean isMailMan;

    public Dog(String name, int age, boolean vaccinated) {
        super(name, age, vaccinated);
        hasBeenWalked = false;
        isMailMan = true;
    }

    public void walk() {
        if(!hasBeenWalked) {
            System.out.println("Let's go out for a walk guys!");
        } else {
            System.out.println("We already went for a walk today!");
        }
        hasBeenWalked = true;
    }

    public boolean getHasBeenWalked() {
        return hasBeenWalked;
    }

    public void mailMan() {
        if(isMailMan) {
            System.out.println("WOOF WOOF WOOF WOOF WOOF");
        } else {
            System.out.println("That's not the mail man! You guys scared him away!");
        }
        isMailMan = false;
    }

    public boolean getIsMailMan() {
        return isMailMan;
    }

}
