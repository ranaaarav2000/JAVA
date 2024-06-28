package advancedpracticesets;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class DateClass {
    public static void main(String[] args) {
        // I am giving you guyz a challenge that make a program to ask anyone using the program that "Do you want to know the date and time"?
        //If the answer is yes or Yes then print the date formatted like this: Sat, 29 Jun, 2024
        //If the answer is No or no then print "Ok got it"
        //for the time if the user says yes or Yes then print the local time and format it like this 22:34:45
        //If the answer is No or no then print "Ok got it"
        //Sol^ is given bellow but do the program first than see the Sol^
        //No cheating..
        //Above are the pakages you need to install :)








































        Scanner sc = new Scanner(System.in);

        System.out.println("Do you want to know the time and date?(Only Yes and No)");
        String asd = sc.nextLine();
        if (asd.equals("Yes")){
            LocalDateTime today = LocalDateTime.now();
            DateTimeFormatter format = DateTimeFormatter.ofPattern("E, dd MM, yyyy ");
            String formatted_Date = today.format(format);
            System.out.println("Today is "+ formatted_Date);
        }

      else if (asd.equals("yes")){
            LocalDateTime today = LocalDateTime.now();
            DateTimeFormatter format = DateTimeFormatter.ofPattern("E, dd MM, yyyy");
            DateTimeFormatter format2 = DateTimeFormatter.ofPattern("H:mm:ss");
            String formatted_Date = today.format(format);
            String formatted_Date2 = today.format(format2);
            System.out.println("Today is "+ formatted_Date);
            System.out.println("Now, the time is "+ formatted_Date2);
        }
        else if (asd.equals("No")){
            System.out.println("Ok, got it");
        }
        else if (asd.equals("no")){
            System.out.println("Ok, got it");
        }
    }
}
