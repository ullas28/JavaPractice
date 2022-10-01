package com.bridgelabz.top_100_codes;

import java.util.Scanner;

//Armstrong number or not using Java
public class ArmstrongNum {
    public static void main(String[] args)
    {
        //variables initialization
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number to check whether its a Armstrong number or not");
        int num = s.nextInt(), reverse = 0;
        int len = order(num);

        if (num == getArmstrongSum(num, len))
            System.out.println(num + " is an Armstrong Number");
        else
            System.out.println(num + " is not an Armstrong Number");

    }

    private static int getArmstrongSum(int num, int order) {
        if(num == 0)
            return 0;

        int digit = num % 10;

        return (int) Math.pow(digit, order) + getArmstrongSum(num/10, order);
    }

    private static int order(int num) {
        int len = 0;
        while (num!=0)
        {
            len++;
            num = num/10;
        }
        return len;
    }
}
