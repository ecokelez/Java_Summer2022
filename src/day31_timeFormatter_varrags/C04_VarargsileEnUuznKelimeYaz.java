package day31_timeFormatter_varrags;

public class C04_VarargsileEnUuznKelimeYaz {
    public static void main(String[] args) {

        enUzunKelimeyiYazdır("Ali","Ayse","Ismail","Ahmet","Babayıgıt");// Ahmet'i sonrdan ekledik varargs dan sonra

    }

    public static void enUzunKelimeyiYazdır(String... kelime) {

        String enUzunKelime=kelime[0];

        for (String each:kelime) {
            if (each.length()>enUzunKelime.length()){

                enUzunKelime=each;
            }
        }
        System.out.println("Girilen kelimelerden en uzunu : "+ enUzunKelime);
    }
}
