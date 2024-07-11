package co2103.hw2.model;

import jakarta.persistence.*;

@Entity
public class Flower {
    @Id
    @GeneratedValue
    private int identifier;
    private int height;

    public int getIdentifier() {
        return identifier;
    }

    public void setIdentifier(int identifier) {
        this.identifier = identifier;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }


    @Override
    public String toString() {
        return "Flower{" +
                "identifier=" + identifier +
                ", height=" + height +
                '}';
    }
}
