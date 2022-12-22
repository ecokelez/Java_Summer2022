package day08_If_Statements;

import java.util.Scanner;

public class C05_Neste_ifElseStatement {
    public static void main(String[] args) {


         /*
           Soru 11) Nested If kullanarak asagidaki soruyu cozen kodu yaziniz.
          Kullanicidan bir sifre girmesini isteyin
          Eger ilk harf buyuk harf ise “A” olup olmadigini kontrol edin.--
          --Ilk harf A ise  “Gecerli Sifre”  degilse “Gecersiz Sifre” yazdirin.

          Eger ilk harf kucuk harf ise “z” olup olmadigini kontrol edin.
          Ilk harf z ise  “Gecerli Sifre”  degilse “Gecersiz Sifre” yazdirin

         */

        //ilk harf buyuk mu kucuk mu?
        //ilk harf buyuk A veya z mi?

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen gecerli bir sıfre gırınız");
        String sıfre= scan.nextLine();
        char ilkHarf=sıfre.charAt(0);

        if (ilkHarf>='A'&& ilkHarf<'Z'){    // ilk harfı buyuk olam kelımeler
            if(ilkHarf=='A'){
                System.out.println("Gecerlı sıfre");
            }else {
                System.out.println("Gecersız sıfre");
            }
        }else if (ilkHarf>='a' && ilkHarf<='z'){  // ilk haf kucuk harf
            if (ilkHarf=='z'){
                System.out.println("Gecerlı sıfre");
            }else{
                System.out.println("Gecersız sıfre");
            }

        } else{
            System.out.println("Lutfen ilk karakter ıcın sadece harf kullanın");
        }


    }
}
