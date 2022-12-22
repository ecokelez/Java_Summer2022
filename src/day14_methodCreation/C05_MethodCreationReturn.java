package day14_methodCreation;

import java.util.Scanner;

public class C05_MethodCreationReturn {
    public static void main(String[] args) {
        /*
          Eger bir class'in icerisinde herhangi bir hesaplama yapip
          bunu da kalici olarak saklamak istersek
          kodumuzu sade ve anlasilir tutmak icin
          islemi bir method'da yapip
          sonucunu main method'a dondurebiliriz
          Return type'i void olmayan bir method'un sonucunu
          main method'da bir variable'a atama yaparsak
          programin geri kalaninda bu yeni degeri kullanma sansimiz olur

         */
        // kullanicidan sehir ismini ve dogum tarihini alip
        // bunlari programda kullanacagimiz formatta bize donduren bir method olusturun
        // Sehir ismini programimizda buyuk harf olarak,
        // tarihi ise 2022-06-30 seklinde kullanmak istiyoruz

        String sehır=sehırAl();
        String tarıh=tarıhAl();

        System.out.println("Gırıdgınız sehır :"+ sehır);
        System.out.println("Gırdıgınız tarıh : "+ tarıh);
    }


    public static String sehırAl() {
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen sehır adı gırınız");
        String sehırAdı=scan.next().toUpperCase();
        return sehırAdı;
    }


    public static String tarıhAl() {
        String tarıh="";
        Scanner scan=new Scanner(System.in);
        System.out.println("yıl gırınız");
        int yıl =scan.nextInt();

        if (yıl>1900 || yıl<2100){
            tarıh=yıl+"-";
        }else{
            System.out.println("Yıl ıcın gecerlı bır sayı yazmalısınız(1900-2100)");
        }

        System.out.println("Yılın kacıncı ay oldugunu tamsayı olarak yazınız");
        int ay=scan.nextInt();

        if (ay<0 || ay>12){
            System.out.println("Ay no 1-12 arasında olmalıdır");
        }else if(ay<10){
            tarıh=tarıh+"0"+ay+"-";
        }else{
            tarıh=tarıh+ay+"-";
        }
        System.out.println("Ayın kacıncı gun oldugunu tamsayı olarak yazdırın");
        int gun=scan.nextInt();
        if (gun<0 || gun>31){
            System.out.println("Lutfen gun  olarak 1-31 arasında bır sayı gırınız");
        } else if (gun<10) {
            tarıh=tarıh+"0"+gun;
        }else{
            tarıh=tarıh+gun;
        }
        return tarıh;
    }


}


