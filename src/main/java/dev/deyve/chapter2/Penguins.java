package dev.deyve.chapter2;

/**
 *  Question 1
 * <p>
 * Which statements are true of the following code? (Choose two.)
 *
 * <p>
 * A. The code compiles as is.
 * B. One line causes compiler errors.
 * C. Two lines cause compiler errors.
 * D. If any lines that do not compile are removed, this code does not print anything.
 * E. If any lines that do not compile are removed, this code prints one line.
 * F. If any lines that do not compile are removed, this code prints two lines.
 * </p>
 */

public class Penguins {

    public static void main(String[] args) {
        var pen = new Penguins();
        pen.length("penguins");
        pen.length(5);
        pen.length(new Object());
    }

    public void length(Object obj) {
        if (obj instanceof String x)
            System.out.println(x.length());
    }
}

// Answer: A, E. The code compiles as is. If any lines that do not compile are removed, this code prints one line.
