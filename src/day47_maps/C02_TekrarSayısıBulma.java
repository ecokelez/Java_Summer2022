package day47_maps;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class C02_TekrarSayısıBulma {
    public static void main(String[] args) {
        String str= "Heeeeellllooooo Woooorrrrllllllddddd";

        //space'leri saymaması icin once onları yok edelim
        str=str.replaceAll("\\W","");

        String [] harflerArr=str.split("");
        System.out.println(Arrays.toString(harflerArr));
        //[H, e, e, e, e, e, l, l, l, l, o, o, o, o, o, W, o, o, o, o, r, r, r, r, l, l, l, l, l, l, d, d, d, d, d]
        // H=1 e=5 l=4

        // harfleri key, kullanım adedini value yaparak bir map olusturalım
        Map<String,Integer> harfKullanımsayılarıMap=new TreeMap<>(); // Collectin' a ihtiyac duymadık
                                                                // cunku ilk defa bir map olusturuyoruz
        Integer harfKullanımsayısı;

        for (String each:harflerArr) {
            if (!harfKullanımsayılarıMap.containsKey(each)){
                harfKullanımsayılarıMap.put(each,1);

            }else {
                harfKullanımsayısı=harfKullanımsayılarıMap.get(each); // var olanı update edelim ve bize getirsin

                harfKullanımsayılarıMap.put(each,++harfKullanımsayısı);
            }
        }
        System.out.println(harfKullanımsayılarıMap);
        //{H=1, W=1, d=5, e=5, l=10, o=9, r=4}


    }
}
