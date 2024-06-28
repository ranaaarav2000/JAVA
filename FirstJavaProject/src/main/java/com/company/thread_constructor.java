package com.company;


class Mythr extends Thread{
    public Mythr(String name) {
        super(name);
    }
    public void run(){
        int i = 34;
        System.out.println("Thank you");
//        while (true){
//            System.out.println("I am a thread");
//        }
    }
}
public class thread_constructor {
    public static void main(String[] args) {
        Mythr trukiVhisalyuu = new Mythr("Aarav");
        Mythr trukiVhisalyuuu1111 = new Mythr("Erik Paddlehands");
        trukiVhisalyuu.start();
        System.out.println("The id of the thread truki vhisalyuu is "+trukiVhisalyuu.getId());
        System.out.println("The id of the thread truki vhisalyuu is "+trukiVhisalyuu.getName());
        System.out.println("The id of the thread truki vhisalyuuu1111 is "+trukiVhisalyuuu1111.getId());
        System.out.println("The id of the thread truki vhisalyuuu1111 is "+trukiVhisalyuuu1111.getName());

    }
}
