package day16_forLoop;

import java.util.Scanner;

public class C16_forLoop_S10 {
    public static void main(String[] args) {

        //  Kullanicidan iki sayi isteyin. Girilen sayilar ve aralarindaki tum tamsayilari
        // toplayip, sonucu yazdiran bir program yaziniz


        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen  birıncı ve ikıncı sayıyı gırınız");
        int bas= scan.nextInt();
        int son= scan.nextInt();

        sayılarıToplam(bas,son);



    }

    private static void sayılarıToplam(int bas, int son) {
        int toplam=0;

        if (bas<son){
            for (int i = bas; i <=son ; i++) {
                toplam+=i;
            }
        } else if (bas>son) {
            for (int i = son; i <=bas ; i++) {
                toplam+=i;
            }
        }else System.out.println("Gecerlı bır aralıkta sayı gırın");

        System.out.println("Aralardakı sayıların toplamı = " + toplam);
    }

}
