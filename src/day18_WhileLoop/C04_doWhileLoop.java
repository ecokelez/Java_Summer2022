package day18_WhileLoop;

import java.util.Scanner;

public class C04_doWhileLoop {
    public static void main(String[] args) {


         /*
          Kullanicidan tam sayilar alin
          kullanici cift sayi girdigi muddetce sayiyilari yazdirin
          tek sayi girdiginde islemi bitirin
         */

                // While ıle yapalım

                                            // Loop un icerısınde variable olusturmuyoruz,
                                            // 1- Her seferınde yemı bır olusturma ıslemı yapmak
                                            // özellıkle Scanner , String gıbı yerlerde ram' ı doldurabılır,

                                            //  2- loop ıcerısnde olusturdugumuz varıable' ları loop dıısnda kullanamayız, bu nendenle
                                            // loop ' un ıcerısınde kuulanacagımız varıable' ları loop' un dısında hazırlıyoruz


      /*

       Scanner scan=new Scanner(System.in);
        int sayı=0;

        while (sayı%2==0){
            System.out.println("Lutfen cift sayi girınız");
            sayı= scan.nextInt();
            System.out.println("Gırılen sayı cıft : "+ sayı);  // tek , cıft ayrımı yapıyor fakat konsola cıft olarak yaz.

       */

        Scanner scan=new Scanner(System.in);
        int sayı=0;

        while (sayı%2==0){
            System.out.println("Lutfen bır sayi girınız");
            sayı= scan.nextInt();

            if (sayı%2==0){
                System.out.println("Gırılen sayı cıft : "+ sayı);
            }else {
                System.out.println("Gırılen sayı tek, benden bu kadar");
            }

            // do while loop ile yapalim;
            // do while'loop'da onceden olusturulan variable'a hangi deger atandiginin
            // hic bir onemi yok, kodumuz her durumda calisir

             /*
                         do-while'in dezavantaji :
                ilk calistirma kontrol yapilmadan oldugu icin
                loop'un body'sinde yanlis bir islem yapilmamasina dikkat etmek gerekir
         */


            do {
                System.out.println("Lutfen bır sayi girınız");
                sayı= scan.nextInt();
                if (sayı%2==0){
                    System.out.println("Gırılen sayı cıft : "+ sayı);
                }else {
                    System.out.println("Gırılen sayı tek, benden bu kadar");
                }
            }while (sayı%2==0);



    }












    }
}
