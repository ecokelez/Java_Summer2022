package day26_constructor;

public class Kamyon {


    public String marka="Model belirtilmedi";
    public String model="Marka belirtilmedi";
    public int yıl;
    public int fiyat;

    public Kamyon(String marka, String model, String yıl, int fiyat) {
    this.marka=marka;
    this.model=model;
    this.yıl= Integer.parseInt(yıl);
    this.fiyat=fiyat;

    }

    public Kamyon(String marka, String model) {
        this.marka = marka;
        this.model = model;
    }

    public Kamyon(){

    }
     /*
          bizim temel amacimiz KamyonRunner'da argument olarak girilen degerin
          Kamyon class'inda intstance variable'a atanmasi
          Ancak scope konusunda ogrendigimiz gibi
          Kamyon constructor scope'unda marka oldugu icin
          instance marka'ya gitmiyor
          Bu karisikligi gidermek icin instance variable'lari
          belirli hale getirmemiz lazim
          Java bunun icin this keyword'u olusturmustur
          Genel kullanim acisindan this keyord'u kodu herkesin anlamasini
          kolaylastirdigi icin tercih edilir
         */

    @Override
    public String toString() {
        return  "\nmarka=" + marka +
                "\nmodel=" + model +
                "\nyıl=" + yıl +
                "\nfiyat=" + fiyat ;

    }

        // toString methodu; ogretmenın özellıklerını yazdırmak ııcn
        // her seferınde ugrasmamak ııcn
}

