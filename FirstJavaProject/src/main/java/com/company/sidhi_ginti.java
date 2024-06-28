package com.company;

public class sidhi_ginti {
    static void i(int n){
        for(int i = n;i>0;i--){
            for(int j = 0; j<i;j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
    public static void main(String[] args) {
        i(5);
    }
}
