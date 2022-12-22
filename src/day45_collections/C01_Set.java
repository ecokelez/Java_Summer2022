package day45_collections;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class C01_Set {
    public static void main(String[] args) {
        //Verilen bir array'deki tekrar eden elementleri silip
        // tekrarsiz halini Array'e atayan bir kod yaziniz.

        int arr[]={4,5,3,6,8,5,1,9,0,4,2,5,7,9,1,2,5,7,6};

        Set<Integer> tekrarsızSet=new HashSet<>();
        for (int each:arr
             ) {
            tekrarsızSet.add(each);
        }
        System.out.println("Set :" + tekrarsızSet);

        int[] tekrarsızArr=new int[tekrarsızSet.size()];
        System.out.println(Arrays.toString(tekrarsızArr));

        int i=0;
        for (int each:tekrarsızSet) {
            tekrarsızArr[i]=each;
            i++;
        }
        arr=tekrarsızArr;
        System.out.println("Bizim Array'in son hali :" +Arrays.toString(arr));

    }
}
