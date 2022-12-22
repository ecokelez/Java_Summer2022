package day34_inheritance;

public class Amele extends Calısan_Personel{


    int persNo=1111;

    public static void main(String[] args) {
      Amele amele1=new Amele();
        System.out.println(amele1.isim);  //İsim belirtilmedi
        // isim atadık
        amele1.isim="Ersoy";
        System.out.println(amele1.isim);

        System.out.println(amele1.persNo);

        System.out.println(amele1.departman);// Departman belirtilmedi
        // sonra departman atadık
        amele1.departman="IT-QA";
        System.out.println(amele1.departman);


        amele1.maas(); // Tum personelin maası vardır
        //Sonra asagıda maas methodunu olusturduk ve

        amele1.ozelSigorta(); //Amelelere ozel %50 indirimli sigorta

    }
    public void maas(){
        System.out.println("Ameleler 20 euro saat ucreti alır");
    }


    public void ozelSigorta(){
        System.out.println("Amelelere ozel %50 indirimli sigorta");
    }
}
