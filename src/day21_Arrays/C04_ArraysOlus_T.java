package day21_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class C04_ArraysOlus_T {
    public static void main(String[] args) {

        //Soru 4- Kullanicidan bir array’in boyutunu
        // ve tum elementlerini alarak bir array olusturup, bu array’i bize donduren bir method olusturun


        int[] sayılar=arrayOlus();

        System.out.println(Arrays.toString(sayılar));

    }

    private static int[] arrayOlus() {
        Scanner scan=new Scanner(System.in);
        System.out.println("Kac elemanlı bır array olusturmak ıstersınız");
        int uzunluk= scan.nextInt();

        int [] olusM=new int[uzunluk];

        for (int i = 0; i <uzunluk ; i++) {
            System.out.println(i+ ". index icin sayi giriniz");
            olusM[i]= scan.nextInt();

        }


     return olusM;
    }

}
