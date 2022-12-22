package day36_inheritanceDataTypeKullanımı;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class DIsci extends BMuhasebe {
    int saatUcreti=11;
    int gunlukMesai=7;

    protected void maasIsci(){
        System.out.println("Isciler :" + (30*saatUcreti*gunlukMesai) + " maas alır");
    }

    protected void ozelSigortaIsci(){
        System.out.println("Isciler %70 indirimli ozel sigorta yaptırabilir");
    }

    public static void main(String[] args) {

        /*
          Bir obje olusturulurken
          Data turu ve constructor ayni class'dan ise
          direk o class'a gidiyorduk
          Eger data turu ve cons. farkli ise
          Obje constructor'in oldugu class'in objesidir
          ancak, bizden istenen
          Isci class'indaki spesifik ozellikler degil
          Bir iscinin muhasebe classindaki
          tum calisanlarla beraber sahip oldugu
          genel ozellikleri yazdirir
         */
        BMuhasebe isc1=new DIsci();
        System.out.println(isc1.gunlukMesai);//  M-8
        System.out.println(isc1.saatUcreti);  //  M-10
        isc1.maas();            // M
        isc1.ozelSigorta();  // M
        isc1.sigorta();     // P
        System.out.println(isc1.isim);  // P
        System.out.println(isc1.soyisim);  // P
        System.out.println(isc1.departman);  // P



        APersonel isc2=new DIsci();
        //System.out.println(isc2.gunlukMesai);
        //System.out.println(isc2.saatUcreti);
        // isc2.ozelSigorta();
        isc2.sigorta();                            // P
        System.out.println(isc2.isim);              // P
        System.out.println(isc2.soyisim);           // P
        System.out.println(isc2.departman);         // P

         /*
         Eger Data turu olan class'da aradigimiz ozellik yoksa
         varsa onun parent'ina gidebilir
         ama child'a donus olmaz
         Aradigi ozelligi bulamazsa CTE verir
         */

        List<String> list1 = new LinkedList<>();
        Deque<String> list2= new LinkedList<>();
        Queue<String> list3= new LinkedList<>();
        /*
        Hepsi LinkedList olsa da
        list1 List gibi davranir
        list2 Deque gibi davranir
        List3 Queue gibi davranir
         */


    }

}
