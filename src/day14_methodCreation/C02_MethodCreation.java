package day14_methodCreation;

import day13_MethodCreation.C04_methodCreation;

public class C02_MethodCreation {
    public static void main(String[] args) {

        //verilen 3 basamaklı sayını rakamları top.yazdıran bir method yazdırın

        int input=423;
        rakamlarıTopla(input);

        C04_methodCreation.topla(6,3);
        C01_MethodCreation.terstenYazdır("Elif");

    }

    public static void rakamlarıTopla(int input) {

        int birlerBasamagi=0;
        int rakamlarToplami=0;
        int temp=input;


        birlerBasamagi=input%10;
        rakamlarToplami+=birlerBasamagi;
        input/=10;

        birlerBasamagi=input%10;
        rakamlarToplami+=birlerBasamagi;
        input/=10;

        birlerBasamagi=input%10;
        rakamlarToplami+=birlerBasamagi;
        input/=10;

        System.out.println("Gırdıgınız " + input + " sayısının rakamlar toplamı : "+ rakamlarToplami);











    }
}
