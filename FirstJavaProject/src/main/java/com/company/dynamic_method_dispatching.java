package com.company;



class Phone{
    public void on(){
        System.out.println("Turning on Phone...");
    }
    public void greet(){
        System.out.println("Good Morning");
    }
}

class Smartphone extends Phone{
    @Override
    public void on(){
        System.out.println("Turning on Smartphone...");

    }
    public void Welcome(){
        System.out.println("I welcome you to Grand Park");
    }
}
public class dynamic_method_dispatching {
    public static void main(String[] args) {
        Phone obj = new Smartphone(); // Allowed
//        Smartphone object = new Phone();     // Not Allowed!
        obj.greet();
        obj.on();
    }

}
