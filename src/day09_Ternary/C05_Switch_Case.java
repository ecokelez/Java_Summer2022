package day09_Ternary;

import java.util.Scanner;

public class C05_Switch_Case {

    public static void main(String[] args) {

        /*
           kullanicidan gun numarasini alip
            1 ise pazartesi,
                  ...
                         7 ise pazar yazdiralim
        */

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bır gun numarası gırınız");
        int gunNo= scan.nextInt();
              /*
              Switch yanına yazılan parantez () neye gore case atayacagımızı gosterır,
              Java gırlen degere gore case' i bulur ve o satırdan itibaren calıstırmaya baslar,
              break yazısı gorunceye kadar ve ya switch parantezıne kadar devam eder.
               */


        switch (gunNo){
            case 1:
                System.out.println("Pazartesi");
                break;
            case 2:
                System.out.println("Salı");
            case 3:
                System.out.println("Carsamba");
            case 4:
                System.out.println("Persembe");
            case 5:
                System.out.println("Cuma");
                break;
            case 6:
                System.out.println("Cumartesi");
                break;
            case 7:
                System.out.println("Pazar");
                break;
            default:
                System.out.println("Lutfen gecerlı bır gun no gırınız");

        }


    }
}
