package org.example;

public class stars {
    static void i(int n){
        for (int i = n ; i>1 ; i-- ){
            for (int j = 1 ; j<=i ; j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
    public static void main(String[] args) {
        i(5);
    }
}
