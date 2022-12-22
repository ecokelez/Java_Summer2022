package day29_passByValue_immutable;

import java.util.Arrays;
import java.util.Random;

public class C01_PasByValue {

     /*
          Birden fazla element iceren array ve arrayList gibi yapilarda da
          passByValue gecerlidir.
          ** Eger method'da array veya list'in kendisi degistirilirse
          passByValue ozelligi sebebiyle Java degisen degeri degil
          array veya list'in orijinal degerini alir
          *** Ancak array veya list degistirilmeden
          sadece icindeki elemanlar degistirilirse
          Java obje degismedigi icin(referans ayni),
          ayni array veya list'i bize dondurur
          ancak icindeki elementler degismis olacaktir.
         */


    public static void main(String[] args) {


        int[]arr={5,7,8,10};

        elemanDegistir(arr);

        System.out.println("main methodun icinde diger method calıstıktan sonra:"+Arrays.toString(arr));

    }

    private static void elemanDegistir(int[] arr) {

        Random rnd=new Random();
        arr[1]= rnd.nextInt(100);
        arr[3]=rnd.nextInt(100);

        System.out.println("methodun icinde :" + Arrays.toString(arr));
    }
}
