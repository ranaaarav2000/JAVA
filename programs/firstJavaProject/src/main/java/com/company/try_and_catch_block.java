package com.company;
public class try_and_catch_block {
    public static void main(String[] args) {
        int a = 6000;
        int b = 0;
        try {
            int c = a / b;
            System.out.println("The result is "+c);
        }
        catch (Exception e){
            System.out.println("We failed to divide. Reason is: ");
            System.out.println(e);
        }
        System.out.println("End of the program");
    }
}
