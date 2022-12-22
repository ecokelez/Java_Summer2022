package day12_StringManipulation;

import java.util.Scanner;

public class C12_PracticeS7 {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen ısmınızı,soyısmınızı ve kredı kartı bılgılerınızı gırınız");
        String ısım= scan.nextLine();
        String soyısım=scan.nextLine();
        String kkNo= scan.nextLine();

        String ısımIlkHarf=ısım.substring(0,1).toUpperCase();
        String ısımGerıyeKalanlar=ısım.substring(1).replaceAll("\\w","*");
        String soyısımIlkHarf=soyısım.substring(0,1).toUpperCase();
        String soyısımGerıyeKalanlar=soyısım.substring(1).replaceAll("\\w","*");

        String kkSDR=kkNo.substring(15,19);
        String kkGerıyeKalanR=kkNo.substring(0,15).replaceAll("\\d","*");

        System.out.println("ısım - soyısım : "+ ısımIlkHarf+ısımGerıyeKalanlar+" "+soyısımIlkHarf+soyısımGerıyeKalanlar+"\n"+
               "Kart No : "+  kkSDR+kkGerıyeKalanR);



    }
}
