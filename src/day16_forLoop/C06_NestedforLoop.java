package day16_forLoop;

public class C06_NestedforLoop {
    public static void main(String[] args) {
        /*
        Bazen tek degısken sorunu coz. yetmez

         */

        for (int i = 1; i <=3 ; i++) {
            System.out.print("*");

        }
     // Bu tur durumlarda Nested loop kullanılır
        System.out.println("");

        for (int i = 1; i <=4 ; i++) {
            System.out.print("* ");
        }
        System.out.println("");

        for (int i = 1; i <=5 ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print("* ");

            }

        }


    }
}
