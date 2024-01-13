package com.itvdn.lesson_03;

import java.util.Scanner;

public class ArithmeticOperations {
    public static void main(String[] args) {

        //Additional task
        int x, y;
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter x, y:");
        x = scan.nextInt();
        y = scan.nextInt();

        System.out.println("Addition: " + (x + y));
        System.out.println("Subtraction: " + (x - y));
        System.out.println("Multiplication: " + (x * y));
        System.out.println("Division: " + (x / y));
    }
}
