package com.company;


class base{
    int x;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }
}

class derived extends base{
    int y;

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
public class Inheritence {
    public static void main(String[] args) {
        derived b = new derived();
        b.setX(4);
        System.out.println("The value of b is "+b.getX());
        base a = new base();
        b.setY(5);
        System.out.println("The value of a is "+b.getY());
    }
}
