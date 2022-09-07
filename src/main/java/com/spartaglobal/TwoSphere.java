package com.spartaglobal;

import static java.lang.Math.PI;
import static java.lang.Math.pow;

public class TwoSphere extends NSphere {

    @Override
    public double getSurfaceArea() {
        return 4 * PI * pow(getRadius(), 2);
    }

    @Override
    public double getVolume() {
        return 4.0 / 3 * PI * pow(getRadius(), 3);
    }
    
}
