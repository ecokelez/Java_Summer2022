package day38_exceptions;

public class C02_Exceptions {
    public static void main(String[] args) {
        int a=1000;
        int b=50;
        int sayac=1;

        /*
        try blogu ; yapmaya calistigimiz ama risk oldugunu dusundugumuz islemleri yazmak icin kullanilir
        catch 'den sonraki parantez; karsilasmayi bekledigimiz exception turunu javaya soylemek icin kullanilir
        catch blogu:Javaya soyledigimiz exception(istisnayi durum) gerceklesirse javanin yapmasini istedigimzi islem
         */
        while (sayac<100){

            try {
                System.out.println(a/b);
            } catch (ArithmeticException e) {
                System.out.println("payda 0 oldu,dikkatli ol");;
            }


            b--;
            sayac++;
        }
    }
}
