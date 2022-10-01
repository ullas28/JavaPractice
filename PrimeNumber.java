package com.bridgelabz.top_100_codes;

import java.util.Scanner;

//Java Program to Check Whether a Number is Prime or Not
public class PrimeNumber {
    public static void main (String[]args)
    {
        Scanner s =new Scanner(System.in);
        System.out.println("Enter the number to check whether its prime or not");
        int n = s.nextInt();
        int i;
        boolean isprime = true;
        // 0 and 1 are not prime numbers also, negative numbers are not prime
        if (n < 2)
        {
            isprime = false;
        }
        else
        {
            for (i = 2; i < n; i++)
            {
                if (n % i == 0)
                {
                    isprime = false;
                    break;
                }
            }
        }
        String result = isprime ? "Prime" : "not Prime";
        System.out.println ("The number " + n + " is : " + result);
    }
}
