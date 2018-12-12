package Structural.Adapter;

public class OSPlayerAdapter implements Player {
    private OverseaPlayer player;

    public OSPlayerAdapter(OverseaPlayer player) {
        this.player = player;
    }

    @Override
    public String getPlayerID() {
        return player.getId();
    }

    @Override
    public String getFirstName() {
        return player.getGivenName();
    }

    @Override
    public String getLastName() {
        return player.getSurname();
    }

    @Override
    public int getTotalPoints() {
        return player.getPoints();
    }

    @Override
    public String getRepresentingTeam() {
        return player.getTeam();
    }

    public String toString() {
        return "[ID: " + player.getId() + "]";
    }
}
