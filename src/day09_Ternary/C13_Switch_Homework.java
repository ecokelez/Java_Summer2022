package day09_Ternary;

import java.util.Scanner;

public class C13_Switch_Homework {
    public static void main(String[] args) {

        /*
        Soru 2- Kullanıcıdan kacıncı ay old. sorun ve ay ısmnı yazdırın
         */


        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bır ay no gırınız");
        int ayNo = scan.nextInt();

        switch (ayNo) {
            case 1:
                System.out.println("Ocak");
                break;
            case 2:
                System.out.println("Subat");
                break;
            case 3:
                System.out.println("Mart");
                break;
            case 4:
                System.out.println("Nısan");
                break;
            case 5:
                System.out.println("Mayıs");
                break;
            case 6:
                System.out.println("Hazıran");
                break;
            case 7:
                System.out.println("Temmuz");
                break;
            case 8:
                System.out.println("Agustos");
                break;
            case 9:
                System.out.println("Eylul");
                break;
            case 10:
                System.out.println("Ekım");
                break;
            case 11:
                System.out.println("Kası");
                break;
            case 12:
                System.out.println("Aralık");
                break;
            default:
                System.out.println("Lutfen bır gecerlı ay no gırınız");


        }
    }
}
