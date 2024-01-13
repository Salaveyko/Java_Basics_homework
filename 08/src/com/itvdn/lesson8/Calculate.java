package com.itvdn.lesson8;

import java.util.Scanner;

/**
 * The program divides all entered values by 5 without a reminder
 */
public class Calculate {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a, b, c:");
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();

        System.out.println("The result of all values divided by 5 without a remainder");
        for (var n : calculate(a, b, c)) {
            System.out.println(n);
        }
    }

    public static int[] calculate(int a, int b, int c) {
        int[] arr = {a / 5, b / 5, c / 5};
        return arr;
    }
}
