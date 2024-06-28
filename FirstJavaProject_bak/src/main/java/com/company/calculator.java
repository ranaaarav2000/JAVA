package com.company;
import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("How many marks were there in your test?");
        int aa = sc.nextInt();
        System.out.println("Enter your marks for english");
        int a = sc.nextInt();
        System.out.println("Enter your marks for maths");
        int b = sc.nextInt();
        System.out.println("Enter your marks for science");
        int c = sc.nextInt();
        System.out.println("Enter your marks for hindi");
        int d = sc.nextInt();
        System.out.println("Enter your marks for Chem");
        int g = sc.nextInt();
        int sum=a+b+c+d+g;
        int per=(sum*100/(aa*5));
        System.out.println("Your percentage is "  +per+ "%" );
    }
}
