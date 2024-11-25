package dev.deyve.chapter8;

import java.util.ArrayList;

/**
 * Question 6
 * <p>
 * Assuming five seconds is enough time for the threads in this program to complete, what is
 * the expected result of executing the following program?
 * <p>
 * A.It always prints a number less than 10.
 * B.It always prints 10.
 * C.It may print 10 or a number less than 10.
 * D.The code does not compile.
 * E.The code compiles but an exception is printed at runtime.
 * F.None of the above.
 * </p>
 */

public class Dance {
    int count = 0;

    synchronized int step() {
        return count++;
    }

    public static void main(String[] args) throws InterruptedException {
        var waltz = new Dance();

        var dancers = new ArrayList<Thread>();

        for (int i = 0; i < 10; i++)
            dancers.add(new Thread(waltz::step));

        for (Thread dancer : dancers)
            dancer.start();

        dancers.forEach(Thread::interrupt);

        Thread.sleep(5_000);

        System.out.print(waltz.count);
    }
}

// Answer: B. It always prints 10.