package day23_ArrayLists;

import java.util.ArrayList;
import java.util.List;

public class C06_contains {

    public static void main(String[] args) {
        List<String> urunler=new ArrayList<>();
        urunler.add("Nutella");
        urunler.add("Ikram");
        urunler.add("Cekırdek");
        urunler.add("Cay");

        System.out.println(urunler.contains("Nutella"));
        System.out.println(urunler.contains("Hobby"));

        List<String>urunler2=new ArrayList<>();
        urunler2.add("Nutella");
        urunler2.add("Ikram");

        System.out.println(urunler.containsAll(urunler2));

        urunler2.add("Hobby");
        System.out.println(urunler.containsAll(urunler2));






    }
}
