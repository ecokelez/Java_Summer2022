package day07_If_Statementns;

import java.util.Scanner;

public class C13_ifElse_Homework {

    public static void main(String[] args) {

       //kullanıcıdan bır karakter ısteyın ve gırılen karakterın bır harf olup
        // olmadıgını yazdırın

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen gecerlı bır karakter gırınız");
        char harf=scan.next().charAt(0);

        if (harf>='a' && harf<='z' || harf>='A' &&  harf<='Z'){
            System.out.println("Gırılen karakter bır harf");
        }else {
            System.out.println("Gırılen karakter bır harf degıl");
        }


    }
}
