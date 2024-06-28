package com.company;


class myThread extends Thread{
    @Override
    public void run(){
        int i = 0;
        while (i<10){
            System.out.println("My cooking thread is r|u|n|n|i|n|g|");
            System.out.println("I am H|A|P|P|Y|");
            i++;
        }
    }
}
class myThread2 extends Thread{
    @Override
    public void run(){
        int i = 0;
        while (i<10){
            System.out.println("Thread 2 for c|h|a|t|t|i|n|g|");
            System.out.println("I am H|A|P|P|Y|");
            i++;
        }

    }
}
public class THreading_using_extending_THRead {
    public static void main(String[] args) {
        myThread t1 = new myThread();
        myThread2 t2 = new myThread2();
        t1.start();
        t2.start();
    }
}
