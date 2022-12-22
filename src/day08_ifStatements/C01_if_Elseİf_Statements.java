package day08_If_Statements;

import java.util.Scanner;

public class C01_if_Elseİf_Statements {

    public static void main(String[] args) {

        /*
        Soru 5) Kullanicidan gun ismini yazmasini isteyin.
           Girilen isim gecerli bir gun ise gun isminin 1.,2. ve 3.harflerini---
             ---ilk harf buyuk diger ikisi kucuk olarak yazdirin,
          gun ismi gecerli degilse “Gecerli gun ismi giriniz” yazdirin

         */


        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir gun ismi giriniz");
        String gun= scan.nextLine().toLowerCase();

        if(gun.equals("pazartesi")){
            System.out.println("Paz");
        } else if (gun.equals("salı")) {
            System.out.println("Salı");
        } else if (gun.equals("carsamba")) {
            System.out.println("Car");
        } else if (gun.equals("persembe")){
            System.out.println("Per");
        } else if (gun.equals("cuma")) {
            System.out.println("Cum");
        } else if (gun.equals("cumartesi")) {
            System.out.println("Cum");
        } else if (gun.equals("pazar")) {
            System.out.println("Paz");
        }else{
            System.out.println("Lutfen gecerli bir gun ismi giriniz");
        }


    }
}
