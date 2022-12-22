package day11_StringManipulations;

import java.util.Scanner;

public class C10_endsWith_S {

    public static void main(String[] args) {

       /*
        Soru 1) Kullanicidan email adresini girmesini isteyin,
         mail @gmail.com icermiyorsa  “lutfen gmail adresi giriniz”,
          @gmail.com ile bitiyorsa  “Email adresiniz kaydedildi “ ,
           @gmail.com ile bitmiyorsa lutfen yazimi kontol edin yazdirin
        */

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bır email adresi gırınız");
        String str= scan.nextLine();

        if (!str.contains("@gmail.com")){
            System.out.println("lutfen gmail adresi giriniz");
        } else if (str.endsWith("@gmail.com")) {
            System.out.println("Email adresiniz kaydedildi");
        }else {
            System.out.println("lutfen yazimi kontol edin");
        }

    }
}
