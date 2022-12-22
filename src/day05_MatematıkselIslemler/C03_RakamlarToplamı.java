package day05_MatematıkselIslemler;

import java.util.Scanner;

public class C03_RakamlarToplamı {

    public static void main(String[] args) {

         Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen 4 basamaklı pozitif bir sayı giriniz");

        int sayi=scan. nextInt();  // 5267

        int birlerBasamagı=0;
        int rakamlarToplamı=0;
        int ilkGirilenSayi=sayi;  // ilk girilen sayıyı bır yerde tutmak ıcın bunu yaptık

        // su anda sayi 5267 bb=0 rt=0

        birlerBasamagı=sayi % 10; // 7
        rakamlarToplamı += birlerBasamagı;
        sayi/=10;

        // su anda sayi= 526 bb = 7 , rt=7

        birlerBasamagı=sayi%10; // bb= 6,
        rakamlarToplamı+= birlerBasamagı;   // 7+6=13,
        sayi/=10;

        // sayi su anda 52 , bb=6, rt=13,

        birlerBasamagı=sayi%10;  //  bb=2 ,
        rakamlarToplamı+=birlerBasamagı;  //  rt--> 13+2=15
        sayi/=10;                          // ---> 2 yi attık   5 kaldı

        // sayi su anda 5 , bb = 5, rt= 15,

        birlerBasamagı=sayi%10;        //   5,
        rakamlarToplamı+=birlerBasamagı;  // rt= 15 +5=20,
        sayi/=10;                 //  0


        // su anda sayi 0 , bb=5 , rt=20,

        System.out.println(ilkGirilenSayi + " sayisınin rakamlar toplamı : "+ rakamlarToplamı );










    }

}
