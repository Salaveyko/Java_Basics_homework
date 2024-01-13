package com.itvdn.lesson6;

import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a, b;

        System.out.print("Enter a: ");
        a = in.nextInt();
        System.out.print("Enter b: ");
        b = in.nextInt();

        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
