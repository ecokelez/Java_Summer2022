package day21_Arrays;

public class C01_Arrays_MaxSayBulma {
    public static void main(String[] args) {


        // Soru 1- Verilen bir int array’deki en buyuk sayiyi yazdiran bir method olusturun.

        int[] sayılar = {3,5,7,6,1,4,9,5,2};

        maxSayıYazdır(sayılar);
    }

    private static void maxSayıYazdır(int[] sayılar) {

        int maxSayı=sayılar[0];  // 1. elemanı atadık buraya e kontrol ettık


        for (int i = 1; i <sayılar.length ; i++) {

            if (sayılar[i]>maxSayı){
                maxSayı=sayılar[i];
            }
        }

        System.out.println("Array' dekı en buyuk sayı: "+ maxSayı);
    }
}
