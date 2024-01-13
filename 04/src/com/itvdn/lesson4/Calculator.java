package com.itvdn.lesson4;

import java.util.Scanner;

/**
 * The simple calculator application with console UI
 */
public class Calculator {
    public static void main(String[] args) {

        boolean exit = false;

        while (!exit) {
            double a, b, rez = 0;
            char sign;
            Scanner scan = new Scanner(System.in);

            System.out.print("Enter the expression: ");
            a = scan.nextDouble();
            sign = scan.next().charAt(0);
            b = scan.nextDouble();

            switch (sign) {
                case '+':
                    rez = a + b;
                    break;
                case '-':
                    rez = a - b;
                    break;
                case '*':
                    rez = a * b;
                    break;
                case '/':
                    if (b != 0) {
                        rez = a / b;
                    } else {
                        System.out.println("ERROR: b = 0!!");
                        continue;
                    }
                    break;
                default:
                    System.out.println("Invalid action entered. Try again...");
                    continue;
            }

            System.out.println(a + " " + sign + " " + b + " = " + rez);
            System.out.print("Press Y/y to exit: ");
            exit = scan.next().equalsIgnoreCase("y");
        }
    }
}
