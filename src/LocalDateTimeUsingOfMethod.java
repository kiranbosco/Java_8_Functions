import java.time.LocalDate;
import java.time.LocalTime;
import java.time.temporal.ChronoField;

public class LocalDateTimeUsingOfMethod {

// there is some of LocalDate methods are there like of method() exe
    public static void main(String[] args) {

        /*localDateTime methods are
        *  now()
        * off()
        * get()
        * temporalField()
        * */
        // of Method()

        // this method will be take the three input parameter like data mont date return
        LocalDate localDate = LocalDate.of(2019,04,04);
        System.out.println("data_month_year : " + localDate);

        // there is some handy getmethod are there got get the datemethods()
        System.out.println(" day_of_week :"  +localDate.getDayOfWeek());// this method will get the day of week
        System.out.println("getMont : " + localDate.getMonth());
        System.out.println("day and year : " +localDate.getDayOfYear());// this method will be return day and year
        System.out.println("this method will be get the month of value" + localDate.getMonthValue());
        System.out.println(" this method will be get year " +localDate.getYear()); // year will be return

        // there is another handy method is temporalField() inside the get(ChronoField.)

        System.out.println(" temoral_ day_mont" + localDate.get(ChronoField.DAY_OF_MONTH)); // it will be return day of month
       // System.out.println("temporal_hour_of_day" + localDate.get(ChronoField.CLOCK_HOUR_OF_DAY)) ; // day of hour of day
      //  System.out.println("temporal_Micro_of_Day " + localDate.get(ChronoField.MICRO_OF_DAY));
    //    System.out.println("temporal _Seconds_of_Minits" + localDate.get(ChronoField.SECOND_OF_MINUTE));


        // Modify the current data and time there is some handy method are there plusDate(),plusMont() some outher

        System.out.println("increase the two days on currentdate : " + localDate.plusDays(2));
        System.out.println("increase the three months : " + localDate.plusMonths(3));
        System.out.println("increase the four years " + localDate.plusYears(4));

        // Decrease data and mont and year use this method minusDate() minusYear(), minusMont()

        System.out.println("decrease the current date : " +localDate.minusDays(3)); // it will be decrease the current data
        System.out.println("decrease the mont on current month : " + localDate.minusWeeks(2));
        System.out.println("decrease the year on current year" + localDate.minusYears(2));

        // check the wether year is leap year or not

        System.out.println("leap year or not : " + localDate.isLeapYear());
        System.out.println("is it leap year : " + LocalDate.ofYearDay(2024,01).isLeapYear());


        // Comparing two dates there is some of handy methods are there isEquals(), isBefore(),isAfter()

       LocalDate localDate1 = LocalDate.of(2020,05,07);
        System.out.println("Comparing two dates : " + localDate1.isEqual(localDate));
        System.out.println("isBefore date : " + localDate1.isBefore(localDate1));
        System.out.println("isAter date : " + localDate.isAfter(localDate1));

        // LocalTime ()

        LocalTime localTime = LocalTime.of(22,35);
        System.out.println("localTime" + localTime); // hour and minutes
        System.out.println("localTime "+ localTime.minusSeconds(22)); // minutes and seconds



    }


}
