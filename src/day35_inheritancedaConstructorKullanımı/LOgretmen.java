package day35_inheritancedaConstructorKullanÄ±mÄ±;

public class LOgretmen {

   LOgretmen(){
        System.out.println("LOgretmen parametresiz const");
    }

    LOgretmen(String isim){

       this();
        System.out.println("LOgretmen parametreli const");
    }

}
