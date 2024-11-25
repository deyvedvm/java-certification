package dev.deyve.chapter8;

/**
 * Question 1
 * <p>
 * How many times does the following code print How rude! at runtime?
 * <p>
 * A.Zero
 * B.One
 * C.Two
 * D.Three
 * E.The code does not compile.
 * F.The code compiles but an exception is printed at runtime.
 * </p>
 */

public class Speaking {
    void talk() {
        try {
            Thread.sleep(10_000);
        } catch (InterruptedException e) {
            System.out.println("How rude!");
        }
    }

    public static void main(String[] args) {
        var speaking = new Speaking();
        var thread = new Thread(speaking::talk);
        thread.run();
        thread.interrupt();
        thread.interrupt();
        thread.interrupt();
    }
}

// Answer: A. Zero
// If you change thread.run() to thread.start(), the code will print How rude! once.