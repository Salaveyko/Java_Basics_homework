package com.itvdn.lesson8;

import java.util.Scanner;

/**
 * The program calculates the number of possible routs for the delivery of goods for customers
 * by one car. !Recursion!
 */
public class Delivery {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of customers:");
        int clientsNumber = scan.nextInt();

        System.out.println("Number of possible delivery options - " + delivery(clientsNumber));
    }

    public static int delivery(int clientN) {
        return clientN == 0 ? 1 : clientN * delivery(clientN - 1);
    }
}
