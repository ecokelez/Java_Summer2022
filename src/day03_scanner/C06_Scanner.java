package day03_scanner;

import java.util.Scanner;

public class C06_Scanner {
    public static void main(String[] args) {

        /*
        kullanıcıdan ismini soy ismini ve yasını alıp
        girilen bilgiler = seyfi capar 34 seklınde yazdırın

         */


        Scanner scan= new Scanner(System.in);
        System.out.println("Lütfen isminizi giriniz");

        /*
        String verileri sacnner ile alınırken --> next () ; ilk bosluga kadar olan  kısmı( 1 kelime) alır
                                             --> nextLine(); satırın sonuna kadar ne yazarsak alır
                                             NOT: eger birden fazla String deger alacaksak nextLıne() kullanmalıyız
         */

        String isim=scan.nextLine();


        System.out.println("Lütfen soyisminizi giriniz");
        String soyisim=scan.nextLine();

        System.out.println("Lütfen yasınızı giriniz");
        double yas= scan.nextDouble();

        // girilen bılgıler =  seyfı capar 34 seklınde yazdırın

        System.out.println("girilen bilgiler = " + isim + " "+soyisim+"  "+yas);
    }
}
