package day03_scanner;

import java.util.Scanner;

public class C08_ScannerIlkHarf {
    public static void main(String[] args) {

     // kullanıcıdan  ismini  alıp , ilk harfini buuyk harf olarak yazdırın

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen isminizi giriniz");

        /*
        Jva Scanner class'ında   nextChar () metodu yoktur ,
        bunun yerine String olarak ilk kelimeyi alıp,
        onun da ilk harfini alabiliriz
         */

        char ilkHarf=scan.next().toUpperCase().charAt(0);
        System.out.println("ismin ilk harfi : " + ilkHarf);


    }
}
