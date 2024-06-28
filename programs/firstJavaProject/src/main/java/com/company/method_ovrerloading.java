package com.company;

public class method_ovrerloading {

//    Below me is a method overloading system
    static void gm(){
        System.out.println("Good morning bro!");
    }
    static void gm(int a){
        System.out.println("Good morning " + a +  " bro!");
    }
    //Above me is a method overloading system.





//    Below me is an array changing system.
    static void change(int[]arr){
        arr[0] = 100;
    }
//    Above me is an array changing system.


//    Below me is a non-returning function
    static void tellJoke(){
        System.out.println("I created a new word!\nPlagiarism!");
    }
    //    Above me is a non-returning function.



    public static void main(String[] args) {
        int[]marks = {98,99,70,89,100};
        tellJoke();
        change(marks);
        System.out.println(marks[0]);
        gm();
        gm(3000);
    }
}
