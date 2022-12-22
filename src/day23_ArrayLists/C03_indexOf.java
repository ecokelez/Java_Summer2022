package day23_ArrayLists;

import java.util.ArrayList;
import java.util.List;

public class C03_indexOf {
    public static void main(String[] args) {

        List<String> urunler=new ArrayList<>();
        urunler.add("Nutella");
        urunler.add("Ikram");
        urunler.add("Cekırdek");
        urunler.add("Cay");

        System.out.println(urunler);  // [Nutella, Ikram, Cekırdek, Cay]
        System.out.println(urunler.indexOf("Ikram"));  // 1
        System.out.println(urunler);

        /*
         indexOf method'u bize bilgi donduren bir method'dur
         listemizi degistirmez
         */


        System.out.println(urunler.lastIndexOf("Ikram"));  // 1

        /*
            indexOf method'u urunu aramaya 0. index'ten
            lastIndexOf method'u ise aramaya son index'ten baslar.

            arama bitip urun bulundugunda,
            ikisi de bulunan urunun index'ini verir
            */


        //  İkinci bir urun eklediğimizde o vakit sıralama degişir !...

        urunler.add("Ikram");
        System.out.println(urunler);  // [Nutella, Ikram, Cekırdek, Cay, Ikram]

        System.out.println(urunler.indexOf("Ikram")); // 1

        System.out.println(urunler.lastIndexOf("Ikram"));  // 4

        System.out.println(urunler.indexOf("Hobby"));   // -1
        System.out.println(urunler.lastIndexOf("Hobby"));  // -1



    }
}
