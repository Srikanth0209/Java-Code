package com.company;

public class Main {
    public static double InterestRate(double amount , double interest){
        return (amount*(interest/100));
    }

    public static void main(String[] args) {
	// write your code here
        for (double i = 8.0 ; i >= 2.0 ; i--){
            System.out.println("10,000  at"+ i +" % Interest is :"+InterestRate(10000.0,
                    i));

        }
        System.out.println("*****************************");
        for (double i = 2.0 ; i <= 8.0 ; i++){
            System.out.println("10,000  at"+ i +" % Interest is :"+InterestRate(10000.0,
                    i));

        }
    }
}
