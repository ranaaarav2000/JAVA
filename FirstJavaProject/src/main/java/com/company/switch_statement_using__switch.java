package com.company;
import java.util.Scanner;

public class switch_statement_using__switch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("What were your marks in english?(out of 50)");
        int e = sc.nextInt();
        System.out.println("What were your marks in Science?");
        int s = sc.nextInt();
        System.out.println("What were your marks in maths");
        int m = sc.nextInt();
        float avg = (e+s+m)/3.0f;
        if(avg>=40 && e>= 33 && s>= 33 && m>= 33){
            System.out.println("You are passed");
        }
        else {
            System.out.println("You are fail!");
        }
        System.out.printf("Your average is %f",avg);

    }
}
