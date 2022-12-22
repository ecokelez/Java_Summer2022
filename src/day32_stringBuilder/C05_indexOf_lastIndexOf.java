package day32_stringBuilder;

public class C05_indexOf_lastIndexOf {
    public static void main(String[] args) {

        StringBuilder sb=new StringBuilder("Pay attention please");

        System.out.println(sb.indexOf("Pay")); // 0

        System.out.println(sb); // Pay attention please

        System.out.println(sb.indexOf("e"));  // 7

        System.out.println(sb.indexOf("e",10));  // 16 -> 10. indexi bul. sonra ilerdeki  e yi  bulma

        System.out.println(sb.lastIndexOf("e"));  // 19

        System.out.println(sb.lastIndexOf("e",10)); // 7--> 10. indexi bul. sonra geriye dogru  e yi  bulma


    }
}
