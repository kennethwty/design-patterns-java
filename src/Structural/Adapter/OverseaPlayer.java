package Structural.Adapter;

// Acting as legacy code; not implementing the Player interface
public class OverseaPlayer {
    private String id;
    private String surname;
    private String givenName;
    private int points;
    private String position;
    private String team;

    public OverseaPlayer(String id, String surname, String givenName, int points, String position, String team) {
        this.id = id;
        this.surname = surname;
        this.givenName = givenName;
        this.points = points;
        this.position = position;
        this.team = team;
    }

    public String getId() {
        return id;
    }

    public String getSurname() {
        return surname;
    }

    public String getGivenName() {
        return givenName;
    }

    public int getPoints() {
        return points;
    }

    public String getPosition() {
        return position;
    }

    public String getTeam() {
        return team;
    }
}
