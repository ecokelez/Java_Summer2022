package day05_MatematıkselIslemler;

import java.util.Scanner;

public class C03_RakamlarToplamı_T {

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Luten 4 basamaklı bır sayı gırınız "); // Ne istedgımızı yazarız
        int sayi=scan.nextInt();    // 4568 -- Varıable atama yaparız -- > Int

        int birlerBasmagı=0;
        int rakamlarToplamı=0;
        int ilkGirilenSayi=sayi;


      // sayı şu anda 4568 bb=0,rt=0

        birlerBasmagı=sayi%10;  //  bb=8
        rakamlarToplamı+=birlerBasmagı;
        sayi/=10; //  8 den kurtulduk

         // su anda sayi 456 bb=8 rt= 8

        birlerBasmagı=sayi%10;   // bb=6
        rakamlarToplamı+=birlerBasmagı;  // rt= 8+6=14
        sayi/=10;    //   6 dan kurtulduk

        // sayi 45 bb = 6 rt=14

        birlerBasmagı=sayi%10;   // bb = 5
        rakamlarToplamı+= birlerBasmagı;  //  rt= 14+5=19
        sayi/=10;                    // 5 den kurtulduk

        // sayı 4 bb 5 rt=19

        birlerBasmagı=sayi%10;  // bb  4
        rakamlarToplamı+=birlerBasmagı;   //  rt= 19+4=23
        sayi/=10;    //   0

        // su nada sayi =0 , bb 4, rt 23

        System.out.println( ilkGirilenSayi + " sayisınin rakamlar toplamı : " + rakamlarToplamı);








    }


}
