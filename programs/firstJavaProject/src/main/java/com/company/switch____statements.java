package com.company;
import java.util.Scanner;



public class switch____statements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("What is your age");
        int age = sc.nextInt();
        switch (age) {
            case 10, 12, 13, 14, 15, 16, 17 -> System.out.println("You are a child");
            case 18 -> System.out.println("You are about to join the adult clan!");
            case 23, 22 -> System.out.println("You are about get a job");
            case 25, 24 -> System.out.println("You are about to get married");
            case 55, 56, 57, 58, 59, 60 -> System.out.println("You have joined the senior clan!");
            default -> System.out.println("Great");
        }
    }
}
