package day22_MultiDimensionalArrays;

import java.util.ArrayList;
import java.util.List;

public class C09_get {

    public static void main(String[] args) {


        List<Integer> sayılar1=new ArrayList<>();

        sayılar1.add(5);
        sayılar1.add(3);
        sayılar1.add(2);


        List<String> isimler = new ArrayList<>();
        isimler.add("Erdal");
        isimler.add("Hakan");
        isimler.add("Enes");


        System.out.println(isimler.get(2));// Enes
        System.out.println(sayılar1.get(1)); //3

    }
}
