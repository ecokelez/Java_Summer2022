package day23_ArrayLists;

import java.util.ArrayList;
import java.util.List;

public class C04_remove {
    public static void main(String[] args) {
        List<String> urunler=new ArrayList<>();
        urunler.add("Nutella");
        urunler.add("Ikram");
        urunler.add("Cekırdek");
        urunler.add("Cay");


        /*
         remove method'u iki sekilde kullanilir
         1- objeyi yazip silmesini istersek bize boolean sonuc doner true/false
         2- index girersek o index'deki elemani siler ve bize silinen elemani dondurur
         */



        System.out.println(urunler);                //[Nutella, Ikram, Cekırdek, Cay]
        System.out.println(urunler.remove("Ikram"));   // true
        System.out.println(urunler);            //[Nutella, Cekırdek, Cay]

        System.out.println(urunler.remove("Hobby"));   // false
        System.out.println(urunler);                 //  [Nutella, Cekırdek, Cay]



        // ikinci yöntem yani index girelim ;


        System.out.println(urunler.remove(1)); // Cekırdek
        System.out.println(urunler);                 //[Nutella, Cay]


            // Olmayan bır index'i silmeye calısırsak;

        //   System.out.println(urunler.remove(3));  --->   //IndexOutOfBoundsException



    }
}
