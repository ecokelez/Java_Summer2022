package day16_forLoop;

import java.util.Scanner;

public class C17_forLoop_S11 {

    public static void main(String[] args) {
        // Interview Question Kullanicidan 10’dan kucuk bir tamsayi isteyin ve girilen
        //  sayinin faktoryel’ini bulun. (5!=5*4*3*2*1)

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen  bir sayıyı gırınız");
        int sayı= scan.nextInt();

        faktorıyelHesap(sayı);


    }

    private static void faktorıyelHesap(int sayı) {

            int faktorıyel=1;

        if (sayı<0) {
            System.out.println("Lutfen pozıtıf bir sayıyı gırınız");
        } else if (sayı==0) {
            System.out.println("0' ın faktoryel degerı=1");
        } else {
            for (int i = 1; i <=sayı; i++) {
                faktorıyel *= i;
            }
        }

        System.out.println("Gırılen faktorıyel degerı  = " + faktorıyel);
    }
}
