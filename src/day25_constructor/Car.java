package day25_constructor;

public class Car {
    /*
        Bu class bizim kaliphanemiz
        bir araba olusturmak icin ihtiyacimiz olan
        variable ve method'lari bu class'da belirleriz
        sonra farkli class'larda araba olusturmamiz gerekirse
        bu class'dan bir obje olusturup
        burada belirlenen variable ve method'lara gore araba uretiri

        */


    public String marka="Marka belirtilmedi";  // default degerlerı olarak atadık
    public String model="Model belirtilmedi";

    public int yıl;
    public int fiyat;

    public void benzinliArac(){
        System.out.println("Bu arac benzınlı motora sahıptır");

    }

    public void maxHız(int hız){

        System.out.println("Bu araba max"+ hız+ "km hız yapar");
    }
}
