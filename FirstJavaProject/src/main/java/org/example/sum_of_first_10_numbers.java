package org.example;

public class sum_of_first_10_numbers {
    static void sum(int n){
        int sum = 0;
        for(int i=1; i<=n; i++)
        {
            sum += i;
            System.out.println(sum);
        }

    }
    public static void main(String[] args) {
     sum(10);
    }
}
