package day07_If_Statementns;

import java.util.Scanner;

public class C10_ifStatementHomework {
    public static void main(String[] args) {
        /*
        kullanıcıdan üçgenin kenar uzunluklarını isteyin
        üçgenin eşkenar üçgen olup olmadığını yazdırın
         */


        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen ucgenın kenar uzunluklarını gırınız");

        int kenar1 = scan.nextInt();
        int kenar2 = scan.nextInt();
        int kenar3 = scan.nextInt();

        if (kenar1 == kenar2 && kenar1 == kenar3) {
            System.out.println("ucgen eskenar ucgendır");
        } else {
            System.out.println("Ucgen eskenar ucgen degıldır");
        }
    }

}
