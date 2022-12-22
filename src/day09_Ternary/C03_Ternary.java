package day09_Ternary;

import java.util.Scanner;

public class C03_Ternary {

    public static void main(String[] args) {

          // kullanicidan bir sayi isteyin
          // sayi poztifse sayiyi yazdirin
          // sayi sıfır ve ya negatifse, bir sayi daha isteyin ve ikisinin carpimini yazdirin

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bır sayı gırınız");
        double sayi= scan.nextDouble();

        if (sayi>0) {
            System.out.println("sayi");
        }else {
            System.out.println("Lutfen bır sayı daha gırın");
            double sayi2= scan.nextDouble();
            System.out.println(sayi*sayi2);    // Bazen if ve else icinde baska seylerde yapabılır
                                               // kod yazabılırız, baska menulere yonlendırebılırız

            /*
            Eger if else lerde yeni kodlar varsa ternary ile yapmamız mumkun olmaz
             */

        }


    }
}
