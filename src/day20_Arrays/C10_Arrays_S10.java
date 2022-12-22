package day20_Arrays;

import java.util.Arrays;

public class C10_Arrays_S10 {
    public static void main(String[] args) {


        //Soru 5- Verilen bir array’e yeni bir element ekleyen method olusturun

        String[] sınıfLıstesı={"Alı CAN"};
        String eklenecekIsım="Murat Babayigit";

        sınıfLıstesı=elemanEkle(sınıfLıstesı,eklenecekIsım);

        System.out.println(Arrays.toString(sınıfLıstesı));


    }

    private static String[] elemanEkle(String[] sınıfLıstesı, String eklenecekIsım) {

        // eski listeden 1 eleman fazla uzunlukta yeni bir array olusturdum
        String[] yenıSınıfListesi=new String[sınıfLıstesı.length+1]; // [null],[null] olur cunku new String olusturdugumuz
                                                                        // ve yenı degerleri de yazmadıgımız ıcın

        for (int i = 0; i < sınıfLıstesı.length ; i++) {

            // oncelikle eski listedeki tum elemanlari, yeni listeye tasidim
            yenıSınıfListesi[i]=sınıfLıstesı[i];

        }

        // son index'e ise eklenecek ismi atadim
        yenıSınıfListesi[yenıSınıfListesi.length-1]=eklenecekIsım;


        return yenıSınıfListesi;

    }  // Bırsey return etmemiz gerekıyor o da yenısınıfLisetsıdır ve bu nedenle yukarıda olustururuz
}
