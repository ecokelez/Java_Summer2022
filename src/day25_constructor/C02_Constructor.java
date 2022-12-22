package day25_constructor;

import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class C02_Constructor {
    public static void main(String[] args) {

             C01          obj1          =  new              C01()            ;
        // class adı    objenın adı       keyword           constructor (yapıcı)


        // Const. Java da obje olusturmak ıcın kullanılan kod blogudur
        // Bır objeyı olusturmak ıcın Class' a ıhtıyac duyulur,
        // Claasın objeyı oluturabılmesı ııcn Constructor ' a  ıhtıyacı vardır
        // OOP Conseptı ıcın Classlardan obje uretmek gerekır,
        // java obje uretme yekısını Constructor vasıtasıya kullanır

        Scanner scan=new Scanner(System.in);
        Random rnd=new Random();
        // List<String> list2=new  List<>();

        // Parametrelerın olup olmaması bır eksıklık ya da fazlalaık degıldır ama;
        //  Eger spesifik bır eleman, obje  ıstıyorsak parametrelerı yazmalıyız,

          /*
        Javada bir obje olusturabilmek icin
        mutlaka constructor kullanmalisiniz
         */

        System.out.println(obj1.sayı);   //  0

        obj1.deneme();   // C01 den deneme method calıstır



    }
}
