package com.itvdn.lesson7;

import java.util.Scanner;

/**
 * A simple program that analyze a number
 */
public class NumbersCheck {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n;

        System.out.print("Enter number: ");
        n = in.nextInt();

        checkN(n);
    }

    private static void checkN(int n) {
        boolean isPositive = false,
                isPrime = true;

        if (n != 0) {
            //checking if the number is positive
            if (n > 0) {
                isPositive = true;
            }
            //x - intermediate number. Needed to determine whether a number is prime
            int x = (isPositive) ? n : n * -1;
            //checking whether the number is prime
            isPrime = isPrime(x);
        } else {
            System.out.println(n + " = 0");
            return;
        }

        System.out.print(n + " is ");
        if (isPositive) {
            System.out.print("positive, ");
        } else {
            System.out.print("negative, ");
        }
        if (isPrime) {
            System.out.println("prime.");
        } else {
            System.out.print("divided without remainder to ");

            if (n % 2 == 0) System.out.print(" " + 2);
            if (n % 3 == 0) System.out.print(" " + 3);
            if (n % 5 == 0) System.out.print(" " + 5);
            if (n % 6 == 0) System.out.print(" " + 6);
            if (n % 9 == 0) System.out.print(" " + 9);

            System.out.println(".");
        }
    }

    /**
     * It checks divisors up to the square root of the number and utilizes the fact that all prime
     * numbers greater than 3 can be represented in the form 6k±1, where the k - integer
     * @param n integer
     * @return true if the n is prime
     */
    private static boolean isPrime(int n) {
        if (n <= 1) return false;
        if (n <= 3) return true;
        if (n % 2 == 0 || n % 3 == 0) return false;
        for (int i = 5; i * i <= n; i += 6) {
            if (n % i == 0 || n % (i + 2) == 0) return false;
        }
        return true;
    }
}
