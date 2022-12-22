package day11_StringManipulations;

public class C04_containsTekrar {
    public static void main(String[] args) {

         /*
        Soru 2) Kullanicidan bir cumle isteyin.
        Cumle “buyuk” kelimesi iceriyorsa tum cumleyi buyuk harf olarak,
        “kucuk” kelimesi iceriyorsa tum cumleyi kucuk harf olarak yazdirin,
      ++ ek requirements:   ikı kelımeyı de ıcerıyorsa "Karar ver buyuk mu yazdırayım kucuk mu ",
        iki kelimeyi de icermiyorsa “Cumle kucuk yada buyuk kelimesi icermiyor” yazdirin.

         */

        String cumle="Java ile hersey kucuk buyuk   guzel olacak";

        if (cumle.contains("buyuk") && cumle.contains("kucuk")){
            System.out.println("Karar ver buyuk mu yazdırayım kucuk mu");
        } else if (cumle.contains("buyuk")) {
            System.out.println(cumle.toUpperCase());
        } else if (cumle.contains("kucuk")) {
            System.out.println(cumle.toLowerCase());
        }else{
            System.out.println("Cumle kucuk yada buyuk kelimesi icermiyor");
        }


    }
}
