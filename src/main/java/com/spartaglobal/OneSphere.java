package com.spartaglobal;

import static java.lang.Math.PI;
import static java.lang.Math.pow;

public class OneSphere extends NSphere {

    @Override
    public double getSurfaceArea() {
        return 2 * PI * getRadius();
    }

    @Override
    public double getVolume() {
        return PI * pow(getRadius(), 2);
    }

}
