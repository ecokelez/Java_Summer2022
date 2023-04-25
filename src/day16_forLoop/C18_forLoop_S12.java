package day16_forLoop;

import java.util.Scanner;

public class C18_forLoop_S12 {
    public static void main(String[] args) {
        /*
        Kullanicidan pozitif bir rakam girmesini isteyin ve girilen rakama gore
    asagidaki sekli cizdirin
    *
    * *
    * * *
    * * * *

         */

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bır rakam gırınız");
        int rakam= scan.nextInt();
        for (int i = 1; i <=rakam ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print("* ");
            }

            System.out.println("");
        }


            }

        }






