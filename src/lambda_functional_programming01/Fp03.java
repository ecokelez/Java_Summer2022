package lambda_functional_programming01;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Fp03 {
    public static void main(String[] args) {
        List<String> liste = new ArrayList<>();
        liste.add("Ali");
        liste.add("Ali");
        liste.add("Mark");
        liste.add("Amanda");
        liste.add("Christopher");
        liste.add("Jackson");
        liste.add("Mariano");
        liste.add("Alberto");
        liste.add("Tucker");
        liste.add("Benjamin");
        System.out.println(liste);
        buyukHarfleYazdır(liste);
        System.out.println();
       // buyukHarfleYazdır01(liste);
        uzunlugaGoreYazdır(liste);
        System.out.println();
        uzunlugaGoreTersdenYazdır(liste);
        System.out.println();
        tekrarsızSonKaraktereGoreYazdır(liste);
        System.out.println();
        uzunlukVeIlkHarfeGoreSıralaYazdır(liste);
        System.out.println();
       // bestenBuyukleriSil(liste);
        System.out.println();
      //  baslangıcıAYadaNOlanıSil(liste);
       // baslangıcıAYadaNOlanıSil01(liste);
        uzunlugu8ile10arasıVe0ileBiteniSil(liste);
        System.out.println("uzunluguOnikidenAzMı(liste) : " + uzunluguOnikidenAzMı(liste));
        System.out.println("xIleBaslamıyorMu(liste) : " + xIleBaslamıyorMu(liste));
        System.out.println("rIleBitenVarMı(liste) : " + rIleBitenVarMı(liste));

    }

    //1) Tüm elemanları büyük harf ile yazdıran bir method oluşturun.
    //1. yol:
    public static void buyukHarfleYazdır(List<String>list){
        list.stream().map(String::toUpperCase).forEach(Utils::aynıSatırdaBosluklaYazdır);
    }

    //2. yol:
   /* public static void buyukHarfleYazdır01(List<String>list){
        list.replaceAll(String::toUpperCase);
        System.out.println(list);
    }

    */

    //2) Elemanları uzunluklarına göre sıralayıp yazdıran bir method oluşturun
    public static void uzunlugaGoreYazdır(List<String>list){
        list.stream().sorted(Comparator.comparing(String::length)).forEach(Utils::aynıSatırdaBosluklaYazdır);
    }
    //3) Elemanları uzunluklarına göre ters sıralayıp yazdıran bir method oluşturun.
    public static void uzunlugaGoreTersdenYazdır(List<String>list){
        list.stream().sorted(Comparator.comparing(String::length).reversed()).forEach(Utils::aynıSatırdaBosluklaYazdır);
    }

    //4) Elemanları son karakterlerine göre sıralayıp tekrarsız yazdıran bir method oluşturun.
    public static void tekrarsızSonKaraktereGoreYazdır(List<String>list){
        list.stream().distinct().sorted(Comparator.comparing(Utils::sonKarakteriAl)).forEach(Utils::aynıSatırdaBosluklaYazdır);
    }

    //5) Elemanları önce uzunluklarına göre ve sonra ilk karakterine göre sıralayıp yazdıran bir method oluşturun.
    public static void uzunlukVeIlkHarfeGoreSıralaYazdır(List<String>list){
        list.stream().sorted(Comparator.comparing(String::length).thenComparing(Utils::ilkKarakteriAl)).
                forEach(Utils::aynıSatırdaBosluklaYazdır);
        //thenComparing() :==>siralam icin bir kosul daha belirtir
    }
    //6) Uzunluğu 5'ten büyük olan elemanları silen bir method oluşturun.
  /*  public static void bestenBuyukleriSil(List<String>list){
        list.removeIf(t->t.length()>5);
        System.out.println(list);

         ==> list, mutable olduğu için elemanları işlem sonrası kalıcı değiştiğinden comment-out yapıyorum.
    }

    //7) ‘A’, ‘a’ ile başlayan yada ‘N’, ‘n’ ile biten elemanları silen bir method oluşturun.
    //1. yol:
    public static void baslangıcıAYadaNOlanıSil(List<String>list){
        list.removeIf(t->t.charAt(0)=='A' || t.charAt(0)=='a' || t.charAt(t.length()-1)=='N' || t.charAt(t.length()-1)=='n');
        System.out.println(list);
    }
    // 2. yol:
    public static void baslangıcıAYadaNOlanıSil01(List<String>list){
        list.removeIf(t->t.startsWith("A") || t.startsWith("a") || t.endsWith("N") || t.endsWith("n"));
        System.out.println(list);


    }

   */

    //8) Uzunluğu 8 ile 10 arası olan yada 'o' ile biten elemanları silen bir method oluşturun.
    public static void uzunlugu8ile10arasıVe0ileBiteniSil(List<String>list){
        list.removeIf(t->(t.length()>7 && t.length()<11) || t.endsWith("o"));
        System.out.println(list);
    }
    //9) Tüm elemanların uzunluklarının 12'den az olup olmadığını kontrol eden bir method oluşturun.

    public static boolean uzunluguOnikidenAzMı(List<String>list){
        return list.stream().allMatch(t->t.length()<12);

    }

    //10) Hiçbir elemanın 'X' ile başlamadığını kontrol eden bir method oluşturun.
    public static boolean xIleBaslamıyorMu(List<String>list){
        return list.stream().noneMatch(t->t.startsWith("X") || t.startsWith("x"));

    }
    //11) Herhangi bir elemanın 'r' ile bitip bitmediğini kontrol eden bir method oluşturun.
    public static boolean rIleBitenVarMı(List<String>list){
        return list.stream().anyMatch(t->t.endsWith("r"));
    }
}
