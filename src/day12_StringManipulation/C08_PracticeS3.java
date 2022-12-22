package day12_StringManipulation;

import java.util.Scanner;

public class C08_PracticeS3 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bır isim gırınız");
        String str= scan.nextLine();


        if (!str.contains("a") && str.contains("Z")) {
            System.out.println("Girdiginz isim a ve ya  Z harfı ıcermıyor");
        } else if (str.contains("a")){
            System.out.println("Girdiginz isim a harfı ıcerıyor");
        }else{
            System.out.println("Girdiginz isim Z harfı ıcerıyor");
        }


    }
}
