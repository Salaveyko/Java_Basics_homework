package com.itvdn.lesson7;

import java.util.Scanner;

/**
 * The program performs currency conversion.
 */
public class Conversion {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double cash, ex;

        System.out.print("Enter the amount of money to exchange: ");
        cash = in.nextDouble();
        System.out.print("Enter the exchange rate: ");
        ex = in.nextDouble();

        System.out.println("Result of exchange = " + conversion(cash, ex));
    }

    private static double conversion(double money, double exchange) {
        return money * exchange;
    }
}
