package day26_constructor;

import day25_constructor.Car;

public class TaxiRunner {

    public static void main(String[] args) {
        // bir gun onceki Car class'indan obje olusturalim
        /*
          Farkli bir package'daki bir class'dan obje olusturdugumuzda
          access modifier'lari da dikkate almaliyiz
         */

        Car car1=new Car();
        System.out.println("car1.fiyat = " + car1.fiyat);

        /*
         Araba class'indan bir obje olusturdugumda
         eger default constructor kullanildiysa
         tum ozellikler icin tek tek deger atamak zorunda kaliriz
         */

        Taxi taxi1=new Taxi();
        taxi1.fiyat=100000;
        taxi1.marka="Mercedes";
        taxi1.yıl=2010;
        taxi1.model="C180";

        System.out.println("Taxi1 bilgileri\nMarka : " + taxi1.marka +"\nModel : " + taxi1.model
                +"\nYil : " + taxi1.yıl+ "\nFiyat : " + taxi1.fiyat);
        /*
          Eger bir objeyi olustururken bazi ozelliklerini
          argument olarak belirtip
          o ozelliklerde bir obje olusturmak istersek
          Java itiraz eder.
          Cunku her class'da default constructor vardir
          ama o da parametresizdir
          bizim yeni ve parametreli constructor(lar)'a ihtiyacimiz var.
         */

        Taxi taxi2=new Taxi("Audi","A5",2016,30000);
        System.out.println("Taxi2 bilgileri\nMarka : " + taxi2.marka +"\nModel : " + taxi2.model
                +"\nYil   : "+taxi2.yıl+ "\nFiyat : " + taxi2.fiyat);

        Taxi taxi3=new Taxi("Opel","Astra",2002,70000);
        System.out.println("Taxi3 bilgileri\nMarka : " + taxi3.marka +"\nModel : " + taxi3.model
                +"\nYil   : "+taxi3.yıl+ "\nFiyat : " + taxi3.fiyat);

        Taxi taxi4=new Taxi("Mercedes","E180",2013,850000);
        System.out.println("Taxi4 bilgileri\nMarka : " + taxi4.marka +"\nModel : " + taxi4.model
                +"\nYil   : "+taxi4.yıl+ "\nFiyat : " + taxi4.fiyat);






    }
}
