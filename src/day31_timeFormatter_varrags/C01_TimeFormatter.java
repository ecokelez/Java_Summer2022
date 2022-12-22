package day31_timeFormatter_varrags;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class C01_TimeFormatter {
    public static void main(String[] args) {
        LocalDateTime tarihsaat=LocalDateTime.now();
        System.out.println("ilk olusturulan tarih:"+tarihsaat);
        //ilk olusturulan tarih:2022-07-25T21:41:03.101936300

        DateTimeFormatter dtf1=DateTimeFormatter.ofPattern("dd/M/yy  hh:mm");
        System.out.println(dtf1.format(tarihsaat));    //  25/7/22  09:45

        DateTimeFormatter dtf2=DateTimeFormatter.ofPattern("d/MMM/yyyy  HH:mm");
        System.out.println(dtf2.format(tarihsaat));     // -->    25/Tem/2022  21:47

        DateTimeFormatter dtf3=DateTimeFormatter.ofPattern("dd/MMMM/yyyy  HH:mm");
        System.out.println(dtf3.format(tarihsaat));     // -->    25/Temmuz/2022  21:50
    }
}
