package day34_inheritance;

public class Personel {
     /*
      Eger parent class olacak sekilde tasarladiginiz bir class varsa
      veya ilerde bu class'i parent yapmak isteyenler olabilir diyorsaniz
      variable ve method'larin a
      access modifier'ini protected yaparız
     */




    protected int persNo;
    protected String isim="İsim belirtilmedi";
    protected String departman="Departman belirtilmedi";



    public void maas(){
        System.out.println("Tum personelin maası vardır");

    }
    public void mesai(){
        System.out.println("Tum personel satatusune gore mesai yapar");
    }

    public void fazlaMesaiUcreti(){

        System.out.println("Personel fazla mesai ucretını statusune gore alır");
    }

}
