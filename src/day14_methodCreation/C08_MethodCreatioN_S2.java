package day14_methodCreation;

import java.util.Scanner;

public class C08_MethodCreatioN_S2 {
    public static void main(String[] args) {
        /*   Kullaniciya kac sayi toplamak istedigini sorun
         * Kullanici 2,3,4 degerini girerse kullanicidan bu sayilari girmesini isteyin
         * ve sayilarin toplamini yazdirin 4 den buyuk girerse cok sayı gırıdnız ben toplayamam yazdirin   */

        Scanner scan=new Scanner(System.in);
        System.out.println("Kac sayı toplamak ıstıyorsunuz");
        int kacSayı= scan.nextInt();

        sayıToplama(kacSayı);

    }

       public static void sayıToplama(int kacSayı) {
        Scanner scan=new Scanner(System.in);
        String result="";

        if (kacSayı<=1){
            System.out.println("Lutfen 1' den buyuk sayı gırınız");
        } else if (kacSayı==2) {
            System.out.println("Lutfen  birinci sayıyı gırınız");
            int sayı1=scan.nextInt();
            System.out.println("Lutfen  ikinci  sayıyı gırınız");
            int sayı2=scan.nextInt();
            System.out.println("iki sayının toplamı = " + (sayı1+ sayı2));
        } else if (kacSayı==3) {
            System.out.println("Lutfen  birinci sayıyı gırınız");
            int sayı1=scan.nextInt();
            System.out.println("Lutfen ikinci sayıyı gırınız");
            int sayı2=scan.nextInt();
            System.out.println("Lutfen  ucuncu sayıyı gırınız");
            int sayı3=scan.nextInt();
            System.out.println("uc sayının toplamı " + (sayı1+sayı2+sayı3));
        } else if (kacSayı==4) {
            System.out.println("Lutfen  birinci sayıyı gırınız");
            int sayı1=scan.nextInt();
            System.out.println(" Lutfen  ikinci sayıyı gırınız");
            int sayı2=scan.nextInt();
            System.out.println("Lutfen  ucuncu sayıyı gırınız");
            int sayı3=scan.nextInt();
            System.out.println("Lutfen  dorduncu sayıyı gırınız");
            int sayı4=scan.nextInt();
            System.out.println("dort sayının toplamı = " +(sayı1+sayı2+sayı3+ sayı4));
        }else{
            System.out.println("Cok sayı gırdnız ben toplayamam ");
        }


       }
    }
