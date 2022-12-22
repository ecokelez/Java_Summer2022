package day20_Arrays;

import java.util.Scanner;

public class C09_Arrays_S4 {
    public static void main(String[] args) {

        //Soru 4- Kullanicidan bir array’in boyutunu
        // ve tum elementlerini alarak bir array olusturup, bu array’i bize donduren bir method olusturun

        int[] sayılar=arrayOlus();
    }

    private static int[] arrayOlus() {


        Scanner scan=new Scanner(System.in);
        System.out.println("Kac elemanlı bır array olusturmak ıstersınız");
        int uzunluk= scan.nextInt();
        int[] olusturulan=new int[uzunluk];


        for (int i = 0; i< uzunluk; i++) {
            System.out.println(i+ " . index icin sayı  gırınız");
            olusturulan[i]=scan.nextInt();

        }
        return olusturulan;
    }
}
