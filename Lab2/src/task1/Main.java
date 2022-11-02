package task1;

import task1.Complex;

public class Main {
    public static void main(String[] args) {
        Complex complex1 = new Complex(2, 3);
        Complex complex2 = new Complex(-7, -5);

        complex1.addWithComplex(complex2);
        complex1.showNumber();

        System.out.println("Hello world!");
    }
}