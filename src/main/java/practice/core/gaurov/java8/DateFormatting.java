package practice.core.gaurov.java8;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class DateFormatting {

    public static void main(String[] args) throws ParseException {
//        printDateTime("2020-01-12");
        printDateTime("2021-01-12T00:00:00Z");
    }

    public static void printDate(String inputDate) throws ParseException {
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        DateTimeFormatter srcFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss z");
        System.out.println(inputDate);
        Date date = formatter.parse(inputDate);


        System.out.println(date.toString());
    }

    public static void printDateTime(String inputDate) {
        DateTimeFormatter tgtFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss'Z'");
        LocalDateTime actualDateTime = LocalDateTime.parse(inputDate, tgtFormatter);
        actualDateTime.toLocalDate().toString();
    }

}
