package com.company;
import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("How many marks were there in your test?");
       float aa = sc.nextInt();
        System.out.println("Enter your marks for english");
       float a = sc.nextInt();
        System.out.println("Enter your marks for maths");
       float b = sc.nextInt();
        System.out.println("Enter your marks for science");
       float c = sc.nextInt();
        System.out.println("Enter your marks for hindi");
       float d = sc.nextInt();
        System.out.println("Enter your marks for Chem");
        float g = sc.nextInt();
        float sum=a+b+c+d+g;
        float per=(sum*100/(aa*5));
        System.out.println("Your percentage is "  +per+ "%" );
    }
}
