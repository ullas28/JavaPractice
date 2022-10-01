package com.bridgelabz.top_100_codes;
//Java Program to Check Whether a Number is Even or Odd
public class EvenOrOdd {
    public static void main(String[] args) {
            int number = 28;

            if (isEven(number))
                System.out.println("Even");
            else
                System.out.println("Odd");
        }
        static boolean isEven ( int num)
        {

            // n & 1 is 1, then odd, else even
            return ((num & 1)!=1);
        }
    }
