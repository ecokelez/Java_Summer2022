package day07_If_Statementns;

import java.util.Scanner;

public class C12_if_ElseStatementHomework {

    public static void main(String[] args) {

          /*
             kullanıcıdan dikdörtgenin kenar uzunluklarını isteyin
            dikdörtgenin kare olup olmadığını yazdırın
          */

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen gecerlı bır kenar uzunlugu gırınız");
         int kenar1= scan.nextInt();
         int kenar2= scan.nextInt();

         if(kenar1==kenar2){
             System.out.println("Bu diktörtgen bır karedır");
         }else{
             System.out.println("Bu bır dikdortgendır");
         }

    }
}
