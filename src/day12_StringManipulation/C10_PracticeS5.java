package day12_StringManipulation;

import java.util.Scanner;

public class C10_PracticeS5 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen 4 harfli bır kelıme gırınız");
        String kelime= scan.nextLine();

        String tersKelime=kelime.substring(3)+
                          kelime.substring(2,3)+
                          kelime.substring(1,2)+
                           kelime.substring(0,1);


        System.out.println(tersKelime);


    }
}
