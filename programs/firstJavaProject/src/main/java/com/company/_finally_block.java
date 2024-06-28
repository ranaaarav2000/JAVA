package com.company;

public class _finally_block {
    public static int greet(){
        try {
            int a = 50;
            int b = 25;
            int c = a/b;
            return c;
        }
        catch (Exception e){
            System.out.println(e);
        }
        finally {
            System.out.println("cleaning up resources.....This is the end of the program");
            System.out.println("the value is: ");
        }

        return 0;
    }
    public static void main(String[] args) {
       int k = greet();
        System.out.println(k);
    }
}
