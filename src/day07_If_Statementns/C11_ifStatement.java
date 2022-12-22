package day07_If_Statementns;

import java.util.Scanner;

public class C11_ifStatement {

    public static void main(String[] args) {
        /*
        Soru 5) Kullanicidan bir gun alin eger gun “Cuma” ise ekrana “Muslumanlar icin kutsal
                gun” yazdirin.
                “Cumartesi” ise ekrana “Yahudiler icin kutsal gun” yazdirin.
                “Pazar” ise ekrana “Hiristiyanlar icin kutsal gun” yazdirin
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bır gun ısmı gırınız");
        String gırılenGun=scan.nextLine().toLowerCase();

        if(gırılenGun.equals("Cuma")){
            System.out.println("Muslumanlar ıcın kutsal gun");
        }if (gırılenGun.equals("Cumartesi")){
            System.out.println("Yahudıler ıcın kutsal gun");
        }if (gırılenGun.equals("Pazar")){
            System.out.println("Hrıstıyanlar ıcın kutsal gun");
        } if (!(gırılenGun.equals("Cuma") || gırılenGun.equals("Cumartesi") || gırılenGun.equals("Pazar"))){
            System.out.println("Lutfen gecerlı bır gun ısmı gırınız");
        }


    }
}
