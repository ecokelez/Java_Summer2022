package day18_WhileLoop;

public class C05_doWhileLoop {
    public static void main(String[] args) {


         /*
            9'dan 190'a kadar 7^nin kati olan tum tam sayilari ekrana yazdiriniz
            */

        int bas = 9;
        int bıtıs = 190;

        int temp = bas;

        // while loop ile

        while (temp< bıtıs) {
            if (temp % 7 == 0) {
                System.out.print(temp + " ");
            }
            temp++;
        }

        // do while ile yapalım

        System.out.println(" ");
        temp = bas;

        do {

            if (temp % 7 == 0) {
                System.out.print(temp + " ");
            }
            temp++;
        } while (temp < bıtıs);

    }
}
