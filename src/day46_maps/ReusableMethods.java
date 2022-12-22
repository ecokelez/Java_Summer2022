package day46_maps;

import java.util.*;

public class ReusableMethods {

    public static Map<Integer,String> mapOlustur(){
        Map<Integer,String> sınıfMap=new HashMap<>();
        sınıfMap.put(101,"Ali,Can,JDev");
        sınıfMap.put(102,"Enes,Cem,Tester");
        sınıfMap.put(103,"Taha,Emre,JDev");
        sınıfMap.put(104,"Derya,Deniz,Devops");
        sınıfMap.put(105,"Ersoy,Zeynep,Tester");
        sınıfMap.put(106,"Emrah,Yahya,JDev");
        sınıfMap.put(107,"Erhan,Sinan,Tester");
        return sınıfMap;

    }

    public static void tumValueSıralıYazdır(Map<Integer, String> ogrenciMap) {
        int sıra=1;

        for (String each: ogrenciMap.values() ) {
            System.out.println(sıra + " - " + each);
            sıra++;
            
        }
    }

    public static List<String> isimSoyisimListesiOlustur(Map<Integer, String> ogrenciMap) {
        List<String> methoddakiList=new ArrayList<>();
        String [] eachArr;

        for (String each:ogrenciMap.values()) {
            eachArr=each.split(",");
            methoddakiList.add(eachArr[0] + " " + eachArr[1]);
            
        }
        return  methoddakiList;
    }


    public static void bransOgrenciSayısıYazdır(Map<Integer, String> sınıfListMap) {
        // brans=bransdakiOgrenciSayısı
        // yeni bir map -sınıfListesinde sayıp yeni bir map ' e koymamaız gerekir,
        // sınıf listesini degisitremeyiz ,yeni bir map olusturmamız gerekir

        Map<String,Integer> bransOgrSayıMap=new TreeMap<>();
        // az eleman old ıcın ve harf sırasına gore istiyorsak TreeMap

        // ilk once brans alalım-> Collectin oluturp value leri atalım icine
        Collection<String> valuesCollection=sınıfListMap.values();// sınıfListMap tum valueleri aldık

        String valueArr[]; // split ile parcalara ayırdıgımz value' leri almak ııcn
        String brans;     // bransı da belirleyelim
        Integer bransdakiOgrSayısı;

        for (String each:valuesCollection) {  // bu alue' leri tek tek almalıyız
                                                // ve onlarında ıcınde bransı almamız gerekir
            valueArr=each.split(",");    //Herbir value parcalara bolup arr e atadık
            brans=valueArr[2];   // bransın esit oldugu 2. variable' ı brans a atadık

            // bransin bransOgrSayiMap'inde key olarak daha onceden eklenip eklenmedigini
            // kontrol etmeliyiz

            if (!bransOgrSayıMap.containsKey(brans)){
                bransOgrSayıMap.put(brans,1);
            }else {
                bransdakiOgrSayısı=bransOgrSayıMap.get(brans); // o anda o bransın sayısı  kac ise onu getirir
                bransOgrSayıMap.put(brans,++bransdakiOgrSayısı);  // bunu bir degere atayalım
            }

            System.out.print(bransOgrSayıMap);
        }

    }

    public static void entryYazdır(Map<Integer, String> sınıfListMap) {
        
        Set<Map.Entry<Integer,String>> sınıfListEntrySeti=sınıfListMap.entrySet();

        for (Map.Entry<Integer,String>entry:sınıfListEntrySeti) {
            System.out.println(entry);
        }

            
        }
    }


