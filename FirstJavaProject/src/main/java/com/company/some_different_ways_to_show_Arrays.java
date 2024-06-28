package com.company;

public class some_different_ways_to_show_Arrays {
    public static void main(String[] args) {
        int[]marks = {98,99,70,89,100};
//        String[]students = {"Harry","Lavish","Aarav","Shubham","Rohan"};
//        System.out.println(students.length);
//        System.out.println(students[2]);


//        Displaying the array(Semi-pro Way)
//        System.out.println("Printing using \"for\" loop: ");
//        for (int i = 0; i<marks.length;i++){
//            System.out.println(marks[i]);



//        Displaying the array(Pro Way)
        System.out.println("Printing using the \"Pro\" Way: ");
        for (int element: marks){
            System.out.println(element);
        }
    }
}
