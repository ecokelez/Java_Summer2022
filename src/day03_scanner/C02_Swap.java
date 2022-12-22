package day03_scanner;

public class C02_Swap {
    public static void main(String[] args) {


        // 1- Verilen sayı1 be sayı2 variable ' ların değerlerini değiştiren (SWAP) bir program yazınız

        int sayı1=10;
        int sayı2=20;
        int sayı3=0;

        // sayı3 gecici kovamız
        // adım 1- sayı2' yi bos kovaya koyalım.
         sayı3=sayı2;     // 10      20     20

        // adım 2- 1. sayıyı 2. sayıya atayacag

        sayı2=sayı1;     // 10    10    20

        //adım3 - bos kovadaki sayıyı sayı1 ' e atayalım

        sayı1=sayı3;      //  20    10    20

        System.out.println("swap'dan sonra sayı1 : "+sayı1);
        System.out.println("swap'dan sonra sayı2 : "+sayı2);
        System.out.println("swap'dan sonra sayı3 :" +sayı3);


    }

}
