public class Fortnite {
    private String skin;
    private String pickaxe;
    private int vbucks;
    private String gameMode;

    public Fortnite(String skin, String pickaxe, int vbucks, String gameMode) {
        this.skin = skin;
        this.pickaxe = pickaxe;
        this.vbucks = vbucks;
        this.gameMode = gameMode;
    }

    public String getSkin() {
        return skin;
    }

    public String getPickaxe() {
        return pickaxe;
    }

    public int getVbucks() {
        return vbucks;
    }

    public String getGameMode() {
        return gameMode;
    }

    public void playBuildFights() {
        System.out.println("First to five, win by two, good luck, have fun, lets go!");
    }
}