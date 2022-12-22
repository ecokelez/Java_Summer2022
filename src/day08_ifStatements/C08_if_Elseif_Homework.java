package day08_ifStatements;

import java.util.Scanner;

public class C08_if_Elseif_Homework {

    public static void main(String[] args) {

        /*
        Soru 6) Kullanicidan iki sayi isteyin, sayilarin ikisi de pozitif ise sayilarin toplamini yazdirin,
                sayilarin ikisi de negative ise sayilarin carpimini yazdirin, sayilarin ikisi farkli
                isaretlere sahipse “farkli isaretlerde sayilarla islem yapamazsin” yazdirin,
                sayilardan sifira esit olan varsa “sifir carpmaya gore yutan elemandir” yazdirin.
         */




        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen gecerli bir sayi yazınız");
        int sayi1= scan.nextInt();
        System.out.println("Lutfenn  ikinci sayıyı gırınız");
        int sayi2= scan.nextInt();

        if (sayi1>0 && sayi2>0){
            System.out.println("sayiların toplamı : " + (sayi1+sayi2));
        } else if (sayi1<0 && sayi2<0) {
            System.out.println("sayıların carpımı : " + (sayi1*sayi2));
        }else if (sayi1>0 && sayi2<0 || sayi1<0 && sayi2>0){
            System.out.println("farklı isaretlerde sayılarla islem yapamazsın");
        } else if (sayi1==0 || sayi2==0) {
            System.out.println("sıfır carpmaya gore yutan elemandır");

        }
    }


    }

