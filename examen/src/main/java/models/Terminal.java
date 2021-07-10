package models;

public class Terminal {

    private int id;
    private String name;

    // Many to one.
    private Airport airport;

    public Terminal() {
    }

    public Terminal(int id, String name, Airport airport) {
        this.id = id;
        this.name = name;
        this.airport = airport;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Airport getAirport() {
        return airport;
    }

    public void setAirport(Airport airport) {
        this.airport = airport;
    }
}
