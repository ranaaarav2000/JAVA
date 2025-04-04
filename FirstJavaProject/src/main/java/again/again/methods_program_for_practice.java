package again.again;

import java.util.Scanner;

public class methods_program_for_practice {
    static String hello(String a, String b){
        String c;
        c = (a + b);
        return c;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String x = "hello Mr.";
        System.out.println("Hello, What is your name?");
        String y = sc.nextLine();
        String z;
        z = hello(x, y);
        System.out.println(z);


        /* This program can be difficult for some of you guyz.... but it is a good program so that you will know what have you
        remembered till now.... so study hard!
         */
    }
}
