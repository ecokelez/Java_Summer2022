package day22_MultiDimensionalArrays;

import java.util.Arrays;

public class C13_MultiD_A_S4 {
    public static void main(String[] args) {


        //Soru 4) Asagidaki multi dimensional array’in ic array’lerindeki tum elemanlarin toplamini
        // birer birer bulan ve herbir sonucu yeni bir array’in elemani yapan
        // ve yeni array’i  ekrana  yazdiran bir program yaziniz { {1,2,3}, {4,5}, {6,7} }
        // Ornek; { {1,2,3}, {4,5}, {6,7} } ==> 1+2+3=6 4+5=9 6+7=13 ==> output: {6, 9, 13}

        int[][] arr = {{1, 2, 3}, {4, 5}, {6, 7}};

        int[] yenıArray = new int[arr.length]; // ıcerdekı her bır ınner Aray ı toplayacak ,
        // outer Array ıcnde ne kadar ınner Array varsa o kadar ,
        // outer Array ın uuznlugu kadar olacak
        int toplam = 0;


        for (int i = 0; i < arr.length; i++) {   // dis loop outer array'i gezer
            for (int j = 0; j < arr[i].length; j++) {  // ic loop ise inner array'leri gezer
                toplam += arr[i][j];


            }
            yenıArray[i] = toplam;  // 0 yazmazsak alttak yanı bır oncekı elemanların uzerıne yenı sayıları ekler
            //  ve toplamaya baslar, inner loop bıtııgı zaman ınner array gozden gecrildi demektir,
            //  dolayısıyla ınner loop bittigınde ben o toplamı yenı array e koydum ,
            //  sonra da toplamı sıfırladım demektır
            toplam = 0;

        }
        System.out.println("Istenen yenı Array:"+ Arrays.toString(yenıArray));

    }
}
