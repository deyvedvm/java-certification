package dev.deyve.chapter1;

/**
 * Which statement is true of this text block?
 * var block = """
 * <p>
 * green
 * yellow
 * """;
 *
 * <p>
 * A.There is only essential whitespace.
 * B.There is only incidental whitespace.
 * C.There is both essential and incidental whitespace.
 * D.The code does not compile.
 * </p>
 */
public class Question11 {

    public static void main(String[] args) {

        var block = """
                    
                    green
                        yellow
                """;

        System.out.println(block);
    }
}

// Answer: A. There is only essential whitespace.
