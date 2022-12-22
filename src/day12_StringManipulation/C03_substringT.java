package day12_StringManipulation;

public class C03_substringT {

    public static void main(String[] args) {
        String ısım="Ersoy";
        String soyısım="Cokelez";
        String kartNo="1234 6589 7458 9658";

        String ısımIlkHarf=ısım.substring(0,1).toUpperCase();
        String ısımGerıyeKalanlar=ısım.substring(1).replaceAll("\\w","*");
        System.out.println(ısımIlkHarf+ısımGerıyeKalanlar);

        String soyısımIlkHarf=soyısım.substring(0,1).toUpperCase();
        String soyısımGerıyeKalanlar=soyısım.substring(1).replaceAll("\\w","*");
        System.out.println(soyısımIlkHarf+soyısımGerıyeKalanlar);

        String kkIlkHarf=kartNo.substring(0,4);
        String kkGerıyeKalanlar=kartNo.substring(4).replaceAll("\\d","*");
        System.out.println(kkIlkHarf + kkGerıyeKalanlar);




    }
}
