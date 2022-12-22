package day30_immutable_date;

import java.time.LocalDate;
import java.time.Month;

public class C03_Date1 {
    public static void main(String[] args) {

        LocalDate tarih=LocalDate.now();
        System.out.println(tarih);   //  2022-07-24

        System.out.println( tarih.getDayOfYear());  // 205

        System.out.println(tarih.getDayOfWeek()); // SUNDAY
        System.out.println(tarih.getMonthValue()); // 7
        System.out.println(tarih.isLeapYear());  // false


        LocalDate tarih2=LocalDate.of(2017,2,6);
        System.out.println(tarih2);

        LocalDate tarih3=LocalDate.of(2021, Month.SEPTEMBER,20);
        System.out.println(tarih3);                                         //  2021-09-20

        System.out.println(tarih.plusDays(100));

        System.out.println(tarih2.plusYears(4).plusMonths(7).plusDays(14));//2021-09-20

        System.out.println(tarih3.minusWeeks(44));  // 2020-11-16

        System.out.println(tarih3.isAfter(tarih2));  // true


        // iki farkli dogum gunu girildiginde
        // hangisinde doganin daha buyuk oldugunu bulunuz
        // tarih2 ve tarih3 icin yapalim

        if (tarih2.isAfter(tarih3)){
            System.out.println(tarih3 + " tarihinde dogan daha buyuk");
        }else if (tarih2.isBefore(tarih3)){
            System.out.println(tarih2 + " tarihinde dogan daha buyuk");
        }else System.out.println("Her iki tarih esıt");

    }
}
