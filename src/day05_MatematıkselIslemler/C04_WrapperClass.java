package day05_MatematıkselIslemler;

public class C04_WrapperClass {

    public static void main(String[] args) {

        String str="Java cok guzel";
        str.toUpperCase();

        int sayi=10;

        // primitive data tur. yanında  metod'lar olmaz
        // Java bazı method'ları kullanabılmemız ıcın her bir primitive data turu icın
        // bir wrapper class olusturmustur


        Integer sayi2=10;    // Bas harfı buyuk old. ıcın Non -Prımıtıve Data Turune donusmustur
        sayi2.byteValue();



    }
}
