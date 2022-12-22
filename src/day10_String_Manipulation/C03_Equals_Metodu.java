package day10_String_Manipulation;

public class C03_Equals_Metodu {
    public static void main(String[] args) {

        String str1="Ali Can";
        String str2="ALİ CAN";
        String str3="Ali Can" + "";
        String str4="Ali Can";
        String str5=new String("Ali Can");


        System.out.println(str1==str2);   //false

        System.out.println(str1==str3);
        System.out.println(str1.equals(str3));

        System.out.println(str1==str5);
        System.out.println(str1.equals(str5));

        System.out.println(str1.equals(str4));

        System.out.println(str3.equals(str5));

        System.out.println(str3==str5);

          /*
          ++equals metodu verilen ıkı String' ın icerıgının bırbırıne esit olup olmadıgını kontrol eder

          ++ Karsılastırma operatoru ıse == ,iki Strıng  objesının degerının  yanında
          referancelarına (adreslerıne) da bakar.
          Aynı degere sahıp olsa bıle farklı ıkı objeyı == karsılastırdıgımızda sonuc False olur

        ++  String'lerde ayni String olsa bile == herzaman calismaz
         emin olmak isterseniz equals() kullanmalisiniz
         equals() kullandigimizda dikkat edecegimiz TEK SEY Metinlerin bire-bir ayni olmasidir
         */


    }
}
