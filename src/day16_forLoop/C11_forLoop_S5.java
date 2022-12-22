package day16_forLoop;

import java.util.Scanner;

public class C11_forLoop_S5 {
    public static void main(String[] args) {

        // Kullanicidan 100’den kucuk bir tamsayi isteyin. 1’den baslayarak girilen sayiya kadar 3’un
        // veya 5”in kati olan sayilari yazdirin.


        Scanner scan=new Scanner(System.in);
        System.out.println("100’den kucuk bir tamsayi gırınız");
        int sayı= scan.nextInt();

        for (int i = 1; i <sayı ; i++) {
            if (i%3==0 || i%5==0){
                System.out.println(i);
            }
        }


    }
}
