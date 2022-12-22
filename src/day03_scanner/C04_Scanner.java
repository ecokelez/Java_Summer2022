package day03_scanner;

import java.util.Scanner;

public class C04_Scanner {
    public static void main(String[] args) {

        //kullanıcıdan ismini isteyin
        //girilen isim
        // isminiz : Ismail  seklinde yazın

        // insanların dünyasından kod' larımızın bulunduğu class' a deger atamak icin
        // Scanner class'ini kullanırız

        // 1- Scanner objesi oluturalım
        Scanner scan = new Scanner(System.in);

        // 2- kullanıcıya ne istedigimizi soyleyelim
        System.out.println("Lütfen isminizi giriniz");

        // 3- olusturdugumuz scan objesi ile kullanıcının  girdigi degeri alıp
        // olsturdugumuz uygun bir variable' a atayalım

        String kullanıcıİsmi = scan.next();
        System.out.println("isminiz : " + kullanıcıİsmi);
    }

}
