package day04_dataCasting;

public class C03_AutoWidening {
    public static void main(String[] args) {

        // dar veri turundekı bır degerı genıs verı turundekı bır verıable' a otom. olarak assıgn eder

        byte sayi1=23;
        short sayi2=55;

        int sayi3= sayi1+sayi2;
        System.out.println(sayi3);

        double sayi4 = sayi1*sayi2; // 1265.0
        System.out.println(sayi4);

        sayi4=sayi2/sayi1;                //  iki tur de int oldugu icın 2.333 olmaz da --> 2 yı verir
        System.out.println(sayi2/sayi1);

        sayi4=(double)sayi2/sayi1;  // sayi2 yi double yapmıs olduk--> dar sayı  genıse gore amel etme
                                    // dar verı turundekı degeri genıs degere atar



        int sayi5=10;

    }
}
