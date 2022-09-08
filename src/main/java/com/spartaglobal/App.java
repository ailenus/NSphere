package com.spartaglobal;


/**
 * Hello world!
 *
 */
public class App {

    public static void main(String[] args) {
        NSphere nSphere = new OneSphere();

        System.out.println("Unit 1-sphere");
        nSphere.printAll();

        nSphere.setRadius(10);
        System.out.println("1-sphere of radius 10");
        nSphere.printAll();

        nSphere = new TwoSphere();
        System.out.println("Unit 2-sphere");
        nSphere.printAll();

        nSphere.setRadius(10);
        System.out.println("2-sphere of radius 10");
        nSphere.printAll();

        nSphere = new ThreeSphere();
        System.out.println("Unit 3-sphere");
        nSphere.printAll();

        nSphere.setRadius(10);
        System.out.println("3-sphere of radius 10");
        nSphere.printAll();

        nSphere = new FourSphere();
        System.out.println("Unit 4-sphere");
        nSphere.printAll();

        nSphere.setRadius(10);
        System.out.println("4-sphere of radius 10");
        nSphere.printAll();
    }

}
