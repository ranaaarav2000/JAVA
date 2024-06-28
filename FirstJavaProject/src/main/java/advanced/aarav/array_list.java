package advanced.aarav;
import java.util.*;
public class array_list {
    public static void main(String[] args) {
        ArrayList <Integer> l1 = new ArrayList<>();
        ArrayList <Integer> l2 = new ArrayList<>(5);
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
        l1.add(23);
        System.out.println(l1.contains(6));
        System.out.println(l1.indexOf(7));
//        l1.clear();
        for (Integer integer : l1) {
            System.out.print(integer);
            System.out.print(", ");
        }
    }
}
