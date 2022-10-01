package com.bridgelabz.top_100_codes;

import java.util.Scanner;

//Reverse a given number in Java
public class ReverseNum {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        System.out.println("Enter a number to revrese it");
        //variables initialization
        int num = s.nextInt(), rev = 0;

        //output
        System.out.println("Reversed Number: " + getReverse(num, rev));
    }

    static int getReverse(int num, int rev) {
        if (num == 0)
            return rev;

        int rem = num % 10;
        rev = rev * 10 + rem;

        return getReverse(num / 10, rev);
    }
}
