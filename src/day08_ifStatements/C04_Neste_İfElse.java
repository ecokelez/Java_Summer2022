package day08_If_Statements;

import java.util.Scanner;

public class C04_Neste_İfElse {

    /*
  Soru12) Kullanıcıdan 4 basamakli bir sayi girmesini isteyin.
  Girdiği sayi 5’e   bölünüyorsa son rakamını kontrol edin.
  Son rakamı 0 ise ekrana “5’e bölünen çift sayı” yazdırın.
  Son rakamı 0 değil ise “5’e bölünen tek sayı” yazdırın.
  Girdiği sayi 5’e bölünmüyorsa ekrana “Tekrar deneyin” yazdırın.

  */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen 4 basamaklı bır sayı gırınız");
        int sayi = scan.nextInt();

        // sayının 5 e bolunup bolunmemesı
        //sayının son basamagının  0 olup olmaması

        if (sayi < 1000 || sayi > 9999) {
            System.out.println("Lutfen 4 basamaklı bır sayı gırınız");
        } else if (sayi % 5 == 0) {
            if (sayi % 10 == 0) {
                System.out.println("5 e bolunen cıft sayı");
            } else {
                System.out.println("5 e bolunen tek sayı");
            }

        } else { // sayi 4 basamaklı degılse ama 5 e bolunemıyor
            System.out.println("Lutfen tekrar deneyin");
        }


    }
}




