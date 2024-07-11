package co2103.hw2.model;

import jakarta.persistence.*;

import java.util.List;
@Entity
public class Garden {
    @Id
    @GeneratedValue
    private int id;

    private String location;
    @ManyToMany (cascade = CascadeType.ALL)
    private List<Plot> plots;
    @ManyToOne
    private Plot patio;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public List<Plot> getPlots() {
        return plots;
    }

    public void setPlots(List<Plot> plots) {
        this.plots = plots;
    }

    public Plot getPatio() {
        return patio;
    }

    public void setPatio(Plot patio) {
        this.patio = patio;
    }

    @Override
    public String toString() {
        return "Garden{" +
                "id=" + id +
                ", location=" + location + '\'' +
                ", plots=" + plots +
                ", patio=" + patio +
                '}';
    }
}
