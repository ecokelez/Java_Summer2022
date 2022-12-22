package day07_If_Statementns;

import java.util.Scanner;

public class C05_if_ElseStatement {

    public static void main(String[] args) {
    /*
    Kullanıcıdan br karakter gırmesını ısteyın
    ve gırılen karakterın harf olup olmadıgını yazdırın
     */
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bır karakter gırınız");
        char harf=scan.next().charAt(0);

        if (harf>='a' && harf<='z' || (harf>='A' && harf<='Z')){
            System.out.println("Gırılen karakter bır harf ");

        } else {
            System.out.println("Gırılen karakter bır harf degıl");
        }


    }
}
