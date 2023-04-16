package day18_WhileLoop;

public class C02_WhileLoop {
    public static void main(String[] args) {
         /*
        Soru 7 ) Kullanicidan bir sayi alin
        ve bu sayinin rakamlari toplamini yazdirin
         */

        int input=5432;

        int birlerbasamagi =0;
        int rakamlarToplami=0;
        int temp=input;



        while (temp>0){
            birlerbasamagi =temp%10;
            rakamlarToplami+= birlerbasamagi;
            temp/=10;
        }
        System.out.println(input +" sayısının rakamlar toplamı :" + rakamlarToplami);
    }
}
