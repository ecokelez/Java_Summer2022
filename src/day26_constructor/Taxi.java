package day26_constructor;

public class Taxi {
    public String marka="Marka belirtilmedi";
    public String model="Model belirtilmedi";
    public int yıl;
    public int fiyat;

    public Taxi(String markaR, String modelR, int yılR, int fiyatR) {
        marka=markaR;
        model=modelR;
        yıl=yılR;
        fiyat=fiyatR;
    }

   public Taxi(){

   }
    
     /*
    biz herhangi bir constructor olusturdugumuzda
    Java default constructor'i siler
    eger biz projemizde bir sorun yasanmasini istemiyorsak
    mutlaka default constructor yerine
    parametresiz bir constructor olusturmaliyiz
     */

    public void benzinliArac(){
        System.out.println("Bu arac benzınlı motora sahıptır");

    }

    public void maxHız(int hız){
        System.out.println("Bu araba max"+ hız+ "km hız yapar");
    }
}


