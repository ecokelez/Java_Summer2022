package day14_methodCreation;

import java.util.Scanner;

public class C10_MethodCreationsS4_Tekrar {
    public static void main(String[] args) {
        /*
              Kullanicidan ismini,soyismini ve bosluk birakmadan 16 hane olarak kredi karti numarasini alin
            isim ve soyismi ilk harfleri buyuk diger harfler kucuk olacak sekilde,
                KK numarasini ise 4 rakamlik 4 blok olacak sekilde duzelten 2 method yazin,ve programda kullanabilmek
           icin duzenlenmis hallerini geri dondurun
                */


        String ısımSoyısım=ısımSoyAl();
        String kartNo=kartNumAl();

        System.out.println("Isım ve Soyısım = " + ısımSoyısım);
        System.out.println("KartNo = " + kartNo);

    }

    private static String kartNumAl() {
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen  KK numaranızı gırınız");
        String kartNum= scan.nextLine();
        kartNum=kartNum.substring(0,4)+" "+
                kartNum.substring(4,8)+" "+
                kartNum.substring(8,12)+" "+
                kartNum.substring(12);

        return kartNum;

    }

    private static String ısımSoyAl() {
        Scanner scan=new Scanner(System.in);
        System.out.println("Ismınızı gırınız");
        String ısım= scan.nextLine();
        System.out.println("Soyismınızı gırınız");
        String soyısım= scan.nextLine();

        ısım=ısım.substring(0,1).toUpperCase()+ısım.substring(1).toLowerCase();
        soyısım=soyısım.substring(0,1).toUpperCase()+soyısım.substring(1).toLowerCase();

        return ısım+" "+soyısım;
    }
}
