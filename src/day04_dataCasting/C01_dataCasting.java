package day04_dataCasting;

public class C01_dataCasting {
    public static void main(String[] args) {
        char harf = 'a';
        char yeniHarf= (char) (harf+1);  // kod bu durumda önce sagdaki islemi yapar
                                // char yeniHarf= 97+1 --> 98
                                // char bir variable 98 olamayacagı icin  Java hata verir

        System.out.println(yeniHarf);


        /*
           Bazen bir variable' a olusturuldgu data turu dısından deger atanabilir
        Bunlardan bazısını Jva otomatik olarak kabul eder

          Java eger bu deger atamasında sorun olusacagını (data kayıplarının olabilecegi  yada datanın baskalasabilecegi)
        gorurse  bu durumda otomatık olarak kabul etmez
        Sizden eger bu atamayı istıyorsanız sorumlulugu almanızı bekler

         */

      int sayi1=(int)7.3;
        System.out.println("sayi1 : " + sayi1);



      double sayi2=10;
        System.out.println("sayi2 : "+ sayi2);

      int sayi3='c';
        System.out.println("sayi3: "+ sayi3 );

      char harf2=98;
        System.out.println("harf2 : "+ harf2 );

    }
}
