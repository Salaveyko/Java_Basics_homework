package com.itvdn.lesson_03;

import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {

        //Task 3 (Circle area calculating)
        final double PI = Math.PI;
        double s, r;

        Scanner in = new Scanner(System.in);

        System.out.println("Enter r:");
        r = in.nextFloat();

        s = PI * Math.pow(r, 2);

        System.out.println("Circle square equals " + s);
    }
}
