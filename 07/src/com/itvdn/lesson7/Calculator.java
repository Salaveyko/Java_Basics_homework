package com.itvdn.lesson7;

import java.util.Scanner;

/**
 * The program that finds the arithmetic average of three entered numbers
 */
public class Calculator {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a, b, c;
        double arithMean;

        System.out.println("Enter a, b, c");
        a = in.nextInt();
        b = in.nextInt();
        c = in.nextInt();

        arithMean = arithmeticMean(a, b, c);

        System.out.println("Arithmetic mean of " + a + ", " + b + ", " + c + " = " + arithMean);
    }

    private static double arithmeticMean(int a, int b, int c) {
        return (a + b + c) / 3;
    }
}
