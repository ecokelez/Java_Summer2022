package day17_NestedforLoop;

public class C05_NestedforLoop {
    public static void main(String[] args) {
        /*
        verilen input'a gore
        *'lardan olusan asagıdaki sekli olusturun
        *
        * *
        * * *
        * * * *
        * * *
        * *
        *

         // artan kismi nested forloop ile yapalim
 */
        int ınput=4;

        for (int i = 1; i <=ınput ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print("* ");
            }
            System.out.print("");
        }


        for (int i = ınput-1; i>=1 ; i--) {
            for (int j =i; j>=1 ; j--) {
                System.out.print("* ");
            }
            System.out.print("");
        }



    }
}
