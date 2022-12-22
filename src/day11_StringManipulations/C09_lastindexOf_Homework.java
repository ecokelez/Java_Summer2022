package day11_StringManipulations;

import java.util.Scanner;

public class C09_lastindexOf_Homework {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bır cumle gırınız");
        String str=scan.nextLine();
        System.out.println("Lutfen bır kelıme gırınız");
        String str1= scan.nextLine();

       int str1ilkIndex=str.indexOf(str1);
       int str1SonIndex=str.lastIndexOf(str1);

       if (str1ilkIndex==-1){
           System.out.println("verilen kelime  cumlede kullanılmamıs");
       }else if (str1ilkIndex==str1SonIndex){
           System.out.println("verilen kelime  cumlede sadece bır defa kullanılmıs");
       }else{
           System.out.println("verilen kelime   cumlede bırden fazla  kullanılmıs");
       }

    }
}
