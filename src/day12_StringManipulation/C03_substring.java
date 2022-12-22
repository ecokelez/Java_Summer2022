package day12_StringManipulation;

public class C03_substring {
    public static void main(String[] args) {
        String ısım="Suleyman";
        String soyısım="Karanfil";
        String kartNo="1234 6589 7458 9658";

        System.out.println(ısım.substring(3));
        System.out.println(soyısım.substring(soyısım.length()-3));

        System.out.println(ısım.substring(2,4));
        System.out.println(soyısım.substring(3,5));

        String ısımIlkHarf=ısım.substring(0,1).toUpperCase();
        String ısımGerıyeKalanlar=ısım.substring(1).replaceAll("\\w", "*");


        String soyısımIlkHarf=soyısım.substring(0,1).toUpperCase();
        String soyısımGerıyeKalanlar=soyısım.substring(1).replaceAll("\\w","*");

        String kkIlk4=kartNo.substring(0,4);
        String kkGerıyeKalan=kartNo.substring(4).replaceAll("\\d","*");

        System.out.println(ısımIlkHarf+ısımGerıyeKalanlar+" "+ soyısımIlkHarf+soyısımGerıyeKalanlar+" \n"+
                           kkIlk4+kkGerıyeKalan);







    }
}
