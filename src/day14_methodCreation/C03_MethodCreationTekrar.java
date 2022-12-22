package day14_methodCreation;

public class C03_MethodCreationTekrar {

    public static void main(String[] args) {


        // Input olarak verilen isim ve soyismi
        // ilk harfi buyuk, geriye kalan harfler * olacak sekilde
        // I**** K***** seklinde yazdiran bir method olusturun


        String ısım="Ersoy";
        String soyısım="COKELEZ";

        ısımBulmaca(ısım,soyısım);

    }

    private static void ısımBulmaca(String ısım, String soyısım) {

        ısım=ısım.substring(0,1).toUpperCase()+ısım.substring(1).replaceAll("\\w","*");
        soyısım=soyısım.substring(0,1).toUpperCase()+soyısım.substring(1).replaceAll("\\w","*");

        System.out.println(ısım+" "+ soyısım);
    }
}
