package Creational.Factory;

public class Fortnite extends Game {
    @Override
    public void createGame() {
        features.add("Funny Moves");
        features.add("50 vs. 50 Mode");
        features.add("Holiday Special");
    }
}
