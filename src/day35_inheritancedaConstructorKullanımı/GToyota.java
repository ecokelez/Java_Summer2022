package day35_inheritancedaConstructorKullanÄ±mÄ±;

public class GToyota {

    GToyota(){
        System.out.println("Toyota parametresiz const.");
    }

    GToyota(String isim){
        // super(isim); extends olmadigi icin super constructor call'u java kabul etmez
        System.out.println("Toyota parametreli const.");
    }



}
