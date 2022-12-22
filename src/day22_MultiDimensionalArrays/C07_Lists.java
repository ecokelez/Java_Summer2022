package day22_MultiDimensionalArrays;

import java.util.ArrayList;
import java.util.List;

public class C07_Lists {
    public static void main(String[] args) {


        List<Integer> sayılar=new ArrayList<>();

         /*
         List primitive data turlerini kabul etmez
         (Type argument cannot be of primitive type)
         */

        sayılar.add(5);
        sayılar.add(3);
        sayılar.add(7);
        System.out.println(sayılar); // [5,3,7]

        // sadece add() kullanirsak Java sona ekler


        sayılar.add(2,10);
        System.out.println(sayılar);      //  [5, 3, 10, 7]

        // add(index,element) istedigimiz index'e istegimiz elementi yerlestirir
        // add methodu eski elementleri silmez veya update etmez, yeni element ekler


    }
}
