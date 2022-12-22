package day46_maps;

import java.util.*;

public class C01_Maps {
    public static void main(String[] args) {
        Map<Integer,String> sınıfList=new HashMap<>();

        sınıfList.put(101,"Ali,Can,JDev");
        sınıfList.put(102,"Enes,Cem,Tester");
        sınıfList.put(103,"Taha,Emre,JDev");
        sınıfList.put(104,"Derya,Deniz,Tester");


        System.out.println(sınıfList);
        // {101=Ali,Can,JDev, 102=Enes,Cem,Tester, 103=Taha,Emre,JDev, 104=Derya,Deniz,Tester}


        System.out.println(sınıfList.keySet()); //[101, 102, 103, 104]
                                                // --> keyset() methodu Set olarak key degerlerini verir
        System.out.println(sınıfList.values()); // value() methodu Collection olarak "value" ları verir,
        // Coolections dan stedigimiz bir variable ' adegerleri ekleyebilir ve kullanabiliriiz
        // [Ali,Can,JDev, Enes,Cem,Tester, Taha,Emre,JDev, Derya,Deniz,Tester]

        System.out.println(sınıfList.values().size()); // 4

        // tum ogrencilerin isim ve soyisimlerini sira no ile alt alta yazdirin
        Collection<String> tumValueColl =sınıfList.values();

        String[] eachArr;
        int sıra=1;

        for (String each:tumValueColl) {
            // buradaki each bize her bir ogrenciye ait
            // ayni yapidaki isim, soyisim, brans bilgilerini iceren String'ler getiriyor

            eachArr=each.split(",");
            System.out.println(Arrays.toString(eachArr));
            System.out.println(sıra + "- " + eachArr[0] + " " + eachArr[1]);
            sıra++;
        }

        // Map'de bulunan ogrencilerin, isim ve soyisimlerini birlestirerek
        // bir sinif listesi olusturun
        List<String> sınıfIsimSoyisimList=new ArrayList<>();

        for (String each:tumValueColl) {

            eachArr=each.split(",");
            sınıfIsimSoyisimList.add(eachArr[0] + " " + eachArr[1]);

        }

        System.out.println(sınıfIsimSoyisimList);


    }
}
