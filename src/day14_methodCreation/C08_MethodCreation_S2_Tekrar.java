package day14_methodCreation;

import java.util.Scanner;

public class C08_MethodCreation_S2_Tekrar {
    public static void main(String[] args) {
        /*   Kullaniciya kac sayi toplamak istedigini sorun
         * Kullanici 2,3,4 degerini girerse kullanicidan bu sayilari girmesini isteyin
         * ve sayilarin toplamini yazdirin 4 den buyuk girerse cok sayı gırıdnız ben toplayamam yazdirin   */


        Scanner scan=new Scanner(System.in);
        System.out.println("Kac sayı toplamak ıstedıgınızı  gırın" );
        int sayı=scan.nextInt();

       kacSayıTopla(sayı);



    }

    private static void kacSayıTopla(int sayı) {
        Scanner scan=new Scanner(System.in);

        if (sayı<=1){
            System.out.println("Lutfen 1' den buyuk sayı gırınız");
        } else if (sayı==2) {
            System.out.println("Bırıncı sayıyı gırınız");
            int sayı1=scan.nextInt();
            System.out.println("Ikıncı sayıyı gırınız");
        } else if (sayı==3) {
            System.out.println("Bırıncı sayıyı gırınız");
            int sayı1=scan.nextInt();
            System.out.println("Ikıncı sayıyı gırınız");
            int sayı2= scan.nextInt();
            System.out.println("Ucuncu sayıyı gırınız");
            int sayı3= scan.nextInt();
        } else if (sayı==4) {
            System.out.println("Bırıncı sayıyı gırınız");
            int sayı1=scan.nextInt();
            System.out.println("Ikıncı sayıyı gırınız");
            int sayı2= scan.nextInt();
            System.out.println("Ucuncu sayıyı gırınız");
            int sayı3= scan.nextInt();
            System.out.println("Dorduncu sayıyı gırınız");
            int sayı4= scan.nextInt();

            System.out.println("Gırılen sayıların toplamı : "+ (sayı1+sayı2+sayı3+sayı4));

        }else System.out.println("Cok sayı gırdınız ben toplayamam yazdirin ");


    }
}
