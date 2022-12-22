package day23_ArrayLists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class C10_ArrayList_S1 {

    public static void main(String[] args) {
        // Soru 1-;
        List<String> eleman=new ArrayList<>();
        eleman.add("A");
        eleman.add("C");
        eleman.add("E");
        eleman.add("F");

        System.out.println(eleman);

        // Soru 2- indexsiz  ve index'li add() methodu;

        eleman.add("B");
        eleman.add(1,"L");

        System.out.println(eleman);  // [A, L, C, E, F, B]

        // Soru 3- set methodu kullanarak;

        eleman.set(3,"D");
        System.out.println(eleman);

        // Soru 4- remove()  methodu kullanarak F' yi silme;

       // eleman.remove("F");
        eleman.remove("F");
        System.out.println(eleman);  // [A, L, C, D, B]

       //  Soru 5- sort() methodu kullanarak alfabetık sıralama;

        Collections.sort(eleman);
        System.out.println(eleman);  //  [A, B, C, D, L]

        // Soru 6- contains methodu kullanarak L nin listte var oldugunu ve
                // M nin de list de var olmadıgını ogrenınız

        System.out.println(eleman.contains("L"));  // ture
        System.out.println(eleman.contains("M"));  //  false

        // Soru 7- size() methodu ;

        System.out.println(eleman.size());  //  5

        // Soru 8- clear methodu kull. listtekı tum elemanları sılme;
        eleman.clear();
        System.out.println(eleman.size());  // 0
        System.out.println(eleman.isEmpty());  // true

        // Soru 9- isEmpty methodu kullanarak listteki  elemanların sılınıp sılınmedıgını dogrulayınız;
        System.out.println(eleman.isEmpty());  // true












    }
}
