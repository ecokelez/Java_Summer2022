package day35_inheritancedaConstructorKullanımı;

public class LOgretmen {

   LOgretmen(){
        System.out.println("LOgretmen parametresiz const");
    }

    LOgretmen(String isim){

       this();
        System.out.println("LOgretmen parametreli const");
    }

}
