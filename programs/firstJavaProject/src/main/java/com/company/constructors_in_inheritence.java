package com.company;


import java.sql.SQLOutput;

class base1{
    public int x;

    base1(){
        System.out.println("I am a constructor");
    }

    base1(int x){
        System.out.println("Constructor's value is "+x);
    }
}

class derived1 extends base1{

    derived1(){
        System.out.println("I am the derived class constructor");
    }
    derived1(int x, int y){
        super(x);
        System.out.println("I am the derived class constructor with the value "+y);
    }

}
class ChildOfDerived extends derived1{
    ChildOfDerived(){
        System.out.println("I am child of derived constructor");
    }
    ChildOfDerived(int x,int y,int z){
        super(x, y);
        System.out.println("I am overloaded child of derived constructor with value as "+z);
    }
}


public class constructors_in_inheritence {
    public static void main(String[] args) {
//        base1 a = new base1();
//        derived1 b = new derived1();

//        Constructor of the base1 class will also run
//        derived1 b = new derived1(12,19);
//        Constructor of the base1 class will also run
        ChildOfDerived ab = new ChildOfDerived(12, 13, 15);
    }
}
