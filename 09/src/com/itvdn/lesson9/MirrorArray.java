package com.itvdn.lesson9;

/**
 * The program creates an array, fills it with random integers, outputs it to the console,
 * inverts the array and prints it again.
 */
public class MirrorArray {
    public static void main(String[] args) {
        int[] arr = new int[10];

        System.out.println("Array");
        arr = fillArr(arr);
        printArr(arr);

        System.out.println("\nDeployed array");
        arr = invertArr(arr);
        printArr(arr);
    }

    /**
     * Fills the array with random integers.
     *
     * @param arr an array of integers
     * @return filled array
     */
    public static int[] fillArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) ((Math.random() * 10) - 5);
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
        System.out.println();
    }

    /**
     * Inverts the given array.
     *
     * @param arr an array of integers.
     * @return an inverted array.
     */
    public static int[] invertArr(int[] arr) {
        int[] newArr = new int[arr.length];

        for (int i = 0, j = arr.length - 1; i < arr.length; i++, j--) {
            newArr[i] = arr[j];
        }

        return newArr;
    }
}
