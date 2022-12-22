package day43_interfaces_iterators;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class N05_Iterator_ListIterator {
    public static void main(String[] args) {
        /*
        String bir listedeki tum elementlerin sonuna X ekleyin
         */
        List<String> list=new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");

        System.out.println(list);

        // for each Loop ile ;

        for (String each:list) {
            each+="X";
            System.out.println(each);
        }

        // ListIterator ile;

      ListIterator<String> li1=list.listIterator();
        while (li1.hasNext()){
           String str= li1.next();
            li1.set(str+"X");
        }
        System.out.println(list);  //  [AX, BX, CX]

    }
}
