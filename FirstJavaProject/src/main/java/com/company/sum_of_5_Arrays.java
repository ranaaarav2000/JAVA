package com.company;

public class sum_of_5_Arrays {
    public static void main(String[] args) {
        float []ima = {4.12f,8.3345f,6.3f,33.23456789f,1011.12331f};
        float sum = 0;
        for (float elements:ima){
            sum = sum+elements;

        }
        System.out.println(sum);
    }
}
