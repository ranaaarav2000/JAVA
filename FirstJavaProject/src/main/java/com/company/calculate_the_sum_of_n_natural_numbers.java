package com.company;

public class calculate_the_sum_of_n_natural_numbers {
    static int i(int n){
        if (n==1){
            return 1;
        }
        else {
            return n + i(n-1);
        }
    }

    public static void main(String[] args) {
        System.out.println(i(4));
    }
}
