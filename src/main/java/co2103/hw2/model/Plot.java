package co2103.hw2.model;

import jakarta.persistence.*;

import java.util.List;
@Entity
public class Plot {
    @Id
    private String name;
    @ManyToMany (mappedBy = "plots")
    private List<Garden> gardens;
    @OneToMany (orphanRemoval=true,fetch=FetchType.EAGER,cascade = CascadeType.REMOVE)
    @JoinColumn
    private List <Flower> flowers;
    @OneToOne
    private Flower seasonal;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Garden> getGardens() {
        return gardens;
    }

    public void setGardens(List<Garden> gardens) {
        this.gardens = gardens;
    }

    public List<Flower> getFlowers() {
        return flowers;
    }

    public void setFlowers(List<Flower> flowers) {
        this.flowers = flowers;
    }

    public Flower getSeasonal() {
        return seasonal;
    }

    public void setSeasonal(Flower seasonal) {
        this.seasonal = seasonal;
    }

    @Override
    public String toString() {
        return "Plot{" +
                "name='" + name + '\'' +
                ", flowers=" + flowers +
                ", seasonal=" + seasonal +
                '}';
    }
}
