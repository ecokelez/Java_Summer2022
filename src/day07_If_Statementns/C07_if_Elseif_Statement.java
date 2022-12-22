package day07_If_Statementns;

import java.util.Scanner;

public class C07_if_Elseif_Statement {
    public static void main(String[] args) {

        /*
        Bır oncekı soruda , kullanıcı negatıf deger gırerse uyaralım,

        NOTE:
        ++ Birden fazla if else if bırbırlerıne baglanmıssa son durum onemlıdır,
        --Eger else ıle bitiyorsa butun duurmlar , ıhtımaler kapsanıyor demektır,
        ++ama else if ile bitiyorsa kapsanmayan durumlar olabilir

       */

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen yasınızı giriniz");
        int yas=scan.nextInt();

        if (yas<0) {
            System.out.println("Lutfen gecerli bir yas giriniz");
        } else if (yas<65) {
            System.out.println("emekli olamazsın , " + (65 - yas) + " yıl daha calısmalısın");
        } else {
            System.out.println("Emeklı olabilırsın");
        }

        }
    }




