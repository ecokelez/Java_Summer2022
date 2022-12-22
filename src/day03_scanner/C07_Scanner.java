package day03_scanner;

import java.util.Scanner;

public class C07_Scanner {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen isminizi, soyisminizi ve yasınızı giriniz\naralarda Enter tusuna basınız");

        String isim=scan.nextLine();
        String soyisim=scan.nextLine();
        int yas=scan. nextInt();

      // gırılen bılgıler = seyfı capar 34 seklınde yazdırın

        System.out.println("Girilen bılgıler = " +isim+","+soyisim+","+yas);



    }
}
