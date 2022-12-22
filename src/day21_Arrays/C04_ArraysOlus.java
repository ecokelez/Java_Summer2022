package day21_Arrays;

import java.util.Scanner;

public class C04_ArraysOlus {
    public static void main(String[] args) {


        //Soru 4- Kullanicidan bir array’in boyutunu 
        // ve tum elementlerini alarak bir array olusturup, bu array’i bize donduren bir method olusturun
        
        int [] sayılar=arrayOlustur();
    }

    private static int[] arrayOlustur() {
        Scanner scan=new Scanner(System.in);
        System.out.println("Kac elemanl ıbır array olusturmak ıstersınız");
        int uzunluk= scan.nextInt();
        int[]olusturulan=new int[uzunluk];  // Array' ın uzunlugunu olusturmak ıcın yukarıda
                                            // scanner ıslemını yaptık  ve int uzunluk degerını atadık ve
                                            // artık bu uzunlukta array olsuturabılıp ve dondurebılırız


        for (int i = 0; i <uzunluk ; i++) {
            System.out.println(i +". index icin sayi giriniz" );
            olusturulan[i]=scan.nextInt();
        }
        return olusturulan;


            
        }
    }

