package day09_Ternary;

import java.util.Scanner;

public class C09_NestedT_Homework {

    public static void main(String[] args) {

     /*
      Kullanıcıdan bır tam sayı alın ve sayı 10 dan kucukse "Rakam" ,
      100 den kucukse "iki basamaklı sayı" ,
      degılse " uc basmaklı sayı ve ya daha buyk sayı" yazdırın

      */

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bır  sayi gırınız");
        int sayi= scan.nextInt();

        String sonuc=(sayi<10) ? ("Rakam") :
                ( (sayi<100) ? "İki basamaklı sayi " : "Uc basmaklı sayı ve ya daha buyuk sayı");

        System.out.println(sonuc);







    }
}
