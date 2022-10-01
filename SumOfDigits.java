package com.bridgelabz.top_100_codes;
//Sum of digits of a number using Java
import java.util.Scanner;

public class SumOfDigits {
    public static void main (String[]args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number to find sum of its digits");
        int num = s.nextInt(), sum = 0;

        //loop to find sum of digits
        while(num!=0){
            sum += num % 10;
            num = num / 10;
        }

        //output
        System.out.println ("Sum of digits : " + sum);
    }

}
