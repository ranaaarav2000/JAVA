package com.company;

public class arrays {
    public static void main(String[] args) {
        int [] marks = new int[5];
        marks[0] = 100;
        marks[1] = 98;
        marks[2] = 80;
        marks[3] = 96;
        marks[4] = 50;
        System.out.println(marks[4]);

        //2. We can also put the valus in the same line.
        int [] markss = {99, 70, 89, 93, 80};
        System.out.println(markss[3]);
    }
}
