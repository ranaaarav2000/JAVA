package com.company;


class negativeRadius extends Exception{
    @Override
    public String toString(){
        return "Radius cannot be  negative!";
    }

    @Override
    public String getMessage() {
        return "Radius cannot be negative";
    }
}
public class throw_throws {
    public static double area(int r) throws negativeRadius{
        if (r<0){
            throw new negativeRadius();
        }
        double result = Math.PI * r * r;
        return result;
    }
    public static int divide(int a, int b) throws ArithmeticException{
        int result = a/b;
        return result;
    }
    public static void main(String[] args) {
        System.out.println("Note: This program is not capable of calculating the circle's area with negative radius");
        System.out.println("Note: This program is not capable of dividing the number by 0");
        try {
            double ar = area(-1);
            System.out.println(ar);

        }
        catch (Exception e){
            System.out.println("Sorry we failed to divide");
            System.out.println("I think you did not notice that ther is a note there saying that the we are not capable of calculating the circle's area with negative radius");
        }
    }
}
