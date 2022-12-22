package day14_methodCreation;

import java.util.Scanner;

public class C07_MethodCreation_S_T_1 {
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
        System.out.println("Lutfen bır sayı gırınız");
        int sayı= scan.nextInt();

        tekCıftmI(sayı);
        sıfırBK(sayı);
        yuzKB(sayı);



    }

    private static void yuzKB(int sayı) {
       if(sayı>100){
           int bırlerBasamagı=0;
           int rakamlarToplamı=0;

            bırlerBasamagı=sayı%10;
            rakamlarToplamı+=bırlerBasamagı;
            sayı/=10;

            bırlerBasamagı=sayı%10;
            rakamlarToplamı+=bırlerBasamagı;
            sayı/=10;

           bırlerBasamagı=sayı%10;
           rakamlarToplamı+=bırlerBasamagı;
           sayı/=10;

           System.out.println("Yazmıs old. 100'den buyuk sayının rakamları toplamı :"+ rakamlarToplamı);

       }else{
           int bırlerBasamagı1=sayı%10;
           System.out.println("100'den kucuk sayının bırler basamagı :" + bırlerBasamagı1);
       }
    }

    private static void sıfırBK(int sayı) {
        if (sayı>0){
            System.out.println("Sıfırdan buyuk sayı");
        }else if (sayı<0){
            System.out.println("Sıfırdan kucuk sayı");
        }else System.out.println("Sayı sıfıra esıttır");
    }

    private static void tekCıftmI(int sayı) {
        if (sayı%2==0){
            System.out.println("Cıft sayı");
        }else System.out.println("Tek sayı");
    }
}
