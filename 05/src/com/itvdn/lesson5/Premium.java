package com.itvdn.lesson5;

import java.util.Scanner;

/**
 * The simple program for calculating bonuses for employees
 */
public class Premium {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter years: ");
        int year = in.nextInt();
        int prem = 0;

        if (year < 5 && year > 0) {
            prem = 10;
        } else if (year >= 5 && year < 10) {
            prem = 15;
        } else if (year >= 10 && year < 15) {
            prem = 25;
        } else if (year >= 15 && year < 20) {
            prem = 35;
        } else if (year >= 20 && year < 25) {
            prem = 45;
        } else if (year >= 25) {
            prem = 50;
        }

        System.out.println("Your premium is " + prem + "% from salary.");
    }
}
