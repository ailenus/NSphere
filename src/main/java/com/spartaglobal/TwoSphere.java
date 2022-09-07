package com.spartaglobal;

public class TwoSphere extends NSphere {

    @Override
    public double getSurfaceArea() {
        return 4 * getRadius() * getRadius() * Math.PI;
    }

    @Override
    public double getVolume() {
        return 4 / 3 * getRadius() * getRadius() * getRadius() * Math.PI;
    }
    
}
