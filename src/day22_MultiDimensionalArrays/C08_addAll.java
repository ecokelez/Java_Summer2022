package day22_MultiDimensionalArrays;

import java.util.ArrayList;
import java.util.List;

public class C08_addAll {
    public static void main(String[] args) {



        List<Integer> sayılar1=new ArrayList<>();

        sayılar1.add(5);
        sayılar1.add(3);
        sayılar1.add(2);


        List<Integer> sayılar2=new ArrayList<>();

        sayılar2.add(10);
        sayılar2.add(15);
        sayılar2.add(16);
        sayılar2.add(20);

        sayılar1.addAll(sayılar2);

        System.out.println(sayılar1);    // [5, 3, 2, 10, 15, 16, 20]

        sayılar1.addAll(1,sayılar2);
        System.out.println(sayılar1);      //  [5, 10, 15, 16, 20, 3, 2, 10, 15, 16, 20]


        // bir listenin sonuna veya istedigimiz bir indexine,
        // baska bir collection ekleyebiliriz




    }
}
