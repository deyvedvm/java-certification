package dev.deyve.chapter1;

/**
 * What is the value of tip after executing the following code snippet?
 * int meal = 5;
 * int tip = 2;
 * var total = meal + (meal>6 ? tip++ : tip--);
 * <p>
 * A.1
 * B.2
 * C.3
 * D.7
 * E.None of the above
 * </p>
 */
public class Question06 {

    public static void main(String[] args) {
        int meal = 5;
        int tip = 2;
        var total = meal + (meal > 6 ? tip++ : tip--);

        System.out.println("tip: " + tip);
        System.out.println("total: " + total);
    }
}

// Answer: A. 1
