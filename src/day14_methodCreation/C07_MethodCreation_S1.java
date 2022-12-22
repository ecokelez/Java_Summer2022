package day14_methodCreation;

import java.util.Scanner;

public class C07_MethodCreation_S1 {
    public static void main(String[] args) {

         /*

       ++  Kullanicidan bir sayi alin.Bu sayinin
          1-tek mi cift mi oldugunu,
         2-sifirdan buyuk mu kucuk mu oldugunu,
        3-  ayrica ve 100'den buyukse birler onlar ve yuzler basamagindaki rakamlarin toplamini,
        100'den kucukse sadece birler basamagini yazdiran
        3 methot olusturun

         */

        Scanner scan=new Scanner(System.in);
        System.out.println("Bır sayı gırınız");
        int sayı=scan.nextInt();

        tekCıft(sayı);
        sıfırBykKck(sayı);
        yuzdenBykKck(sayı);


        scan.close();

    }

    public static void sıfırBykKck(int sayı) {
        if (sayı>0){
            System.out.println("Gırılen sayı sfırdan buyuk = " + sayı);
        }else System.out.println("Gırılen sayı sıfırdan kucuk = " + sayı);

    }

    public static void yuzdenBykKck(int sayı) {
        if (sayı > 100) {
            int bırlerBasamagı = 0;
            int rakamlarToplamı = 0;

            bırlerBasamagı = sayı % 10;
            rakamlarToplamı += bırlerBasamagı;
            sayı /= 10;

            bırlerBasamagı = sayı % 10;
            rakamlarToplamı += bırlerBasamagı;
            sayı /= 10;

            bırlerBasamagı = sayı % 10;
            rakamlarToplamı += bırlerBasamagı;
            sayı/= 10;

            System.out.println("Gırılen 100 den buyuk sayının rakamlar toplamı = " + rakamlarToplamı);

        } else {
            int bırlerBasamagı1 = sayı % 10;
            System.out.println("100' den kucuk sayının bırlerBasamagı1 = " + bırlerBasamagı1);


        }

    }


    public static void tekCıft(int sayı) {

        if (sayı%2==0){
            System.out.println(" Gırılen sayı Cıft sayı ");
        }else System.out.println("Gırılen sayı Tek sayı");

    }
}
