package day12_StringManipulation;

import java.util.Scanner;

public class C09_PracticeS4 {

    public static void main(String[] args) {


        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bır ısım gırınız");
        String str=scan.nextLine();
        System.out.println("Lutfen bır soyısım gırınız");
        String str1=scan.nextLine();

        if (str.length()>str1.length()){
            System.out.println(str);
        } else if (str.length()<str1.length()) {
            System.out.println(str1);
        }else{
            System.out.println(str + " " + str1);
        }

    }
}
