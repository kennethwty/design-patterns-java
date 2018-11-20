package Creational.Factory;

public class NBA2K extends Game {

    @Override
    public void createGame() {
        features.add("MyLeague");
        features.add("MyTeam");
        features.add("MyCareer");
    }
}
