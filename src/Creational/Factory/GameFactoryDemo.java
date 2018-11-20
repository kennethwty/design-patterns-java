package Creational.Factory;

/*
    Author: Tsz Yan "Kenneth" Wong

    Concepts:
        - Doesn't expose instantiation logic
        - Defer to subclass
        - Common interface
        - Parameter driven
        - Solves complex creation
        - Specified by architecture, implemented by users
        - Sometimes viewed as an opposite of the Singleton design pattern
        - Examples:
            - Calendar
            - ResourceBundle
            - NumberFormat
 */

public class GameFactoryDemo {
    public static void main(String[] args) {
        Game game = GameFactory.getGame("GTA");
        System.out.println("This game has the following features: " + game.getFeatures());
    }
}
