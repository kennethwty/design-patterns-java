package Structural.Adapter;

import java.util.ArrayList;
import java.util.List;

public class BasketballHallOfFame {

    public List<Player> getHOFlist() {
        List<Player> listOfPlayers = new ArrayList<>();

        // Too many good players to list...
        Player USPlayer1 = new PlayerDB("2136","Kobe", "Bryant", 33643, "LA Lakers");
        Player USPlayer2 = new PlayerDB("1252","Tracy", "McGrady", 18381, "Orlando Magic");

        listOfPlayers.add(USPlayer1);
        listOfPlayers.add(USPlayer2);

        // Oversea players
        OverseaPlayer OSPlayer1 = new OverseaPlayer("1","Kenneth", "Wong", 9999, "Point Guard", "Hong Kong Vakers");

        // Using the adapter to add the player to the US HOF list
        listOfPlayers.add(new OSPlayerAdapter(OSPlayer1));

        return listOfPlayers;
    }
}
