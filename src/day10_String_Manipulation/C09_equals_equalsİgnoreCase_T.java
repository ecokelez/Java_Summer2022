package day10_String_Manipulation;

public class C09_equals_equalsİgnoreCase_T {

    public static void main(String[] args) {
         String str1="ersoy  cokelez";
         String str2="Ersoy Cokelez";
         String str3="ERSOY COKELEZ";
         String str4="ersoy cokelez" + "" ;

        System.out.println(str1==str2);
        System.out.println(str1.equals(str2));
        System.out.println(str1.equalsIgnoreCase(str2));

        System.out.println(str1==str3);   // false
        System.out.println(str1.equals(str3));  //
        System.out.println(str1.equalsIgnoreCase(str3));   //

        System.out.println(str3==str4);
        System.out.println(str3.equals(str4));
        System.out.println(str3.equalsIgnoreCase(str4));

        System.out.println(str1==str4);
        System.out.println(str1.equals(str4));
        System.out.println(str1.equalsIgnoreCase(str4));



    }
}
