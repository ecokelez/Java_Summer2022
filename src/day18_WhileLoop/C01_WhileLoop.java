package day18_WhileLoop;

public class C01_WhileLoop {
    public static void main(String[] args) {
         /*
        Soru 4 ) Kullanicidan baslangic ve bitis haflerini alin
        ve baslangic harfinden baslayip bitis harfinde biten
        tum harfleri buyuk harf olarak ekrana yazdirin.
        Kullanicinin hata yapmadigini farz edin.
         */

        char ilkHarf= 'e';
        char sonHarf='s';

        char temp=ilkHarf;  // Ilk  harf degerını korumak ıcın , bozmamak ıcın bu degerı olusturduk

        String buyult="";

        while (temp<=sonHarf){
                                            //char larda prımıtve data turu oldugu ıcın to UpperCase metodu olmaz
            buyult=(temp+"").toUpperCase();  // String bır ıfadeyı char olarak kullanabıllmemız ıcın
                                            // temp sonuna "" ekledık  ve paranteze aldık

            System.out.print(buyult+" ");
            temp+=1;

        }



    }
}
