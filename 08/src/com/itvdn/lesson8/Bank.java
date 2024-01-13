package com.itvdn.lesson8;

import java.util.Scanner;

/**
 * A simple program that allows you to determine whether the client has repaid the loan.
 * The bank employee enters the payment amount and the program determines whether the amount
 * is not less than the minimum payment amount. After, the program displays an account status.
 */
public class Bank {

    private final static double MIN_DEPOSIT = 100;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double arrears = 700;

        while (true) {
            System.out.print("Enter the amount of money deposited: ");
            double s = scan.nextDouble();

            if (s > 0) {
                arrears = check(s, arrears);
            } else {
                System.out.println("What`s wrong with you? Try again.");
            }

            System.out.println("\nExit program? (y): ");
            if (scan.next().charAt(0) == 'y') {
                break;
            }
        }
    }

    /**
     * Checking account status and displaying the info.
     *
     * @param s       contribution amount
     * @param arrears amount owed
     * @return the deducted amount of debt
     */
    public static double check(double s, double arrears) {
        arrears -= s;

        if (s < MIN_DEPOSIT && arrears > 0) {
            System.out.println("The amount paid is too small, " +
                    "the minimum contribution amount this month is UAH 100. " +
                    "Please, makes balance of UAH " + (MIN_DEPOSIT - s) + " in the near future.");
        }
        System.out.println("You contributed UAH " + s + ".");

        if (arrears > 0) {
            System.out.println("Your debt is UAH " + arrears + ".");
        } else if (arrears < 0) {
            System.out.println("Your overpayment is UAH " + (arrears * -1) + ".");
        } else {
            System.out.println("You have no debt on the loan.");
        }

        return arrears;
    }
}
