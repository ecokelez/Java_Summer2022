package day38_exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class C04_Exceptions_While {
    public static void main(String[] args) {


             /*
          ** Marketteki tum urunleri bir array'de tuttugumuzu varsayalim
          Kullaniciya index sorup, o index'deki urunu yazdiran bir program hazirlayalim
          Kullanici urun sayisindan buyuk bir index girerse
          exception vermesinin onune gecelim
         */


        String[] urunler={"Nutella","Cokokrem","Sut","Cay","Fındık"};
        Scanner scan;


        int istenenSıra=0;
        boolean kontrol=true;

        while (kontrol){
            try {// try blogu: yapmak istedıgımız islem

                scan=new Scanner(System.in);
                System.out.println("Istedıgınız urunun sıra nosunu gırınız");
                int isteneSıra=scan.nextInt();
                kontrol=false;

            } catch (InputMismatchException deneme) {  //  e/deneme--> variable ismidir
                System.out.println("Urunun indexi icin bir tamsayı girmeniz gerekli");

            }

        }




        /*
         *catch blogunun onundeki parantezde;
         exception class'inin ismi ve yaninda
         yakalanan exception'i atadigimiz variable'in ismi olur (e)
         * catch bloguna; problem yakalandıgında kullanıcıya ne yaptırmak ıstıyorsak onu yazarız

         **Eger yakalanan exception ile ilgili bilgileri
         kullaniciya vermek isterseniz bu objeyi kullanabilirsiniz
         *** eger exception ile ilgili kullaniciya bilgi verme ihtiyaci yoksa
         e kullanilmasa da kod calisir
         */



        try {
            System.out.println("Aradıgınız urun :" + urunler[istenenSıra-1]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Girdiginiz sıra listemizde bulunmuyor" +
                    "\nSıra numarası en fazla :"+urunler.length+ " olabilir");;
        }

    }
}


