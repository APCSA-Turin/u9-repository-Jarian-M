public class VideoGamesRunner {
    public static void main(String[] args) {
        VideoGames videoGame = new VideoGames("Generic Game", "RPG", "2/12/2015", "Unreal Engine", "Single Player");
        System.out.println(videoGame.getTitle());
        System.out.println(videoGame.getType());
        System.out.println(videoGame.getDate());
        System.out.println(videoGame.getEngine());
        System.out.println(videoGame.getGameMode());
        videoGame.playGame();
        videoGame.rageQuit();

        Fortnite fort = new Fortnite("Fortnite", "Battle Royale", "7/21/2017", "Unreal Engine", "1v1 Build Fights", "Panda Team Leader", "Cold Snap", 13500);
        System.out.println(fort.getTitle());
        System.out.println(fort.getType());
        System.out.println(fort.getDate());
        System.out.println(fort.getEngine());
        System.out.println(fort.getGameMode());
        fort.playGame();
        fort.rageQuit();
        System.out.println(fort.getSkin());
        System.out.println(fort.getPickaxe());
        System.out.println(fort.getVbucks());
        fort.playBuildFights();

        MarioKart kart = new MarioKart("Mario Kart", "Racing", "5/29/2014", "Nintendo", "Grand Prix", "Car", "Bowser Jr.", "Sweet Sweet Canyon");
        System.out.println(kart.getTitle());
        System.out.println(kart.getType());
        System.out.println(kart.getDate());
        System.out.println(kart.getEngine());
        System.out.println(kart.getGameMode());
        kart.playGame();
        kart.rageQuit();
        System.out.println(kart.getVehicle());
        System.out.println(kart.getCharacter());
        System.out.println(kart.getMap());
        kart.blueShells();
        kart.greenShells();
    }
}
