package day10_String_Manipulation;

public class C06_indexOf {
    public static void main(String[] args) {
        String str="Java ogrenmek cok guzel";

        System.out.println(str.indexOf("o"));    // 5
        System.out.println(str.indexOf('g'));   // 6
        System.out.println(str.indexOf("t"));

        /*
         -- bana Integer donduruyor
         --int yok dıye bır deger bulunmuyor
         -- 0 dersek J' nın index' idır
         -- bır deger donerse bız aranan str' da olmadıgını
         -- Java -1 dondurmeyı tercıh etmıstır
         */

                // str5 de p harfi var mıdır
        if (str.indexOf("=")==-1){
            System.out.println("str5 de istenen karakter kullanilmamis");
        }else{
            System.out.println("str5'de istenen karakter kullanilmis");
        }
    }
}
