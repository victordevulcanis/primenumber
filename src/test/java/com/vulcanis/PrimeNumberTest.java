package com.vulcanis;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PrimeNumberTest {

    @Test
    public void shouldBePrime() {
        Assertions.assertTrue(PrimeNumber.divisibleOnlyByOneAndItself(1));
        Assertions.assertTrue(PrimeNumber.divisibleOnlyByOneAndItself(2));
        Assertions.assertTrue(PrimeNumber.divisibleOnlyByOneAndItself(3));
        Assertions.assertTrue(PrimeNumber.divisibleOnlyByOneAndItself(5));
        Assertions.assertTrue(PrimeNumber.divisibleOnlyByOneAndItself(7));
        Assertions.assertTrue(PrimeNumber.divisibleOnlyByOneAndItself(23));
        Assertions.assertTrue(PrimeNumber.divisibleOnlyByOneAndItself(97));
    }

    @Test
    public void shouldNotBePrime(){
        Assertions.assertFalse(PrimeNumber.divisibleOnlyByOneAndItself(4));
        Assertions.assertFalse(PrimeNumber.divisibleOnlyByOneAndItself(6));
        Assertions.assertFalse(PrimeNumber.divisibleOnlyByOneAndItself(8));
        Assertions.assertFalse(PrimeNumber.divisibleOnlyByOneAndItself(9));
        Assertions.assertFalse(PrimeNumber.divisibleOnlyByOneAndItself(10));
        Assertions.assertFalse(PrimeNumber.divisibleOnlyByOneAndItself(99));
    }


}
