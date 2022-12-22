package day22_MultiDimensionalArrays;

import java.util.Arrays;

public class C10_Multi_S1 {
    public static void main(String[] args) {
        //Soru 2) Asagidaki multi dimensional array’in
        // tüm elemanlarinın carpimini  ekrana yazdiran bir program yaziniz { {1,2,3}, {4,5,6} }

            int[][] arr={ {1,2,3}, {4,5,6} };
            int carpım=1;

        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j <arr[i].length ; j++) {

                carpım*=arr[i][j];

            }

        }

        System.out.println("Tüm elemanların carpımı:"+ carpım);
    }
}
