package practice.practices;

import java.util.Scanner;

public class demonstrating_logical_runtime_syntax {
    public static void main(String[] args) {
//        Syntax error
//        int a = 33
//        Syntax error


//        Logical error
//        for (int i = 1; i>11;i++){
//           System.out.println(i);
//        }
//        Logical error

//        runtime error: only when you put 0 in the other number!
        int k;
        int v;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number.");
        k = sc.nextInt();
        System.out.println("enter the second number. ");
        v = sc.nextInt();
        System.out.println("The value of your number is "+k/v);

    }
}
