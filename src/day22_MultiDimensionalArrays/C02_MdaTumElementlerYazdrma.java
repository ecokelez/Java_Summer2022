package day22_MultiDimensionalArrays;

public class C02_MdaTumElementlerYazdrma {
    public static void main(String[] args) {


        // verilen bir multi-dimensional array'in
        // tum elementlerini yazdiran bir method olusturun




     int [][] sayılar={{1,5,6,9},{2,5},{3,1,6}};

        elemetlerıYazdır(sayılar);
    }

    private static void elemetlerıYazdır(int[][] sayılar) {

        for (int i = 0; i < sayılar.length; i++) {  // i = 0,1,2 degerleri alacak

            for (int j = 0; j < sayılar[i].length ; j++) {  // inner arraylerin uzunluguna bagladik
                                                            // inner Array ın uznluguna kadar gıdecek

                System.out.print(sayılar[i][j]+ " ");

            }

        }

    }
}
