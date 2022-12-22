package day09_Ternary;

import java.util.Scanner;

public class C02_Ternary {

    public static void main(String[] args) {

        //Soru4 ) Kullanicidan bir sayi alin. Sayi pozitifse “Sayi pozitif” yazdirin,
        // negatifse  sayinin karesini yazdirin


        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bır sayı gırınız");
        double sayi= scan.nextDouble();

        /*
        Eger ternary ıcındekı sonuclar farklı data turlerındeyse
        atama yapamayız, sadece yazdırabılırız,
        double sonuc = sayi>0 ? "Sayi Pozitif" : (sayi*sayi)
         */
        System.out.println(sayi>0 ? "Sayi pozitif " : (sayi*sayi));


    }
}
