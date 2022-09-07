package com.spartaglobal;

public class OneSphere extends NSphere {

    @Override
    public double getSurfaceArea() {
        return 2 * getRadius() * Math.PI;
    }

    @Override
    public double getVolume() {
        return getRadius() * getRadius() * Math.PI;
    }

}
