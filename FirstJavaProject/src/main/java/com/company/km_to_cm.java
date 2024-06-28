package com.company;
import java.util.Scanner;
public class km_to_cm {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number in km");
        int a= sc.nextInt();
        int b= (a*1000*100);
        System.out.println(a+"km in mm is "+b+"mm");
    }
}
