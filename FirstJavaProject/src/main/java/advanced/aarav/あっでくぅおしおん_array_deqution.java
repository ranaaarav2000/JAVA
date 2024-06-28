package advanced.aarav;

import java.util.ArrayDeque;

public class あっでくぅおしおん_array_deqution {
    public static void main(String[] args) {
        ArrayDeque<Integer> l1 = new ArrayDeque<>();
        l1.add(6);
        l1.add(56);
        l1.add(9);
        l1.addFirst(5);
        System.out.println(l1.getFirst());
        System.out.println(l1.getLast());
    }
}