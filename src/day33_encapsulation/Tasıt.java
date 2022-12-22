package day33_encapsulation;

public class Tasıt {

    private String tasıtTuru;
    private boolean muayenesıVarMı;
    private int yıl;



    public String getTasıtTuru() {
        return tasıtTuru;
    }
        /*
        // getter method'u da tek bir satirlik islem yapiyor
       // baska class'larin private oldugu icin erisemedigi
       // tasitTuru bilgisini, class icinden alip
       // istenen farkli class'lar return ediyor

        */
    public void setTasıtTuru(String tasıtTuru) {
        this.tasıtTuru = tasıtTuru;
    }
    /*
    bizim gönderdiğimiz TasıtRunner Classından Tır bilgisi argumentını
    parametre olan String tasıtTuru parametresıne PassByValue ozellıgı ıle esıtlıyor
    Daha sonra bu parametre olarak gelen tasıtTurunu  instence variable'a yani
    this.tasıtTuru ne  atıyor.
    Boylece tast1 objesının instence tasıtTuru degerı= Tır oluyor */

    //return olmadığı icin bu methodun cağırıldığı tasitrunner classinden yazdirilamaz
    //burada bir satırlık islem yapıyor o bir satırlık islemde gonderdıgımız argumentı
    // parametreye esıtleyıp instance variable(this.) atama yapıyor

    public boolean isMuayenesıVarMı() {
        return muayenesıVarMı;

        // boolean variabe'ler icin olusturulan methodlarinin ismi
        // isVariableIsmi seklinde olur
    }

    public void setMuayenesıVarMı(boolean muayenesıVarMı) {
        this.muayenesıVarMı = muayenesıVarMı;
        // this kelimesını--> egere atanacak degrle variable ismi aynı olursa
        // thıs kullanılır => this.muayenesıVarMı = muayenesıVarMı;

    }

    public int getYıl() {
        return yıl;
    }

    public void setYıl(int yıl) {
        this.yıl = yıl;
    }
}
