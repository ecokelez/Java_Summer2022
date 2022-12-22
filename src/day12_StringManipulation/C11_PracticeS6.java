package day12_StringManipulation;

import java.util.Scanner;

public class C11_PracticeS6 {
    public static void main(String[] args){


      //Soru6 Kullanicidan bir sifre girmesini isteyin Asagidaki sartlari sagliyorsa “Sifre
        //basari ile tanimlandi”, sartlari saglamazsa “Islem basarisiz,Lutfen yeni bir sifre girin”
        //yazdirin
        //Ilk harf buyuk harf olmali
        //Son harf kucuk harf olmali
        //Sifre bosluk icermemeli
        //Sifre uzunlugu en az 8 karakter olmali

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir sıfre gırınız");
        String sıfre= scan.nextLine();
        String ılkHarf=sıfre.substring(0,1);
        String ılkHarBuyuk=sıfre.substring(0,1).toUpperCase();
        String sonHarf=sıfre.substring(sıfre.length()-1);
        String sonHarfKucuk=sıfre.toLowerCase().substring(sıfre.length()-1);
        String boslukSıfre=sıfre.replaceAll("//s","");

         if (ılkHarf.equals(ılkHarBuyuk) && (sonHarf.equals(sonHarfKucuk)) &&
                 (sıfre.equals(boslukSıfre)) && (sıfre.length()>=8)){
             System.out.println("Sifre basari ile tanimlandi");
         }else {
             System.out.println("Islem basarisiz,Lutfen yeni bir sifre girin");
         }








    }
}
