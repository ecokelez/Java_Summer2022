package day10_String_Manipulation;

import java.util.Locale;

public class C02_toLowerCase_toUpperCase {
    public static void main(String[] args) {

        String str="Beni psıkopata baglamayın";
        System.out.println(str.toUpperCase());
        System.out.println(str.toUpperCase(Locale.forLanguageTag("Tr")));

         /*
           Eger buyuk- kucuk donusumunde local bır dılı almak ıstersenızbu method kullanılabılır

         */

    }
}
