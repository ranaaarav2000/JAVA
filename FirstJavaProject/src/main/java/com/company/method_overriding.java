package com.company;


class A{
    public int aarav(){
        return 4;
    }
    public void meth2(){
        System.out.println("I am method 2 of class A");
    }
}

class b extends A{
    @Override
    public void meth2(){
        System.out.println("I am method 2 of class B");
    }
    public void meth3(){
        System.out.println("I am method 3 of class B");
    }
}
public class method_overriding {
    public static void main(String[] args) {
        A a = new A();
        b b = new b();
        a.meth2();
        b.meth2();
    }
}