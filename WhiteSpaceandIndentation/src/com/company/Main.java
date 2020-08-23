package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int myvariable=619;
        System.out.println("My Variable is :" + myvariable);
        int i = myvariable++;
        System.out.println("My Variable is :" + i);
        int j = myvariable--;
        System.out.println("My Variable is :" + j);
        if (myvariable == 50)
        {
            System.out.println("Printed");
        }
        else
        {
            System.out.println("Your Variable is Not 50 kthnxbyee");
        }
    }
}
