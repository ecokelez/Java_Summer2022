package day17_NestedforLoop;

public class C04_NestedforLoop {
    public static void main(String[] args) {

            /*
            verilen inputa gore *'lardan olusan bir ucgen olusturun
            ornek = input = 4 ise
                *
                * *
                * * *
                * * * *
        */


        int ınput=4;

        for (int i = 0; i <=ınput ; i++) {

            for (int j = 1; j <=i; j++) {
                System.out.print("* ");
            }
            System.out.print("");
        }





    }
}
