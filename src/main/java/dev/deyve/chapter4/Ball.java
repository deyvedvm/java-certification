package dev.deyve.chapter4;

/**
 * Question 6
 * <p>
 * What is the output of the following application?
 * <p>
 * A.0
 * B.Caught!
 * C.The code does not compile because LostBallException is not handled or declared in the
 * main() method.
 * D.The code does not compile because ArrayIndexOutOfBoundsException is not handled or
 * declared in the toss() method.
 * E.The code does not compile for a different reason.
 * F.None of the above.
 */

class LostBallException extends Exception {
}

public class Ball {
    public void toss() throws LostBallException {
        var windUp = new int[1];
        System.out.println(windUp[1]);
    }

    public static void main(String[] bouncy) {
        try {
            new Ball().toss();
        } catch (Throwable e) {
            System.out.print("Caught!");
        }
    }
}

// Answer: B. Caught!