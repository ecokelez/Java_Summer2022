package day35_inheritancedaConstructorKullanımı;

public class HCorolla extends GToyota{


    HCorolla(){
        System.out.println("HCorolla parametresiz const.");
    }


    HCorolla(String isim){
        super(isim);
        System.out.println("HCorolla parametreli const.");
    }
}
