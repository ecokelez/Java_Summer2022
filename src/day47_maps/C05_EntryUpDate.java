package day47_maps;

import day46_maps.ReusableMethods;

import java.util.Map;
import java.util.Set;

public class C05_EntryUpDate {
    public static void main(String[] args) {
        //soyismi Can olanların bransını DataScience yapalım

        Map<Integer,String> sınıfListMap= ReusableMethods.mapOlustur();

        // entryleri alalim
        Set<Map.Entry<Integer,String>> entrySeti=sınıfListMap.entrySet();// tum enrty'lere sahibim

        String entryValue;
        String[] entryArr;
        for (Map.Entry<Integer,String> entry:entrySeti) {

            entryValue=entry.getValue();
            entryArr=entryValue.split(",");

            if (entryArr[1].equals("Can")){
                entryArr[2]="DataScience";
                entry.setValue(entryArr[0]+ "," + entryArr[1] + "," + entryArr[2]); // map' e eklemek ıcın setValue ekledik
            }
        }

        System.out.println(sınıfListMap);
    }
}
