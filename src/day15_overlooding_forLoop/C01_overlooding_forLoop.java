package day15_overlooding_forLoop;

public class C01_overlooding_forLoop {
    public static void main(String[] args) {
        int sayı1=10;
        int sayı2=5;

        int sonuc=carpGetir(sayı1,sayı2);

        System.out.println(" Illa da sonucu gorelım dıyenlere main method ıcınde : "+ sonuc);

    }


    private static int carpGetir(int sayı1, int sayı2) {
        int sonuc=sayı1*sayı2;

        System.out.println(" Illa da sonucu gorelım dıyenlere dıger method ıcınde : "+ sonuc); // ekstra olarak yazıldı

        return sonuc;



    }


}
