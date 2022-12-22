package day47_maps;

import day46_maps.ReusableMethods;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class C03_Update {
    public static void main(String[] args) {

         /*
          map.contains(key) ==> verdigimiz key'in map'de olup olmadigini boolean olarak doner
          map.contains(value) ==> bir butun olarak value'nun map'de olup olmadigini doner
          ONEMLI NOT : map.contains(value) value'nun icindeki bir parcayi bulmada ise yaramaz
                      eger value icindeki bir parcayi aratmak istiyorsak
                      map uzerinde manipulation yapmamiz lazim
           map.get(key) ==> verilen key'e ait degeri dondurur
         */

        Map<Integer,String> sınıfListMap= ReusableMethods.mapOlustur();
        System.out.println(sınıfListMap);

        System.out.println(sınıfListMap.containsKey(104));  // true
        System.out.println(sınıfListMap.containsKey(114)); // false

        System.out.println(sınıfListMap.containsValue("Ali,Can,JDev")); // true
        System.out.println(sınıfListMap.containsValue("JDev"));  // false



        // Verilen map'de JDev degerlerini JavaDeveloper olarak degistirelim
        // Map'lerde replace tum value'yu degistirmek istersek kullanilabilir
        // kismi degisikliklerde kullanamayiz



      /* Collection<String> valueColection=sınıfListMap.values();
        for (String each:valueColection) {
            each=each.replace("JDev","JavaDeveloper");
            System.out.println(each);
                                             /*Ali,Can,JavaDeveloper
                                                 Enes,Cem,Tester
                                                 Taha,Emre,JavaDeveloper
                                                  Derya,Deniz,Devops
                                                  Ersoy,Zeynep,Tester
                                                  Emrah,Yahya,JavaDeveloper */


        // System.out.println(sınıfListMap);
    //101=Ali,Can,JDev, 102=Enes,Cem,Tester, 103=Taha,Emre,JDev,
    // 104=Derya,Deniz,Devops, 105=Ersoy,Zeynep,Tester, 106=Emrah,Yahya,JDev, 107=Erhan,Sinan,Tester}*/

        ReusableMethods.tumValueSıralıYazdır(sınıfListMap);
        // Map'i guncelleme yapmak icin key, yenideger'i map'e eklemeliyiz
        // ornegin key 101 icin value Ali, Can, JDev
        // guncelleme icin sinifListMap.put(101,Ali, Can, JavaDeveloper)
        // bunu yapabilmek icin herbir key'e ve ona ait value'ye ihtiyacim var

        Set<Integer> keySeti=sınıfListMap.keySet(); // daha once collection olust. value' lara eristigimiz gibi
                                                    // simdi de set olusturup key' lere ulasabiliriz
        String eachValue;
        for (Integer each:keySeti) {
            eachValue=sınıfListMap.get(each);
            eachValue=eachValue.replace("JDev","JavaDeveloper");
            sınıfListMap.put(each,eachValue);
        }
          /*
             biz key'lerin tamamini aldik
             herbir key'in value'sunu get'irdik
             value uzerinde degisikligi yapip
             yeni halini put(key, yeniDeger) ile map'e koyduk
             */
       System.out.println(sınıfListMap);





    }
}
