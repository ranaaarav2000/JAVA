package com.company;


class MyThreadRunnable implements Runnable{
    public void run(){
        System.out.println("I am a thread not a threat");
    }
}
class MyThreadRunnable2 implements Runnable{
    public void run(){
        System.out.println("I am thread 2 not the threat 2");
    }
}
public class thread {
    public static void main(String[] args) {
        MyThreadRunnable bullet1= new MyThreadRunnable();
        Thread gun1 = new Thread(bullet1);
        
        MyThreadRunnable2 bullet2 = new MyThreadRunnable2();
        Thread gun2 = new Thread(bullet2);
        gun1.start();
        gun2.start();
    }
}
