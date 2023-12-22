package com.vulcanis;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PrimeNumberTest {

    @Test
    public void shouldBePrime() {
        assertTrue(PrimeNumber.divisibleOnlyByOneAndItself(2));
        assertTrue(PrimeNumber.divisibleOnlyByOneAndItself(23));
        assertTrue(PrimeNumber.divisibleOnlyByOneAndItself(97));
    }

    @Test
    public void shouldNotBePrime(){
        assertFalse(PrimeNumber.divisibleOnlyByOneAndItself(1));
        assertFalse(PrimeNumber.divisibleOnlyByOneAndItself(4));
        assertFalse(PrimeNumber.divisibleOnlyByOneAndItself(10));
        assertFalse(PrimeNumber.divisibleOnlyByOneAndItself(99));
    }

}
