package day20_Arrays;

import java.util.Arrays;

public class C02_Arrays {

    public static void main(String[] args) {

        int sayılar[]=new int[3];

        System.out.println(sayılar);
        // Non -Primitive data tuurndekı dataları her zaman yazdırmayız,
        // Array' i yazdırmak ıstersek Arrays Class' ından yardım ısterız

        System.out.println(Arrays.toString(sayılar));  // [0, 0, 0]

        sayılar[2]=10;
        sayılar[0]=5;
        sayılar[1]=3;

        System.out.println(sayılar); // [I@19dfb72a
        System.out.println(Arrays.toString(sayılar)); // [0, 0, 0]




        String sınıfLıst[]={"Ali","Ayse","Ahmet"};
        System.out.println(Arrays.toString(sınıfLıst));  //[Ali, Ayse, Ahmet]

        sınıfLıst[1]="Hasan";
        System.out.println(Arrays.toString(sınıfLıst));  // [Ali, Hasan, Ahmet]


        System.out.println(sınıfLıst[1]);    // Hasan' ı yazdıralım
                                            // Array ın bır elemanı old. ıcın bır Strıngdır

        System.out.println(sınıfLıst[0]);  // Ali






    }
}
