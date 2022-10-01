package com.bridgelabz.top_100_codes;
//Find the Sum of the Numbers in a Given Range in Java
public class SumInGivenRange {
    public static void main (String[]args)
    {
        int a = 5;
        int b = 10;

        int sum = 0;

        for (int i = a; i <= b; i++)
            sum = sum + i;
        System.out.println ("The sum is " + sum);
    }
}
