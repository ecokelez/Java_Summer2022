package day09_Ternary;

import java.util.Scanner;

public class C01_Ternary {

    public static void main(String[] args) {

        // Soru 3) Kullanıcıdan bır sayı alın ve mutlak degerını yazın

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bır sayı gırınız");
        double sayi= scan.nextDouble();


        System.out.println("Gırdıgınız sayının mutlak degeri : " + (sayi>=0 ? sayi: (-1*sayi)));


    }
}
