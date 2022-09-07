package com.spartaglobal;

/**
 * <!-- MathJax LaTeX used for <math> elements-->
 * An <math>n</math>-sphere is a topological space in the
 * <math>(n + 1)</math>-dimensional Euclidean space defined as
 * <math>S^n (r) = {x \in \mathbb{R}^{n+ 1} : \lVert x\rVert = r}<\math>
 * wherein <math>r<\math> is the radius thereof.
 */
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
