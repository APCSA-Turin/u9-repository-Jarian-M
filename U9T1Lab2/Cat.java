public class Cat extends Animal{
    private boolean hasPlayedWith;
    private boolean needsNap;
    public Cat(String name, int age, boolean vaccinated) {
        super(name, age, vaccinated);
        hasPlayedWith = false;
        needsNap = true;
    }

    public void play() {
        if(!hasPlayedWith) {
            System.out.println("It's time to play! No scratching this time!");
        } else{
            System.out.println("You've had enough play for today!");
        }
        hasPlayedWith = true;
    }

    public boolean getHasPlayedWith() {
        return hasPlayedWith;
    }

    public void nap() {
        if(needsNap) {
            System.out.println("You haven't slept kitty, it's time to nap!");
        } else {
            System.out.println("Haven't you slept enough!");
        }
        needsNap = false;
    }

    public boolean getNeedsNap() {
        return needsNap;
    }
}
