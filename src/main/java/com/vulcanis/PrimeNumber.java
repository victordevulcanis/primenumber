package com.vulcanis;

public class PrimeNumber {

    public static boolean divisibleOnlyByOneAndItself(int dividend) {
        for (int divisor = 2; divisor < dividend; divisor++)
            if (isAExactDivision(dividend, divisor))
                return false;
        return true;
    }

    private static boolean isAExactDivision(int dividend, int divisor) {
        return dividend % divisor == 0;
    }

}
