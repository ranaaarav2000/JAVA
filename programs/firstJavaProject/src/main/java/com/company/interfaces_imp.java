package com.company;

interface bicycle{
    void applyBrake(int decrement);
    void speedUp(int increment);
}
class avonCycle implements bicycle{
    int speed = 7;
    public void applyBrake(int decrement){
        speed = speed - decrement;
        System.out.println("Now, the speed of your cycle is "+speed);
    }
    public void speedUp(int increment){
        speed = speed + increment;
        System.out.println("Now, the speed of your cycle is "+speed);
    }
}
public class interfaces_imp {
    public static void main(String[] args) {
        avonCycle c = new avonCycle();
        c.speedUp(6);
    }
}
