package org.example;

public class recursive_method_ {
    static void pattern1(int n){
        if (n > 0){
            pattern1(n - 1);
            for (int i = n; i < 1; i--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
       pattern1(4);
    }
}
