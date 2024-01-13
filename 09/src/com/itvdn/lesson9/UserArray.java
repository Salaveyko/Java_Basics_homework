package com.itvdn.lesson9;

/**
 * A simple program that can add new elements to an array at its start or end.
 */
public class UserArray {
    public static void main(String[] args) {
        int size = 10;
        int[] arr = new int[size];

        System.out.println("Array");
        arr = fillArr(arr);
        printArr(arr);

        arr = addToEnd(arr);
        printArr(arr);

        arr = addOnTop(arr, 14);
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
        System.out.println("\n");
    }

    /**
     * Creates a new array with length+1. New element is 0.
     *
     * @param arr an array of integers.
     * @return a new array larger by 1.
     */
    public static int[] addToEnd(int[] arr) {
        int[] newArr = new int[arr.length + 1];

        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i];
        }

        return newArr;
    }

    /**
     * Creates a new array larger by 1 and adds the new element as the first.
     *
     * @param arr     an array of integers.
     * @param element element to insert into the array.
     * @return a new array.
     */
    public static int[] addOnTop(int[] arr, int element) {
        int[] newArr = new int[arr.length + 1];

        newArr[0] = element;
        for (int i = 0; i < arr.length; i++) {
            newArr[i + 1] = arr[i];
        }

        return newArr;
    }
}
