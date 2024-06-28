package com.company;


class myEmp{
    private int num;
    private String nothing;

    public String getNothing() {return nothing;}
    public void setNothing(String in){nothing = in;}
    public void setNum(int num1){num = num1;}
    public int getNum(){ return num;}

}
public class getters_and_setters {
    public static void main(String[] args) {
        myEmp e = new myEmp();
        e.setNothing("Simon Riley");
        e.setNum(33);
        System.out.println("Hello everyone!My name is "+e.getNothing());
        System.out.println("And just in case my salary is "+e.getNum());
    }
}
