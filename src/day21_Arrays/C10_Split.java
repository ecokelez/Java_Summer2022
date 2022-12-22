package day21_Arrays;

import java.util.Arrays;

public class C10_Split {
    public static void main(String[] args) {

        /*
            split bır array methodu degıl, String methodudur,
            ama Array dondurdugu ıcın bu konuda anlatıyoruz
            split ile herhangı bır string'i istedıgımız sekılde parcalara bolup bır Array haline getiriyorz
         */

        String str="Java ne kadar guzel";

        String[] kelımeler=str.split(" ");
        System.out.println(Arrays.toString(kelımeler));     //  [Java, ne, kadar, guzel]

        String[] kelımelerNe=str.split("ne");
        System.out.println(Arrays.toString(kelımelerNe));   //  [Java ,  kadar guzel]

        String[] kelımelerE=str.split("e");
        System.out.println(Arrays.toString(kelımelerE));  //   [Java n,  kadar guz, l]
    }
}
