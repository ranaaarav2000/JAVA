package com.company;

interface sample{
    void meth1();
    void meth2();
}
interface childsample extends sample{
    void meth3();
    void meth4();
}
class maple implements childsample{
    public void meth1(){
        System.out.println("|Hello! I am meth|");
    }
    public void meth2(){
        System.out.println("|Hello! I am meth|");
    }
    public void meth3(){
        System.out.println("|Hello! I am meth|");
    }
    public void meth4(){
        System.out.println("|Hello! I am meth|");
    }

}
public class inheritance_in_interfaces {
    public static void main(String[] args) {
        maple c = new maple();
        c.meth1();
        c.meth2();
        c.meth3();
        c.meth4();

    }
}
