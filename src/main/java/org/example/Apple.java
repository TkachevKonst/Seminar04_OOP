package org.example;

public class Apple extends Fruit{

    public Apple() {
        super(1.0f);
        this.name = "Яблоко";
    }


    @Override
    public String toString() {
        return String.format("Яблоко весом %.2f"+this.getWeight());
    }
}
