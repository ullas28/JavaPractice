package com.bridgelabz.top_100_codes;
//Find the Greatest Number Among Three Numbers in Java
import java.util.Scanner;

public class GrtOf3Num {
    public static void main (String[]args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter three integers");
        int num1 = s.nextInt(), num2 = s.nextInt(), num3 = s.nextInt();
        int temp, result;

        // find the largest b/w num1 and num2 & store in temp
        temp = num1>num2 ? num1:num2;

        // find the largest b/w temp and num3 & finally printing it
        result = temp>num3 ? temp:num3;
        System.out.println (result + " is the greatest");
    }
}
