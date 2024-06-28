package com.company;

import java.util.Scanner;

public class handling_specific_exceptions {
    public static void main(String[] args) {
        int [] marks = {7, 56, 6};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Array index");
        int in = sc.nextInt();
        System.out.println("Enter the number you want to divide with");
        int ind = sc.nextInt();
        try {
            System.out.println("The value at array index entered is "+marks[in]);
            System.out.println("The value of array-value/number is "+marks[in]/ind);
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("arrayIndexOutOfBoundsException occured!");
        }
        catch (Exception e) {
            System.out.println("Some other exception occured!");
        }
    }
}
