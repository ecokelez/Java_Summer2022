package day14_methodCreation;

public class C04_MethodCreationReturn_Tekrar {
    public static void main(String[] args) {
        // verilen isim ve soyismi ilk harfi buyuk
        // geriye kalanlari * olacak sekilde degistirip
        //  bize bu halini donduren bir method olusturun
        // NOT : programin ilerleyen kisimlarinda isim ve soyismi bu sekilde kullanmak istiyoruz

        String ısım="Ersoy";
        String soyısım="COKELEZ";

         String gızlıBulmaca=saklıBulmaca(ısım,soyısım);

        System.out.println(ısım+" "+soyısım);
        System.out.println(gızlıBulmaca);



    }

    private static String saklıBulmaca(String ısım, String soyısım) {

        ısım=ısım.substring(0,1).toUpperCase()+ısım.substring(1).replaceAll("\\w","*");
        soyısım=soyısım.substring(0,1).toUpperCase()+soyısım.substring(1).replaceAll("\\w","*");

        return ısım+" "+soyısım;
    }
}
