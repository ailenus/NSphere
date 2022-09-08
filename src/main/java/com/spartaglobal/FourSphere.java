package com.spartaglobal;

import static java.lang.Math.PI;
import static java.lang.Math.pow;

public class FourSphere extends NSphere {

    @Override
    public double getSurfaceArea() {
        return 8.0 / 3 * pow(PI, 2) * pow(getRadius(), 4);
    }

    @Override
    public double getVolume() {
        return 8.0 / 15 * pow(PI, 2) * pow(getRadius(), 5);
    }
    
}
