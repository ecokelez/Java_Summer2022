package lambda_functional_programming01;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Fp01 {


            /*
    1-) Lambda (Functional Programming) Java 8 ile kullanilmaya baslanmistir.
    2-) Functional Programming'de "Ne yapilacak?(What to do?)" uzerine yogunlasilir.
    Structured Programming'de "Nasil Yapilacak?(How to do?)" uzerine yogunlasilir.
    3-) Functional Programming Arrays ve Collections ile kullanilir.
    4-) "entrySet() methodu ile Map, Set'e donusturulerek Functional Programming'de kullanilabilir.
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

        listElemanlarınıYazdırStructured(liste);
        System.out.println();
        listElemanlarınıYazdırFunctional(liste);
        System.out.println();
        ciftElemanlarıYazdır(liste);
        System.out.println();
        System.out.println("Functional :");
        ciftElemanlarıYazdırFunctional(liste);
        System.out.println();
        tekElemanlarınKareleriniYazdırFunctional(liste);
        System.out.println();
        tekrarsızElemanlarınKupunuYazdır(liste);
        System.out.println();
        tekrarsızCiftElemanlarınKareleriToplamı(liste);
        System.out.println();
        tekrarsızCiftElemanlarınKupleriCarpımı(liste);
        System.out.println();
        getmaxEleman01(liste);
        getmaxEleman02(liste);
        System.out.println();
        getMinEleman(liste);
        getyedidenBuyukMin(liste);
        getyedidenBuyukMin1(liste);
        getyedidenBuyukMin2(liste);
        getTersSıralamaTekrarsızElemanlarınYarısı(liste);



        //1) Ardışık list elementlerini aynı satırda aralarında boşluk bırakarak yazdıran bir method oluşturun.(Structured)

    }

    public static void listElemanlarınıYazdırStructured(List<Integer>list){
        for(Integer w: list){
            System.out.print(w +" ");
        }

    }
    //1) Ardışık list elementlerini aynı satırda aralarında boşluk bırakarak yazdıran bir method oluşturun.(Functional)

    public static void listElemanlarınıYazdırFunctional(List<Integer>list){
        list.stream().forEach(t-> System.out.print(t+" "));
        //stream() methodu collection'dan elementleri akışa dahil etmel için ve methodlara ulaşmak için kullanılır.

    }

    //2)Ardışık çift list elementlerini aynı satırda aralarında boşluk bırakarak yazdıran bir method oluşturun.(Structured)
    public static void ciftElemanlarıYazdır(List<Integer>list){
        for(Integer w:list){
            if(w%2==0){
                System.out.print(w+" ");
            }
        }
    }

    //2)Ardışık çift list elementlerini aynı satırda aralarında boşluk bırakarak yazdıran bir method oluşturun.(Functional)
    public static void ciftElemanlarıYazdırFunctional(List<Integer>list){
        list.stream().filter(t->t%2==0).forEach(t-> System.out.print(t+" "));
    }

    //3) Ardışık tek list elementlerinin karelerini aynı satırda aralarında boşluk bırakarak yazdıran bir method oluşturun.(Functional)
    public static void tekElemanlarınKareleriniYazdırFunctional(List<Integer>list){
       // list.stream().filter(t->t%2==0).forEach(t-> System.out.print(t*t+" "));
        list.stream().filter(t->t%2!=0).map(t->t*t).forEach(t-> System.out.print(t+" "));
        //elemanların değerleri değişecekse map() methodu kullanılır.

    }
    //4) Ardışık tek list elementlerinin küplerini tekrarsız olarak aynı satırda aralarında boşluk bırakarak yazdıran bir method oluşturun.
    public static void tekrarsızElemanlarınKupunuYazdır(List<Integer>list){
        list.stream().distinct().filter(t->t%2!=0).map(t->t*t*t).forEach(t-> System.out.print(t+" "));
    }
    //5) Tekrarsız çift elementlerin karelerinin toplamını hesaplayan bir method oluşturun.

    public static void tekrarsızCiftElemanlarınKareleriToplamı(List<Integer>list){
       Integer toplam= list.stream().distinct().filter(t->t%2==0).map(t->t*t).reduce(0,(t,u)->t+u);

        System.out.println(toplam);
    }

    //6) Tekrarsız çift elemanların küpünün çarpımını hesaplayan bir method oluşturun.
    public static void tekrarsızCiftElemanlarınKupleriCarpımı(List<Integer>list){
        Integer carpım=list.stream().distinct().filter(t->t%2==0).map(t->t*t*t).reduce(1,(t,u)->t*u);
        System.out.println(carpım);
    }

    //7) List elemanları arasından en büyük değeri bulan bir method oluşturun.
    // 1.Yol:
    public static void getmaxEleman01(List<Integer>list){
        Integer max=list.stream().distinct().reduce(Integer.MIN_VALUE,(t,u)-> t>u ? t : u);

        System.out.println(max);
    }
    //2.Yol:
    public static void getmaxEleman02(List<Integer>list){
        Integer max=list.stream().distinct().sorted().reduce(Integer.MIN_VALUE,(t,u)->u);
        System.out.println("max = " + max);
    }
    //Ödev
    //8)List elemanları arasından en küçük değeri bulan bir method oluşturun.(2 Yol ile)
    public static void getMinEleman(List<Integer>list){
       Integer min= list.stream().distinct().sorted().reduce(Integer.MAX_VALUE,(t,u)->u);
        System.out.println("min = " + min);
    }


    //9) List elemanları arasından 7'den büyük, çift, en küçük değeri bulan bir method oluşturun.
    //1.yol:
    public static void getyedidenBuyukMin(List<Integer>list){
        Integer min=list.stream().distinct().filter(t->t%2==0).filter(t->t>7).reduce(Integer.MAX_VALUE,(t,u)->t<u ? t :u);
        System.out.println(min);
    }

    //2.yol:
    public static void getyedidenBuyukMin1(List<Integer>list){
        Integer min=list.stream().distinct().filter(t->t%2==0).filter(t->t>7).sorted(Comparator.reverseOrder()).
                reduce(Integer.MAX_VALUE,(t,u)->u);

        System.out.println(min);

    }

    //3.yol:
    public static void getyedidenBuyukMin2(List<Integer>list){
        Integer min=list.stream().filter(t->t%2==0).filter(t->t>7).sorted().findFirst().get();
        System.out.println(min);

    }
    //10) Ters sıralama ile tekrarsız ve 5'ten büyük elemanların
    // yarı değerlerini(elamanın ikiye bölüm sonucunu) bulan bir method oluşturun.

    public static void getTersSıralamaTekrarsızElemanlarınYarısı(List<Integer>list){
        List<Double>sonuc=list.stream().distinct().filter(t->t>5).map(t->t/2.0).
                sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println(sonuc);
    }




}
