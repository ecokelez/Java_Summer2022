package day06_concatenation;

public class C02_Concatenation {

    public static void main(String[] args) {
        String str1="Java";
        String str2="Guzeldır";

        int sayi1=5;
        int sayi2=4;

       // Yukarıdakı verıable' ları kullanarak ıstenen metinlerı yazdıralım

        System.out.println(str1+" "+str2+" "+ sayi1+sayi2); // Java Guzeldır 54

        System.out.println(); // Java Guzeldır 9
        System.out.println(str1+" "+str2+" "+(sayi1+sayi2));

        System.out.println(sayi1+sayi2+" "+str1);  // 9 Java

        System.out.println("" + sayi1+sayi2+" "+ str2);  // 54 Guzeldır

        /*
           (" " +str1+str2 +..) ---> " " hıclık bile olsa Strıng olur ve strong olur
           ve yan yana bırlestırır, ınt' ı  kendıne benzetır ve toplama yapmak yerıne metın gıbı kabul eder
           ve yan yana bırlestırır
         */

        System.out.println(str1.concat(str2));  // JavaGuzeldır
        System.out.println(str1.concat(" ").concat(str2)); // Java Guzeldır

    }
}
