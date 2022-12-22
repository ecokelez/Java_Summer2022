package day16_forLoop;

import java.util.Scanner;

public class C05_forLoop_S10 {
    public static void main(String[] args) {


                //  Soru 10 )  Kullanicidan iki sayi isteyin. +++
               //++ Girilen sayilar ve aralarindaki tum tamsayilari toplayip, sonucu yazdiran bir program yaziniz

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen baslangıc ve bıtıs degerlerını pozıtıf tamsayı olarak gırın");
        int bas= scan.nextInt();
        int bıtıs=scan.nextInt();

        aralarıTopla(bas,bıtıs);



    }

    public static void aralarıTopla(int bas, int bıtıs) {
        int toplam=0;

        if (bas<=bıtıs){
            for (int i = bas; i <=bıtıs ; i++) {
               toplam+=i;
            }

        }else{
            for (int i = bıtıs; i <=bas ; i++) {
                toplam+=i;
            }
        }
        System.out.println("Aralardakı sayıların toplamı = " + toplam);






    }
}
