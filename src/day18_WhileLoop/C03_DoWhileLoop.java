package day18_WhileLoop;

public class C03_DoWhileLoop {
    public static void main(String[] args) {

        /*
            while loop'da once kontrol edip sonra islem yaptigimiz icin
            islem bittikten sonra loop'un kirilmasi icin bir kez daha basa donmemiz gerekiyor
            bu durumda fazladan bir islem yapiliyor
        */


        int sayı=7;

        while (sayı<10){

            System.out.println(sayı);

            sayı++;

        }

        /*
        do While Loop ile calsıtdığımızda bu dezavantaj ortdan kalkar
         */

        sayı=7;

        do {
            System.out.println(sayı);
            sayı++;
        }while (sayı<10);



    }
}
