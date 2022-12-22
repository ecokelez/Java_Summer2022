package day36_inheritanceDataTypeKullanımı;

public class EYanHizmetliler extends BMuhasebe{

    protected int saatUcreti=9;
   protected int gunlukMesai=8;

    protected void maas(){
        System.out.println("Yan hizmetliler: " + (30*gunlukMesai*saatUcreti) + " maas alir");

    }

    protected void issizlikSigorta(){
        System.out.println("Yan Hizmetliler %30 indirimli ozel sigorta yaptirabilir");

    }

    public static void main(String[] args) {

             /*
        overriding child class'daki bir method'un parent class'daki ayni isimdeki methodu
        etkisiz hale getirerek kendisinin spesifik ozelligini ortaya cikarmasidir.
       ** Overriding'i nerede dikkate aliyoruz?
        -- bir obje olusturulurken data turu ve constructor farkli ise
       ** eger bir obje olusturulurken  data turu ve constructor farkli ise
        --objenin ozelliklerini belirlerken 3 konuya dikkat cekmeliyiz
        1- Obje, constructor'in oldugu class'da olusur
        2- objenin ozelliklerini aramaya data turunun oldugu class'dan baslariz
           bu class'da aranan ozellik bulunamazsa parent class'lara bakilir
           ordada bulamazsak CTE verir
        3-  * eger aranan ozellik variable ise buldugumuz ilk degeri yazdiririz
        * aranan ozellik method ise degeri yazdirmadan once
         override edilmis mi diye kontrol etmemiz gerekir
         eger override edildiyse en guncel degeri yazdiriz
         */

        BMuhasebe yh1=new EYanHizmetliler();

        System.out.println(yh1.gunlukMesai); //  Muhasebe-8
        System.out.println(yh1.saatUcreti);  //  Muhasebe-10
        yh1.maas();             // yH
        yh1.ozelSigorta();  // Muhasebe
        yh1.sigorta();     // P
        System.out.println(yh1.isim);  // P
        System.out.println(yh1.soyisim);  // P
        System.out.println(yh1.departman);  // P
       //  System.out.println(yh1.issizlikSigorta);-->
        // aramaya Muhasebeden bas.  ve parent class' a da baktık ve issizlikSigortası bulamadık CTE verdi


        /*
        Data türü ve Constructor'i farkli olan bir objede, obje constructor ismi ile aynı class'ta oluşsa da,
        aramaya Data türünün yazıldığı class'tan başlar.
         Inherit olayı her zamankiyle aynı şekilde çalışır ancak ortada bir method varsa,
         Override edilip edilmediği kontrol edilmeden çalışmaz.
        Normalde parent'tan child gidilmez lakin Override varsa child'da ki method kullanılır.
         */


    }
}
