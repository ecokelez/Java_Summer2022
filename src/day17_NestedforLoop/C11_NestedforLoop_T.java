package day17_NestedforLoop;

public class C11_NestedforLoop_T {
    public static void main(String[] args) {

            /*
                 verilen yukseklik ve boy degerine gore
                *'lardan olusan bir dikdortgen olusturalim
                    yukseklik :3  boy:4
                     * * * *
                     * * * *
                     * * * *
             */

        int yukseklık=3;
        int boy=4;

        for (int i = 1; i <=yukseklık ; i++) {

            for (int j = 1; j <=boy ; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }

    }
}
