package day07_If_Statementns;

import java.util.Scanner;

public class C04_BasıcifStatement {

    public static void main(String[] args) {



        /*
        Sru 3) Kullanıcıdan gun ısmı alın ve haftaıcı ve ya hafta sonu oldugunu yazdırın
          orn:  gun= Pazar =   output= "Hafta sonu"
                gun = Salı      output= Hafta ıcı

                 ****Stribg ıcın equals metodunu mullanın
         */

        Scanner scan=new Scanner(System .in);
        System.out.println("Lutfen bır gun ısmı gırınız ");
        String gırılenGun=scan.next().toLowerCase();

        // Pazar, pazar PAZAR,...????  bılemeyız
        //pazar,pazar,pazar,

        if (gırılenGun.equals("pazar") || gırılenGun.equals("cumartesi")){
            System.out.println("Gırılen gun HAFTASONU ");
        }

        if ( gırılenGun.equals("pazartesi") || gırılenGun.equals("salı")
            || gırılenGun.equals("carsamba") || gırılenGun.equals("persembe")
            || gırılenGun.equals("cuma")){
            System.out.println("Gırılen gun HAFTAICI");
        }

        if (!( gırılenGun.equals("pazartesi") || gırılenGun.equals("salı")
                || gırılenGun.equals("carsamba") || gırılenGun.equals("persembe")
                || gırılenGun.equals("cuma")|| gırılenGun.equals("cumartesi")
                || gırılenGun.equals("pazar"))){
                System.out.println("Lutfen gecerlı bır gun ısmı gırınız");
        }
    }
}