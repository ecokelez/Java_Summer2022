package day25_constructor;

public class C01 {

    /*
        Java OOP konsept kullandıgı ıcın olusturulan her bır class'ın ihtıyac oldugunda,
         obje uretebılmesıne uygun dızayn etmıstır,
         Ama her her class' dan obje verılmeyebılır,

     Biz Constructor' a ıhtıyacımız olan özel parametrelerı yazmazsak Java bızım ıcın standart bır urun uretır,
    istedıgımız spesıfık ozellıkler varsa parametreler vasıtasıyla soylemek gerekır

         Bır Class' da gorunurde constructor yoksa bıle Java oraya ıhtıyac halınde kullanılması ıcın ;
        Bunun ıcın Java ihtıyac halınde kuulanılması ıcın her Class' da default constructor koymustur,
        bu default constructor  class'dan obje olusturuldugunda otomatik olarak calisir

      ornegin bu class'da constructor gorunmemesine ragmen
      C02 class'inda icinde oldugumuz C01 class'indan bir obje uretebildik
     */

     int sayı;
      public void deneme(){

          System.out.println("C01 den deneme method calıstır");
      }
}


