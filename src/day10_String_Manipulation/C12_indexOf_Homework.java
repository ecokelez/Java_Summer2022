package day10_String_Manipulation;

import java.util.Scanner;

public class C12_indexOf_Homework {
    public static void main(String[] args) {

        /*
        Kullancıdan bır cumle ve bır harf ısteyın ve harfın cumlede var olıp olamadıgını yazdrın
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bır cumle yazınız");
        String str=scan.nextLine();

        System.out.println("Lutfen bır harf gırınız");
        char harf=scan.next().toLowerCase().charAt(0);


        if (str.indexOf("harf")==-1) {
            System.out.println("Gırdıgınız harf cumlede kullanilmamistır");
        }else{
            System.out.println("Gırdıgınız harf bu cumlede kullanilmıstır");
        }

    }
}
