package day35_inheritancedaConstructorKullanımı;

public class Child extends BParent{

    String isim="Child isim belirtilmedi";

    protected String childKulupAdı="Child Kulubu";



    Child(){
        System.out.println("Child constructor calıstı");  // 3
     }

    public static void main(String[] args) {
         AGrandParent gp1=new AGrandParent();
        // bu objeyi olusturmak icin Granpa Cons. calisir,
        // Parent veya Child cons calismaz

         Child child1=new Child();  //  obje olust.
         child1.granpaKlupAdi="Child1"; // 1    // child1 objesiyle ;
                                                // hem grandpa hemde parentdaki variablerı hem görebliilip hemde degistirebiliyorum
                                                 // cunku child clası parent ı extend yaptı,
                                                 // o da grandpa classını extend yaptı

         child1.parentKlupAdi="Child2";         // 2
        // child1 objesi icin Child cons calisir

    /*
        Java'da bir class'i kullanabilmek icin o class'dan obje olusturur, dolayisiyla o class'in constructor'ini
        kullanirdik.

        Java inheritance'da parent class'lardaki ozellikleri kullanabilmek icin o class'larin constructorlarini otomatik
        calistiran bir yapi kurmustur.

        Ornegin biz child class'inda Child class'indan bir obje olusturmak istedigimizde Child constructor'ini kullaniriz.

        Java Child(){} gordugunde once parent'in constructor'ini calistirmam lazim der. Buradan parent constructor'a gider.
        Parent class'inda Parent(){} gorunce once bunun parent'inin yani Grandparent constructor'inin calismasi gerekir der.
        Boylece extends keyword olmayan class'a kadar gider ve oradan baslayarak tum constructor'lari asagi dogru calistirir.
         */

    }

}
