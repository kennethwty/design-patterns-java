package Structural.Adapter;

public class PlayerDB implements Player {
    private String playerID;
    private String firstName;
    private String lastName;
    private int points;
    private String team;

    public PlayerDB(String playerID, String firstName, String lastName, int points, String team) {
        this.playerID = playerID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.points = points;
        this.team = team;
    }

    @Override
    public String getPlayerID() {
        return null;
    }

    @Override
    public String getFirstName() {
        return null;
    }

    @Override
    public String getLastName() {
        return null;
    }

    @Override
    public int getTotalPoints() {
        return 0;
    }

    @Override
    public String getRepresentingTeam() {
        return null;
    }

    public String toString() {
        return "[ID: " + playerID + ", First Name: " + firstName + ", Last Name: " + lastName + ", Points: " + points + ", Team: " + team + "]";
    }
}
