package com.itvdn.lesson_03;

import java.util.Scanner;

public class ArithmeticAverage {
    public static void main(String[] args) {

        //Task 2
        Scanner in = new Scanner(System.in);
        double x, y, z, rez;

        System.out.println("Enter x, y, z:");
        x = in.nextInt();
        y = in.nextInt();
        z = in.nextInt();

        rez = (x + y + z) / 3;

        System.out.println("Arithmetic average of = " + rez);
    }
}
