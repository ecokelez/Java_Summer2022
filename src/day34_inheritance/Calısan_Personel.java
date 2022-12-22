package day34_inheritance;

public class Calısan_Personel {

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

