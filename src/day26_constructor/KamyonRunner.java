package day26_constructor;

public class KamyonRunner {

    public static void main(String[] args) {

        Kamyon kamyon1=new Kamyon();
        System.out.println(kamyon1);

    Kamyon kamyon2=new Kamyon("Mercedes","3240","2015",900000);
        System.out.println("kamyon2 bilgileri:"+ kamyon2.toString());
Kamyon kamyon3=new Kamyon("Scania","360","2005",780000);
        System.out.println("kamyon3 bilgileri:"+ kamyon3);

Kamyon kamyon4=new Kamyon("Volvo","s540");
        System.out.println(kamyon4);

        Kamyon kamyon5=new Kamyon();
        System.out.println(kamyon5);

    }

}
