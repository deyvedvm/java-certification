package dev.deyve.chapter11;

import java.text.NumberFormat;
import java.util.Locale;

/**
 * For currency, the United States uses the $ symbol, the UK uses the £ symbol, and Germany
 * uses the € symbol. Given this information, what is the expected output of the following
 * code snippet?
 * <p>
 * A.$1.10
 * B.1,10€
 * C.£1.10
 * D.The code does not compile.
 * E.An exception is thrown at runtime.
 * F.The output cannot be determined without knowing the locale of the system where it will
 * be run.
 * </p>
 */
public class Question10 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Locale.setDefault(Locale.Category.FORMAT, Locale.GERMANY);
        System.out.print(NumberFormat.getCurrencyInstance(Locale.UK).format(1.1));

    }
}

// Answer: C. £1.10