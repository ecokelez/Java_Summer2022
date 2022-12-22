package day17_NestedforLoop;

public class C02_nestedforLoop {
    public static void main(String[] args) {

            /*

           // verilen sayiya gore carpim tablosu olusturun

                input 3
                1 2 3
                2 4 6
                3 6 9

     */



            int ınput=3;

        for (int i = 1; i <=ınput ; i++) {

            for (int j = 1; j <=ınput ; j++) {
                System.out.print(i*j + " ");
            }

            System.out.println("");
        }




    }
}
