package day24_ArrayLists_forEachLoop;

import java.util.Arrays;
import java.util.List;

public class C01_ArraydenArrayListYapmak {
    public static void main(String[] args) {



        String arr[]={"Ismail","Nurullah","Fatih"};

            /*
        Uzun listeler olusturmamiz gerektiginde,
        tek tek eklemek yerine array olusturup, bunlari list'e cevirmek
        daha pratik olabilir
        1- loop ile array'deki tum elementleri list'e atabiliriz
        2- Arrays.asList() kullanabiliriz
           Ancak bu method'un 2 tane kotu yan etkisi var
           - Arrays class'i kullanildigi icin array ozellikleri gecerli olur
             dolayisiyla list'te olan add, remove gibi size'i degistiren method'lar
             bu sekilde olusturulan list'lerde kullanilamaz
           - kaynak olan array ile urun olan list ozdeslestirilir
             birinde yapilan degisiklik, otomatik olarak digerine de islenir
         */


        List<String> sınıfList=Arrays.asList(arr);
        System.out.println(sınıfList);      // [Ismail, Nurullah, Fatih]


        // 1. yan etki

       //  sınıfList.add("Erdi");  //   UnsupportedOperationException
       //  sınıfList.remove(1); //  UnsupportedOperationException


        arr[1]="Emre";
        System.out.println("degısım sonrası Array:"+Arrays.toString(arr));  //  [Ismail, Emre, Fatih]
        System.out.println("Array' i degıstırınce list:"+ sınıfList);      //  [Ismail, Emre, Fatih]

        sınıfList.set(0,"Utku");
        System.out.println("List'i degıstırınce list:"+sınıfList);   // [Utku, Emre, Fatih]
        System.out.println("List'i degsıtırnce Array:"+ Arrays.toString(arr));  // [Utku, Emre, Fatih]


    }
}
