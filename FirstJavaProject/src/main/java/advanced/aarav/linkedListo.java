package advanced.aarav;

import java.util.ArrayList;
import java.util.LinkedList;

public class linkedListo {
    public static void main(String[] args) {
        LinkedList <Integer> l1 = new LinkedList<>();
        LinkedList <Integer> l2 = new LinkedList<>();
        l2.add(15);
        l2.add(18);
        l2.add(19);

        l1.add(6);
        l1.add(7);
        l1.add(4);
        l1.add(6);
        l1.add(0,5);
        l1.add(0,1);
        l1.addAll(0,l2);
        l1.addLast(613);
        l1.addFirst(123);
        System.out.println(l1.contains(6));
        System.out.println(l1.indexOf(7));
//        l1.clear();
        for (Integer in : l1) {
            System.out.print(in);
            System.out.print(", ");
        }
    }
}
