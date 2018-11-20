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

public class GameFactory {
    public static Game getGame(String gameName) {
        switch(gameName) {
            case "NBA2K":
                return new NBA2K();

            case "Fortnite":
                return new Fortnite();

            case "GTA":
                return new GTA();

            default:
                return null;
        }
    }
}
