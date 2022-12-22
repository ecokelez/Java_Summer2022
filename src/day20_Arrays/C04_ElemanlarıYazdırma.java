package day20_Arrays;

import java.util.Arrays;

    public class C04_ElemanlarıYazdırma {

        public static void main(String[] args) {

            int sayılar[]={1,2,3,4,5,6,7};

        // Array ın tamamını yazdıralım

            System.out.println(Arrays.toString(sayılar));






      // Array' ın tum elementlerını yazdıralım

     /*   for (int i = 0; i < sayılar.length; i++) {
        if (i< sayılar.length-1){
                System.out.print(sayılar[i]+", ");
            }else System.out.println(sayılar[i]);
        }

      */




            // Array' ın tum elementlerını yazdıralım

            for (int i = 0; i < sayılar.length ; i++) {
                System.out.print(sayılar[i]+" ");

            }




    }
}
