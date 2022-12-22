package day09_Ternary;

import java.util.Scanner;

public class C08_Ternary_Homework {

    public static void main(String[] args) {

         // Soru 2  = Kullanıcıdan bır tam sayı alın ve sayının tek ve ya cift oldugunu yazdırın

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bır tam sayı gırınız");
        int sayi= scan.nextInt();

        System.out.println(sayi%2==0 ? "sayi cift sayıdır : " : "sayi tek sayıdır");

    }
}
