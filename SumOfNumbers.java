package com.bridgelabz.top_100_codes;

/**
 *
 * @author ULLASKUMAR K
 *Find the Sum of N Natural Numbers in Java
 */
public class SumOfNumbers {
    public static void main (String[]args)
{
    /*
    * @param input arguments
    * */

    int n = 10;
    int sum = getSum (n);
    System.out.println (sum);
}

    static int getSum (int n)
    {
        if (n == 0)
            return n;

        return n + getSum (n - 1) ;
    }
}