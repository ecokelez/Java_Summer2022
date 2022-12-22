package day14_methodCreation;

import java.util.Scanner;

    public class C09_MethodCreationS3 {
         public static void main(String[] args) {

                  /*
        Email kontrolu yapan bir program yazin.Kullanici girdigi sifre
        -@ isareti icermiyorsa gecersiz email yazdirin
        -@gmail.com icermiyorsa "lutfen gmail adresinizi girin" yazdirin
        -@gmail.com ile bitmiyorsa "Yazimda bir sorun var,maili kontrol ediniz"
         */

             Scanner scan=new Scanner(System.in);
             System.out.print("Lutfen mail adresinizi gırınız: ");
             String email=scan.nextLine();

             mailKontrol(email);


         }

        public static void mailKontrol(String email) {
          if (!(email.contains("@"))){
              System.out.println("Gecersız email");
          } else if (!(email.contains("@gmail.com"))) {
              System.out.println("lutfen gmail adresinizi girin");
          }else if (!(email.endsWith("@gmail.com"))){
              System.out.println("Yazimda bir sorun var,maili kontrol ediniz");
          }else {
              System.out.println("Tebrıkler! Email adresınız kaydedıldı");
          }
        }


    }
