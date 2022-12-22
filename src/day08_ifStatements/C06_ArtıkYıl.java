package day08_If_Statements;

import java.util.Scanner;

public class C06_ArtıkYıl {

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bır yıl gırınız");
        int yıl= scan.nextInt();
        
        if (yıl%4==0){
            System.out.println("Artık yıl degıl");
        } else if (yıl%100 !=0 ) {
            
        }

    }
}
