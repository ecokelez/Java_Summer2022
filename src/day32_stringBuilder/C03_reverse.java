package day32_stringBuilder;

public class C03_reverse {
    public static void main(String[] args) {

        // verilen bir inputu tersine cevirip bize donduren bir method olusturun

        String ınput="Hey gidi for loop gunlerı";

        String tersInput=tersineCevir(ınput);

        System.out.println(tersInput);

    }

    public static String tersineCevir(String ınput) {

        StringBuilder sb=new StringBuilder(ınput);

        return sb.reverse().toString();

    }
}
