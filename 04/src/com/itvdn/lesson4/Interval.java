package com.itvdn.lesson4;

import java.util.Scanner;

/**
 * The Interval class checks which interval the entered number falls into in the range [0, 100]
 */
public class Interval {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter number: ");
        int n = scan.nextInt();

        if (n >= 0 && n < 15)
            System.out.println("[0 - 14]");
        else if (n >= 15 && n < 36)
            System.out.println("[15 - 35]");
        else if (n >= 36 && n < 51)
            System.out.println("[36 - 51]");
        else if (n >= 50 && n <= 100)
            System.out.println("[50 - 100]");
        else
            System.out.println("Number is out of interval");
    }
}
