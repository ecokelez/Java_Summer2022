package day23_ArrayLists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class C08_equals {
    public static void main(String[] args) {



        List<String> urunler=new ArrayList<>();
        urunler.add("Nutella");
        urunler.add("Ikram");
        urunler.add("Cekırdek");
        urunler.add("Cay");

        List<String> urunler2=new ArrayList<>();
        urunler2.add("Ikram");
        urunler2.add("Nutella");
        urunler2.add("Cay");
        urunler2.add("Cekırdek");

        System.out.println(urunler.equals(urunler2));  // false  -- cunku urunlerın sıralaması farklı

        Collections.sort(urunler);   // her ıkısını  de sıralayalım
        Collections.sort(urunler2);

        System.out.println(urunler.equals(urunler2));   //  true



    }
}
