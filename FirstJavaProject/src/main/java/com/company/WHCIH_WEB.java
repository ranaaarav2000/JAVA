package com.company;
import java.util.Scanner;

public class WHCIH_WEB {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Type the URL at end (.com)and i will find it out(It only supports (.com .org .in) only.)");
        String str = sc.next();
        if (str.endsWith(".org")){
            System.out.println("This is an organizational website");
        }
        else if (str.endsWith(".in")) {
            System.out.println("This is an indian website");
        }
        else if (str.endsWith(".com")) {
            System.out.println("This is a commercial website");
        }
        else {
            System.out.println("Sorry!We do not recognize this URL");
        }
    }
}
