package day16_forLoop;

public class C03_forLoop_S2 {
    public static void main(String[] args) {

        //Soru 2 ) 10 ile 30 arasindaki(10 ve 30 dahil) sayilari aralarinda virgul olarak ayni satirda yazdirin


      /*  int sayı=0;

        for (int i = 10; i <=30 ; i++) {
            System.out.print( i+",");


       */

       int bas = 10;
        int son = 30;

        for (int i = bas; i <= son; i++) {

            if (i < son) {
                System.out.println(i + " ,");
            } else {
                System.out.println(i);
            }

        }
    }

}








