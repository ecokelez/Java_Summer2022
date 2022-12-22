package day33_encapsulation;

public class ArabaRunner {
    public static void main(String[] args) {
        Araba arb1=new Araba();
        /*
        arb1 objesi uzerinden marka variable' na ulasabıldım,
        degıstırebıldım(set) ve yazdırabıldım(get)
         */

        arb1.marka="Toyota";
        System.out.println(arb1.marka);


        /*
         access modifier kullanarak marka variable'ina ulasimi
         tamamen serbest yapabilir veya tamamen engelleyebilirim
         private yaptigimiz modele ise hic ulasamayiz
         yani access modifier ya hep ya hic diyor
        ** arb1.model dedıgımde modeli ne gorebılıyorum ne de degıstırebılıyorum   */

        // model'i degistirelim ama goremeyelim
        // yakiti da gorelim ama degistiremeyelim


        /*   set ve get yetkilerini ozel olarak tanimlamak isterseniz
        *1.adim - ozel yetki tanimlayacaginiz variable'lari private yapin
               private bir dataya baska classlardan ulasmak mumkun olmadigindan
        ** 2.adim - set yetkisi icin setter, get yetkisi icin getter methodlari olusturalim */



        arb1.setModel("Corolla");   // string bir deger gırmelisın--Model olarak Coralla atadık
                                  // Modeli yazdırma imkanımız yok , cunku getter methodu yok


        System.out.println(arb1.getYakıt()); // elektrikli bilgisini yazdıramadık
        // yakıtı degıstıremeyız cunku setter methodu yok

    }
}
