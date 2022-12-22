package day47_maps;

import day46_maps.ReusableMethods;

import java.util.Map;

public class C01_DununTekrarı {
    public static void main(String[] args) {
        // C01 deki  map i bu classdan kullanabilmek icin bir ReusableMethods.mapOlustur() yaptık
        Map<Integer,String> sınıfListMap= ReusableMethods.mapOlustur();//
        System.out.println(sınıfListMap);


        // ogrenci listesini isim-soyisim olarak yazdırın
        ReusableMethods.tumValueSıralıYazdır(sınıfListMap);

        // kac farkli brans varsa bransIsmi = branstakiOgrencisayisi seklinde yazdirin,
        //once ReusableMethods ile bir method olsuturalım

        ReusableMethods.bransOgrenciSayısıYazdır(sınıfListMap);



    }
}
