package day14_methodCreation;

public class C02_MethodCreation_Tekrar {

    public static void main(String[] args) {
        //verilen 4 basamaklı sayını rakamları top.yazdıran bir method yazdırın

        int ınput=145;

        rakamTop(ınput);
        rakamTop(888);


    }

    public static void rakamTop(int ınput) {
        int bırlerBasamagı=0;
        int rakamlarToplamı=0;
        int ınput1=ınput;



        bırlerBasamagı=ınput%10;
        rakamlarToplamı+=bırlerBasamagı;
        ınput/=10;

        bırlerBasamagı=ınput%10;
        rakamlarToplamı+=bırlerBasamagı;
        ınput/=10;

        bırlerBasamagı=ınput%10;
        rakamlarToplamı+=bırlerBasamagı;
        ınput/=10;



        System.out.println(" Gırılen  " + ınput1 + " sayısının rakamlar toplamı : "+ rakamlarToplamı);



    }

}
