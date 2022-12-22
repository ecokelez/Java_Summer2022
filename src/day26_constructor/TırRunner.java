package day26_constructor;

public class TırRunner {
    public static void main(String[] args) {

        Tır tır1=new Tır();
        System.out.println("tır1 ozellıkleri:"+ tır1.toString());

        Tır tır2=new Tır("Mercedes","Axor500",2022,1500000);
        System.out.println("Tır2 bilgiler "+ tır2.toString());

        Tır tır3=new Tır("Volvo","x450",2012,900000);
        System.out.println("Tır3 bilgileri"+tır3.toString());

        Tır tır4=new Tır("Scania","s540");
        System.out.println("Tır4 bilgileri"+tır4.toString());


        // yıl ve fiyat bilgilerini yazmadıgımız ıcın
        // Java default degrler atadı yanı=0
    }
}
