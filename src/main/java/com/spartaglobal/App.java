package com.spartaglobal;

/**
 * Hello world!
 *
 */
public class App {

    public static void main(String[] args) {
        NSphere nSphere = new OneSphere();
        System.out.println(nSphere.getSurfaceArea());
        System.out.println(nSphere.getVolume());
        nSphere.setRadius(10);
        System.out.println(nSphere.getSurfaceArea());
        System.out.println(nSphere.getVolume());
        nSphere = new TwoSphere();
        System.out.println(nSphere.getSurfaceArea());
        System.out.println(nSphere.getVolume());
        nSphere.setRadius(10);
        System.out.println(nSphere.getSurfaceArea());
        System.out.println(nSphere.getVolume());
    }

}
