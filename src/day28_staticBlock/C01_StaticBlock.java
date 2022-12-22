package day28_staticBlock;

public class C01_StaticBlock {


    static int sayı;
    static {
              /*
        * Static block class uyelerinin tamamindan once calisir
        (main method'dan bile once)
        ** static block class olusturuldugunda calisir
        genellikle de class'la ilgili on ayarlamalar
        veya static variable'lara deger atamak icin kullanilir.
        *** Static block'larin class icerisinde nerede oldugu onemli degildir
        once static block'lar calisir
        birden fazla static block varsa, yukaridan asagi dogru calisir
         */

        System.out.println("static bolck calıstı");

        sayı=10;
    }


    public static void main(String[] args) {

        System.out.println("Main method calıstı");
        System.out.println(sayı);

    }

    static {

        System.out.println("main method altındaki static bolck calıstı");
    }
}
