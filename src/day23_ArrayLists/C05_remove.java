package day23_ArrayLists;

import java.util.ArrayList;
import java.util.List;

public class C05_remove {
    public static void main(String[] args) {
        List<Integer> sayilar1 = new ArrayList<>();
        sayilar1.add(5);
        sayilar1.add(3);
        sayilar1.add(2);
        sayilar1.add(1);

        System.out.println(sayilar1);  //[5, 3, 2, 1]

        sayilar1.remove(1);

        /*
         Sayilardan olusan bir list varsa
         java remove method'unda sayi yazdigimizda direk index olarak kabul eder
         */


        System.out.println(sayilar1);  //  [5, 2, 1]

        // 5' i silelim;
        // illa da 5'i silsin dersek
        // silinecek objeyi bir variable'a tanimlayabiliriz

        Integer sıl=5;

        sayilar1.remove(sıl);
        System.out.println(sayilar1);  // [2, 1]

        // 2. yöntem; indexOf methodundan yardım alabilirim
        // 2 yi silmek icin 2'nin index'ini bulup, onu remove'a yazabiliriz

        sayilar1.remove(sayilar1.indexOf(2));
        System.out.println(sayilar1);         //  [1]





    }
}
