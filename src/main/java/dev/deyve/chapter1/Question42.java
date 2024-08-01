package dev.deyve.chapter1;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;

/**
 * What is a possible output of the following?
 *
 * <p>
 * A. 2022-05-13T10:00-07:00[America/Los_Angeles]
 * B. 2022-05-13T00:00:00Z
 * C. 2022-05-13T17:00:00Z
 * D. 2022-05-14T10:00-07:00[America/Los_Angeles]
 * E. 2022-05-14T00:00:00Z
 * F. 2022-05-14T17:00:00Z
 * </p>
 */
public class Question42 {

    public static void main(String[] args) {

        var trainDay = LocalDate.of(2022, 5, 13);
        var time = LocalTime.of(10, 0);
        var zone = ZoneId.of("America/Los_Angeles");

        var zdt = ZonedDateTime.of(trainDay, time, zone);

        var instant = zdt.toInstant();

        instant = instant.plus(1, ChronoUnit.DAYS);

        System.out.println(instant);
    }
}

// Answer: F. 2022-05-14T17:00:00Z
