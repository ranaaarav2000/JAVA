package com.company;

import java.util.Scanner;

public class errors_slash_java {

    public static void main(String[] args) {

//        SYNTAX ERROR DEMO
//        int a = 0 // ERROR: no semicolon!
//        b = 34 // ERROR: b not declared!


//        LOGICAL ERROR DEMO
//         write a program to print all prime numbers between 1 and 10
        System.out.println(2);
        for (int i = 1; i<4; i++){
            System.out.println(2*i+1);
        }

//        RUNTIME ERROR
        System.out.println("Enter the value of your number here ");
        float k;
        Scanner sc = new Scanner(System.in);
        k = sc.nextFloat();
        System.out.println("Integer part of 1000 divided by your number is "+1000/k);
        if (k == 0){
            System.out.println("ERROR: we can not divide any number by 0");
        }
    }
}
