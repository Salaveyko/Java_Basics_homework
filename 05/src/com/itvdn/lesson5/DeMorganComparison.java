package com.itvdn.lesson5;

/**
 * De Morgan Comparison in action
 */
public class DeMorganComparison {
    public static void main(String[] args) {
        boolean a = false, b = false;
        System.out.println("A | B = " + ((a | b) ? "true" : "false"));
        System.out.println("!(A & B) = " + ((!(!a & !b)) ? "true" : "false"));
    }
}
