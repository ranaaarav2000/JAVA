package com.company;

public class method_multiplication_of_n {
    static void multiplicationOfN(int n){
        for (int i = 1; i <= 10; i++){
            System.out.printf("%d X %d = %d\n",n,i,n*i);
        }
    }
    public static void main(String[] args) {
        multiplicationOfN(5);
    }
}
