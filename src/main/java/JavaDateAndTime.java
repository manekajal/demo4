import java.time.*;
import java.time.format.DateTimeFormatter;

public class JavaDateAndTime {

    // first Api = LocalDate / LocalTime

    public static void main(String[] args) {

        LocalDateTime localDate = LocalDateTime.now();
        System.out.println(localDate);


        String date=localDate.format(DateTimeFormatter.ISO_WEEK_DATE);

        System.out.println(date);

//        String date1=localDate.DateTimeFormatter.ISO_DATE;
//
//        System.out.println(date);

//        LocalDate localDate =LocalDate.of(2024,07,01);
//        System.out.println(localDate.isLeapYear());


//        LocalDateTime localDateTime=LocalDateTime.now();
//        System.out.println(localDateTime);
//
//        LocalDate yesterday= LocalDate.from(localDateTime.minusDays(9));
//        System.out.println(yesterday);
//
//        LocalDate tomorrow = LocalDate.from(localDateTime.plusDays(3));
//        System.out.println(tomorrow);

//        LocalTime time=LocalTime.now();
//        System.out.println(time);

//        LocalTime time = LocalTime.of(10,43,0);
//
//        System.out.println(time);
//
//        LocalTime time1=LocalTime.from((time.minusHours(2)));
//        System.out.println(time1);
//
//        LocalTime localTime=LocalTime.now(Clock.systemDefaultZone());
//        System.out.println(localTime);

//        ZoneId zoneId=ZoneId.of("Europe/London");
//        LocalTime localTime1=LocalTime.now(zoneId);
//        System.out.println(localTime1);




    }
}
