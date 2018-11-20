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

import java.util.ArrayList;
import java.util.List;

public abstract class Game {

    protected List<String> features = new ArrayList<>();

    // no-arg constructor
    public Game() {
        this.createGame();
    }

    public List<String> getGame() {
        return features;
    }

    public abstract void createGame();

}

