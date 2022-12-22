package day24_ArrayLists_forEachLoop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C05_IstenmeyenleriSil {
    public static void main(String[] args) {
        
        String[] sehirler={"Istanbul","Ankara","Mersin","Konya","Kastamonu"};
        String istenmeyenHarf="r";
        List<String> kalanlar=new ArrayList<>();

        for (int i = 0; i < sehirler.length ; i++) {
            if (!sehirler[i].contains(istenmeyenHarf)){
                kalanlar.add(sehirler[i]);
            }
        }

        // loop biitiğinde istenmeyen harf icermeyen sehırler listeye eklenms olacak
        System.out.println(kalanlar); // [Mersin]

        // yeni bir Array olsuturup listeyı ona aktaralım
        String[] kalanlarArrayi=new String[kalanlar.size()];

        for (int i = 0; i <kalanlarArrayi.length ; i++) {
            kalanlarArrayi[i]= kalanlar.get(i);
        }

        // sehirler Array'iin yeni degerini atayalım;
         sehirler=kalanlarArrayi;
        System.out.println("sehirler Array'inin son hali:"+ Arrays.toString(sehirler));

    }
}
