package day09_Ternary;

import java.util.Scanner;

public class C14_Switch_Homework {
    public static void main(String[] args) {

        /*
        Kullanıcıdan bır sayı gırmesını ısteyin, gırılen sayı ;
        10 ise "iki basamaklı en kucuk sayı"
        100 ise "uc basamaklı en kucuk sayı"
        1000 ise " dort basamaklı en  kucuk sayı"
        diger durumlarda "gırdıgın sayıyıy degısıtır" yazdırın

         */

        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen gecerlı bır sayı gırınız");

        int sayi= scan.nextInt();


        switch (sayi){
            case 10 :
                System.out.println("iki basamaklı en kucuk sayı");
                break;
            case 100 :
                System.out.println("uc basamaklı en kucuk sayı");
                break;
            case 1000 :
                System.out.println(" dort basamaklı en  kucuk sayı");
                break;
            default:
                System.out.println("gırdıgın sayıyı degıstır");
        }
    }
}
