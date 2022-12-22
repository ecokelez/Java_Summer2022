package day43_interfaces_iterators;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class N06_Iterator_ListIterator {
    public static void main(String[] args) {
         /*
        Soru 3) Bir listedeki istenen sayi araliginda olmayan elementleri silen bir program yaziniz …                                         (2. liste olusturmadan, gecerli liste uzerinde islem yapiniz)
        Orn : [2,13,56,23,45,14,40] istenen aralik 20 ile 40 arasi (sinirlar dahil)
        output: [23,40]
         */

        List<Integer> liste=new ArrayList<>();
        liste.add(2);
        liste.add(13);
        liste.add(56);
        liste.add(23);
        liste.add(45);
        liste.add(14);
        liste.add(40);

        System.out.println(liste);

        ListIterator li1=liste.listIterator();
        int basSınır=20;
        int bıtısSınır=40;

        while(li1.hasNext()){
           Integer temp=(Integer) li1.next();
            if(temp<basSınır || temp>bıtısSınır){
                li1.remove();

            }
        }
        System.out.println(liste);  // [23, 40]

    }
}
