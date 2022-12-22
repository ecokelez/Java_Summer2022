package day13_MethodCreation;

import java.util.Scanner;

public class C02_StringManipulatıon {
    public static void main(String[] args) {
         /* kullanıcıdan bir sifre girmesini isteyin asagıdakı sartları saglıyorsa "sıfre basarı ile
     tanımlandı"sartları saglanmaza "ıslem basarısız."lutfen yenı bir sıfre giriniz"
    -ilk harf buyuk harf olmalı
    -Son harf kucuk harf olmalı
    -sıfre bosluk ıcermemlı
    -sıfre uzunlugu en az 8 karakter olmalı*/

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir sifre girınız");
        String sıfre= scan.nextLine();
        int kontrol=0;
        // ılk harf kontrolu

        if (sıfre.charAt(0)>='A' && sıfre.charAt(0)<='Z'){
         kontrol++;
        }else{
            System.out.println("ilk harf buyuk harf olmalı");
        }
        if (sıfre.charAt(sıfre.length()-1)>='a' && sıfre.charAt(sıfre.length()-1)<='z'){
        kontrol++;
        }else{
            System.out.println("Son harf kucuk harf olmalı");
        }
           // bosluk kontrolu;

        if (sıfre.contains(" ")){
            System.out.println("Sıfre bosluk ıcermemlı");
        }else{

        }
         // sıfre uuznluk kontrolu;
         if (sıfre.length()>=8){
         kontrol++;
         }else{
             System.out.println("Sıfre uzunlugu en az 8 karakter olmalı");
         }

         if (kontrol==4) {
             ;
             System.out.println("sıfre basarı ile tanımlandı");
         }else{
             System.out.println("Islem basarısız,lutfen yenı bir sıfre giriniz");
         }


    }
}
