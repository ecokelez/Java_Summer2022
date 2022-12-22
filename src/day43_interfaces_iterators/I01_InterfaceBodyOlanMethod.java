package day43_interfaces_iterators;

public interface I01_InterfaceBodyOlanMethod {

    void motor();
    public void yakıt();
    public abstract String aku();

    /*

        Normal bir class'da oldugumuzu duusnursek
    2 tane access modifier kullanma ihtimali olamaz

        Asagidaki method'da goreceginiz gibi interface'de istisnai olarak
    body'si olan methodlar olusturulabilir.
    Bu ozellik Java 8 'en sonra kullanilmaya baslamistir.
        Bir interface'e yeni bir method eklememiz gerektiginde
    eskiden beri bu interface'i implement eden tum class'lara gidip
    yeni eklenen method'u override etmemiz gerekirdi

        Bu ozellik sayesinde basina default veya static keyword ekleyerek
    interface'de yeni ve body'si olan bir method olusturursak
    bu method'un child class'lar tarafindan override edilme mecburiyeti olmaz
    Ve eskiden implement etmis class'lari degistirmemiz gerekmez

    Bu istisnai bir durumdur ve interface icin olusturulan genel
    kurallari bozmaz
         Bu method'larin body'si olsa da bunlara concrete method denmez
    ama override edilme mecburiyetleri yoktur.

       Buradaki default kelimesi access modifier degil
    istisnai durumun belirtilmesi icindir.
    O zaman nicin 2 keyword (static ve default) tanimlanmistir ?
    Bu iki farkli kelimenin amaci;
    child class'lardan bu method'a nasil erisilebilecegini belirlemek icindir

    static keyword kullanilirsa , child class'dan bu method'a erismek icin
    InterfaceAdi.methodAdi yeterli olur
    default keyword kullanilirsa, method'a erismek icin obje olusturulmalidir.
     */

    public default void teker(){
        System.out.println("Tum arabaların tekeri vardır");
    }

    public static void direksiyon(){
        System.out.println("static....Tum arabalarin direksiyonu vardir");
    }


}
