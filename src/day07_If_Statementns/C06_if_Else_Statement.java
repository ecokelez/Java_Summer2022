package day07_If_Statementns;

import java.util.Scanner;

public class C06_if_Else_Statement {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen yasınızı gırınız");
        int yas= scan.nextInt();

        if (yas<65){
            System.out.println("emeklı olamazsın, " + (65- yas ) + " yıl daha calısmalısın");
        } else {
            System.out.println("Emeklı olabılırsın");
        }


    }
}
