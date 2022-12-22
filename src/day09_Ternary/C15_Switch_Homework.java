package day09_Ternary;

import java.util.Scanner;

public class C15_Switch_Homework {

    public static void main(String[] args) {
        /*
        Kullnaıcıdan SDET kısaltmasındakı harflaerden bırısını yazmasını ısteyın,
        Kullanıcı S gırerse "Software",
                  D girerse "Developer"
                  E gırerse "Engıneer"
                  T gırerse "In Testıng"   yazdırın

         */
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen S,D,E,T harflerınden birini gırınız");
        char harf=scan.next().toUpperCase().charAt(0);


        switch (harf){
            case 'S' :
                System.out.println("Software");
                break;
            case 'D' :
                System.out.println("Developer");
                break;
            case 'E' :
                System.out.println("Engıneer");
                break;
            case 'T' :
                System.out.println("In Testıng");
                break;
            default:
                System.out.println("Lutfen gecerlı bır harf gırınız");
        }


    }

}
