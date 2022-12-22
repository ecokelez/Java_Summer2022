package day28_staticBlock;

public class C02_PassByValue {

    public static void main(String[] args) {

        double satısfıyatı=100;

        System.out.println(indirimliFiyat(satısfıyatı));   //  90

        System.out.println(satısfıyatı);                  // 100

        System.out.println(indirimliFiyat(satısfıyatı));  //  90

        // iki farkli method'da satisFiyati isminde variable olabilir
        // Java buna itiraz etmez cunku, scope'lari farklidir.

        // Fakatt aynı scope' ta  aynı isimde iki variable olusturamayız,
        // data tuur farklı olsa bıle aynı ısımde iki variable olusturamayız


    }


   public static double indirimliFiyat(double orjinalFiyat){

       // methodumuz %10 indirim yapip
       // yeni fiyati main methid'a dondursun

        double satısFiyatı=orjinalFiyat*0.9;

        return satısFiyatı;
   }

}
