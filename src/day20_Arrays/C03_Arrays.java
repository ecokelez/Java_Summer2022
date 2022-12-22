package day20_Arrays;

import java.util.Arrays;

public class C03_Arrays {
    public static void main(String[] args) {


        // Ikı sekılde Array olusturabılırız

        int  sayılar[]={1,2,3};

        String harfler[]=new String[4];

        System.out.println("sayıların uzunlugu : "+ sayılar.length);  // 3
      //   String lenght() methodunda pazarantez var , Array de yok

        System.out.println("harfler array' ın uznlugu : "+ harfler.length); // 4

        System.out.println(Arrays.toString(harfler)); //[null, null, null, null]
        // icersınde hic element yok

        // harfler Array ' ının son elementlerını yazdıralım
        System.out.println(harfler[harfler.length-1]);

        System.out.println(harfler[5]); // ArrayIndexOutOfBoundsException


    }
}
