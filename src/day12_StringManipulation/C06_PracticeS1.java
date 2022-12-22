package day12_StringManipulation;

public class C06_PracticeS1 {

    public static void main(String[] args) {
        String str=" Java ogrenmek123 Cok guzel@ ";
         // Java ogrenmek cok guzel seklınde cevırın

        str=str.trim();

        str=str.replaceAll("\\W", " ");

        str=str.replaceAll("\\d","");


        str=str.replaceAll("C","c");

        str=str+".";

        System.out.println(str);




    }
}
