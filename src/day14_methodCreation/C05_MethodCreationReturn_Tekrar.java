package day14_methodCreation;

import java.util.Scanner;

public class C05_MethodCreationReturn_Tekrar {

    public static void main(String[] args) {

        // kullanicidan sehir ismini ve dogum tarihini alip
        // bunlari programda kullanacagimiz formatta bize donduren bir method olusturun
        // Sehir ismini programimizda buyuk harf olarak,
        // tarihi ise 2022-06-30 seklinde kullanmak istiyoruz



        String sehır=sehırYaz();
        String tarıh=tarıhYaz();


        System.out.println("sehır = " + sehır);
        System.out.println("tarıh = " + tarıh);

    }

    private static String sehırYaz() {
        Scanner scan=new Scanner(System.in);
        System.out.println("Bır sehır adı gırınız");
        String sehırAdı=scan.nextLine().toUpperCase();

        return sehırAdı;
    }

    private static String tarıhYaz() {
        String tarıh="";
        Scanner scan=new Scanner(System.in);
        System.out.println("Yıl gırınız");
        int yıl= scan.nextInt();

        if (yıl>1900 || yıl<2100){
             tarıh=yıl+"-";
        }else  System.out.println("Gecerlı bır yıl gırınız");

        System.out.println("Yılın kacıncı ay oldugunu tamsayı olarak yazınız");
        int ay= scan.nextInt();
        if (ay<0 || ay>12){
            System.out.println("Gecerlı bır aralıkta ay no  gırınız");
        } else if (ay<10) {
            tarıh=tarıh+"0"+ay+"-";
        }else tarıh=tarıh+ay+"-";

        System.out.println("Gecerlı bır gun sayısı  gırınız");
        int gun= scan.nextInt();

        if (gun<1 || gun>31){
            System.out.println("Lutfen gun  olarak 1-31 arasında bır sayı gırınız");
        } else if (gun<10) {
            tarıh=tarıh+"0"+gun;
        }else tarıh=tarıh+gun;

    return tarıh;



    }
}
