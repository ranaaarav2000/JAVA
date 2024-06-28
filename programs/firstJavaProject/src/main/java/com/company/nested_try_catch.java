package com.company;

import java.util.Scanner;

public class nested_try_catch {
    public static void main(String[] args) {
        int [] marks = {7, 56, 6};
        System.out.println("Enter the array index");
        Scanner sc = new Scanner(System.in);
        int ind = sc.nextInt();


        try {

            System.out.println("The value of the index is:");
            try {
                System.out.println(marks[ind]);
            }
            catch (ArrayIndexOutOfBoundsException e){
                System.out.println("Sorry, this index does not exist");
                System.out.println("Exception in level 2");
            }
        }
        catch (Exception e){
            System.out.println("Exception in level 1");
        }
    }
}
