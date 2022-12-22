package day26_constructor;

public class Araba {


    public String marka="Marka belirtilmedi";  // default degerlerı olarak atadık
    public String model="Model belirtilmedi";
    public int yıl;
    public int fiyat;

    public Araba(String markaR, String modelR, int yilR, int fiyatR) {
        marka=markaR;
        model=modelR;
        yıl=yilR;
        fiyat=fiyatR;
    }
    public Araba(){
    }
    /*
    biz herhangi bir constructor olusturdugumuzda
    Java default constructor'i siler
    eger biz projemizde bir sorun yasanmasini istemiyorsak
    mutlaka default constructor yerine
    parametresiz bir constructor olusturmaliyiz
     */
    public void benzınlıArac(){
        System.out.println("Bu arac benzinli motora sahiptir");
    }
    public void maxHiz(int hiz){
        System.out.println("Bu araba max " + hiz + " km hiz yapar" );
    }




    public void benzinliArac(){
        System.out.println("Bu arac benzınlı motora sahıptır");

    }

    public void maxHız(int hız){
        System.out.println("Bu araba max"+ hız+ "km hız yapar");
    }
}


