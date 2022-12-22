package day21_Arrays;

import java.util.Arrays;

public class C09_binarySearch {
    public static void main(String[] args) {

        /*
        binarySearch mrthod' u sıralanmıs Array' de aradıgımız elementın index' ini dondurur,
          Ya aradıgımız element Array' de yoksa ?
          (String' de indexOf() bize olmayan elemetler ıcın -1 donduruyorudu)

         */

        int[] sayılar={3,7,15,4,27,10};

        Arrays.sort(sayılar);

        System.out.println(Arrays.toString(sayılar)); // [3, 4, 7, 10, 15, 27]

        // Varsa index yoksa - sıra



        System.out.println(Arrays.binarySearch(sayılar,4));   // 1
        System.out.println(Arrays.binarySearch(sayılar,15)); //  4
        System.out.println(Arrays.binarySearch(sayılar,11)); //  -5
        System.out.println(Arrays.binarySearch(sayılar,6));  // -3
        System.out.println(Arrays.binarySearch(sayılar,-100));  // -1


    }
}
