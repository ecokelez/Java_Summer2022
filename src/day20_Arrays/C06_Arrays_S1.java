package day20_Arrays;

import java.util.Arrays;

public class C06_Arrays_S1 {
    public static void main(String[] args) {

        // Verilen bir int Array' deki en buyuk sayyıyı yazdıran bır mrthod olusturun

        int[] sayılar={1,2,3,5,8,12,26,67};

        enBuyukSayı(sayılar);
    }

    private static void enBuyukSayı(int[] sayılar) {

        int maxSayı=sayılar[0];

        for (int i = 1; i <sayılar.length ; i++) {

            if (sayılar[i]>maxSayı){
                maxSayı=sayılar[i];
            }


        }
        System.out.println("Array'deki en buyuk sayı:"+ maxSayı);

    }
}
