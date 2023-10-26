package org.example;

public class Orange extends Fruit{

    public Orange() {
        super(1.5f);
        this.name = "Апельсин";
    }
    public String toString() {
        return String.format("Апельсин весом %.2f"+this.getWeight());
    }
}
