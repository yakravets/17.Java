package models;

import javax.persistence.*;

@Entity
@Table(name = "airports")
public class Airport {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String icao_code;
    private String iata_code;
    private String status;
    private double longitude;
    private double latitude;

    public Airport() {
    }

    public Airport(String name, String icao_code, String iata_code, String status, double longitude, double latitude) {
        this.name = name;
        this.icao_code = icao_code;
        this.iata_code = iata_code;
        this.status = status;
        this.longitude = longitude;
        this.latitude = latitude;
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

    public String getIcao_code() {
        return icao_code;
    }

    public void setIcao_code(String icao_code) {
        this.icao_code = icao_code;
    }

    public String getIata_code() {
        return iata_code;
    }

    public void setIata_code(String iata_code) {
        this.iata_code = iata_code;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }
}
