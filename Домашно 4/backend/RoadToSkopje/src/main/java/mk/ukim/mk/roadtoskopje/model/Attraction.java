package mk.ukim.mk.roadtoskopje.model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

/**
 * Java class for Attraction in Skopje.
 */
@Entity
public class Attraction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private double lon;
    private double lat;
    private String name;
    private String website;
    private String phone;

    public Attraction() {
    }

    /**
     * Constructor with all parameters.
     *
     * @param id
     * @param lon
     * @param lat
     * @param name
     * @param website
     * @param phone
     */
    public Attraction(long id, double lon, double lat, String name, String website, String phone) {
        this.id = id;
        this.lon = lon;
        this.lat = lat;
        this.name = name;
        this.website = website;
        this.phone = phone;
    }

    //GET AND SET METHODS
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public double getLon() {
        return lon;
    }

    public void setLon(double lon) {
        this.lon = lon;
    }

    public double getLat() {
        return lat;
    }

    public void setLat(double lat) {
        this.lat = lat;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}