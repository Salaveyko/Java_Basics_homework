package com.itvdn.lesson5;

import java.util.Scanner;

/**
 * The program check if a number is a power of 2.
 */
public class IsPowOfTwo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter number: ");

        int num = in.nextInt();
        if ((num & (num - 1)) == 0) {
            System.out.println(num + " is pow of 2.");
        } else {
            System.out.println(num + " isn`t pow of 2.");
        }
    }
}
