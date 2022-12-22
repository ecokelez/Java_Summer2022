package day03_scanner;

public class C01_AsciiTable {
    public static void main(String[] args) {

        // Bir tam sayı, bir de char değişkeni oluşturun ve bunların toplamını yazdırın


        int sayı=10;
        char harf='a';
        String str="banana";

        System.out.println(sayı+harf);  // 10a
        System.out.println(sayı*harf); //
        System.out.println(str+harf); // banana
        System.out.println(harf+2);
        System.out.println(str+sayı+harf); // banan10a

        // char yeniHarf= harf+2

        // peki ...konsolde verilen variable' ları kullanarak 10a görmek istiyorsak nasıl yazabiliriz ?

        System.out.println("10a");
        System.out.println(""+sayı+harf);


    }
}
