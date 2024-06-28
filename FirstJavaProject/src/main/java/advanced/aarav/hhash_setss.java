package advanced.aarav;

import java.util.*;

public class hhash_setss {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashSet <Integer> myHashSet = new HashSet<>(6);
        myHashSet.add(6);
        myHashSet.add(3);
        myHashSet.add(8);
        myHashSet.add(11);
        myHashSet.add(11);
        HashSet <Integer> myHashSet2 = new HashSet<>(16);
        myHashSet2.add(32);
        myHashSet2.add(65);
        myHashSet2.add(25);
        myHashSet2.add(311);
        myHashSet2.add(76);
        myHashSet2.add(435);
        System.out.println("These are the myHashSet items: ");
       for (Integer i : myHashSet){
            System.out.print(i);
           System.out.print(", ");
            }
        System.out.println();

        System.out.println("These are the myHashset2 items: ");
        for (Integer i1 : myHashSet2){
            System.out.print(i1);
            System.out.print(", ");
        }
        System.out.println();
        System.out.println("Enter the value here to check whether the value is in the hashset or not ");
        int k = sc.nextInt();
        if (myHashSet.contains(k)){
            System.out.println(k+"is there in the hashset");
        }
        else {
            System.out.println("Sorry, we could not find the value you were looking for");
        }
        System.out.println("Do you want to add Some thing in the hashset?");
        int j = sc.nextInt();
        if (!myHashSet.contains(j)){
            myHashSet.add(j);
            System.out.println("Ok got it, now the hashset looks like this:");
            for (Integer k1 : myHashSet){
                System.out.print(k1);
                System.out.print(", ");
            }
        }
    }
}
