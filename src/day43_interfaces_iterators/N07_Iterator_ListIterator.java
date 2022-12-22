package day43_interfaces_iterators;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class N07_Iterator_ListIterator {
    public static void main(String[] args) {
         /*
        Soru 4) Bir listedeki elementleri iterator kullanarak sondan basa dogru yazdirin
         */


        List<Integer> liste = new ArrayList<>();
        liste.add(2);
        liste.add(13);
        liste.add(56);
        liste.add(23);
        liste.add(45);
        liste.add(14);
        liste.add(40);

        System.out.println(liste);

        ListIterator li1 = liste.listIterator();
        while (li1.hasNext()) {
            li1.next();

        }
        while (li1.hasPrevious()) {

            System.out.print(li1.hasPrevious()); // 40 14 45 23 56 13 2
        }
    }
}
