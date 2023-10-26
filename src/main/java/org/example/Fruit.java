package org.example;

public abstract class Fruit {

    private final float weight;

    protected String name;

    public float getWeight() {
        return weight;
    }

    public Fruit(float weight) {
        this.weight = weight;
    }
}
