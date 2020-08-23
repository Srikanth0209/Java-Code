package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        char switchCase = 'F';
        switch (switchCase){
            case 'A':
                System.out.println("A was Found");
                break;
            case 'B':
                System.out.println("B was Found");
                break;
            case 'C': case 'D': case 'E':
                System.out.println(switchCase + "was Found");
                break;
            default:
                System.out.println("Could not find A B C D or E");
        }

    }
}
