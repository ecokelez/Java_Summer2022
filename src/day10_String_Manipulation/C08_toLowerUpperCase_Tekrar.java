package day10_String_Manipulation;

import java.util.Locale;

public class C08_toLowerUpperCase_Tekrar {
    public static void main(String[] args) {

        String str="Javayı sevmeye basladım";
        System.out.println(str.toLowerCase());
        System.out.println(str.toUpperCase());
        System.out.println(str.toUpperCase(Locale.forLanguageTag("TR")));





    }

}
