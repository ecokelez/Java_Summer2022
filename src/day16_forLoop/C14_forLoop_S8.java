package day16_forLoop;

import java.util.Scanner;

public class C14_forLoop_S8 {
    public static void main(String[] args) {
        //  Interview Question : Kullanicidan bir String isteyin ve Stringi tersine ceviren
        //  bir method yazin.

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bır string gırınız");
        String str= scan.nextLine();

        tersdenYazdır(str);

    }

    private static void tersdenYazdır(String str) {
        String tersInput=str.substring(str.length()-1);

        for (int i = str.length()-2; i >=0 ; i--) {
            tersInput+=str.substring(i,i+1);

        }
        System.out.println( tersInput);


    }
}
