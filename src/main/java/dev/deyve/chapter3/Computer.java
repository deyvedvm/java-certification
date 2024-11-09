package dev.deyve.chapter3;

/**
 * Question 13
 * <p>
 * What is the output of the following code?
 * </p>
 * <p>
 * A. computer-laptop-
 * B. laptop-computer-
 * C. laptop-laptop-
 * D. The code does not compile.
 * E. None of the above.
 * </p>
 */

class Laptop extends Computer {
    public void startup() {
        System.out.print("laptop-");
    }
}

public class Computer {
    public void startup() {
        System.out.print("computer-");
    }

    public static void main(String[] args) {

        Computer computer = new Laptop();
        Laptop laptop = new Laptop();

        computer.startup();
        laptop.startup();
    }
}

// Answer: C. laptop-laptop-
