package com.itvdn.lesson6;

/**
 * Drawing figures with a height of 10 in the console
 */
public class DrawFigure {
    public static void main(String[] args) {

        int a = 10, b = 10;

        //rectangle
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                System.out.print("+");
            }
            System.out.println();
        }

        System.out.println();

        //right triangle
        for (int i = 0; i < a; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("+");
            }
            System.out.println();
        }

        System.out.println();

        //equilateral triangle
        for (int i = 0; i < a * 2; i += 2) {

            for (int j = a * 2; j > i; j -= 2) {
                System.out.print(" ");
            }
            for (int k = 0; k <= i; k++) {

                System.out.print("+");
            }

            System.out.println();
        }

        System.out.println();

        //diamond
        for (int i = 0; i < a; i += 2) {

            for (int j = a; j > i; j -= 2) {
                System.out.print(" ");
            }
            for (int k = 0; k <= i; k++) {

                System.out.print("+");
            }

            System.out.println();
        }
        for (int i = 0; i < a; i += 2) {

            for (int j = 0; j <= i; j += 2) {
                System.out.print(" ");
            }
            for (int k = a - 1; k > i; k--) {

                System.out.print("+");
            }

            System.out.println();
        }
    }
}
