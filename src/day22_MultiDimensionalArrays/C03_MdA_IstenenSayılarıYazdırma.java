package day22_MultiDimensionalArrays;

public class C03_MdA_IstenenSayılarıYazdırma {
    public static void main(String[] args) {

    /*
        Verilen 2 katli bir multi-dimensional array'de
        outer index'i ve inner index'i ayni olan sayilarin toplamini bulunuz
        int[][] sayilar = {{1,5,6,9,4},{2,5,5,8},{3,1,6}};
        [0][0] + [1][1] + [2][2] ......

    */

        int [][] sayılar={{1,5,6,9,4},{2,5,5,8},{3,1,6},{4,5,8,9}};

        int ıstenenToplam=0;

        for (int i = 0; i < sayılar.length; i++) {
            for (int j = 0; j < sayılar[i].length; j++) {

                if (i==j){
                    ıstenenToplam+=sayılar[i][j];
                }
            }
        }

        System.out.println("istenen toplam: "+ıstenenToplam);
    }
}
