package day30_immutable_date;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class C06_LocalDateTime {
    public static void main(String[] args) {

        LocalDateTime tarihsaat=LocalDateTime.now();

        System.out.println(tarihsaat);  //  2022-07-23T19:42:08.133087200

        System.out.println(tarihsaat.plusMonths(3).plusHours(100));  // 2022-10-27T23:43:36.810185600

        System.out.println(tarihsaat.minusDays(100).plusHours(100));  //  2022-04-18T23:43:36.810185600

        System.out.println(tarihsaat.toLocalDate());  //  2022-07-23






    }
}
