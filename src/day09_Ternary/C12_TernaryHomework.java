package day09_Ternary;

import java.util.Scanner;

public class C12_TernaryHomework {

    public static void main(String[] args) {

         // Soru 1= Kullanıcıdan iki  sayı alın ve buyuk olmayan sayıyı yazdırın

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bırıncı sayiyı gırınız");
        int sayi1= scan.nextInt();
        System.out.println("Lutfen ikicı sayıyı gırınız");
        int sayi2= scan.nextInt();


        System.out.println(("Kucuk olan sayi : " + (sayi1<sayi2 ? sayi1 : sayi2)));



    }
}
