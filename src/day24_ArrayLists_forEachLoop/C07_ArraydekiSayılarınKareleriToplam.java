package day24_ArrayLists_forEachLoop;

public class C07_ArraydekiSayılarınKareleriToplam {
    public static void main(String[] args) {

        int[] sayilar= {2,3,4,1,5,7,6,5,4,3};

        int toplam=0;

        for (int each:sayilar
             ) {
            toplam+=each*each;
        }

        System.out.println("kareler toplamı:" + toplam);
    }
}
