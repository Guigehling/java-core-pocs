

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public class DateTimeApp {

    public static void main(String[] args) {

        // =========================================
        // CURRENT DATE
        // =========================================
        LocalDate today = LocalDate.now();
        System.out.println("Today: " + today);

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
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        System.out.println("Formatted: " + formatter.format(dateTime));
        System.out.println("Formatted: " + dateTime.format(formatter));

        // =========================================
        // PARSE
        // =========================================
        System.out.println("Parsed: " + LocalDate.parse("2022-02-20"));

        //FIX-ME - Erro
        //System.out.println("Parsed/Formatted: " + LocalDate.parse("2022-02-20", formatter));

        // =========================================
        // PLUS
        // =========================================
        System.out.println("Plus 10 Days: " + today.plusDays(10));

        // =========================================
        // MINUS
        // =========================================
        System.out.println("Minuis 2 Days: " + today.minusDays(2));

        // =========================================
        // PERIOD
        // =========================================
        Period period = Period.between(
                LocalDate.of(2025, 9, 10),
                today
        );

        System.out.println("Years: " + period.getYears());

        // =========================================
        // DURATION
        // =========================================
        Duration duration = Duration.between(
                LocalTime.of(8, 0),
                LocalTime.now()
        );

        System.out.println("Duration: " + duration.toHours());

        // =========================================
        // CHRONOUNIT
        // =========================================
        LocalDateTime start = LocalDateTime.of(2026, 6, 1, 8, 30);
        LocalDateTime end = LocalDateTime.of(2026, 6, 2, 10, 45);

        System.out.println("ChronoUnit:");
        System.out.println("-- Hours   : " + ChronoUnit.HOURS.between(start, end));
        System.out.println("-- Minutes : " + ChronoUnit.MINUTES.between(start, end));
        System.out.println("-- Days    : " + ChronoUnit.DAYS.between(start, end));
        System.out.println("-- Months  : " + ChronoUnit.MONTHS.between(start, end));
        System.out.println("-- Years   : " + ChronoUnit.YEARS.between(start, end));

        // =========================================
        // ZONE
        // =========================================
        ZonedDateTime zoned = ZonedDateTime.now(
                ZoneId.of("America/Sao_Paulo")
        );

        System.out.println("Zone: " + zoned);

        // =========================================
        // TIME ZONES (ZONEID)
        // =========================================
        ZonedDateTime saoPauloTime = ZonedDateTime.now(
                ZoneId.of("America/Sao_Paulo")
        );

        ZonedDateTime newYorkTime = saoPauloTime.withZoneSameInstant(
                ZoneId.of("America/New_York")
        );

        ZonedDateTime tokyoTime = saoPauloTime.withZoneSameInstant(
                ZoneId.of("Asia/Tokyo")
        );

        System.out.println("Zones:");
        System.out.println("-- São Paulo : " + saoPauloTime);
        System.out.println("-- New York  : " + newYorkTime);
        System.out.println("-- Tokyo     : " + tokyoTime);

        // =========================================
        // java.util.Date -> LocalDateTime
        // =========================================
        Date legacyDate = new Date();

        LocalDateTime localDateTime = LocalDateTime.ofInstant(
                legacyDate.toInstant(),
                ZoneId.systemDefault()
        );

        System.out.println("Legacy Date: " + legacyDate);
        System.out.println("LocalDateTime: " + localDateTime);

        // =========================================
        // LocalDateTime -> java.util.Date
        // =========================================
        Date convertedDate = Date.from(localDateTime
                .atZone(ZoneId.systemDefault())
                .toInstant()
        );

        System.out.println("Converted Date: " + convertedDate);

        // =========================================
        // LOCALDATETIME -> INSTANT
        // =========================================
        Instant instant = LocalDateTime.now()
                .atZone(ZoneId.systemDefault())
                .toInstant();

        System.out.println("Convertd to Instant: " + instant);

        // =========================================
        // INSTANT -> LOCALDATETIME
        // =========================================
        LocalDateTime convertedBack = LocalDateTime.ofInstant(
                instant,
                ZoneId.systemDefault()
        );

        System.out.println("Converted Back: " + convertedBack);

    }

}

