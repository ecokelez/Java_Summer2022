package day35_inheritancedaConstructorKullanÄ±mÄ±;

public class KDizelCorolla extends HCorolla{


    KDizelCorolla(){
        System.out.println("KDizelCorolla parametresiz const.");
    }


    KDizelCorolla(String isim){
        super(isim);
        System.out.println("KDizelCorolla parametreli const.");
    }

    public static void main(String[] args) {
        KDizelCorolla obj1=new KDizelCorolla("Hasan");
    }

}
