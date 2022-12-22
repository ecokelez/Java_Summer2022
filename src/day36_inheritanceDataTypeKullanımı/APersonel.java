package day36_inheritanceDataTypeKullanımı;

public class APersonel {
    String isim="İsim belirtilmedi";
    String soyisim="Soyisim belirtilmedi";
    String departman="Departmanm belirtilmedi";


    protected void maas(){
        System.out.println("Tum personelimiz maas alir");
    }


    protected void sigorta(){
        System.out.println("Tum personelimiz sigorta yapilir");
    }


}
