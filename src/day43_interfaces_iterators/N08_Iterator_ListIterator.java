package day43_interfaces_iterators;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class N08_Iterator_ListIterator {
    public static void main(String[] args) {

        /*
        Bir listedeki ilk n elemanı iterator kullanarak 5 arttırn
        list: [2,13,56,78,23,45,67]
        arttrılması istenen eleman sayısı 3
        Output: [7,18,61,78,23,45,67]
         */
        List<Integer> liste=new ArrayList<>();
        liste.add(2);
        liste.add(13);
        liste.add(56);
        liste.add(78);
        liste.add(23);
        liste.add(45);
        liste.add(67);
        System.out.println(liste);

        ListIterator it1=liste.listIterator();
        Integer temp;
        int count=1;

        while(it1.hasNext() && count<=3){
           temp=(Integer) it1.next()+5;
            it1.set(temp);
            count++;

        }
        System.out.println(liste);
    }
}
