package com.company;


class MyNewthr1 extends Thread{
    public MyNewthr1(String name) {
        super(name);
    }
    public void run(){
        System.out.println("Thank you " + this.getName());
//        while (true){
//            System.out.println("I am a thread");
//        }
    }
}

class MyNewthr2 extends Thread{
    public void run(){
        System.out.println("Thank you " + this.getName());
//        while (true){
//            System.out.println("I am a thread");
//        }
    }
}
public class thread_methods {
    public static void main(String[] args) {
        MyNewthr1 t1 = new MyNewthr1("ANATA");
        MyNewthr1 t2 = new MyNewthr1("ANATA NO KUNI E NAN SAI KURUMA O UNTENSHITE MO II DESU KA?");
        t1.start();
       try {
           t1.join();
       }
       catch (Exception e){
           System.out.println(e);
       }
        t2.start();
    }
}
