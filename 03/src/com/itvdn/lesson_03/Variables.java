package com.itvdn.lesson_03;

public class Variables {
    static public void main(String[] args) {

        //Task 1
        {
            int x = 10, y = 12, z = 3;
            x += y - x++ * z;
            //x = -8, y = 12, z = 3
            System.out.println(x + " " + y + " " + z);
        }
        {
            int x = 10, y = 12, z = 3;
            z = --x - y * 5;
            //x = 9, y = 12, z = -51
            System.out.println(x + " " + y + " " + z);
        }
        {
            int x = 10, y = 12, z = 3;
            y /= x + 5 % z;
            //x = 10, y = 1, z = 3
            System.out.println(x + " " + y + " " + z);
        }
        {
            int x = 10, y = 12, z = 3;
            z = x++ + y * 5;
            //x = 11, y = 12, z = 70
            System.out.println(x + " " + y + " " + z);
        }
        {
            int x = 10, y = 12, z = 3;
            x = y - x++ * z;
            //x = -18, y = 12, z = 3
            System.out.println(x + " " + y + " " + z);
        }
    }
}
