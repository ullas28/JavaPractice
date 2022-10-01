package com.bridgelabz.top_100_codes;

import java.util.Scanner;
//Java Program to Find Greatest of Two Numbers
public class GreatOfTwoNum {
    public static void main (String[]args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter two integers");
        int num1 = s.nextInt(), num2 = s.nextInt();
        if (num1 == num2)
            System.out.println ("both are equal");
        else if (num1 > num2)
            System.out.println (num1 + " is greater");

        else
            System.out.println (num2 + " is greater");

    }
}
