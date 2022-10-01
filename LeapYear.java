package com.bridgelabz.top_100_codes;

import java.util.Scanner;

//Java Program to Check Leap Year or not
public class LeapYear {
        public static void main (String[]args)
        {
            Scanner s= new Scanner(System.in);
            System.out.println("Enter year to check whether it is a leap year or not");
            int year = s.nextInt();

            if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0))
                System.out.println (year + " is a Leap Year");

                //not leap year
            else
                System.out.println (year + " is not a Leap Year");

        }
}
