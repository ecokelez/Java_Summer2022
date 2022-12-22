package day29_passByValue_immutable;

public class C05_Immutable {
    public static void main(String[] args) {

        String ısım="Mine";

        ısım=ısım.toUpperCase();
        System.out.println(ısım);  // MINE

        ısım="Mevlut";
        System.out.println(ısım);


        for (int i = 0; i <100 ; i++) {
            ısım+=".";

        }
        System.out.println(ısım);
    }
}
