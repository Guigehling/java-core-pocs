import java.time.*;
import java.time.format.DateTimeFormatter;

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
        System.out.println("Minuis 2 Days: " + today.minusMonths(2));

        // =========================================
        // PERIOD
        // =========================================
        Period period = Period.between(
                LocalDate.of(2000, 1, 1),
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

    }

}
