public class GamingDesktop extends Desktop{
    private String graphicsCard;

    public GamingDesktop(int screenSize, int memory, String graphicsCard) {
        super(screenSize, memory, true);
        this.graphicsCard = graphicsCard;
    }

    public String getGraphicsCard() {
        return graphicsCard;
    }

    public void updateDrivers() {
        System.out.println("Driver Update Found! Starting Driver Update: 0%... 100% Driver Update Complete!");
    }
}