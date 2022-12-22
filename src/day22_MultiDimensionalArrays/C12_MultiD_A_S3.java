package day22_MultiDimensionalArrays;

public class C12_MultiD_A_S3 {
    public static void main(String[] args) {

        //Soru 4) Asagidaki multi dimensional array’in ic array’lerindeki aynı index' e sahip elemanların
        // toplaminı ekrana  yazdiran bir program yaziniz

        int[][] arr1={{1,2}, {3,4,5},{6}};
        int[][]arr2={{7,8,9}, {10,11},{12}};

        int toplam=0;

        for (int i = 0; i <arr1.length ; i++) {
            for (int j = 0; j < arr1[i].length ; j++) {
                for (int k = 0; k <arr2.length ; k++) {
                    for (int l = 0; l <arr2[i].length ; l++) {

                        if (i==k && j==l){
                            toplam+=arr1[i][j]+arr2[k][l];
                        }
                    }

                }

            }

        }
        System.out.println("Aynı index' e sahip elemanların toplamı: "+ toplam);

    }
}
