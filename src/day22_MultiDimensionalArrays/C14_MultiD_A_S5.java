package day22_MultiDimensionalArrays;

import java.util.Scanner;

public class C14_MultiD_A_S5 {

    public static void main(String[] args) {

        // Soru 5- Kullanıcıdan bir cumle ısteyın ve cumledek kelıme sayısını  yazdırın

     /*
      String str="Java ile hayat cok guzel";
      String[] arr=str.split(" ");
        System.out.println("Kelıme sayısı:"+ arr.length);

      */

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir cumle gırınız");
        String cumle= scan.nextLine();

        String[] arr=cumle.split(" ");
        System.out.println("Kelime sayısı:"+arr.length);


    }

}
