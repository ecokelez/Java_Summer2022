package day30_immutable_date;

import java.time.LocalTime;

public class C05_StringVsStringBuilder {
    public static void main(String[] args) {
        /*
         String mi yoksa StringBuilder mi daha hizlidir ?
         bunun icin bir String olusturup, 1000 kere sonuna . ekleyelim
        oncesinde ve sonrasinda zamani alip aradaki farki bulalim

         ayni islemi string builder icin de yapalim
        */


        LocalTime baslangıc=LocalTime.now();

        String str="Ahhhh Java";
        for (int i = 0; i <1000 ; i++) {
            str += ".";

        }
        LocalTime bıtıs=LocalTime.now();

        System.out.println(baslangıc);
        System.out.println(bıtıs);

       // int StringZaman= bıtıs.getNano()- baslangıc.getNano();
        // System.out.println(StringZaman);
         System.out.println("String zaman : "+ (bıtıs.getNano()- baslangıc.getNano()));



        baslangıc=LocalTime.now();

        StringBuilder sb=new StringBuilder("Ahhh Java");
        for (int i = 0; i <1000; i++) {
            sb.append(".");

        }

        bıtıs=LocalTime.now();
        System.out.println(baslangıc);
        System.out.println(bıtıs);

        System.out.println("StringBuilder zaman : " + (bıtıs.getNano() - baslangıc.getNano()) );
    }
}
