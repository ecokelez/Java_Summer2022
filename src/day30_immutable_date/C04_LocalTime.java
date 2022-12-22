package day30_immutable_date;

import java.time.LocalTime;
import java.util.InputMismatchException;

import static java.time.LocalTime.now;

public class C04_LocalTime {
    public static void main(String[] args) throws InputMismatchException, InterruptedException {

        LocalTime time1= LocalTime.now();

                 /*
         Bizim olusturdugumuz date ve time
         canli saat veya tarih degildir
         LocalTime.now(); kullandigimiz satirda
         o anki tarih veya saati alip
         bizim variable'imiza store eder.
         time1 variable'inin degeri SABITTIR
         */

        Thread.sleep(3000); //  3 sanıyelık bekletme , uyku modu

        time1=LocalTime.now();
        System.out.println(time1);  // 19:36:16.544550

        System.out.println(time1.getSecond());  // 16

        System.out.println(time1.plusSeconds(1000));

        System.out.println(time1.minusMinutes(200));  // 16:16:16.544550

        System.out.println(time1.withHour(3));  // saati 3 yaptı--> 03:36:16.544550


    }

}
