package day11_StringManipulations;

public class C01_indexOf {
    public static void main(String[] args) {

        String str="Java ogrenmek cok guzel";

        //Verieln bır strıng de herhangı bır strıgde ve ya char 'ın
        // ilk kullanıldıgı index' i bıze dondurur, verır.

        System.out.println(str.indexOf('g'));
        System.out.println(str.indexOf("r"));

        System.out.println(str.indexOf("j"));  // -1

        System.out.println(str.indexOf("mek")); //  10

        /*
        Eger istedıgımız index' ten sonrasını kontrol etmek ıstersek
        o vakıt aynı metodu iki parametrelı olarak kullanabılırız
         */

        System.out.println(str.indexOf("g",6));  // yazılan index' ten baslar


        /* yukarıdakı str' da 2. ve 3. e'lerın indexlerını bulun
        2.  e'yı bulabılmek ıcın 1. index ıne ıhtıyacım var
         */

        int ilke=str.indexOf("e");
        int ikincie=str.indexOf("e",ilke+1);

        // egrer 2. e varsa 3. e nın olup olmadıgını ve varsa  index ını yazdıralım

        if (ikincie==-1){
            System.out.println("verılen str da 2. e yok");
        }else{
            int ucuncue=str.indexOf("e",ikincie+1);
            if (ucuncue==-1){
                System.out.println("verılen str da 3.e yok");
            }else {
                System.out.println("verılen str da 3. e'nin index'i: "+ ucuncue);;
            }
        }

    }
}
