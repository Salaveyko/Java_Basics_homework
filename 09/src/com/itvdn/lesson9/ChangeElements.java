package com.itvdn.lesson9;

public class ChangeElements {
    public static int[] fillArr(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            arr[i] = (int)((Math.random() * 10) - 5);
        }

        return arr;
    }

    public static void printArr(int[] arr) {
        for(int a : arr) {
            System.out.print(" " + a);
        }
        System.out.println();
    }

    public static int[] changeMinMax(int[] arr) {
        int min = 0, max = 0, buf = 0;

        for(int i = 0; i < arr.length; i++){
            if(arr[i] < arr[min]) {
                min = i;
            }
            if (arr[i] > arr[max]) {
                max = i;
            }
        }

        buf = arr[min];
        arr[min] = arr[max];
        arr[max] = buf;

        return arr;
    }

    public static int minValueCounter(int[] arr) {
        int minVal = arr[0], counter = 0;
        for(int a:arr) {
            if(a < minVal) {
                minVal = a;
            }
        }

        for(int a:arr) {
            if(minVal == a) {
                counter++;
            }
        }

        return counter;
    }

    public static void main(String[] args) {
        int[] arr = new int[10];

        System.out.println("Array");
        arr = fillArr(arr);
        printArr(arr);

        System.out.println("\nArray after changes");
        arr = changeMinMax(arr);
        printArr(arr);

        System.out.println("\nThis array has " + minValueCounter(arr) + " elements with smallest value.");
    }
}
