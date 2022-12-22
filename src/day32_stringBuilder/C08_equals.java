package day32_stringBuilder;

public class C08_equals {
    public static void main(String[] args) {

        StringBuilder sb1=new StringBuilder("Java");
        StringBuilder sb2=new StringBuilder("Java");
        String str="Java";

        System.out.println(sb1.equals(sb2));  // false

        System.out.println(sb1.equals(sb1));  // true
        // StirngBuilder' da equals metodu ancak aynı obje olursa true doner,
        // String gibi dusunmemek gerekır

        System.out.println(sb1.equals(str));  //  false


        System.out.println(sb1.compareTo(sb2)); //  0

        StringBuilder sb3=new StringBuilder("Jave");
        System.out.println(sb1.compareTo(sb3));  //  -4

        /*
        compareTo() methodu SringBuilder' ı bastan baslayarak harf harf karsılastırır,
        ilk harfler aynı ise ikincilere gecer,
        ikinciler aynı ise 3. gecer ve ilk farklı olan harflere kadar gıder,
        farklı olan iki harfin Ascii kodları arasındaki farkı vardır,
        **** Eger hic farklı harf yoksa sonuc olarak 0 dondurur.

         */


    }
}
