package com.itvdn.lesson6;

import java.util.Scanner;

/**
 * The program calculates the possible number of product delivery options for N customers.
 */
public class Delivery {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n, rez = 1;

        System.out.print("Enter N: ");
        n = in.nextInt();

        do {
            rez *= n--;
        } while (n != 0);

        System.out.println("You have " + rez + " possible ways.");
    }
}
