package day22_MultiDimensionalArrays;

public class C11_Multi_S2 {
    public static void main(String[] args) {

        //Soru 2) Asagidaki multi dimensional array’in ic array’lerindeki
        // son elemanlarin carpimini  ekrana yazdiran bir program yaziniz { {1,2,3}, {4,5}, {6} }


        int [][] sayılar={ {1,2,3}, {4,5}, {6} };
        int carpım=1;

        for (int i = 0; i < sayılar.length; i++) {
            for (int j = 0; j <sayılar[i] .length; j++) {


                if (j==sayılar[i].length-1){   //  son elementi bulabılmek ıcın
                    carpım*=sayılar[i][j];

                }

            }

        }
        System.out.println("Son elemanlarin carpimi:" + carpım);
    }
}
