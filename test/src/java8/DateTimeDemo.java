package java8;

import java.time.*;

public class DateTimeDemo {
    public void localDateTimeTest() {
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println("当前日期时间" + localDateTime);
        LocalDate localDate = localDateTime.toLocalDate();
        System.out.println("当前日期" + localDate);
        LocalTime localTime = localDateTime.toLocalTime();
        System.out.println("当前时间" + localTime);

        Month month = localDateTime.getMonth();
        int day = localDateTime.getDayOfMonth();
        int seconds = localDateTime.getSecond();

        System.out.println("月: " + month + ", 日: " + day + ", 秒: " + seconds);

        LocalDateTime date2 = localDateTime.withDayOfMonth(10).withYear(2012);
        System.out.println("date2: " + date2);

        LocalTime date5 = LocalTime.parse("20:15:30");
        System.out.println("date5: " + date5);
    }

    public void zoneDateTime() {
        ZonedDateTime date1 = ZonedDateTime.parse("2015-12-03T10:15:30+05:30[Asia/Shanghai]");
        System.out.println("date1: " + date1);

        ZoneId id = ZoneId.of("Europe/Paris");
        System.out.println("ZoneId: " + id);

        ZoneId currentZone = ZoneId.systemDefault();
        System.out.println("当期时区: " + currentZone);
    }
}
