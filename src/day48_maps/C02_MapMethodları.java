package day48_maps;

import day46_maps.ReusableMethods;

import java.util.Map;

public class C02_MapMethodları {
    public static void main(String[] args) {
        Map<Integer,String> sınıfListMap= ReusableMethods.mapOlustur();
        ReusableMethods.entryYazdır(sınıfListMap);


        sınıfListMap.clear();
        System.out.println("clear'dan sonra map :" + sınıfListMap);

        sınıfListMap=ReusableMethods.mapOlustur();
        System.out.println(sınıfListMap.getOrDefault(104, "Aradıgınız key yok"));
        // Derya ,Deniz,Devops
        System.out.println(sınıfListMap.getOrDefault(110, "Aradıgınız key yok"));


        System.out.println(sınıfListMap.isEmpty()); // false
        sınıfListMap.putIfAbsent(104,"Derya,Okyanus,Developer");
        sınıfListMap.putIfAbsent(108,"Aysun,Can,Devops");
        ReusableMethods.entryYazdır(sınıfListMap);


        /*
        SinifListesiMap'e key olarak 106 yoksa , value "Mevlut, Han, Tester" ekleyin
        106 daha onceden varsa, "eski degeri degistirmek istediginizden emin misiniz ?"
        yazdirin
            106'nin oldugunu kontrol etmek icin containsKey daha mantikli ama biz
          yeni ogrendigimiz method ile yapalim

          map.putIfabsent (key, value) ==> key varsa
          ekleme yapmaz, bize o key ile kayitli olan value'yu dondurur
          ==> key daha onceden map'e eklenmemisse
          eklemeyi yapar ve bize null dondurur
        */

        System.out.println(sınıfListMap.putIfAbsent(106,"Mevlut,Han,Tester"));
        // Taha ,Deniz ,JDev

        if (sınıfListMap.putIfAbsent(104,"Derya,Okyanus,Developer")==null){
            System.out.println("Kayıt basarılı");
        }else {
            System.out.println("eski degeri degistirmek istedignizden emin misiniz");
        }
        System.out.println(sınıfListMap.putIfAbsent(109,"Mevlut,Han,Tester"));
        // Taha ,Deniz ,JDev

        ReusableMethods.entryYazdır(sınıfListMap);

        sınıfListMap.remove(106); // 106 silip sildigini dondurur
        sınıfListMap.remove(107,"Erhan,Sinan,Tester"); // silerse true,silmezse false dondurur

        ReusableMethods.entryYazdır(sınıfListMap);

        sınıfListMap.replace(103,"Erdal,Ciftci,Tester");
        sınıfListMap.put(109,"Cavidan,Eken,JDev");

        ReusableMethods.entryYazdır(sınıfListMap);
        System.out.println(sınıfListMap.size()); // 7
    }
}
