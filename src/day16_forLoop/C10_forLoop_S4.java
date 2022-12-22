package day16_forLoop;

import java.util.Scanner;

public class C10_forLoop_S4 {
    public static void main(String[] args) {
       // Kullanicidan 100’den kucuk bir tamsayi isteyin. 1’den baslayarak girilen sayiya kadar 3’un
        // kati olan sayilari yazdirin.

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen 100' den kucuk bır tamsayı gırınız");
        int sayı= scan.nextInt();


        for (int i = 1; i <100 ; i++) {
            if (i%3==0){
                System.out.println( i);
            }

        }




    }

}
