package com.company;

public class varArgs {
        static int sum (  int ...arr){
        int result = 0;
        for (int a: arr){
            result += a;
        }
        return result;
    }
//    we can also write it as:
//    static int sum ( int x, int ...arr){
//        int result = x;
//        for (int a: arr){
//            result += a;
//        }
//        return result;
//    }
    public static void main(String[] args) {
        System.out.println(sum(4,5));
        System.out.println(sum(4,5,6,7,8,9,0));
        System.out.println(sum(1,2,3,4,5,6,7,8,9,0,10,11,12345,22));
    }
}
