public class VideoGames {
    private String title;
    private String type;
    private String date;
    private String engine;

    public VideoGames(String title, String type, String date, String engine) {
        this.title = title;
        this.type = type;
        this.date = date;
        this.engine = engine;
    }

    public String getTitle() {
        return title;
    }

    public String getType() {
        return type;
    }

    public String getDate() {
        return date;
    }

    public String getEngine() {
        return engine;
    }

    public void playGame() {
        System.out.println("I'm playing a game, it's so fun!");
    }

    public void rageQuit() {
        System.out.println("This game sucks! Why did I even play!");
    }
}
