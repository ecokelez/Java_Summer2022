package day07_If_Statementns;

import java.util.Scanner;

public class C08_ifStatement_Homework {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir tamsayı gırınız");

        int sayi = scan.nextInt();


        if (sayi % 10 == 0) {
            System.out.println("girilen sayi cıft");
        }else{
            System.out.println("girilen sayi tek ");
        }

    }
}

