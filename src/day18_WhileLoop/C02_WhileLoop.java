package day18_WhileLoop;

public class C02_WhileLoop {
    public static void main(String[] args) {
         /*
        Soru 7 ) Kullanicidan bir sayi alin
        ve bu sayinin rakamlari toplamini yazdirin
         */

        int input=5432;

        int bırlerbasamagı=0;
        int rakamlarToplamı=0;
        int temp=input;



        while (temp>0){
            bırlerbasamagı=temp%10;
            rakamlarToplamı+=bırlerbasamagı;
            temp/=10;
        }
        System.out.println(input +" sayısının rakamlar toplamı :" + rakamlarToplamı);
    }
}
