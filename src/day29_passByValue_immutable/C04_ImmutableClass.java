package day29_passByValue_immutable;

public class C04_ImmutableClass {
    public static void main(String[] args) {


             /*
         Immutable : degistirilemez
         mutable   : degistirilebilir

         en meshur immutable class : String
         */

        String str="Yıldız Bank";

        System.out.println(str.toUpperCase());

        str.toLowerCase();
        System.out.println(str);  // Yıldız Bank

        str.substring(3,5);
        System.out.println(str);  // Yıldız Bank


        // Java'da String gibi metin ifadelerde kullanabilecegimiz
        // mutable StringBuilder class'i da vardir

        StringBuilder sb=new StringBuilder("Java Bank");
        System.out.println(sb);

        sb.reverse();
        System.out.println(sb); // knaB avaJ

        sb.append(".");
        System.out.println(sb); // knaB avaJ.

        // StringBilder' da atama olmasa da method calısıyorsa StringBilder degisir,
        // ama Stirng' de method alıısnca stirng degısmez sebebi de Stirn' in Immutable olmasıdır.



    }
}
