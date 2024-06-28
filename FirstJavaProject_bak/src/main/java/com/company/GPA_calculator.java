package com.company;
import java.util.Scanner;

public class GPA_calculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("How many hours did you study in 1st year");
        float d=sc.nextFloat();
        System.out.println("How many hours did you study in 2nd year");
        float e=sc.nextFloat();
        System.out.println("How many hours did you study in 3rd year");
        float f=sc.nextFloat();
        System.out.println("What was your in 1st year");
        float g=sc.nextFloat();
        System.out.println("What was your grade in 2nd year");
        float h=sc.nextFloat();
        System.out.println("What was your grade in 3rd year");
        float i =sc.nextFloat();

        float abc= (d*g);
        float def= (e*h);
        float ghi= (f*i);
        float g1= (abc+def+ghi);
        float g2= (d+e+f);
        float gpa= (g1/g2);
        System.out.println("Your total gpa is " +gpa);
    }
}
