package day20_Arrays;

import java.util.Scanner;

public class C08_Arrays_S3 {
    public static void main(String[] args) {


        //  Soru 3-Kuulanıcıdan aldıgınız bır ısmın , verilen bir array de  olup olmadıgını da  kontrol edip,
        //  bize true veya false sonucu donen bir method olusturun

        String[] ısımler = {"Başak", "Nurullah", "Fatih", "Adem", "Enes"};
        Scanner scan=new Scanner(System.in);
        System.out.println( "Lutfen bır ısım gırınız");
        String kontrolIsım=scan.nextLine();

        boolean sonuc=contains(ısımler,kontrolIsım);

        if (sonuc){
            System.out.println("Girilen isim listede var");
        }else System.out.println("Girilen isim listede yok");

    }

    private static boolean contains(String[] ısımler,String kontrolIsım) {
        boolean sonucMethod=false;

        for (int i = 0; i <ısımler.length ; i++) {

            if (ısımler[i].equalsIgnoreCase(kontrolIsım)){

                sonucMethod=true;
            }

        }
        return  sonucMethod;
    }
}
