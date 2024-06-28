package com.company;
import java.util.Scanner;

public class whats_your_name {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("what is your name?");
        String a = sc.next();
        System.out.println("Hello "+a+" ,have nice day!");
    }
}
