package day23_ArrayLists;

import java.util.ArrayList;
import java.util.List;

public class C02_set {
    public static void main(String[] args) {
          /*
            elimizde urunlerin bulundugu bir liste var
            urun listesindeki istenen siradaki urunu
            istedigimiz yeni urunle degistirip
            eski urunu, var olan eski urunler listesine ekleyelim.
        */

        List<String>urunler=new ArrayList<>();
        urunler.add("Nutella");
        urunler.add("Ikram");
        urunler.add("Cekırdek");
        urunler.add("Cay");

        List<String>eskiUrunler=new ArrayList<>();


        String yenıUrun="Biskrem";
        String sılınecekUrun="Ikram";

        int temp=urunler.indexOf(sılınecekUrun);
        String sılınenUrun=urunler.set(temp,yenıUrun);

        eskiUrunler.add(sılınenUrun);

        System.out.println("urunler listesi : " + urunler);   //  [Nutella, Biskrem, Cekırdek, Cay]
        System.out.println("eski urunler listesi : " + eskiUrunler);   // [Ikram]


    yenıUrun="Kahve";
    sılınecekUrun="Cay";

    temp=urunler.indexOf(sılınecekUrun);
    sılınenUrun=urunler.set(temp,yenıUrun);

    eskiUrunler.add(sılınenUrun);

        System.out.println("Urunler listesi:"+urunler);  //  [Nutella, Biskrem, Cekırdek, Kahve]
        System.out.println("Eski urunler listesi:"+eskiUrunler);   //  [Ikram, Cay]






    }
}
