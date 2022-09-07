package com.spartaglobal;

public abstract class NSphere {

    // fields
    private int radius;

    // constructors
    protected NSphere() {
        this(1);
    }

    protected NSphere(int radius) {
        this.radius = radius;
    }

    // methods
    public int getRadius() {
        return this.radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public abstract double getSurfaceArea();

    public abstract double getVolume();

}
