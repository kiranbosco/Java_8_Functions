package util.Date;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class LocalDateTimeExe {

    public static void main(String[] args) {

        // LocalTime :- this calass is given to current michine local time
      LocalTime localTime =  LocalTime.now();
        System.out.println("localTime : " + localTime);

        // LocalDate :- this class is given to Current michine local Date
        LocalDate localDate = LocalDate.now();
        System.out.println("localDate : "+ localDate);

        //LocalDateAndTime :- this class will be given both localdate and localTime
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println("localDateTime : " + localDateTime);


    }
}
