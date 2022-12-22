package day28_staticBlock;

public class C03_PassByValue {

    public static void main(String[] args) {


        /*
          %25 indirimli fiyati hesaplayip bize donduren bir method olusturun
         */


        double satısFiyati=100;
        double indirimOranı=60;


        double indirimliFiyat=indirimliFiyatHesapla(satısFiyati, indirimOranı);

        System.out.println("indirimli fiyat : "+ indirimliFiyat);
        System.out.println("indirimli fiyat : "+ indirimliFiyat);
        System.out.println("indirimli fiyat : "+ indirimliFiyat);
        System.out.println("indirimli fiyat : "+ indirimliFiyat);

    }

    private static double indirimliFiyatHesapla(double satısFiyati,double indirimOranı) {

        double indirimliFiyat=satısFiyati*(1-indirimOranı/100);

        return indirimliFiyat;
    }
}
