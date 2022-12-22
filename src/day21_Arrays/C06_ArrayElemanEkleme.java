package day21_Arrays;

import java.util.Arrays;

public class C06_ArrayElemanEkleme {

    public static void main(String[] args) {


        // C05 dekı methodu kullanarak Array' eleman ekleyelim

        String[] takımLıstesı={"Suleyman", "Osman"};
        String eklenecekIsım="Talha";


        takımLıstesı=C05_ArrayElemetEkleme_T.elemanEkle(takımLıstesı,eklenecekIsım);

        System.out.println(Arrays.toString(takımLıstesı));
    }
}
