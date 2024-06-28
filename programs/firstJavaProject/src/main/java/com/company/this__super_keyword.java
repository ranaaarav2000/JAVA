package com.company;

class aClass{
    int a;

    public int getA(){
       return a;
    }
    aClass(int a) {
       this.a = a;
    }
    public int returnOne(){
        return 1;
    }
}

class twoClass extends aClass{
     twoClass(int c) {
         super(c);
         System.out.println("私　は　クラス　です");
    }
}
public class this__super_keyword {
    public static void main(String[] args) {
        aClass eb = new aClass(23);
        twoClass ab = new twoClass(5);
        System.out.println(eb.getA());
    }
}
