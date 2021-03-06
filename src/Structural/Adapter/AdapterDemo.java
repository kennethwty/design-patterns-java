package Structural.Adapter;

/*
    Author: Tsz Yan "Kenneth" Wong

    Concepts:
        - Great pattern for connecting new codes to legacy codes without having to change the working contract that was produced from the legacy code originally.
        - Choose this pattern when we want to have a client to talk to an existing interface.
        - Usually when one portion of the system is a legacy app that we don't want to change or cannot possibly change.
        - Basically: Translating the requests from client to the code that it is adapting.

    Design:
        - Client centric
        - Integrate new with old
        - Can be an interface, but not required

        Note: Unlike Decorator pattern where it is adding new functionality to legacy API, this is simply adapting.

    Examples:
        - Arrays -> Lists (Arrays.toList())
        - Streams IO

    Pitfalls:
        - Do not add new functionality
 */

import java.util.List;

public class AdapterDemo {
    public static void main(String[] args) {
        BasketballHallOfFame hof = new BasketballHallOfFame();

        List<Player> players = hof.getHOFlist();

        System.out.println(players);
    }
}
