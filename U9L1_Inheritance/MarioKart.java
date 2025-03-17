public class MarioKart extends VideoGames{
    private String vehicle;
    private String character;
    private String map;
    private String gameMode;

    public MarioKart(String title, String type, String date, String engine, String gameMode, String vehicle, String character, String map) {
        super(title, type, date, engine, gameMode);
        this.vehicle = vehicle;
        this.character = character;
        this.map = map;
    }

    public String getVehicle() {
        return vehicle;
    }

    public String getCharacter() {
        return character;
    }

    public String getMap() {
        return map;
    }

    public void blueShells() {
        System.out.println("Oh no! You got hit with a blue shell! To last place you go!");
    }

    public void greenShells() {
        System.out.println("GreenShell coming your way! Nevermind it missed. GreenShells are so useless!");
    }
}
