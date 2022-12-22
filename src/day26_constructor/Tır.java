package day26_constructor;

public class Tır {
    public String marka="Marka belirtilmedi";
    public String model="Model belirtilmedi";
    public int yıl;
    public int fiyat;

    public Tır(String marka, String model) {
        this.marka = marka;
        this.model = model;
    }

    public Tır(String marka, String model, int yıl, int fiyat) {
        this.marka=marka;
        this.model=model;
        this.yıl=yıl;
        this.fiyat=fiyat;



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


        //Tır2 dekı markayı buradakı markaya atamam gereklıdır,
        // yani parametre olarak gelen markayı yukarıdakı objeye ait
        // buradakı instance variable esıtlemem gerekır


    }




    public Tır(){

    }

    /*
    biz herhangi bir constructor olusturdugumuzda
    Java default constructor'i siler
    eger biz projemizde bir sorun yasanmasini istemiyorsak
    mutlaka default constructor yerine
    parametresiz bir constructor olusturmaliyiz
     */




    @Override
    public String toString() {
        return
                "\nmarka:" + marka +
                "\nmodel:" + model +
                "\nyıl:" + yıl +
                "\nfiyat:" + fiyat;

    }
}
