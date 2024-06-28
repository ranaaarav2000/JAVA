package com.company;

public class in_array_or_not {
    public static void main(String[] args) {
        float []ima = {4.12f,8.3345f,6.3f,33.23456789f,1011.12331f};
        float sum = 4.123f;
        boolean not = false;
        for (float elements:ima){
            if (sum==elements){
                not = true;
                break;
            }

        }
        if (not) {
            System.out.println("It is in the array.");
        }
            else {
                System.out.println("Value is not present in your array.");
            }
        }
}
