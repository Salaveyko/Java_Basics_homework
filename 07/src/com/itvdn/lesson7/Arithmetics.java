package com.itvdn.lesson7;

import java.util.Scanner;

/**
 * Simple calculator
 */
public class Arithmetics {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a, b;
        char x;

        while (true) {
            System.out.println("Enter the expression: ");
            a = in.nextInt();
            x = in.next().charAt(0);
            b = in.nextInt();

            switch (x) {
                case '+':
                    add(a, b);
                    break;
                case '-':
                    sub(a, b);
                    break;
                case '*':
                    mul(a, b);
                    break;
                case '/':
                    div(a, b);
                    break;
                default:
                    System.out.println("Unknown action.");
            }

            System.out.print("Exit (y): ");
            if (in.next().charAt(0) == 'y') break;

            System.out.println();
        }
    }

    /**
     * Finds the sum of numbers a and b and displays it on the screen.
     *
     * @param a integer
     * @param b integer
     */
    private static void add(int a, int b) {
        System.out.println(a + " + " + b + " = " + (a + b));
    }

    /**
     * Finds the difference of numbers a and b and displays it on the screen.
     *
     * @param a integer
     * @param b integer
     */
    private static void sub(int a, int b) {
        System.out.println(a + " - " + b + " = " + (a - b));
    }

    /**
     * Finds the product of numbers a and b and displays it on the screen.
     *
     * @param a integer
     * @param b integer
     */
    private static void mul(int a, int b) {
        System.out.println(a + " * " + b + " = " + (a * b));
    }

    /**
     * Finds the quotient of numbers a and b and displays it on the screen.
     *
     * @param a integer
     * @param b integer
     */
    private static void div(int a, int b) {
        if (b == 0) {
            System.out.println("Division by 0");
        } else {
            System.out.println(a + " / " + b + " = " + (a / b));
        }
    }
}
