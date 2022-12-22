package day23_ArrayLists;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class C07_sort {
    public static void main(String[] args) {


        List<String> urunler=new ArrayList<>();
        urunler.add("Nutella");
        urunler.add("Ikram");
        urunler.add("Cekırdek");
        urunler.add("Cay");

        Collections.sort(urunler);

        System.out.println(urunler);  //  [Cay, Cekırdek, Ikram, Nutella]


        /*
        List ile gelen sort method'unda siralama ozelligini girmek gerekiyor
        bunun yerine Collections Class'indan sort method'unu kullaniyoruz
        bu method listemizi natural order'a (String'de alfabeye gore) gore siralar
         */


    }
}
