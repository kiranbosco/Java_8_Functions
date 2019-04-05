package util.Date;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateFormateExemple {

    // this method will be converting String formate to LocalDateFormate
    public static void parseLocaDate(){

        String date = "2019-04-04";
        LocalDate localDate = LocalDate.parse(date);
        System.out.println("convert string to DateFormate : " + localDate);

        // another way to parsing string to localDateFormate
        LocalDate localDate1 = LocalDate.parse(date, DateTimeFormatter.ISO_LOCAL_DATE); // this two methods are follow  doest follw the --- but
        System.out.println("second Way to convert : " + localDate1);

        // but it will be given -- formate here look at this method()
        String date1 = "20190404";
        LocalDate localDate2 = LocalDate.parse(date1,DateTimeFormatter.BASIC_ISO_DATE);
        System.out.println("Basic formate " + localDate2);

        // CUSTOME DATE FORMATE

        String s3 = "2019|04|";
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("YYYY|MM|dd");
        LocalDate localDate3 =LocalDate.parse(s3,dateTimeFormatter);
        System.out.println(" localDate3 formate " + localDate3);

    }

    public static void formateLocatDate(){

        // Local date formatre

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("YYYY|MM|dd");
        LocalDate localDate = LocalDate.now();
        String  str = localDate.format(dateTimeFormatter);
        System.out.println( "Date Formater : " + str);


    }
    public static void main(String[] args) {

        // parseLocaDate();
        formateLocatDate();
    }
}
