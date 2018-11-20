package Creational.Factory;

public class GTA extends Game {
    @Override
    public void createGame() {
        features.add("Super Cars");
        features.add("Switch between characters");
        features.add("Basically do whatever you want...");
    }
}
