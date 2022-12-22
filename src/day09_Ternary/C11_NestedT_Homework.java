package day09_Ternary;

import java.util.Scanner;

public class C11_NestedT_Homework {
    public static void main(String[] args) {

        /*
        Kullanıcıdan bır sayı alın ve sayı uc basamaklı ıse "uc basamaklı sayı"
        degılse " Uc basamaklı sayı degıl" yazdırın
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bır sayı gırınız");
        int sayi= scan.nextInt();

        System.out.println(sayi>99 && sayi<1000 ? "Uc basmaklı sayı" : "Uc basamaklı sayı degıl");

    }


}
