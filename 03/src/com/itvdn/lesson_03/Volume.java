package com.itvdn.lesson_03;

import java.util.Scanner;

public class Volume {
    public static void main(String[] args){

        //Task 4 (Calculating the area and volume of a cylinder)
       Scanner in = new Scanner(System.in);

        final double PI = Math.PI;
        double r, h, v, s;

        System.out.println("Enter h and r:");
        h = in.nextDouble();
        r = in.nextDouble();

        s = 2 * PI * r * (r + h);
        v = PI * Math.pow(r, 2) * h;

        System.out.println("S = " + s + "\nV = " + v);
    }
}