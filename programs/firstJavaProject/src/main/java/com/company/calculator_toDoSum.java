package com.company;
import java.util.Scanner;

public class calculator_toDoSum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first number");
        float a = sc.nextFloat();
        System.out.println("Enter the second number");
        float b = sc.nextFloat();
        float bcd = (a+b);
        System.out.println("Th sum is " +bcd);
    }
}
