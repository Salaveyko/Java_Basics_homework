package com.itvdn.lesson9;

/**
 * The program creates an array of size 10, prints it, prints the inverted array,
 * and prints the subarray to the console.
 */
public class ReversedArray {
    public static void main(String[] args) {
        int size = 10;
        int[] arr = new int[size];

        System.out.println("Array");
        arr = fillArr(arr);
        printArr(arr);

        System.out.println("Inverted array");
        printArr(myReverse(arr));

        System.out.println("Subarray");
        printArr(subArr(arr, 6, 12));
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
        System.out.println("\n");
    }

    /**
     * Inverts the given array.
     *
     * @param arr an array of integers.
     * @return an inverted array.
     */
    public static int[] myReverse(int[] arr) {
        int[] newArr = new int[arr.length];

        for (int i = 0, j = arr.length - 1; i < arr.length; i++, j--) {
            newArr[i] = arr[j];
        }

        return newArr;
    }

    /**
     * Fills a new array from the given array, starting reading at the given index.
     * If the new subarray larger than the given array has elements after the given
     * index, then the new values are filled with 1.
     *
     * @param arr   an array of integers
     * @param index indicates the element of the arr from which to start reading
     * @param size  length of new array
     * @return new subarray
     */
    public static int[] subArr(int[] arr, int index, int size) {
        int[] subArr = new int[size];

        for (int i = index, j = 0; j < size; i++, j++) {
            if (i < arr.length) {
                subArr[j] = arr[i];
            } else {
                subArr[j] = 1;
            }
        }

        return subArr;
    }
}
