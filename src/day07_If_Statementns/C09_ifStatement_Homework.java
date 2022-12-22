package day07_If_Statementns;

import java.util.Scanner;

public class C09_ifStatement_Homework {

    public static void main(String[] args) {

        /*
          Kullanıcıdan gün isimlerinden birinin ilk harfini isteyin ve o harfle
        başlayan gün isimlerini yazdırın.

        */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen hafatanın gunlerınden birinın ilk harfini gırınız");
        char ilkHarf = scan.next().toUpperCase().charAt(0);

        if (ilkHarf == 'P') {
            System.out.println("Pzartesi, Persembe, Pazar");
        }
        if (ilkHarf == 'S') {
            System.out.println("Salı");
        }
        if (ilkHarf == 'C') {
            System.out.println("Carsamba,Cuma veya Cumartesi");
        }
        if (!(ilkHarf == 'P' || ilkHarf == 'S' || ilkHarf == 'C')) {
            System.out.println("Lutfen gecerlı bır harf giriniz");
        }

    }
}
