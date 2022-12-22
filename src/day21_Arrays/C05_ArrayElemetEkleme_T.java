package day21_Arrays;

import java.util.Arrays;

public class C05_ArrayElemetEkleme_T {

    public static void main(String[] args) {
        //Soru 5- Verilen bir array’e yeni bir element ekleyen method olusturun

        String[] sınıfLıstesı={"Alı CAN"};
        String eklenecekIsım="Murat Babayigit";

        sınıfLıstesı=elemanEkle(sınıfLıstesı,eklenecekIsım);

        System.out.println(Arrays.toString(sınıfLıstesı));

    }

    public static String[] elemanEkle(String[] sınıfLıstesı, String eklenecekIsım) {


        // eski listeden 1 eleman fazla uzunlukta yeni bir array olusturdum
        String[] yeniSınıfLıstesı=new String[sınıfLıstesı.length+1];


        // oncelikle eski listedeki tum elemanlari, yeni listeye tasidim
        for (int i = 0; i <sınıfLıstesı.length ; i++) {
            yeniSınıfLıstesı[i]=sınıfLıstesı[i];

            // son index'e ise eklenecek ismi atadim
            yeniSınıfLıstesı[yeniSınıfLıstesı.length-1]=eklenecekIsım;

        }


        return yeniSınıfLıstesı;
    }
}
