package day08_ifStatements;

import java.util.Scanner;

public class C07_if_ElseifHomework {

    public static void main(String[] args) {

       /*
        Soru 8) Kullanicidan maas icin bir teklif isteyin ve asagidaki degerlere gore cevap azdirin.
                Teklif 80.000’in uzerinde ise “Kabul ediyorum” ,
                60 – 80.000 arasinda ise “Konusabiliriz”,
                60.000’nin altinda ise “Maalesef Kabul edemem” yazdirin
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("Bir teklıf verınız");
        double teklıf= scan.nextDouble();


        if (teklıf>80000 ){
            System.out.println("Kabul edıyorum");
        } else if (teklıf>=60000 || teklıf<=80000) {
            System.out.println("Konusabılırız");
        }else if (teklıf<60000){
            System.out.println("Maalesef kabul edemem");
        }


    }
}
