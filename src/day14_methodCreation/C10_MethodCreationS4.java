package day14_methodCreation;

import java.util.Scanner;

public class C10_MethodCreationS4 {

    public static void main(String[] args) {

        /*
                 Kullanicidan ismini,soyismini ve bosluk birakmadan 16 hane olarak kredi karti numarasini alin
            isim ve soyismi ilk harfleri buyuk diger harfler kucuk olacak sekilde,
                KK numarasini ise 4 rakamlik 4 blok olacak sekilde duzelten 2 method yazin,ve programda kullanabilmek
           icin duzenlenmis hallerini geri dondurun
                */



        String adSoyad=kullanıcıAdı();
        String kartNo=kredinumAl();


        System.out.println("Gırmıs oldugunuz ad ve soyadınız = " + adSoyad);
        System.out.println("Gırmıs oldugunuz kart numaranız = " + kartNo);



    }

    public static String kredinumAl() {
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen kartNo gırınız ");
        String kartNo= scan.nextLine();
        kartNo=kartNo.substring(0,4)+" "+
                kartNo.substring(4,8)+" "+
                kartNo.substring(8,12)+" "+
                kartNo.substring(12);


         return kartNo;


    }

    public static String kullanıcıAdı() {
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen adınızı gırınız ");
        String ad= scan.nextLine();
        ad=ad.substring(0,1).toUpperCase()+ad.substring(1).toLowerCase();

        System.out.println("Lutfen soyadınızı gırınız");
        String soyad= scan.nextLine();
        soyad=soyad.substring(0,1).toUpperCase()+soyad.substring(1).toLowerCase();

          return (ad+" "+soyad);


    }
}
