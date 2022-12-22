package day14_methodCreation;

public class C03_MethodCreation {
    public static void main(String[] args) {

        // Input olarak verilen isim ve soyismi
        // ilk harfi buyuk, geriye kalan harfler * olacak sekilde
        // I**** K***** seklinde yazdiran bir method olusturun


        String isim="Enes";
        String soyısım="Bozkurt";

        ısmıGızle(isim,soyısım);
        System.out.println(isim+" "+soyısım);

        C02_MethodCreation.rakamlarıTopla(654);
        C01_MethodCreation.terstenYazdır("Sude");

    }

    private static void ısmıGızle(String isim, String soyısım) {

        isim=isim.substring(0,1).toUpperCase()+isim.substring(1).replaceAll("\\w","*");
        soyısım=soyısım.substring(0,1).toUpperCase()+
                soyısım.substring(1).replaceAll("\\w","*");

        System.out.println(isim+" "+soyısım);


    }
}
