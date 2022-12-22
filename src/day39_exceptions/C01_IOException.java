package day39_exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class C01_IOException {
    public static void main(String[] args) throws FileNotFoundException {

        /*
        Java'dan bilgisayarimizdaki bir dosyaya erismek istiyorsak
        FileInputStream Class'indan yardim aliriz.
        Ayni sekilde Java'dan bilgisayarimizdaki bir dosyaya ekleme ya da update
        yapmak istersek FileOutputStream Class'indan yardim aliriz.
        */

        FileInputStream fis=new FileInputStream("src/day39_exceptions/Test.txt");
        /*
    Goruldugu gibi compile time'da altini kirmizi cizen her durum CTE degildir.
    Java'da bazi exceptionlar da Compile Time Exception'dir.
    Ozellikle dosya okuma ve yazma ile ilgili exceptionlar
    Compile Time Exception'dir.

    Compile Time Exception olustugunda Java cozum icin 2 ihtimal onerir:
    1- try-catch ile cevrelemek
    2- method signature'ina throws keyword ile beklenen exception turunu yazmak.

    throws exception; sadece olayin farkinda oldugumuzun deklarasyonudur.
    Exception'in handle edilmesinde hicbir rolu yoktur.
    Yani try-catch ile kontrol altina aldigimiz (handle) exceptionlarda
    kod calismaya devam ediyordu.
    Ancak throws exception yazdigimizda java bir exception ile karsilasirsa
    yine hicbir sey yapmamisiz gibi hata mesaji yayinlayip calismayi durdurur.
    */

    }
}
