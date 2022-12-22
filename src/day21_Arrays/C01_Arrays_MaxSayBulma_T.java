package day21_Arrays;

public class C01_Arrays_MaxSayBulma_T {

    public static void main(String[] args) {
        // Soru 1- Verilen bir int array’deki en buyuk sayiyi yazdiran bir method olusturun.



        int[] sayılar={3,5,7,13,8,6,4};

        maxSayıYaz(sayılar);
    }

    private static void maxSayıYaz(int[] sayılar) {

        int maxSayı=sayılar[0];

        for (int i = 1; i <sayılar.length ; i++) {

            if (sayılar[i]>maxSayı){
                maxSayı=sayılar[i];
            }

        }

        System.out.println("Arraydekı en buyuk sayı:" + maxSayı);
    }
}
