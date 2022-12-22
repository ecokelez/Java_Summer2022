package day14_methodCreation;

import java.util.Scanner;

public class C09_MethodCreationS3_Tekrar {
    public static void main(String[] args) {
            /*
        Email kontrolu yapan bir program yazin.Kullanici girdigi sifre
        -@ isareti icermiyorsa gecersiz email yazdirin
        -@gmail.com icermiyorsa "lutfen gmail adresinizi girin" yazdirin
        -@gmail.com ile bitmiyorsa "Yazimda bir sorun var,maili kontrol ediniz"
         */

        Scanner scan=new Scanner(System.in);
        System.out.println( " Lutfen bır email adresi gırınız ");
        String email= scan.nextLine();

        emailKontrol(email);




    }

    private static void emailKontrol(String email) {

        if (!(email.contains("@"))){
            System.out.println("Gecersız email yazdırın");
        } else if (!(email.contains("@gmail.com"))) {
            System.out.println("Lutfen gmail adresinizi girin");
        }else System.out.println("Yazimda bir sorun var,maili kontrol ediniz");
    }


}
