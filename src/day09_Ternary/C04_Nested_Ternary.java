package day09_Ternary;

import java.util.Scanner;

public class C04_Nested_Ternary {
    public static void main(String[] args) {
        /*
        Soru2 : --> Kullanicidan bir harf isteyin kucuk harf ise consola “Kucuk Harf” ,
             --> buyuk harfse consola “Buyuk Harf”
             --> yoksa “girdiginiz karakter harf degil” yazdirin.

         */

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bır harf gırınız");
        char harf=scan.next().charAt(0);

        /*
           String sonuc=(harf>='a' && harf<='z') ? ("Kucuk harf") :
                ("Buyuk harf ve ya geversız karakter"):
         */

        String sonuc=(harf>='a' && harf<='z') ? ("Kucuk harf") :
                ( (harf>='A' && harf<='Z') ? "Buyuk harf" : "Gecersız karakter ");

        String sonuc2=harf>='a' && harf<='z' ? "Kucuk harf" :
                      harf>='A' && harf<='Z'  ? "Buyuk harf" : "Gecersız karakter";

        System.out.println(sonuc);
        System.out.println(sonuc2);


    }
}
