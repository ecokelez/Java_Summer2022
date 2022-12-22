package day03_scanner;

import java.util.Scanner;

public class C05_Scanner {
    public static void main(String[] args) {

        // kullanıcıdan iki sayı alıp carpımlarını yazın

        // 1. adım

        Scanner scan=new Scanner(System.in);

        //2.adım

        System.out.println("Lütfen ilk sayıyı giriniz");

        // 3.adım

      double sayı1=scan.nextDouble();

      // 2. sayı icin 2. ve 3. adımları tekrarlarız

        System.out.println("Lütfen ilk sayıyı giriniz");
        double sayı2=scan.nextDouble();

        System.out.println("girilen sayıların carpımı : " + sayı1*sayı2);






    }
}
