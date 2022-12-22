package day43_interfaces_iterators;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class N04_Iterator_ListIterator {

    public static void main(String[] args) {
        /*
        Bir listedeki tum elementleri iterator kullanarak silin
         */

        List<String> list=new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");

        System.out.println(list);

        Iterator<String> li1=list.iterator();
        li1.next();  // 10 kaldırdkk
        li1.remove();

        System.out.println(list); // [B, C]

        while(li1.hasNext()){
            li1.next();
            li1.remove();
        }
        System.out.println(list);  //  []


    }
}
