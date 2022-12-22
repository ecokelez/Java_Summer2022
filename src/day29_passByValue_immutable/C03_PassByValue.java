package day29_passByValue_immutable;


import java.util.ArrayList;
import java.util.List;

public class C03_PassByValue {

    public static void main(String[] args) {


        /*
             bir list olusturalim
            iki ayri method'dan birinde
            sadece elemanlari degistirelim

            digerinde yeni bir list atayip,
            ayni sayida yeni leman ekleyelim

            ve her iki method call'dan sonra kendi listemizi
             main method icerisinde kontrol edelim
        */

        List<String> list = new ArrayList<>();
        list.add("Ali");
        list.add("Veli");
        list.add("Can");

        System.out.println("İlk basta list :"+list);   // [Ali, Veli, Can]

        elemanlarDegistır(list);
        System.out.println("eleman degıstır methodundan sonra list :"+ list); // [Oguz, Murat, Fatih]


        listDegıstır(list);
        System.out.println("list degıstır methodundan sonra list : " + list); //[Oguz, Murat, Fatih]
    }

    private static void listDegıstır(List<String> list) {
        list=new ArrayList<>();
        list.add("Nutella");
        list.add("Cay");
        list.add("Cokokrem");

        System.out.println("list degıstır methodunda list : " + list);  // [Nutella, Cay, Cokokrem]


    }

    private static void elemanlarDegistır(List<String> list) {

        list.set(0,"Oguz");
        list.set(1,"Murat");
        list.set(2,"Fatih");

        System.out.println("eleman degıstır methodunda list :"+ list);  //[Oguz, Murat, Fatih]

    }
}
