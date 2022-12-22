package day10_String_Manipulation;

import java.util.Locale;

public class C11_Mix_Tekrar {

    public static void main(String[] args) {

        String str="Javayı sevmeye basladım";
        String str1="JAVAYI SEVMEYE BASLADIM";
        String str2="javayı sevmeye basladım"+"";


        System.out.println(str.indexOf("v"));
        System.out.println(str.indexOf('m'));
        System.out.println(str.indexOf("m"));
        System.out.println(str.indexOf("y"));
        System.out.println(str.indexOf("l"));


        System.out.println(str.length());
        System.out.println(str.charAt(8));
        System.out.println(str.toUpperCase().charAt(18));
        System.out.println(str.toUpperCase().charAt(22));

        System.out.println(str.toUpperCase());
        System.out.println(str.toUpperCase(Locale.forLanguageTag("Tr")));
        System.out.println(str.toUpperCase().charAt(15));
        System.out.println(str.toLowerCase());
        System.out.println(str.toLowerCase().charAt(0));

        System.out.println(str.equals(str2));   // true
        System.out.println(str==str1);                  // false
        System.out.println(str.equalsIgnoreCase(str1));          // true

        System.out.println(str1==str2);   //false
        System.out.println(str1.equals(str2));    //  false
        System.out.println(str1.equalsIgnoreCase(str2));   // false

        System.out.println(str.length());
        System.out.println(str.length()-1);
        System.out.println(str.toUpperCase().length()-2);
        System.out.println(str2.charAt(str2.length()-3));
        System.out.println(str1.toLowerCase().charAt(7));
        System.out.println(str1.toLowerCase().charAt(str1.length()-7));



    }
}
