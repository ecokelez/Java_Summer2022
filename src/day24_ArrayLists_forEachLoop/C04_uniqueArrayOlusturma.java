package day24_ArrayLists_forEachLoop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C04_uniqueArrayOlusturma {
    public static void main(String[] args) {


        int[] arr={2,3,5,6,3,5,4,1,9,6,3,5,5};

        int[] uniqueArray=uniqueArrayOlustur(arr);

        System.out.println(Arrays.toString(uniqueArray));
    }

    private static int[] uniqueArrayOlustur(int[] arr) {

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));  //  [1, 2, 3, 3, 3, 4, 5, 5, 5, 5, 6, 6, 9]
        List<Integer> benzersızList=new ArrayList<>();

        // yanındakı elementlerı kontrol edıp listeye eklıyor
        for (int i = 0; i < arr.length-1 ; i++) {
            if (arr[i]!=arr[i+1]){
                benzersızList.add(arr[i]);
            }
        }

        // son elementı kontrol edıp yoksa listeye ekliyouz
        if (benzersızList.contains(arr[arr.length-1])){
            benzersızList.add(arr[arr.length-1]);

        }

        // benzersızList  --> 1 ,2 ,3 ,4,5, 6, 9
        // benzersız Listenın size()  bilgisini kullanarak bir Array oluşturduk.
        int[]tekarsızArr=new int[benzersızList.size()];

        // benzersiz lisetedeki tüm elemanları yeni Array'e atadık
        for (int i = 0; i < tekarsızArr.length ; i++) {
            tekarsızArr[i]= benzersızList.get(i);
        }
        return tekarsızArr;
    }
}
