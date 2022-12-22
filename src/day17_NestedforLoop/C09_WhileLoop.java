package day17_NestedforLoop;

import java.util.Scanner;

public class C09_WhileLoop {
    public static void main(String[] args) {

        /* Soru 6 : kullanıcıdan bir sifre girmesini isteyin asagıdakı sartları saglıyorsa "sıfre basarı ile
     tanımlandı"sartları saglanmaza "ıslem basarısız."lutfen yenı bir sıfre giriniz"
     Ve basarılı sıfre gırınceye kadar ıslemın tekrar sıfre gırmesını  ısteyın
    -ilk harf buyuk harf olmalı
    -Son harf kucuk harf olmalı
    -sıfre bosluk ıcermemlı
    -sıfre uzunlugu en az 8 karakter olmalı*/

        Scanner scan=new Scanner(System.in);

        String sıfre= "";
        boolean sıfreBasarılıMı=false;
        int kontrol=0;


        while (!sıfreBasarılıMı) {
            // kulanıcıdan bır sıfre alalım
            System.out.println("Lutfen bir sifre girınız");
            sıfre = scan.nextLine();

            // Ilk harf kontrolu
            if (sıfre.charAt(0) >= 'A' && sıfre.charAt(0) <= 'Z') {
                kontrol++;
            } else System.out.println("ilk harf buyuk harf olmalı");

            // son harf konrolu
            if (sıfre.charAt(sıfre.length() - 1) >= 'a' && sıfre.charAt(sıfre.length() - 1) <= 'z') {
                kontrol++;
            } else System.out.println("Son harf kucuk harf olmalı");

            // bosluk kontrolu;
            if (sıfre.contains(" ")) {
                System.out.println("Sıfre bosluk ıcermemlı");
            } else kontrol++;

            // sıfre uuznluk kontrolu;
            if (sıfre.length() >= 8) {
                kontrol++;
            } else System.out.println("Sıfre uzunlugu en az 8 karakter olmalı");

            if (kontrol == 4) {
                System.out.println("Sıfre basarı ile tanımlandı");
                sıfreBasarılıMı = true;
            } else kontrol = 0;     // Sıfre basarısız old tekrar basa donecek --++
            //  +++ Kontrol variable sıfırlanmalı

        }
    }
}





