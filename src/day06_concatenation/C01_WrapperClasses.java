package day06_concatenation;

import java.util.Scanner;

public class C01_WrapperClasses {
     public static void main(String[] args) {

          /*
           // Primitive data tur. yanında  metod'lar olmaz
        Java bazı method'ları kullanabılmemız ıcın her bir primitive data turu icın
         bir wrapper class olusturmustur
           */

          /*
          Javanın hazır metodları kulanabılmamız icın
          prımıtıve data turlerının herbırıne actıgı Classlar'dır
             int ---> Integer
             char--->Character
             digerlerı prımıtıve data turu le aynı sadece  bas harfı buyuk

           */


          String str= "Java ile hayat ne guzel ";
          System.out.println(str.toUpperCase());  //JAVA ILE HAYAT NE GUZEL


          boolean guzelMi=true;

          // boolean primitive old. hazır methodu bulunmuyor

          Boolean buGuzelMi=true;   // Wrapper Classını kullanacagımızda buyuk harf Boolen kullan ve .


          System.out.println(Short.MIN_VALUE);  // -32768 ----> mın. degerler
          System.out.println(Short.MAX_VALUE);  // 32767  -- > max. deger ,alt ve ust sınırlar



          String ogrNo="123456";

          // kullanıcıdan bır sıfre ısteyın ,
          // eger sıfre sadece rakamalrdan olusuyorsa kabul etmeyelım


          Scanner scan=new Scanner(System.in);
          System.out.println("Lutfen  5 basamaklı bır sıfre gırınız");

          String sıfre= scan.nextLine();   //sifrenın harf ıcermesını ısrtedıgımız ıcın Strıng yaptık

          Integer sıfreSayi=Integer.parseInt(sıfre);

          System.out.println("gırılen sıfre : "+ (sıfre+3));
          System.out.println("Integer sıfrenızın 3 fazlası: " + (sıfreSayi+3));

          /*
          Wrapper Class'lar ileride kullnaıleecgımız pekcok fayadalı hazır method icerir
          Cogu zaman Data Base lere sıfreler strıng olarak tutulur
           */

     }
}
