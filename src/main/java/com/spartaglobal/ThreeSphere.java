package com.spartaglobal;

import static java.lang.Math.PI;
import static java.lang.Math.pow;

public class ThreeSphere extends NSphere {

    @Override
    public double getSurfaceArea() {
        return 2 * pow(PI, 2) * pow(getRadius(), 3);
    }

    @Override
    public double getVolume() {
        return 1.0 / 2 * pow(PI, 2) * pow(getRadius(), 4);
    }
    
}