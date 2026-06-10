import org.joda.time.*;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

import java.util.Date;


public class JodaTimeApp {

    public static void main(String[] args) {

        // =========================================
        // CURRENT DATE
        // =========================================
        DateTime now = DateTime.now();
        System.out.println("Today: " + now);

        // =========================================
        // CURRENT TIME
        // =========================================
        LocalTime time = LocalTime.now();
        System.out.println("Time: " + time);

        // =========================================
        // CURRENT DATE TIME
        // =========================================
        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println("DateTime: " + dateTime);

        // =========================================
        // FORMAT
        // =========================================
        DateTimeFormatter formatter = DateTimeFormat.forPattern("dd/MM/yyyy HH:mm:ss");
        System.out.println("Formatted: " + formatter.print(dateTime));

        // =========================================
        // PARSE
        // =========================================
        System.out.println("Parsed: " + DateTime.parse("2022-02-20"));

        // =========================================
        // PLUS
        // =========================================
        System.out.println("Plus 10 Days: " + dateTime.plusDays(10));
        System.out.println("Plus 2 Months: " + dateTime.plusMonths(2));

        // =========================================
        // MINUS
        // =========================================
        System.out.println("Minuis 2 Months: " + dateTime.minusMonths(2));

        // =========================================
        // PERIOD
        // =========================================
        Period period = new Period(DateTime.parse("2023-04-05"), DateTime.now());

        System.out.println("Years: " + period.getYears());

        // =========================================
        // DURATION
        // =========================================
        Hours duration = Hours.hoursBetween(new LocalTime(8, 0), LocalTime.now());

        System.out.println("Duration: " + duration.getHours());

        // =========================================
        // CHRONOUNIT
        // =========================================
        LocalDateTime start = new LocalDateTime(2026, 6, 1, 8, 30);
        LocalDateTime end = new LocalDateTime(2026, 6, 2, 10, 45);

        System.out.println("ChronoUnit:");
        System.out.println("-- Hours   : " + Hours.hoursBetween(start, end).getHours());
        System.out.println("-- Minutes : " + Minutes.minutesBetween(start, end).getMinutes());
        System.out.println("-- Days    : " + Days.daysBetween(start, end).getDays());
        System.out.println("-- Months  : " + Months.monthsBetween(start, end).getMonths());
        System.out.println("-- Years   : " + Years.yearsBetween(start, end).getYears());

        // =========================================
        // ZONE
        // =========================================
        DateTimeZone zoned = DateTimeZone.forID("America/Sao_Paulo");

        System.out.println("Zone: " + new DateTime(zoned));

        // =========================================
        // TIME ZONES (ZONEID)
        // =========================================
        DateTimeZone zoneSaoPaulo = DateTimeZone.forID("America/Sao_Paulo");
        DateTimeZone zoneNewYork = DateTimeZone.forID("America/New_York");
        DateTimeZone zoneTokyo = DateTimeZone.forID("Asia/Tokyo");

        DateTime saoPauloTime = new DateTime(zoneSaoPaulo);

        DateTime newYorkTime = saoPauloTime.withZone(zoneNewYork);
        DateTime tokyoTime = saoPauloTime.withZone(zoneTokyo);

        System.out.println("Zones:");
        System.out.println("-- São Paulo : " + saoPauloTime);
        System.out.println("-- New York  : " + newYorkTime);
        System.out.println("-- Tokyo     : " + tokyoTime);

        // =========================================
        // java.util.Date -> LocalDateTime
        // =========================================
        Date legacyDate = new Date();
        LocalDateTime localDateTime = new LocalDateTime(legacyDate);

        System.out.println("Legacy Date: " + legacyDate);
        System.out.println("LocalDateTime: " + localDateTime);

        // =========================================
        // LocalDateTime -> java.util.Date
        // =========================================
        Date convertedDate = localDateTime.toDate();

        System.out.println("Converted Date: " + convertedDate);

        // =========================================
        // LOCALDATETIME -> INSTANT
        // =========================================
        Instant instant = LocalDateTime.now().toDateTime().toInstant();
        System.out.println("Converted to Instant: " + instant);

        // =========================================
        // INSTANT -> LOCALDATETIME
        // =========================================
        LocalDateTime convertedBack = new LocalDateTime(instant, DateTimeZone.getDefault());
        System.out.println("Converted Back: " + convertedBack);
    }

}
