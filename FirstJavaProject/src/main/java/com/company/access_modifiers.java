package com.company;


class C1{
    public int x = 5;
    protected int y = 45;
    int z = 46;
    private int a = 78;
    public void meth1(){
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        System.out.println(a);

    }
}

public class access_modifiers {
    public static void main(String[] args) {
        C1 c = new C1();
        c.meth1();
    }
}
