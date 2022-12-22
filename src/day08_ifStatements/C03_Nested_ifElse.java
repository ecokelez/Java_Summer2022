package day08_If_Statements;

import java.util.Scanner;

public class C03_Nested_ifElse {

    /*
    Emeklılk kontrolu yapan bır program yazınız
    Cınsıyet olarak erkek E ve kadın olarak K  degıskenlerını kabul etsın
    Farklı bır harf ve ya sembol girilirse hata mesajı versın

    Kadınlarda yas sınırı 60,
    erkeklerde 65 olsun
    negatıf yas ve ya 80 den buyuk yas gırılırse hata mesajı versın

     */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen cınsıyetlerınızı gırınız" + "\n Kadın K Erkek ıcın E harfını gırınız ");

        char cınsıyet = scan.next().toUpperCase().charAt(0);
        System.out.println("Lutfen yasınızı gırınız");
        double yas = scan.nextDouble();


        if (cınsıyet == 'E') {
            if (yas < 0 || yas > 80) {
                System.out.println("Gecerlı bır yas gırınız");
            } else if (yas < 65) {
                System.out.println("Emeklı olamazsın");
            } else {
                System.out.println("Emeklı olabılırsın");
            }

        } else if (cınsıyet == 'K') {
            if (yas < 0 || yas > 80) {
                System.out.println("Gcerlı bır yas gırınız");
            } else if (yas < 60) {
                System.out.println("Emeklı olamazsın");
            } else {
                System.out.println("Emeklı olabılırsın");
            }

        } else {
            System.out.println("Lutfen gecerli bır yas gırınız");
        }
    }
}






