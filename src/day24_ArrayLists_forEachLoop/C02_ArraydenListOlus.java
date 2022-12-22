package day24_ArrayLists_forEachLoop;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class C02_ArraydenListOlus {
    public static void main(String[] args) {
             /*
        icinde 200 tane 1000'den kucuk pozitif tamsayi olan bir list olusturun
        kullanicidan bir sayi isteyip
        listede var olup olmadigini kullaniciya yazalim

         */

        Random rnd=new Random();
        int sayı=0;
        List<Integer>sayıListei=new ArrayList<>();

        while(sayıListei.size()<200){
            sayı= rnd.nextInt(1000);
            if (!sayıListei.contains(sayı)){
                sayıListei.add(sayı);
            }
        }
        System.out.println(sayıListei);

        boolean bıldıMı=false;
        int tahmınSayısı=1;
        Scanner sacn=new Scanner(System.in);

        while(!bıldıMı) {      // bıldıMi==false

            System.out.println("Lutfenbır sayı tahmınınde bulununuz");
            sayı = sacn.nextInt();

            if (sayıListei.contains(sayı)) {
                System.out.println("Tebrıkler" + tahmınSayısı + " adet tahmınde bır sayı buldunuz");
                bıldıMı = true;

            } else {
                System.out.println(tahmınSayısı + " adet sayi soylediniz ama hic biri listede yok");
                tahmınSayısı++;

            }

        }
    }
}
