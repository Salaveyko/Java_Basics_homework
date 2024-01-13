package com.itvdn.lesson5;

/**
 * Just practical work with logical operations
 */
public class LogicOperation {
    public static void main(String[] args) {
        {
            int x = 5, y = 10, z = 15;
            x += y >> x++ * z;

            //x = 5, y = 10, z = 15
            System.out.println("X = " + x + ", y = " + y + ", z = " + z);
        }

        {
            int x = 5, y = 10, z;
            z = ++x & y * 5;

            //x = 6, y = 10, z = 2
            System.out.println("X = " + x + ", y = " + y + ", z = " + z);
        }

        {
            int x = 5, y = 10, z = 15;
            y /= x + 5 | z;

            //x = 5, y = 0, z = 15
            System.out.println("X = " + x + ", y = " + y + ", z = " + z);
        }

        {
            int x = 5, y = 10, z = 15;
            z = x++ & y * 5;

            //x = 6, y = 10, z = 0
            System.out.println("X = " + x + ", y = " + y + ", z = " + z);
        }

        {
            int x = 5, y = 10, z = 15;
            x = y << x++ ^ z;

            //x = 495(335), y = 10, z = 15
            System.out.println("X = " + x + ", y = " + y + ", z = " + z);
        }
    }
}
