package day39_exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class C02_NestedTryCatchException {

            /*
       Su dosya yolunda bir txt dosyassı var ben onu okumak istiyorum,
   sen de bunu koduma dahil et,bunu kodumuza dahil edebilmemiz ıcın bır obje olusturmamız lazım (fis),
      bir class dan olsuturacagımız objeyle o clas'taki methodlara ulasabiliyorudk,
    dolayısıyla ilk yapmamız gereken sey obje olusturmak, yani biz  bu objeyı olustur.da,
    ben o dosyada yazanları ekranda goremem, fakat Java  bu kod sayesinde -->
    14. satır sayeysinde o dosyaya ulasabiliyor,daha okumaya baslamadı ama artık ulasabiliyor,

   Buradaki problem Java ya dısarıdan ("src/day39_exceptions/Test.txt") bilgi veriyorsunuz,
  ama Java size guvenmiyor - ya o yola gittigimde dosya yoksa ne olacak,
   ya bu adreste doya yoksa ya da bozuksa -
   o vakit sizin bu Java' nın ongorsune karsı Java yı rahatlatmanız gerekir,
    bunun icin iki yol vardır:
            1- Metod signature 'a - throw keyword gibi - hangi hatayı bekledıgınızı soyleyebilirisniz,
            2-Biz bunu tam anlamıyla handle edip, hehrhangi bir sorun cıkmaması ıcn try-catch yapabil.
         */


    public static void main(String[] args) {
        int k;

        try {
            FileInputStream fis=new FileInputStream ("src/day39_exceptions/Test.txt");

            while((k=fis.read())!=-1){
                System.out.print((char)k);
            }

        } catch (FileNotFoundException e) {
            System.out.println("Dosya bulunamadı");
        }catch (IOException e) {
            System.out.println("Dosyadan biligler okunamadı");
        }
    }
}









