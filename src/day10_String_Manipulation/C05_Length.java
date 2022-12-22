package day10_String_Manipulation;

public class C05_Length {
    public static void main(String[] args) {

        String str="Java ogren, ısı kap";

        System.out.println(str.length());  // str ' ın karakter sayısını verir.

        System.out.println(str.charAt(str.length()-1));  // son karakteri yazdıracak -- p

        System.out.println(str.charAt(str.length()-3));  // sondan 3. karakter  --> k

        /*
               *** Verilen String' dekı karakter sayısını dondurur ***
        Java' da null pointer(işaretleyıcı) bir deger degıl,
        karşısına yazıldıgı variable' ın hıc bır deger almadıgının işaretcısıdır
         */

        String str2=""; // str2' ye bır deger atanmıs  mıdır ---> Evet
                        //  bu deger : hıclık
        System.out.println(str2.length());  // '' 0 ''


        String str3=null; // str3' e bır deger atanmıs  mıdır ---> Hayır
                          //  null  bu deger atamamayı ıfade etmektedır

        System.out.println(str3.length());   // Bır deger atanmammıs kı nasıl uzunlugu olsun
                                            //   NullPointerException olarak hata verir...




    }
}
