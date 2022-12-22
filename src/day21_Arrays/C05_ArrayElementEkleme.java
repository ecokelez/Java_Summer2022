package day21_Arrays;

import java.util.Arrays;

public class C05_ArrayElementEkleme {
    public static void main(String[] args) {


        //Soru 5- Verilen bir array’e yeni bir element ekleyen method olusturun

        String[] sınıfLıstesı={"Alı CAN"};
        String eklenecekIsım="Murat Babayigit";

        sınıfLıstesı=elemanEkle(sınıfLıstesı,eklenecekIsım);
        System.out.println(Arrays.toString(sınıfLıstesı));

    }

    private static String[] elemanEkle(String[] sınıfLıstesı, String eklenecekIsım) {

        // eski listeden 1 eleman fazla uzunlukta yeni bir array olusturdum
        String [] yeniSinifListesi= new String[sınıfLıstesı.length+1]; // [null, null, null, null]


        // oncelikle eski listedeki tum elemanlari, yeni listeye tasidim
        for (int i = 0; i <sınıfLıstesı.length ; i++) {
            yeniSinifListesi[i]=sınıfLıstesı[i];
        }

        // son index'e ise eklenecek ismi atadim
        yeniSinifListesi[yeniSinifListesi.length-1]=eklenecekIsım;

        return yeniSinifListesi;

    }
}
