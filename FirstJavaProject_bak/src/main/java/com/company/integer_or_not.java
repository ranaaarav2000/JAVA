package com.company;
import java.util.Scanner;


public class integer_or_not {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("try to add a decimal num");
        boolean b1=sc.hasNextInt();
        System.out.println(b1);
    }
}
