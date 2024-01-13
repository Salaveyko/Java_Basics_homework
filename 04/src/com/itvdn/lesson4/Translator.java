package com.itvdn.lesson4;

import java.util.Scanner;

/**
 * Simple Translator class which translates English words into Ukrainian
 */
public class Translator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter word: ");
        String word = in.next();

        switch (word) {
            case "cloud":
                System.out.println("Хмара");
                break;
            case "snow":
                System.out.println("Сніг");
                break;
            case "dew":
                System.out.println("Роса");
                break;
            case "rainbow":
                System.out.println("Райдуга");
                break;
            case "fog":
                System.out.println("Туман");
                break;
            case "ice":
                System.out.println("Лід");
                break;
            case "rain":
                System.out.println("Дощ");
                break;
            case "wind":
                System.out.println("Вітер");
                break;
            case "sun":
                System.out.println("Сонце");
                break;
            case "oxygen":
                System.out.println("Кисень");
                break;
            default:
                System.out.println("Undefined");
        }
    }
}
