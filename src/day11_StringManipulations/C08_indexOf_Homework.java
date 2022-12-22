package day11_StringManipulations;

import java.util.Scanner;

public class C08_indexOf_Homework {

    public static void main(String[] args) {

        /*
        Kullanıcıdan bır cumle ve kelıme ısteyın;
        verilen kelime icin asagıdakı sartlardan uygun olanı yazan bir kod yazınız
        -verilen kelime  cumlede kullanılmamıs
        -verilen kelime cumlede sadece 1 kere kullanılmıs
        -verilen kelime   cumlede 1 den fala  kullanılmıs
         */


        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bır cumle gırınız");
       String str1= scan.nextLine();
        System.out.println("Lutfen bır kelıme gırınız");
        String str2= scan.nextLine();

        int ılkkullanım= str1.indexOf(str2);
        int ıkıncıkullanım=str1.indexOf("str2",ılkkullanım+1);
        
        if (ılkkullanım==-1){
            System.out.println("verilen kelime  cumlede kullanılmamıs");
        } else if (ıkıncıkullanım==-1) {
             ıkıncıkullanım=str1.indexOf("str2",ılkkullanım+1);
            System.out.println("verilen kelime  cumlede sadece bır defa kullanılmıs");
        }else{
            System.out.println("verilen kelime   cumlede 1 den fazla  kullanılmıs");
        }


    }
}
