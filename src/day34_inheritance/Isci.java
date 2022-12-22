package day34_inheritance;

public class Isci extends Personel{
     /*
    Normal hayatimizda parent cocuk sahibi olmaya karar verebilir
    Java'da ise child class'lar ozelliklerini inherit etmek istedikleri
    class'i kendilerine parent edinirler.
    mesela isci class'ini olusturunca nelere ihtiyaci var diye dusunsek
    Personel class'indaki tum variable ve method'lara ihtiyaci
    oldugunu gorebiliriz.
    BU durumda yeniden o variable ve method'lari olusturmak yerine
    Personel class'ini kendimize parent ediniriz

    Bir class'i parent edinmek icin extends keyword kullanmaliyiz

    bir class baska bir class'i parent edindiginde
    1- parent class'daki tum ozelliklere (variable + method) otomatik olarak sahip olur
    2- Parent class'daki ozelliklerden bazilarini kendine uyarlayabilir
    3- Parent class'da olmayan bazi yeni ozellikler olusturabilir
    not: parent class'daki ozelliklerden hicbirini reddedemez ama degistirebilir
     */

    int persNo=1001;

    public static void main(String[] args) {
        Isci amele1=new Isci();
        System.out.println(amele1.isim); //Isim belirtilmedi
        // kendi Class'ımızda isim variable'ı  olmadgı ıcn Parent' a gidilir ve
       //  ısım variable alınnır,İsim belirtilmedi bilgisine ulasılır

        amele1.isim="Selim";
        System.out.println(amele1.persNo); // 1001 kendi class'imizda varsa onu kullanir


        System.out.println(amele1.persNo); // yularıda  tanımladık ve atadık
                                        // kendi Classımızda varsa onu kullanırız,
                                        // yoksa Parent a gidilir

        amele1.maas();      //  Tum personelin maası
                            //Sonra asagıda maas methodunu olusturduk
                          // "Iscıler minumum 15 euro saat ucreti alır"


       amele1.ozelSigorta();//Icilerden isteyene %50 indirim yapılır

    }
    public void maas(){  // isci Class'ının maasını spesifiklestlrmek ıstersek ve
                        // kendne ozgu maas methodu varsa
                        // aynı isimde yenı bır method olusturlur

        System.out.println("Iscıler minumum 15 euro saat ucreti alır");
    }

   public void ozelSigorta(){

        System.out.println("Iscilerden isteyene %50 indirim yapılır");
   }

}


