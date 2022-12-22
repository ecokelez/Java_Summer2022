package day07_If_Statementns;

import java.util.Scanner;

public class C14_ifElseHomework {

    public static void main(String[] args) {
        /*
            kullanıcıdan üçgenin kenar uzunluklarını isteyin
           eger uc kenarı bırbırıne esıtse ekrana eskenar ucgen yazdırın
           dıger durumlarda ekrana eskeanr degıl yazdırın
       */

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen gecerlı bır kenar uzunlugu gırınız");
         double kenar1= scan.nextDouble();
         double kenar2= scan.nextDouble();
         double kenar3= scan.nextDouble();

         if(kenar1==kenar2 && kenar2==kenar3){
             System.out.println("Bu uçgen eskenar ucgendır");
         }else {
             System.out.println("Bu ucgen eskenar ucgen degıldır");
         }




    }
}
