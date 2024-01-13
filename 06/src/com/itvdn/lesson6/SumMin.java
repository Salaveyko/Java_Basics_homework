package com.itvdn.lesson6;

import java.util.Scanner;

/**
 * The program processes the values entered by the user and:
 * 1. Outputs all odd values from the specified diapason;
 * 2. Outputs the sum of all numbers from the specified diapason.
 */
public class SumMin {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a, b, sum = 0;

        System.out.print("Enter a: ");
        a = in.nextInt();
        System.out.print("Enter b: ");
        b = in.nextInt();

        if (a > b) {
            System.out.println("a must be less then b");
            return;
        }

        for (int i = a + 1; i < b; i++) {
            sum += i;

            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }

        System.out.println("\nSum = " + sum);
    }
}
