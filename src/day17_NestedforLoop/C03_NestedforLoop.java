package day17_NestedforLoop;

public class C03_NestedforLoop {
    public static void main(String[] args) {
        /*
                 verilen yukseklik ve boy degerine gore
                *'lardan olusan bir dikdortgen olusturalim
                    yukseklik :3  boy:4
                     * * * *
                     * * * *
                     * * * *
 */

    int yukseklık=4;
    int boy=8;


        for (int i = 1; i <=yukseklık ; i++) {
            for (int j = 1; j <=boy ; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }



    }
}