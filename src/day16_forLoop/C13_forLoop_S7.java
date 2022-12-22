package day16_forLoop;

import java.util.Scanner;

public class C13_forLoop_S7 {
    public static void main(String[] args) {
        // Interview Question : Kullanicidan bir String isteyin ve Stringi tersten yazdirin.

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bır string gırınız");
        String str= scan.nextLine();

        String tersStr=str.substring(str.length()-1);

        for (int i = str.length()-2; i >=0 ; i--) {
            tersStr=str.substring(i,i+1);
        }

        System.out.println(tersStr);




    }
}
