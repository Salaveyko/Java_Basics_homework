package com.itvdn.lesson9;

import java.util.Scanner;

/**
 * The program creates N-sized array of integers, fills it with random values, and prints it.
 * Also, the CustomerArray has several methods that parse the array.
 */
public class CustomerArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter array size: ");

        int size = in.nextInt();
        int[] arr = new int[size];

        fillArr(arr);
        printArr(arr);
        System.out.println("The largest element of the array = " + maxElement(arr));
        System.out.println("The smallest element of the array = " + minElement(arr));
        System.out.println("The sum of the elements =  " + sumOfElements(arr));
        System.out.println("Arithmetic mean = " + arithmeticMean(arr));
        System.out.println("Negative elements:");
        printAllNegatives(arr);
    }

    /**
     * Fills the array with random integers.
     *
     * @param arr an array of integers
     * @return filled array
     */
    public static int[] fillArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) ((Math.random() * 100) - 50);
        }

        return arr;
    }

    /**
     * Prints an array to the console.
     *
     * @param arr an array of integers.
     */
    public static void printArr(int[] arr) {
        for (int a : arr) {
            System.out.print(" " + a);
        }
        System.out.println("\n");
    }

    /**
     * Finds and returns the max value of an array.
     *
     * @param arr an array of integers.
     * @return the maximum value of an array.
     */
    public static int maxElement(int[] arr) {
        int max = arr[0];

        for (int a : arr) {
            if (a > max) {
                max = a;
            }
        }

        return max;
    }

    /**
     * Finds and returns the min value of an array.
     *
     * @param arr an array of integers.
     * @return the minimum value of an array.
     */
    public static int minElement(int[] arr) {
        int min = arr[0];

        for (int a : arr) {
            if (a < min) {
                min = a;
            }
        }

        return min;
    }

    /**
     * Adds all values of an array.
     *
     * @param arr an array of integers.
     * @return sum of all array elements.
     */
    public static int sumOfElements(int[] arr) {
        int sum = 0;

        for (int a : arr) {
            sum += a;
        }

        return sum;
    }

    /**
     * Finds the arithmetic average of the array elements.
     *
     * @param arr an array of integers.
     * @return the arithmetic mean of the array elements.
     */
    public static int arithmeticMean(int[] arr) {
        return sumOfElements(arr) / arr.length;
    }

    /**
     * Prints all negative array values to the console.
     *
     * @param arr an array of integers.
     */
    public static void printAllNegatives(int[] arr) {
        for (int a : arr) {
            if (a < 0) {
                System.out.print(" " + a);
            }
        }
        System.out.println();
    }
}
