package day47_maps;

import day46_maps.ReusableMethods;

import java.util.Map;
import java.util.Set;

public class C04_Entry {
    public static void main(String[] args) {
         /*
          Java Entry<K,V> map'in ivcerisinde bulunan her bir kaydi
          K=V seklinde tutar
          dolayisiyla herhangi bir Entry'e ulastigimizda
          hem key'e hem de value'ya ulasabilir ve istedigimiz islemleri yapabiliriz

          entry.getKey() bize key'i getirir
          entry.getValue() bize value'yu getirir
          entry.setValue() value'yu istedigimiz deger olarak update eder
         */

        Map<Integer,String> sınıfListMap= ReusableMethods.mapOlustur();
        System.out.println(sınıfListMap);


        // map'in her bir elemanini alt alta yazdirin
        //Classıma almak icin bir set olusturalım
        Set<Map.Entry<Integer,String>> sınıfEntrySet=sınıfListMap.entrySet();

        for (Map.Entry each: sınıfEntrySet) {

            System.out.println(each);

        }

        // Map'in tum elemanlarinda varsa Tester kurs ismini QA olarak degistirelim
        String eachValue;
        for (Map.Entry<Integer,String> each:sınıfEntrySet) {

            eachValue=each.getValue();
            eachValue=eachValue.replace("Tester","QA");
            each.setValue(eachValue);

        }

        System.out.println(sınıfListMap);
        //{101=Ali,Can,JDev, 102=Enes,Cem,QA, 103=Taha,Emre,JDev, 104=Derya,Deniz,Devops,
        // 105=Ersoy,Zeynep,QA, 106=Emrah,Yahya,JDev, 107=Erhan,Sinan,QA}
    }
}
