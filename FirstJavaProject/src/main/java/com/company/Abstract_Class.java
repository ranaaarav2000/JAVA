package com.company;


abstract class base2{
    public base2() {
        System.out.println("I am a constructor.");
    }
    public void sayHello(){
        System.out.println("Hello");
    }
    abstract public void greet2();
    abstract public void greet3();

}

class Child extends base2{
    @Override
    public void greet2() {
        System.out.println("Good Morning");
    }
    @Override
    public void greet3() {
        System.out.println("Good Afternoon");
    }
}
public class Abstract_Class {
    public static void main(String[] args) {
        Child d = new Child();
        d.greet3();
    }
}
