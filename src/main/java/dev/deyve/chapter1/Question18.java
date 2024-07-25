package dev.deyve.chapter1;

import java.time.*;

/**
 * In the United States, daylight saving time ends on November 6, 2022 at 02:00 a.m. and we
 * repeat the previous hour. What is the output of the following?
 * <p>
 * A.5 false
 * B.5 true
 * C.6 false
 * D.6 true
 * E.7 false
 * F.7 true
 * G. None of the above
 * </p>
 */
public class Question18 {

    public static void main(String[] args) {

        var localDate = LocalDate.of(2022, Month.NOVEMBER, 6);
        var localTime = LocalTime.of(1, 0);

        var zone = ZoneId.of("America/New_York");
        var z = ZonedDateTime.of(localDate, localTime, zone);

        var offset = z.getOffset();

        for (int i = 0; i < 6; i++)
            z.plusHours(1);

        System.out.print(z.getHour() + " "
                + offset.equals(z.getOffset()));
    }
}

// Answer: D. None of the above.
