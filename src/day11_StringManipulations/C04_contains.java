package day11_StringManipulations;

public class C04_contains {
    public static void main(String[] args) {
        /*
        Soru 2) Kullanicidan bir cumle isteyin.
        Cumle “buyuk” kelimesi iceriyorsa tum cumleyi buyuk harf olarak,
        “kucuk” kelimesi iceriyorsa tum cumleyi kucuk harf olarak yazdirin,
        iki kelimeyi de icermiyorsa “Cumle kucuk yada buyuk kelimesi icermiyor” yazdirin.

         */
        String cumle = "Java buyuk dunya kucuk";
        // requirements' da buyuk harf kucuk harf hassasıyetı duzenlenmemıs
        //2. olarak da her ıkı kelmeyı de ıcerme durumu acıklanmamıs
        // bu duurmda gorevı bıze kım verdıyse ona sormak gerekır

        if (cumle.contains("buyuk")) {
            System.out.println(cumle.toUpperCase());
        } else if (cumle.contains("kucuk")) {
            System.out.println(cumle.toLowerCase());
        } else if (cumle.contains("kucuk") && cumle.contains("buyuk")) {
            System.out.println("Karar ver buyuk mu yazdırayım kucuk mu ");
        }else{
            System.out.println("Cumle kucuk yada buyuk kelimesi icermiyor");
        }
    }
}
