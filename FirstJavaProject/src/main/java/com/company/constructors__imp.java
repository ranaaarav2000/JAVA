package com.company;


class myMainEmp{

    private int num;
    private String nothing;


    //This is a constructor!
    public myMainEmp(){num = 45; nothing = "Max Riley";}
    //This is a constructor!

//    To pass Arguments
    public myMainEmp(int myID, String myName){nothing = myName; num = myID; }
//    To pass Arguments

    public String getNothing() {return nothing;}
    public int getNum(){ return num;}

}
public class constructors__imp {
    public static void main(String[] args) {

//        Passing arguments
//        myMainEmp max = new myMainEmp(45, "Max Riley");
//          Passing arguments
//        We can even not pass arguments so that java will know that constructor above is going to be used
        myMainEmp max = new myMainEmp();
//        We can even not pass arguments so that java will know that constructor above is going to be used

        System.out.println("My name is "+max.getNothing());
        System.out.println("My ID is "+max.getNum());

    }
}
