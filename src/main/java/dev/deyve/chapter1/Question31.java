package dev.deyve.chapter1;

import java.time.*;

/**
 * The United States observes daylight saving time on March 13, 2022, by moving the clocks
 * forward an hour at 2 a.m. What does the following code output?
 * <p>
 * A. 13 false
 * B. 13 true
 * C. 16 false
 * D. 16 true
 * E. 17 false
 * F. 17 true
 * G. None of the above
 * </p>
 */
public class Question31 {

    public static void main(String[] args) {
        var localDate = LocalDate.of(2022, 3, 13);
        var localTime = LocalTime.of(13, 0);

        var zone = ZoneId.of("America/New_York");
        var z = ZonedDateTime.of(localDate, localTime, zone);

        var offset = z.getOffset();
        var duration = Duration.ofHours(3);
        var later = z.plus(duration);

        System.out.println(later.getHour() + " "
                + offset.equals(later.getOffset()));

    }
}

// Answer: D. 16 true