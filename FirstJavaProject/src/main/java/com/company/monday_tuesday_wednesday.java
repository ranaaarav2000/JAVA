package com.company;
import java.util.Scanner;


public class monday_tuesday_wednesday {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("which day num of the week is today");
        int a  = sc.nextInt();
        switch (a) {
            case 1 -> System.out.println("Today is Monday");
            case 2 -> System.out.println("Today is Tuesday");
            case 3 -> System.out.println("Today is Wednesday");
            case 4 -> System.out.println("Today is Thursday");
            case 5 -> System.out.println("Today is Friday");
            case 6 -> System.out.println("Today is Saturday");
            case 7 -> System.out.println("Today is Sunday");
            case 8 -> System.out.println("ERROR: Sorry, if you have eyes and you can see in the calendar, you will notice that there is not a 8th day, Egyptian!");
        }
    }
}
