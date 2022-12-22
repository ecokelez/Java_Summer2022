package day31_timeFormatter_varrags;

public class C03_VarargsileToplama {
    public static void main(String[] args) {

        // verilen 2 int'i toplayip sonucu yazdiran bir method olusturun

        int sayı1 = 10;
        int sayı2 = 20;
        int sayı3= 30;
        int sayı4= 40;

        toplaYazdır(sayı1,sayı2,sayı3,sayı4);
        toplaYazdır(sayı1,sayı2,sayı3);
        toplaYazdır(sayı1,sayı2);

    }

    public static void toplaYazdır(int... sayı){
         /*
        int... sayi  bu gosterim integer variable'lardan olusan bir varargs demektir
        varargs array alt yapisini kullanir
         */

        int toplam=0;
        int sayıAdedi= sayı.length;

        for (int each:sayı
             ) {
            toplam+=each;
        }
        System.out.println("Girilen "+ sayıAdedi +" adet sayını toplamı : " + toplam);
    }
}
