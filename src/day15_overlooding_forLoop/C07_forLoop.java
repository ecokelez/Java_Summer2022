package day15_overlooding_forLoop;

public class C07_forLoop {

    public static void main(String[] args) {

        C06_StringTersCevirme.tersYazdır("ERSOY");

        // 100'den 1'e kadar(sinirlar dahil) 8 ile bolunebilen sayilari yazdirin

        for (int i = 100; i >=1 ; i--) {

            if (i%8==0){
                System.out.print("  " + i);
            }

        }

    }
}
