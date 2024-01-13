package com.itvdn.lesson5;

import java.util.Scanner;

/**
 * The Parity class checks the number for parity.
 * 2 verification options are used:
 * 1. Checking the first bit for equality 0;
 * 2. Using the "reminder of division" operation.
 */
public class Parity {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter number: ");
        int num = in.nextInt();

        //Variant 1
        if ((num & 1) == 1) {
            System.out.println("Odd number.");
        } else {
            System.out.println("Even number.");
        }

        //Variant 2
        if (num % 2 != 0) {
            System.out.println("Odd number.");
        } else {
            System.out.println("Even number.");
        }
    }
}
