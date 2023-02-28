package task1;

import java.util.Arrays;

public class Main {
    public static void main(final String[] args) {
        // TODO: Initialize the calculator
        Calculator calculator = new Methods();

        // TODO: Uncomment after implementing the task

        System.out.println(calculator.add(2d, 3d));
        System.out.println(calculator.divide(9d, 4d));
        System.out.println(calculator.average(Arrays.asList(1d, 2d, 3d, 4d)));


        try {
            calculator.add(null, Double.MAX_VALUE);
        } catch (Calculator.NullParameterException e) {
            System.out.println("Null Parameter Exception thrown!");
        }

        try {
            calculator.add(Double.MAX_VALUE, null);
        } catch (Calculator.NullParameterException e) {
            System.out.println("Null Parameter Exception thrown!");
        }

        try {
            calculator.add(null, null);
        } catch (Calculator.NullParameterException e) {
            System.out.println("Null Parameter Exception thrown!");
        }

        try {
            calculator.add(Double.MAX_VALUE, Double.MAX_VALUE);
        } catch (Calculator.OverflowException e) {
            System.out.println("Overflow Exception thrown!");
        }

        try {
            calculator.add(-Double.MAX_VALUE, -Double.MAX_VALUE);
        } catch (Calculator.UnderflowException e) {
            System.out.println("Underflow Exception thrown!");
        }

        try {
            calculator.divide(null, Double.MAX_VALUE);
        } catch (Calculator.NullParameterException e) {
            System.out.println("Null Parameter Exception thrown!");
        }

        try {
            calculator.divide(Double.MAX_VALUE, null);
        } catch (Calculator.NullParameterException e) {
            System.out.println("Null Parameter Exception thrown!");
        }

        try {
            calculator.divide(null, null);
        } catch (Calculator.NullParameterException e) {
            System.out.println("Null Parameter Exception thrown!");
        }

        try {
            calculator.divide(null, null);
        } catch (Calculator.NullParameterException e) {
            System.out.println("Null Parameter Exception thrown!");
        }

        try {
            calculator.divide(1d, 0d);
        } catch (Calculator.OverflowException e) {
            System.out.println("Overflow Exception thrown!");
        }

        try {
            calculator.divide(-1d, 0d);
        } catch (Calculator.UnderflowException e) {
            System.out.println("Underflow Exception thrown!");
        }

        try {
            calculator.average(Arrays.asList(1d, 2d, Double.MAX_VALUE, Double.MAX_VALUE));
        } catch (Calculator.OverflowException e) {
            System.out.println("Overflow Exception thrown!");
        }

        try {
            calculator.average(Arrays.asList(1d, -100d, -Double.MAX_VALUE, -Double.MAX_VALUE));
        } catch (Calculator.UnderflowException e) {
            System.out.println("Underflow Exception thrown!");
        }

    }
}

