package com.bridgelabz.top_100_codes;
//Check if a Number is Positive or Negative in Java
public class PositveNumber {
    public static void main(String[] args) {
        int num = -9;
        if (num >= 0) {
            if (num == 0) {
                System.out.println("Number is zero");
            } else
                System.out.println("Number is positive");
        } else {
            System.out.println("Number is negative");
        }
        if (num == 0){
            System.out.println("Number is zero");
        }else {
            String result = num > 0 ? "Poitive number" : "Negative number";
            System.out.println(result);
        }
    }
    }
