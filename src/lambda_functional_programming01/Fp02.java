package lambda_functional_programming01;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Fp02 {
    /*
    1) t-> "Logic" , (t,u)-> "Logic"
    Bu yapıya "Lambda Expession"
    2) Functional Programming kapsamında "Lambda Expession" kullanılabilir ama onerilmez.
    "Lambda Expession" yerine "Method Referance" tercih edilir.
    3)"Method Referance" kullanımı "Class Name :: Method Name"
      Aynı zamanda kendi class'larınızı da kullanabilirsiniz.
      Örneğin bir Animal class'ınız var ve bu class "eat()" methoduna sahip ==> "Animal :: eat"
     */

    public static void main(String[] args) {
        List<Integer> liste = new ArrayList<>();
        liste.add(8);
        liste.add(9);
        liste.add(131);
        liste.add(10);
        liste.add(9);
        liste.add(10);
        liste.add(2);
        liste.add(8);
        System.out.println(liste);
        listElemanlarınıYazdırFuctional(liste);
        System.out.println();
        ciftElemanlarıYazdır(liste);
        System.out.println();
        tekElemanlarınKareleriniYazdır(liste);
        System.out.println();
        tekrarsızTekElemanlarınKupunuYazdır(liste);
        System.out.println();
        tekrarsızCıftElemanlarınKareToplamı(liste);
        tekrarsızCıftElemanlarınKareToplamı1(liste);
        tekrarsızCıftElemanlarınKareToplamı2(liste);
        tekrarsızCıftElemanlarınKuplerıCarpımı(liste);
        getmaxElement(liste);
        getMinElement(liste);
        yedidenBuyukCiftMın(liste);
        tekrarsızTersSıralamaylaElemanlarınYarısı(liste);
    }


    //1) Ardışık list elemanlarını aynı satırda aralarında boşluk bırakarak yazdıran bir method oluşturun.(Functional ve method reference)
    public static void listElemanlarınıYazdırFuctional(List<Integer>list){

    list.stream().forEach(Utils::aynıSatırdaBosluklaYazdır);
    }

    //2)Ardışık çift list elementlerini aynı satırda aralarında boşluk bırakarak yazdıran bir method oluşturun.(Functional)
    public static void ciftElemanlarıYazdır(List<Integer>list){
        list.stream().filter(t->t%2==0).forEach(Utils::aynıSatırdaBosluklaYazdır);
    }

    //3) Ardışık tek list elemanlarının karelerini aynı satırda aralarında boşluk bırakarak yazdıran bir method oluşturun.(Functional)

    public static void tekElemanlarınKareleriniYazdır(List<Integer>list){

        list.stream().filter(Utils::tekElemanlarıSec).map(Utils::karesiniAl).forEach(Utils::aynıSatırdaBosluklaYazdır);
    }
    //4) Ardışık tek list elemanlarının küplerini tekrarsız olarak aynı satırda aralarında boşluk bırakarak yazdıran bir method oluşturun.

    public static void tekrarsızTekElemanlarınKupunuYazdır(List<Integer>list){
        list.stream().distinct().filter(Utils::tekElemanlarıSec).map(Utils::kupunuAl).forEach(Utils::aynıSatırdaBosluklaYazdır);

    }

    //5) Tekrarsız çift elemanların karelerinin toplamını hesaplayan bir method oluşturun.
    //1. yol:
    public static void tekrarsızCıftElemanlarınKareToplamı(List<Integer>list){

        Integer toplam=list.stream().distinct().filter(Utils::ciftElemanlarıSec).map(Utils::karesiniAl).reduce(0,Math::addExact);
        System.out.println(toplam);

    }
    // 2. yol:
    public static void tekrarsızCıftElemanlarınKareToplamı1(List<Integer>list){
        Integer toplam=list.stream().distinct().filter(Utils::ciftElemanlarıSec).map(Utils::karesiniAl).reduce(Math::addExact).get();
        System.out.println(toplam);
    }
     //3. yol:
     public static void tekrarsızCıftElemanlarınKareToplamı2(List<Integer>list){
        Integer toplam=list.stream().distinct().filter(Utils::ciftElemanlarıSec).map(Utils::karesiniAl).reduce(0,Integer::sum);
         System.out.println(toplam);

     }
    //6) Tekrarsız çift elemanların küpünün çarpımını hesaplayan bir method oluşturun.
    public static void tekrarsızCıftElemanlarınKuplerıCarpımı(List<Integer>list){
        Integer carpım=list.stream().distinct().filter(Utils::ciftElemanlarıSec).map(Utils::kupunuAl).reduce(1,Math::multiplyExact);
        System.out.println(carpım);
    }

    //7) List elemanları arasından en büyük değeri bulan bir method oluşturun.
    public static void getmaxElement(List<Integer>list){
        Integer max=list.stream().distinct().reduce(Math::max).get();
        System.out.println(max);
    }
        //Ödev
    //8)List elemanları arasından en küçük değeri bulan bir method oluşturun.(Method Reference)
    public static void getMinElement(List<Integer>list){
        Integer min=list.stream().distinct().reduce(Math::min).get();
        System.out.println(min);
    }

    //9) List elemanları arasından 7'den büyük, çift, en küçük değeri bulan bir method oluşturun.
    public static void yedidenBuyukCiftMın(List<Integer>list){
        Integer min=list.stream().distinct().filter(t->t>7).filter(Utils::ciftElemanlarıSec).reduce(Math::min).get();
        System.out.println("min = " + min);
    }

    //10) Ters sıralama ile tekrarsız ve 5'ten büyük elemanların yarı değerlerini(elamanın ikiye bölüm sonucunu)
    // bulan bir method oluşturun.

    public static void tekrarsızTersSıralamaylaElemanlarınYarısı(List<Integer>list){
       List<Double> sonuc= list.stream().distinct().filter(t->t>5).map(Utils::yarısınıAl).sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println(sonuc);
    }
}
