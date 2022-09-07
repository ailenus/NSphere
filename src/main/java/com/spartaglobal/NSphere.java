package com.spartaglobal;

public abstract class NSphere {

    // fields
    private double radius;

    // constructors
    public NSphere() {
        this(1);
    }

    public NSphere(int radius) {
        this.radius = radius;
    }

    // methods
    public double getRadius() {
        return this.radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public abstract double getSurfaceArea();

    public abstract double getVolume();

    public void printSufaceArea() {
        System.out.println("Suface area: " + getSurfaceArea());
    }

    public void printVoume() {
        System.out.println("Volume: " + getVolume());
    }

    public void printAll() {
        printSufaceArea();
        printVoume();
    }

}
