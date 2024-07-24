package dev.deyve.chapter1;

import java.time.*;

/**
 * Most of the United States observes daylight saving time on March 13, 2022, by moving the
 * clocks forward an hour at 2 a.m. What does the following code output?
 * <p>
 * A.4 false
 * B.4 true
 * C.5 false
 * D.5 true
 * E.6 false
 * F.6 true
 * G. None of the above
 * </p>
 */
public class Question05 {

    public static void main(String[] args) {
        var localDate = LocalDate.of(2022, 3, 13);
        var localTime = LocalTime.of(1, 0);

        var zone = ZoneId.of("America/New_York");
        var z = ZonedDateTime.of(localDate, localTime, zone);

        var offset = z.getOffset();
        var duration = Duration.ofHours(3);

        var later = z.plus(duration);
        System.out.println(later.getHour() + " " + offset.equals(later.getOffset()));
    }
}

// Answer: C. 5 false
