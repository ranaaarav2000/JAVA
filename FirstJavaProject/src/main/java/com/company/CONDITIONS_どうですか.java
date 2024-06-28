package com.company;
import java.util.Scanner;


public class CONDITIONS_どうですか {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome!Welcome!Welcome everyone to our supercar driving contest!who will win?" );
        System.out.println("be above 18 and drive the beautiful cars!");
        System.out.println("What is your age sir?");
        int age = sc.nextInt();
        if(age>=18){
            System.out.println("Yes sir you can drive");
        }
        else {
            System.out.println("No boy you cannot drive yet!");
        }

    }
}
