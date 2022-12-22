package day09_Ternary;

import java.util.Scanner;

public class C10_NestedT_Homework {

    public static void main(String[] args) {
        /*
        Kullanıcıdan dıkdortgenın uuznlugunu ve genıslıgını alın ve
        gırilen degerlere gore dkdortgenın kare olup olmadıgını yazın
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen uzun kenarı gırınız");
        int kenar1= scan.nextInt();
        System.out.println("Lutfen kısa kenarı gırınız");
        int kenar2= scan.nextInt();


        System.out.println(kenar1==kenar2 ? "Diktortgen bir karedir" : " Dikdortgen kare degildır");



    }
}
