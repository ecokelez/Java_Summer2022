package day39_exceptions;

public class C04_EcxeptionTurleri {
    public static void main(String[] args) {
        String str;

        /*
        lokal variable'lar deger vermeden olsuturulabılır,sadece deklarasyonla olusturalabilir,
        ama deger atanmadan yazdırılamaz
         System.out.println(str);
         */

        str=null;
        /*System.out.println(str.length());
        // NullPointerException

         */

       /* Object obj="Java Java Java";  //   ClassCastException
        Integer sayı=(Integer)obj;

        */


        /*
         String srt2="Hava Cıva";
        Integer sayı2=str2;  -->  ClassCastException

        Java bazı casting islemlerinde compile time' a izin vermeyebilir,
        ancak bazen syntax uygun olmayabilir,
        bu durumda java kodun calısmasına itiraz etmez
         */

      /*Thread.sleep(5000); -> sleep' ın  altını cizer ve Java bizden bırsey yapmamızı bekler
        // 1- ya throw
        // 2- ya da try -catch blogu

       */

    }
}
