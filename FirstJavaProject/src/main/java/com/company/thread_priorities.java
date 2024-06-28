package com.company;


class Mythr1 extends Thread{
    public Mythr1(String name) {
        super(name);
    }
    public void run(){
        System.out.println("Thank you " + this.getName());
//        while (true){
//            System.out.println("I am a thread");
//        }
    }
}
public class thread_priorities {
    public static void main(String[] args) {
        Mythr1 t1 = new Mythr1("Jokke");
        Mythr1 t2 = new Mythr1("Erik");
        Mythr1 t3  = new Mythr1("Mikka ");
        Mythr1 t4  = new Mythr1("Lassi");
        Mythr1 t5  = new Mythr1("Otto");
        t1.setPriority(Thread.MAX_PRIORITY);
        t2.setPriority(Thread.MIN_PRIORITY);
        t3.setPriority(Thread.MIN_PRIORITY);
        t4.setPriority(Thread.MIN_PRIORITY);
        t5.setPriority(Thread.MIN_PRIORITY);

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
    }
}
